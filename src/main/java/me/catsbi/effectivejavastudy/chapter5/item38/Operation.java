package me.catsbi.effectivejavastudy.chapter5.item38;

public interface Operation {
    double apply(double x, double y);

    default String test() {
        return "Hello";
    }
}
