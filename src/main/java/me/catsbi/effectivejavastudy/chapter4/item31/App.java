package me.catsbi.effectivejavastudy.chapter4.item31;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        swap(integers, 0, 2);
        System.out.println(integers);

        swapOld(integers, 0, 2);
        System.out.println("integers = " + integers);
    }

    public static <E> void swapOld(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }

    public static void swap(List<?> list, int i, int j) {
        swapHelper(list, i, j);
    }

    private static <E> void swapHelper(List<E> list, int i, int j){
        list.set(i, list.set(j, list.get(i)));
    }
}
