package me.catsbi.effectivejavastudy.chapter4.item26;

import java.time.LocalDateTime;

public class Food {
    private String name;
    private LocalDateTime expireDate;
    private int price;

    public Food(String name, LocalDateTime expireDate, int price) {
        this.name = name;
        this.expireDate = expireDate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getExpireDate() {
        return expireDate;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", expireDate=" + expireDate +
                ", price=" + price +
                '}';
    }
}
