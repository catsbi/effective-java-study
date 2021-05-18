package me.catsbi.effectivejavastudy.chapter1.item7;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class WeakHashMapTest {
    public static void main(String[] args) throws InterruptedException {
        WeakReference<String> refer = new WeakReference<>("test");

        WeakHashMap<Reference, Stack> weakHashMap = new WeakHashMap<>();
        weakHashMap.put(refer, new Stack());

        clear();

        System.out.println("map size= "+ weakHashMap.size());

        refer = null;

        clear();
        System.out.println("map size= "+ weakHashMap.size());

    }

    private static void clear() throws InterruptedException {
        System.out.println("clear");
        System.gc();
        System.out.println("Sleeping");
        Thread.sleep(2000);
    }
}
