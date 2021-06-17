package me.catsbi.effectivejavastudy.chapter4.item26;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class FoodApp {
    public static void main(String[] args) {
        Foods foods = new Foods();

        //foods.add(new Weapon("도끼", 10));
        foods.add(new Food("피자", LocalDateTime.of(2021, Month.JUNE, 25,17,30), 1000));

        foods.print();

        List<String> list = new ArrayList<>();
        unsafeAdd(list, "hello");
        unsafeAdd(list, 123);
        String s = list.get(1);

    }



    public static void unsafeAdd(List list, Object o) {
        list.add(o);
    }

    public static void safeAdd(List<Object> list, Object o) {
        list.add(o);
    }
}
