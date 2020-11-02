package com.volna.main;

import java.util.Objects;

public class Tile {
    private Color color;
    private Index index;

    public Tile(Color color, Index index) {
        this.color = color;
        this.index = index;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Index getIndex() {
        return index;
    }

    public void setIndex(Index index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tile tile = (Tile) o;
        return color == tile.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
