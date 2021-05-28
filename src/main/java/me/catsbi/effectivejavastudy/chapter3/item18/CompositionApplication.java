package me.catsbi.effectivejavastudy.chapter3.item18;

import java.util.Arrays;
import java.util.HashSet;

public class CompositionApplication {
    public static void main(String[] args) {
        CompositionInstrumentedSet<String> set = new CompositionInstrumentedSet<String>(new HashSet<>());

        set.addAll(Arrays.asList("hello", "java", "world"));

        System.out.println("set.getAddCount() = " + set.getAddCount());

    }
}
