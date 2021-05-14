package me.catsbi.effectivejavastudy.chapter1.item5.shopping;

//의존관계 주입으로 할인 정책을 외부에서 주입받음으로써 유연성과 재사용성을 키웠다.
public class ShoppingServiceV3 {
    private final DiscountPolicy discountPolicy;
    private String shoppingMallName;

    public ShoppingServiceV3(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public ShoppingServiceV3(Builder builder) {
        discountPolicy = builder.discountPolicy;
        shoppingMallName = builder.shoppingMallName;
    }

    //정적 팩토리 메서드를 이용한 객체 주입
    public static ShoppingServiceV3 of(DiscountPolicy discountPolicy) {
        return new ShoppingServiceV3(discountPolicy);
    }

    //빌더 패턴을 이용한 객체 주입
    public static Builder builder(DiscountPolicy discountPolicy) {
        return new Builder(discountPolicy);
    }

    public static class Builder{
        private final DiscountPolicy discountPolicy;
        private String shoppingMallName;

        public Builder(DiscountPolicy discountPolicy) {
            this.discountPolicy = discountPolicy;
        }

        public Builder shoppingMallName(String shoppingMallName) {
            this.shoppingMallName = shoppingMallName;
            return this;
        }

        public ShoppingServiceV3 build() {
            return new ShoppingServiceV3(this);
        }
    }

    public ShoppingResponse buy(Item item, int money) {
        if (!item.isPayable(money)) {
            throw new IllegalArgumentException("돈이 부족합니다.");
        }

        int resultPrice = discountPolicy.discount(item.getPrice());
        return ShoppingResponse.of(item, resultPrice);
    }

}
