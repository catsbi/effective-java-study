package me.catsbi.effectivejavastudy.chapter6.item42;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

public class App {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("book", "apple", "fineapple", "grape", "car", "bobo", "bbibbi", "crong");

        /*Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });*/

        strings.sort(comparingInt(String::length));
        Collections.sort(strings, comparing(String::length));
    }
}
