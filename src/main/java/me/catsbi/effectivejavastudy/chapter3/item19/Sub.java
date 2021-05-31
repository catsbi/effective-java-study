package me.catsbi.effectivejavastudy.chapter3.item19;

import java.time.Instant;

public class Sub extends Super{
    private final Instant instant;
    public Sub() {
        instant = Instant.now();
    }

    @Override
    public void overrideMe() {
        System.out.println("Sub overrideMe Method!! " + instant);
    }
}
