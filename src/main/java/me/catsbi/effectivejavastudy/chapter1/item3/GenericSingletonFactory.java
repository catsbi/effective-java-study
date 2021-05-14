package me.catsbi.effectivejavastudy.chapter1.item3;

import lombok.Data;

/**
 * 정적 팩토리 메소드를 이용한 싱글톤
 * - 제네릭 싱글톤 팩토리를 사용한다.
 */
@Data
public class GenericSingletonFactory implements SingletonBase{
    private static ApplyFunction<Object> IDENTITY_FUNCTION = arg -> {
        System.out.println("arg = " + arg);
        return arg;
    };

    @SuppressWarnings("unchecked")
    public static <T> ApplyFunction<T> identityFunction() {
        return (ApplyFunction<T>) IDENTITY_FUNCTION;
    }

    @Override
    public void print() {
        System.out.println("제네릭 싱글톤 팩터리 사용");
    }
}
