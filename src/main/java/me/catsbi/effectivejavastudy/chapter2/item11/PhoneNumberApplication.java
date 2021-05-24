package me.catsbi.effectivejavastudy.chapter2.item11;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumberApplication {
    public static void main(String[] args) {
        PhoneNumber phoneNumber1 = new PhoneNumber("010", "1234", "5678");
        PhoneNumber phoneNumber2 = new PhoneNumber("010", "1234", "5678");

        System.out.println("phoneNumber1.equals(phoneNumber2) = " + phoneNumber1.equals(phoneNumber2));

        Map<PhoneNumber, String> map = new HashMap<>();
        map.put(phoneNumber1, "catsbi");
        map.put(phoneNumber2, "bibi");

        System.out.println(map.get(phoneNumber1));
        System.out.println(map.get(phoneNumber2));
    }
}
