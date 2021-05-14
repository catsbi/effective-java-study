package me.catsbi.effectivejavastudy.chapter1.item3;

public enum SingletonV3 implements SingletonBase{
    INSTANCE;

    @Override
    public void print() {
        System.out.println("싱글톤 V3버전 열거 타입");
    }
}
