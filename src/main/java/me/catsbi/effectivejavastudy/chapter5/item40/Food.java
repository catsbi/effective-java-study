package me.catsbi.effectivejavastudy.chapter5.item40;

import java.util.Objects;

public class Food {
    private String name;
    private long price;

    public Food(String name, long price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food)) return false;
        Food food = (Food) o;
        return price == food.price && Objects.equals(name, food.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
