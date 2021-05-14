package me.catsbi.effectivejavastudy.chapter1.item3;

import lombok.Data;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Objects;

/**
 * 정적 팩토리 메소드를 이용한 싱글톤
 */
@Data
public class SingletonV2 implements SingletonBase, Serializable {
    private static final SingletonV2 instance = new SingletonV2();

    private SingletonV2(){
        if (Objects.nonNull(instance)) {
            throw new RuntimeException();
        }
    }

    public static SingletonV2 getInstanceV1() {
        //return new SingletonV2();
        return instance;
    }

    @Override
    public void print() {
        System.out.println("싱글톤 V2버전 정적 팩토리 메소드");
    }

    public Object readResolve() throws ObjectStreamException{
        return instance;
    }
}
