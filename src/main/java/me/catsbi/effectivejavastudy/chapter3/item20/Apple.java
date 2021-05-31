package me.catsbi.effectivejavastudy.chapter3.item20;

public class Apple implements Food, Comparable<Apple>{
    private final String name;
    private final long price;

    public Apple(String name, long price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Apple o) {
        return Long.compare(price, o.price);
    }
}
