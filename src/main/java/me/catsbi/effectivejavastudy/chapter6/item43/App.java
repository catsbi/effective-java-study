package me.catsbi.effectivejavastudy.chapter6.item43;

import java.util.Arrays;
import java.util.List;

public class App {
    public static FoodRepository foodRepository;

    public static void main(String[] args) {
    }

    public void saveFoodAll(List<FoodSaveForm> forms) {
        /*for (FoodSaveForm form : forms) {
            Food food = form.toFood();
            foodRepository.save(food);
        }*/
        /*forms.stream()
                .map(form-> form.toFood())
                .forEach(food -> formRepository.save(food));*/

        forms.stream().map(FoodSaveForm::toFood).forEach(foodRepository::save);
    }
}
