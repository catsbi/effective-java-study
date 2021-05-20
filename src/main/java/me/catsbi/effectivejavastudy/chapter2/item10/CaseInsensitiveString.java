package me.catsbi.effectivejavastudy.chapter2.item10;

import java.util.Objects;

public final class CaseInsensitiveString {
    private final String str;

    public CaseInsensitiveString(String str) {
        this.str = Objects.requireNonNull(str);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString) {
            return str.equalsIgnoreCase(((CaseInsensitiveString) o).str);
        }
        if (o instanceof String) {
            return str.equalsIgnoreCase((String) o);
        }
        return false;
    }
}
