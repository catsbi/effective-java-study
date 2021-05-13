package me.catsbi.effectivejavastudy.item3;

import lombok.Data;

import java.util.Objects;

/**
 * 불변 상수를 이용한 싱글톤
 */
@Data
public class SingletonV1 implements SingletonBase{
    public static final SingletonV1 instance = new SingletonV1();

    private SingletonV1(){
        if (Objects.nonNull(instance)) {
            throw new RuntimeException();
        }
    }

    public static SingletonV1 getInstance() {
        return instance;
    }

    @Override
    public void print() {
        System.out.println("싱글톤 V1버전 전역 불변 상수");
    }
}
