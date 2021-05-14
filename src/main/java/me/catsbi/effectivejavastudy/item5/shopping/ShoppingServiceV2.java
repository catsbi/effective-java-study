package me.catsbi.effectivejavastudy.item5.shopping;

//싱글톤을 잘 못 사용한 예
public class ShoppingServiceV2 {
    private static final DiscountPolicy discountPolicy = new DiscountPolicy(1000);
    public static ShoppingServiceV2 instance = new ShoppingServiceV2();

    private ShoppingServiceV2() { }

    public static ShoppingServiceV2 getInstance() {
        return instance;
    }

    public ShoppingResponse buy(Item item, int money) {
        if (!item.isPayable(money)) {
            throw new IllegalArgumentException("돈이 부족합니다.");
        }

        int resultPrice = discountPolicy.discount(item.getPrice());
        return ShoppingResponse.of(item, resultPrice);
    }

}
