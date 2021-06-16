package me.catsbi.effectivejavastudy.chapter3.item23;

public class Circle extends FigureV2{
    final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return  Math.PI * (radius * radius);
    }
}
