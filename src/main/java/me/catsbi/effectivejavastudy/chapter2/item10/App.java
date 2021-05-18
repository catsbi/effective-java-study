package me.catsbi.effectivejavastudy.chapter2.item10;

public class App {
    public static void main(String[] args) {
        Point point = new Point(0,1);
        ColorPoint bluePoint = new ColorPoint(0, 1, Color.BLUE);

        System.out.println(point.equals(bluePoint));
        System.out.println(bluePoint.equals(point));

    }
}
