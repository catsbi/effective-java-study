package me.catsbi.effectivejavastudy.chapter6.item43;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Food {

    private Long id;
    private String name;
    private Long price;
    private Long quantity;
    private LocalDateTime expireDate;

    private LocalDateTime createAt;
    private String sellerName;

    public Food(String name, Long price, Long quantity, LocalDateTime expireDate) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expireDate = expireDate;
        this.createAt = LocalDateTime.now();
        this.sellerName = "CatsbiCompany";
    }
}
