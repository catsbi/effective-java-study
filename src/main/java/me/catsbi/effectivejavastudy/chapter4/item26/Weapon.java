package me.catsbi.effectivejavastudy.chapter4.item26;

public class Weapon {
    private String name;
    private double power;

    public Weapon(String name, double power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public double getPower() {
        return power;
    }
}
