package me.catsbi.effectivejavastudy.chapter3.item21;

public class Iphone implements Phone{
    @Override
    public void call(String number) {
        System.out.println(number +"로 전화를 겁니다. 따르릉");
    }

    @Override
    public void hangup() {
        System.out.println("전화를 종료합니다.");
    }

}
