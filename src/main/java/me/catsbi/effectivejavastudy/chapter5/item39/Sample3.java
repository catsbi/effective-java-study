package me.catsbi.effectivejavastudy.chapter5.item39;

import java.util.ArrayList;
import java.util.List;

public class Sample3 {

    @ExceptionTest(IndexOutOfBoundsException.class)
    @ExceptionTest(NullPointerException.class)
    public static void doublyBad() {
        List<String> list = new ArrayList<>();
        /**
         * 자바 API 명세에 따르면 다음 메서드는 IndexOutOfBoundsException나
         * NullPointerException를 던질 수 있다.
         */
        list.addAll(5, null);
    }

}
