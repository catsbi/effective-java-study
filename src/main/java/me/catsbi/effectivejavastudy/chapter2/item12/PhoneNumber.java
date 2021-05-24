package me.catsbi.effectivejavastudy.chapter2.item12;

import lombok.ToString;

import java.util.Objects;

public class PhoneNumber {
    private int hashCode;

    private final String prefix;
    private final String middle;
    private final String suffix;

    public PhoneNumber(String prefix, String middle, String suffix) {
        this.prefix = prefix;
        this.middle = middle;
        this.suffix = suffix;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getMiddle() {
        return middle;
    }

    public String getSuffix() {
        return suffix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneNumber)) return false;
        PhoneNumber that = (PhoneNumber) o;
        return Objects.equals(prefix, that.prefix) && Objects.equals(middle, that.middle) && Objects.equals(suffix, that.suffix);
    }
    @Override public int hashCode() {
        if (hashCode != 0) {
            return hashCode;
        }
        int result = prefix.hashCode();
        result = 31 * result + middle.hashCode();
        result = 31 * result + suffix.hashCode();
        hashCode = result;

        return result;
    }

    /**
     * 전화번호의 문자열 표현을 반환한다.
     * 이 문자열은 "XXX-YYYY-ZZZZ" 형태의 12글자다.
     * XXX는 통신사 식별번호, YYYY는 일련번호 앞자리, ZZZZ는 일련번호 뒷자리이다.
     * 각각의 대문자는 10진수 숫자 하나를 나타낸다.
     *
     * 전화번호의 각 부분이 값이 너무 작아 자릿수를 채울 수 없는 경우,
     * 앞에서부터 0으로 채워나간다.(ex: 123 -> 0123)
     * @return
     */
    /*@Override
    public String toString() {
        return String.format("%03d-%03d-%04d", prefix, middle, suffix);
    }*/


    /**
     * 전화번호 정보를 반환한다.
     * 기본적으로 다음과 같은 정보를 포함한다.
     * "[통신사 식별번호: 010, 일련번호 앞자리: 1234, 일련번호 뒷자리: 5678]"
     * @return
     */
    @Override
    public String toString() {
        return "PhoneNumber{" +
                "hashCode=" + hashCode +
                ", prefix='" + prefix + '\'' +
                ", middle='" + middle + '\'' +
                ", suffix='" + suffix + '\'' +
                '}';
    }
}
