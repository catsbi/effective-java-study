package me.catsbi.effectivejavastudy.chapter2.item14;

import lombok.Data;
import lombok.ToString;

import java.util.Comparator;
import java.util.Objects;

import static java.util.Comparator.comparingInt;

@Data
public class PhoneNumber implements Comparable<PhoneNumber> {
    private int hashCode;

    private final int prefix;
    private final int middle;
    private final int suffix;

    public PhoneNumber(int prefix, int middle, int suffix) {
        this.prefix = prefix;
        this.middle = middle;
        this.suffix = suffix;
    }


    @Override
    public String toString() {
        return String.format("%03d-%04d-%04d", prefix, middle, suffix);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneNumber)) return false;
        PhoneNumber that = (PhoneNumber) o;
        return Objects.equals(prefix, that.prefix) && Objects.equals(middle, that.middle) && Objects.equals(suffix, that.suffix);
    }

    @Override
    public int hashCode() {
        if (hashCode != 0) {
            return hashCode;
        }
        int result = Objects.hashCode(prefix);
        result = 31 * result + Objects.hashCode(middle);
        result = 31 * result + Objects.hashCode(suffix);
        hashCode = result;

        return result;
    }

    public static final Comparator<PhoneNumber> COMPARATOR =
            comparingInt(PhoneNumber::getPrefix)
            .thenComparingInt(PhoneNumber::getMiddle)
            .thenComparingInt(PhoneNumber::getSuffix);


    @Override
    public int compareTo(PhoneNumber pn) {
        return COMPARATOR.compare(this, pn);
    }
}
