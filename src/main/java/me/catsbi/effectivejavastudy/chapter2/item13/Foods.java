package me.catsbi.effectivejavastudy.chapter2.item13;

import java.util.Arrays;

public class Foods implements Cloneable {
    private static final int BUFFER_SIZE = 16;
    private Food[] store = new Food[BUFFER_SIZE];
    private int size;

    public Foods() {
    }

    public void add(Food food) {
        ensureCapacity();
        store[size++] = food;
    }

    private void ensureCapacity() {
        if (store.length == size) {
            store = Arrays.copyOf(store, 2 * size + 1);
        }
    }

    public Food get(int index) {
        if (index < size) {
            Food result = store[index];
            remove(index);
            return result;
        }
        throw new IllegalArgumentException();
    }

    private void remove(int index) {
        if (store.length - index >= 0) {
            System.arraycopy(store, index + 1, store, index, store.length - 1 - index);
            size--;
        }
    }

    public Food[] getAll() {
        return store.clone();
    }

    @Override
    public Foods clone() {
        try {
            Foods result = (Foods) super.clone();
            result.store = store.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Foods{" + Arrays.toString(store) + '}';
    }
}
