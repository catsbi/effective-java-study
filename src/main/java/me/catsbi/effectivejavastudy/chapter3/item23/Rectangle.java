package me.catsbi.effectivejavastudy.chapter3.item23;

public class Rectangle extends FigureV2{
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
