package me.catsbi.effectivejavastudy.chapter4.item29;

import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Stack<String> stackStr = new GenericStackV1<>();
        Stack<Integer> stackInt = new GenericStackV1<>();
        Stack<Double> stackDouble = new GenericStackV1<>();

        String str = "hello world";
        for (int i = 0; i < str.length(); i++) {
            stackStr.push(str.charAt(i)+"");
            stackInt.push(i);
            stackDouble.push(i+10D);
        }

        while (!stackStr.isEmpty()) {
            System.out.print(stackStr.pop().toUpperCase());
        }
        System.out.println();
        while (!stackDouble.isEmpty()) {
            System.out.print(stackDouble.pop());
        }
    }
}
