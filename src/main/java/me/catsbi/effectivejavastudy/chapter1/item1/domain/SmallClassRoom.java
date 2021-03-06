package me.catsbi.effectivejavastudy.chapter1.item1.domain;

public class SmallClassRoom implements ClassRoom {
    private static final long CAPACITY = 30;

    @Override
    public long getCapacity() {
        return CAPACITY;
    }

    public static boolean supported(int count) {
        return count > 0 && count <= CAPACITY;
    }
}
