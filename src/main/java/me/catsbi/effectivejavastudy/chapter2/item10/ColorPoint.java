package me.catsbi.effectivejavastudy.chapter2.item10;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
public class ColorPoint extends Point{
    private Color color;

    public ColorPoint(long x, long y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColorPoint)) return false;
        if (!super.equals(o)) return false;
        ColorPoint that = (ColorPoint) o;
        return color == that.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }
}
