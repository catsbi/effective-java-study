package me.catsbi.effectivejavastudy.chapter2.item10;

public class ColorPointFromComposition {
    private final Point point;
    private final Color color;

    public ColorPointFromComposition(int x, int y, Color color) {
        this.point = new Point(x, y);
        this.color = color;
    }

    public Point asPoint() {
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPointFromComposition)) return false;
        ColorPointFromComposition cp = (ColorPointFromComposition) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }
}
