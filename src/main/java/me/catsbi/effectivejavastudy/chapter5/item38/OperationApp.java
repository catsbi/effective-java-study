package me.catsbi.effectivejavastudy.chapter5.item38;

import java.util.Arrays;
import java.util.Collection;

public class OperationApp {
    public static void main(String[] args) {
        double x = 4, y = 2;
        testV1(ExtendedOperation.class, x, y);
        testV2(Arrays.asList(ExtendedOperation.values()), x, y);
    }

    private static void testV2(Collection<? extends Operation> opSet, double x, double y) {
        for (Operation op : opSet) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }

    private static <T extends Enum<T> & Operation> void testV1(
            Class<T> opEnumType, double x, double y) {
        for (Operation op : opEnumType.getEnumConstants()) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }
}
