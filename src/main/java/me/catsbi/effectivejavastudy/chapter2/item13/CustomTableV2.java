package me.catsbi.effectivejavastudy.chapter2.item13;

import lombok.Data;

import java.util.Arrays;
import java.util.Objects;

@Data
public class CustomTableV2{
    private final int BUFFER_SIZE = 16;
    private int size;
    private Entry[] buckets = new Entry[BUFFER_SIZE];

    public CustomTableV2() {
    }

    public CustomTableV2(int size, Entry[] buckets) {
        this.size = size;
        this.buckets = buckets;
    }

    public CustomTableV2(CustomTableV2 ct2) {
        this.size = ct2.size;
        this.buckets = copyBuckets(ct2.buckets);
    }

    private static Entry[] copyBuckets(Entry[] entries) {
        Entry[] copiedEntries = new Entry[entries.length];
        Entry current = entries[0].deepCopy();
        int count = 0;

        while (!current.hasNext()) {
            copiedEntries[count++] = current;
            current = current.next;
        }

        copiedEntries[count] = current;
        return copiedEntries;
    }

    public static CustomTableV2 newInstance(CustomTableV2 ct2) {
        return new CustomTableV2(ct2.size, copyBuckets(ct2.buckets));
    }

    public void put(Object key, Object obj) {
        ensureCapacity();
        Entry entry = new Entry(key, obj, null);
        linkEntry(entry);
        buckets[size++] = entry;
    }

    public Object get(Object key) {
        if (size == 0) {
            throw new RuntimeException();
        }

        return Arrays.stream(buckets)
                .filter(bucket -> bucket.key.equals(key))
                .findFirst()
                .map(Entry::getValue)
                .orElseThrow(IllegalArgumentException::new);
    }

    private void linkEntry(Entry entry) {
        if (size > 0) {
            buckets[size - 1].setNext(entry);
        }
    }

    private void ensureCapacity() {
        if (buckets.length == size) {
            buckets = Arrays.copyOf(buckets, 2 * size + 1);
        }
    }

    @Data
    private static class Entry {
        final Object key;
        Object value;
        Entry next;

        public Entry(Object key, Object value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        Entry deepCopy() {
            Entry result = new Entry(key, value, next);
            for (Entry p = result; p.next != null; p = p.next) {
                p.next = new Entry(p.next.key, p.next.value, p.next.next);
            }
            return result;
        }

        boolean hasNext() {
            return next == null;
        }

    }


    @Override
    public String toString() {
        Entry bucket = buckets[0];
        StringBuilder result = new StringBuilder();

        if (Objects.isNull(bucket)) return null;

        while (!bucket.hasNext()) {
            result.append(bucket.value.toString());
            bucket = bucket.next;
        }
        result.append(bucket.value.toString());

        return result.toString();
    }
}
