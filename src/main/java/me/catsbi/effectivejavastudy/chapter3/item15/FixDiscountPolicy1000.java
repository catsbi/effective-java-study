package me.catsbi.effectivejavastudy.chapter3.item15;

public class FixDiscountPolicy1000 implements DiscountPolicy{
    private static final FixDiscountPolicy1000 instance = new FixDiscountPolicy1000();
    public static final int DISCOUNT_AMOUNT = 1000;

    private FixDiscountPolicy1000() { }

    public static FixDiscountPolicy1000 getInstance() {
        return instance;
    }

    @Override
    public int discount(int price) {
        if (price > DISCOUNT_AMOUNT) {
            return price - DISCOUNT_AMOUNT;
        }
        return 0;
    }
}
