package me.catsbi.effectivejavastudy.item2.domain;

import lombok.Data;

@Data
public class NutritionalInformationV3 {
    private final int calorie;      //칼로리 - 필수
    private final int sodium;       //나트륨
    private final int carbohydrate; // 탄수화물 - 필수
    private final int sugars;       //당류
    private final int fat;          //지방 - 필수
    private final int transFat;     // 트랜스지방
    private final int saturatedFat; //포화지방
    private final int cholesterol;  //콜레스테롤
    private final int protein;      // 단백질 - 필수

    public NutritionalInformationV3(Builder builder) {
        calorie = builder.calorie;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
        sugars = builder.sugars;
        fat = builder.fat;
        transFat = builder.transFat;
        saturatedFat = builder.saturatedFat;
        cholesterol = builder.cholesterol;
        protein = builder.protein;
    }


    public static Builder builder(int calorie, int carbohydrate, int fat, int protein) {
        return new Builder(calorie, carbohydrate, fat, protein);
    }

    public static class Builder {
        private final int calorie;
        private final int carbohydrate;
        private final int fat;
        private final int protein;
        private int sodium = 0;
        private int sugars = 0;
        private int transFat = 0;
        private int saturatedFat = 0;
        private int cholesterol = 0;

        public Builder(int calorie, int carbohydrate, int fat, int protein) {
            this.calorie = calorie;
            this.carbohydrate = carbohydrate;
            this.fat = fat;
            this.protein = protein;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder sugars(int sugars) {
            this.sugars = sugars;
            return this;
        }

        public Builder transFat(int transFat) {
            this.transFat = transFat;
            return this;
        }

        public Builder saturatedFat(int saturatedFat) {
            this.saturatedFat = saturatedFat;
            return this;
        }

        public Builder cholesterol(int cholesterol) {
            this.cholesterol = cholesterol;
            return this;
        }

        public NutritionalInformationV3 build() {
            return new NutritionalInformationV3(this);
        }

    }
}
