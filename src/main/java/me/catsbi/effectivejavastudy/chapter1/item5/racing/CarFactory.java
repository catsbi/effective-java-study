package me.catsbi.effectivejavastudy.chapter1.item5.racing;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CarFactory {
    public static List<Car> create(Supplier<? extends Car> generator, int count) {
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(generator.get());
        }

        return list;
    }
}
