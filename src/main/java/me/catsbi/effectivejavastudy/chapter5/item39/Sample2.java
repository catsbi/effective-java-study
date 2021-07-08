package me.catsbi.effectivejavastudy.chapter5.item39;

public class Sample2 {
    @ExceptionTest(ArithmeticException.class)
    public static void m1() {
        int i = 0;
        i = i / i;
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m2() {
        int[] ints = new int[0];
        int i = ints[0];
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m3() {}
}
