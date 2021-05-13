package me.catsbi.effectivejavastudy.item3;

public class App {
    public static void main(String[] args) {
        ApplyFunction<Integer> applyFunction = GenericSingletonFactory.identityFunction();


        Object apply = applyFunction.apply(123);
        System.out.println("apply = " + apply.getClass());
    }
}
