package me.catsbi.effectivejavastudy.chapter3.item18;

import java.util.Arrays;

public class SetApplication {
    public static void main(String[] args) {
        InstrumentedHashSet<String> set = new InstrumentedHashSet<>();
        set.addAll(Arrays.asList("java", "test", "code"));

        System.out.println("set.getAddCount() = " + set.getAddCount());
    }
}
