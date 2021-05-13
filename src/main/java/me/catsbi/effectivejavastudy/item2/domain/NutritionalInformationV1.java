package me.catsbi.effectivejavastudy.item2.domain;

public class NutritionalInformationV1 {
    private final int calorie;      //칼로리 - 필수
    private final int sodium;       //나트륨
    private final int carbohydrate; // 탄수화물 - 필수
    private final int sugars;       //당류
    private final int fat;          //지방 - 필수
    private final int transFat;     // 트랜스지방
    private final int saturatedFat; //포화지방
    private final int cholesterol;  //콜레스테롤
    private final int protein;      // 단백질 - 필수

    public NutritionalInformationV1() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    public NutritionalInformationV1(int calorie, int carbohydrate, int fat, int protein) {
        this(calorie, 0, carbohydrate, 0, fat, 0, 0, 0, protein);
    }

    public NutritionalInformationV1(int calorie, int sodium, int carbohydrate, int sugars, int fat, int transFat, int saturatedFat, int cholesterol, int protein) {
        this.calorie = calorie;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
        this.sugars = sugars;
        this.fat = fat;
        this.transFat = transFat;
        this.saturatedFat = saturatedFat;
        this.cholesterol = cholesterol;
        this.protein = protein;
    }
}
