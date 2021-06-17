package me.catsbi.effectivejavastudy.chapter4.item26;

import java.util.HashSet;
import java.util.Set;

public class UnboundWildcardApp {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>() {{
            add(1);
            add(3);
            add(4);
        }};
        HashSet<Integer> s2 = new HashSet<>() {{
            add(1);
            add(4);
            add(5);
            add(6);
        }};

        long count = numElementInCommon(s2, s1);
        System.out.println("count = " + count);


    }

    static long numElementInCommon(Set<?> s1, Set<?> s2) {
        return s1.stream()
                .filter(obj-> s2.contains(obj))
                .count();
    }
}
