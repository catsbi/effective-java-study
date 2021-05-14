package me.catsbi.effectivejavastudy.item6;

import java.util.regex.Pattern;

public class StringUtils {
    private static final Pattern ROMAN = Pattern
            .compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    //worst case
    static boolean isRomanNumeralV1(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    //good case
    static boolean isRomanNumeralV2(String s) {
        return ROMAN.matcher(s).matches();
    }
}
