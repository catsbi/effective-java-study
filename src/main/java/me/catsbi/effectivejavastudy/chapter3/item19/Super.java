package me.catsbi.effectivejavastudy.chapter3.item19;

public class Super {
    public Super() {
        overrideMe();
    }

    public void overrideMe() {
        System.out.println("Super override method!");
    }
}
