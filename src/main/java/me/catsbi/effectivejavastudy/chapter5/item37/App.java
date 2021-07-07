package me.catsbi.effectivejavastudy.chapter5.item37;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class App {
    public static void main(String[] args) {

        //worst case
        /*Set<Plant>[] plantsByLifeCycle = new Set[Plant.LifeCycle.values().length];
        for (int i = 0; i < plantsByLifeCycle.length; i++) {
            plantsByLifeCycle[i] = new HashSet<>();
        }

        for (Plant p : garden) {
            plantsByLifeCycle[p.lifeCycle.ordinal()].add(p);
        }

        for (int i = 0; i < plantsByLifeCycle.length; i++) {
            System.out.printf("%s:
             %s%n", Plant.LifeCycle.values()[i], plantsByLifeCycle[i]);
        }*/

        Plant[] garden = new Plant[16];

        Map<Plant.LifeCycle, Set<Plant>> plantByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);
        for (Plant.LifeCycle lc : Plant.LifeCycle.values()) {
            plantByLifeCycle.put(lc, new HashSet<>());
        }
        for (Plant p : garden) {
            plantByLifeCycle.get(p.lifeCycle).add(p);
        }
        System.out.println(plantByLifeCycle);


        System.out.println(Arrays.stream(garden)
                .collect(Collectors.groupingBy(p -> p.lifeCycle,
                        () -> new EnumMap<>(Plant.LifeCycle.class),
                        toSet())));

    }
}
