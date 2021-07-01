package me.catsbi.effectivejavastudy.chapter4.item30;

import java.util.*;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        String[] strings = {"사과", "포도", "수박"};
        UnaryOperator<String> sameString = identityFunction();
        for (String string : strings) {
            System.out.println(sameString.apply(string));
        }

        Number[] numbers = {1, 2.0, 3L};
        UnaryOperator<Number> sameNumber = identityFunction();
        for (Number number : numbers) {
            System.out.println(sameNumber.apply(number));
        }
    }

    public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    private static final UnaryOperator<Object> IDENTITY_FN = t -> t;

    //입력 값을 그대로 반환하는 항등함수이기에 안전하다.
    @SuppressWarnings("unchecked")
    public static <T> UnaryOperator<T> identityFunction(){
        return (UnaryOperator<T>) IDENTITY_FN;
    }

    public static <E extends Comparable<E>> Optional<E> max(Collection<E> c){
        if(c.isEmpty()) return Optional.empty();

        E result = null;
        for (E e : c) {
            if(result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);
        }
        return Optional.of(result);
    }
}
