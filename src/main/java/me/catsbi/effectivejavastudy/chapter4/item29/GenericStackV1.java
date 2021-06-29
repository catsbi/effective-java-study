package me.catsbi.effectivejavastudy.chapter4.item29;

import java.util.Arrays;
import java.util.EmptyStackException;

public class GenericStackV1<E> implements Stack<E>{
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public GenericStackV1() {
        elements = (E[])new Object[DEFAULT_INITIAL_CAPACITY];
    }

    @Override
    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    @Override
    public E pop() {
        if(size == 0) throw new EmptyStackException();
        E result = elements[--size];
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
