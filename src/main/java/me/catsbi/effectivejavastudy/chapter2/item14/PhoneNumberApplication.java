package me.catsbi.effectivejavastudy.chapter2.item14;

import java.util.Arrays;
import java.util.List;

public class PhoneNumberApplication {
    public static void main(String[] args) {
        final List<PhoneNumber> list = Arrays.asList(
                new PhoneNumber(10, 3478, 5136),
                new PhoneNumber(10, 1234, 5678),
                new PhoneNumber(10, 2929, 3940),
                new PhoneNumber(10, 2929, 3939)
                );

        System.out.println("sort before: "+ list);
        list.sort(PhoneNumber::compareTo);
        System.out.println("sort after: "+list);

    }
}
