package me.catsbi.effectivejavastudy.chapter3.item15;

import lombok.Getter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Lotto {
    public static final int ONE = 1;
    public static final int LOTTO_RANGE = 45;
    private static final LottoNumber[] LOTTO_NUMBERS;
    public static final List<LottoNumber> VALUES;

    static {
        LOTTO_NUMBERS = (LottoNumber[]) IntStream.range(ONE, LOTTO_RANGE)
                .mapToObj(LottoNumber::new).toArray();

        VALUES = Collections.unmodifiableList(Arrays.asList(LOTTO_NUMBERS));
    }

    public static LottoNumber[] values() {
        return LOTTO_NUMBERS.clone();
    }

    @Getter
    private static class LottoNumber {
        final int number;

        LottoNumber(int number) {
            if (number < ONE || number > LOTTO_RANGE) {
                throw new IllegalArgumentException();
            }
            this.number = number;
        }
    }
}
