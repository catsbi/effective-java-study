package me.catsbi.effectivejavastudy.chapter5.item40;

import java.util.Objects;

public class Bigram {
    private final char first;
    private final char second;

    public Bigram(char first, char second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bigram)) return false;
        Bigram bigram = (Bigram) o;
        return first == bigram.first && second == bigram.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
