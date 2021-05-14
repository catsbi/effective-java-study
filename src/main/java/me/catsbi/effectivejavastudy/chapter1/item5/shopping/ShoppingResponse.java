package me.catsbi.effectivejavastudy.chapter1.item5.shopping;

import lombok.Data;

@Data
public class ShoppingResponse {
    private final Item item;
    private final int balance;

    public static ShoppingResponse of(Item item, int balance) {
        return new ShoppingResponse(item, balance);
    }
}
