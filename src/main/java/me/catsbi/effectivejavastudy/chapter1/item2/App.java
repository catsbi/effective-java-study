package me.catsbi.effectivejavastudy.chapter1.item2;

import me.catsbi.effectivejavastudy.chapter1.item2.domain.NutritionalInformationV2;
import me.catsbi.effectivejavastudy.chapter1.item2.domain.NutritionalInformationV3;

public class App {
    public static void main(String[] args) {
        NutritionalInformationV2 v2 = new NutritionalInformationV2();

        v2.setCalorie(105);
        v2.setCarbohydrate(11);
        v2.setSodium(30);
        v2.setSugars(6);
        v2.setFat(6);
        v2.setTransFat(2);
        v2.setSaturatedFat(4);
        v2.setCholesterol(29);
        v2.setProtein(1);

        NutritionalInformationV3 v3 = NutritionalInformationV3.builder(105, 11, 6, 1)
                .sodium(30).cholesterol(29).transFat(2).sugars(6).saturatedFat(4).build();
    }
}
