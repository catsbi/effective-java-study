package me.catsbi.effectivejavastudy.item5.racing;

import java.util.List;

public class CarApplication {
    public static void main(String[] args) {
        List<Car> cars = CarFactory.create(() -> RacingCar.of("K5"), 10);

        System.out.println("cars = " + cars);
    }
}
