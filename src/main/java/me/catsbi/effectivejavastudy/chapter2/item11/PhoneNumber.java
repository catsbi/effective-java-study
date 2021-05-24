package me.catsbi.effectivejavastudy.chapter2.item11;

import lombok.ToString;

import java.util.Objects;

@ToString
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
}
