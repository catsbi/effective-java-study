package me.catsbi.effectivejavastudy.chapter3.item23;

public class FigureV1 {
    enum Shape {
        RECTANGLE, CIRCLE
    };

    //공통 필드
    private final Shape shape;

    private double length;
    private double width;

    private double radius;

    public FigureV1(double radius) {
        this.radius = radius;
        shape = Shape.CIRCLE;
    }

    public FigureV1(double length, double width) {
        this.length = length;
        this.width = width;
        shape = Shape.RECTANGLE;
    }

    public double area() {
        switch (shape) {
            case RECTANGLE:
                return length * width;
            case CIRCLE:
                return  Math.PI * (radius * radius);
            default:
                throw new AssertionError(shape);
        }
    }
}
