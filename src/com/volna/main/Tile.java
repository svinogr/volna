package com.volna.main;

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
}
