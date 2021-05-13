package me.catsbi.effectivejavastudy.item1.domain;

public class BigClassRoom implements ClassRoom{
    private static final long CAPACITY = 150;

    @Override
    public long getCapacity() {
        return CAPACITY;
    }

    public static boolean supported(int count) {
        return count > 0 && count <= CAPACITY;
    }
}
