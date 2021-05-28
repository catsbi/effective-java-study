package me.catsbi.effectivejavastudy.chapter3.item16;

public class PointApplication {
    public static void main(String[] args) {
        Point point1 = new Point(0, 1);

        //point1.y = 2;
        point1.setX(5);

        System.out.println("point1 = " + point1);
    }

}
