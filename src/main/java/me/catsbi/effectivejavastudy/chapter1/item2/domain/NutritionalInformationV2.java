package me.catsbi.effectivejavastudy.chapter1.item2.domain;

public class NutritionalInformationV2 {
    private int calorie;      //칼로리 - 필수
    private int sodium;       //나트륨
    private int carbohydrate; // 탄수화물 - 필수
    private int sugars;       //당류
    private int fat;          //지방 - 필수
    private int transFat;     // 트랜스지방
    private int saturatedFat; //포화지방
    private int cholesterol;  //콜레스테롤
    private int protein;      // 단백질 - 필수

    public NutritionalInformationV2() { }

    public void setCalorie(int calorie) { this.calorie = calorie; }

    public void setSodium(int sodium) { this.sodium = sodium; }

    public void setCarbohydrate(int carbohydrate) { this.carbohydrate = carbohydrate; }

    public void setSugars(int sugars) { this.sugars = sugars; }

    public void setFat(int fat) { this.fat = fat; }

    public void setTransFat(int transFat) { this.transFat = transFat; }

    public void setSaturatedFat(int saturatedFat) { this.saturatedFat = saturatedFat; }

    public void setCholesterol(int cholesterol) { this.cholesterol = cholesterol; }

    public void setProtein(int protein) { this.protein = protein; }
}
