package me.catsbi.effectivejavastudy.chapter1.item5.shopping;

//정적 유틸리티를 잘 못 사용한 예
public class ShoppingServiceV1 {
    private static final DiscountPolicy discountPolicy = new DiscountPolicy(1000);

    private ShoppingServiceV1(){}

    public static ShoppingResponse buy(Item item, int money){
        if (!item.isPayable(money)) {
            throw new IllegalArgumentException("돈이 부족합니다.");
        }

        int resultPrice = discountPolicy.discount(item.getPrice());
        return ShoppingResponse.of(item, resultPrice);
    }
}
