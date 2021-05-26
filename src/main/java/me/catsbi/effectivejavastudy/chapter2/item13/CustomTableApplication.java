package me.catsbi.effectivejavastudy.chapter2.item13;

public class CustomTableApplication {
    public static void main(String[] args) {
        CustomTable ct = new CustomTable();

        ct.put("first", new Food("사과", 1000));
        ct.put("second", new Food("포도", 2000));
        ct.put("third", new Food("수박", 3000));

        CustomTable copiedCT = ct.clone();
        copiedCT.put("four", new Food("귤", 1111));

        System.out.println("copiedCT = " + copiedCT);
        System.out.println("ct = " + ct);
    }
}
