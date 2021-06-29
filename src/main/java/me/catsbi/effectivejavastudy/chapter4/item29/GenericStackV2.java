package me.catsbi.effectivejavastudy.chapter4.item29;

import java.util.Arrays;
import java.util.EmptyStackException;

public class GenericStackV2<E> implements Stack<E>{
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public GenericStackV2() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    @Override
    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    @Override
    public E pop() {
        if(size == 0) throw new EmptyStackException();
        E result = (E) elements[--size];
        elements[size] = null;
        return result;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
