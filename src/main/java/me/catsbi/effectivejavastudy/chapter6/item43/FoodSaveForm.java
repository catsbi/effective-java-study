package me.catsbi.effectivejavastudy.chapter6.item43;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FoodSaveForm {
    private String name;
    private Long price;
    private Long quantity;
    private LocalDateTime expireDate;

    public Food toFood() {
        return new Food(name, price, quantity, expireDate);
    }
}
