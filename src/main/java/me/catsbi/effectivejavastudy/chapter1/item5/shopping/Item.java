package me.catsbi.effectivejavastudy.chapter1.item5.shopping;

import lombok.Data;

@Data
public class Item {
    private String name;
    private int price;

    public boolean isPayable(int money) {
        return price <= money;
    }
}
