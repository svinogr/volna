package com.volna.main;

import java.util.Random;

public class Pole {
    private Tile[][] pole;
    private int sizeX;
    private int sizeY;

    public Pole(int SIZE_X, int SIZE_Y) {
        pole = new Tile[SIZE_X][SIZE_Y];
        this.sizeX = SIZE_X;
        this.sizeY = SIZE_Y;
    }

    public void addTile(Tile tile) {
        Index index = getEmptyPlace();

        if (index != null) {
            pole[index.getX()][index.getY()] = tile;
        }
    }

    // получаем пустое место массива
    private Index getEmptyPlace() {
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                if (pole[i][j] == null) {
                    return new Index(i, j);
                }
            }
        }
        return null;
    }


    private void inflatePole() {
        Random random = new Random();

        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                Color color = Color.values()[random.nextInt(3)];
                Index index = new Index(i,j);
                Tile tile = new Tile(color, index);
                pole[i][j] = tile;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < sizeX; i++) {
            builder.append("|");
            for (int j = 0; j < sizeY; j++) {
                builder.append("|");
               builder.append(pole[i][j].getColor());
                builder.append("|");
            }
            builder.append("|");
            builder.append("\n");
        }

        return builder.toString();
    }

    public Tile[][] getPole() {
        return pole;
    }

    public void setPole(Tile[][] pole) {
        this.pole = pole;
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }
}
