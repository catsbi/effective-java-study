package me.catsbi.effectivejavastudy.chapter2.item10;

import lombok.Data;

import java.util.Objects;

@Data
public class Point {
    private long x ;
    private long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
