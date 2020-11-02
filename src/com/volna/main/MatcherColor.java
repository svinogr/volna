package com.volna.main;

import java.util.*;

public class MatcherColor {
    private final Index end = new Index(9, 9);
    private Index start = new Index(0, 0);

    private List<List<Tile>> arrayList = new ArrayList<>();
    private Pole pole;

    public MatcherColor(Pole pole) {
        this.pole = pole;
    }

    public void match() {
        Set listToDelete = new HashSet();
        for (int i = pole.getSizeX() - 1; i >= 0; i--) {
            for (int j = pole.getSizeY() - 1; j >= 0; j--) {
                Tile tile = pole.getPole()[i][j];
                List<Tile> tileList = searchHorizontalCombination(tile);
                listToDelete.addAll(tileList);
            }
        }

    }


    private List<Tile> searchHorizontalCombination(Tile tile) {
        List<Tile> tileList = new ArrayList<>();
        tileList.add(tile);

        if (tile != null) {
            Tile rightTile = getRightTile(tile);
            if(tile.equals(rightTile)){
                tileList.add(rightTile);
                searchHorizontalCombination(rightTile);
            }
        }

        System.out.println(tile.getIndex());
        return Collections.emptyList();
    }

    private Tile getRightTile(Tile tile) {
        if (tile.getIndex().getY() != end.getY()) {
            return pole.getPole()[tile.getIndex().getX()][tile.getIndex().getY() + 1];
        } else return null;
    }

    private Tile getLeftTile(Tile tile) {
        if (tile.getIndex().getY() != start.getY()) {
            return pole.getPole()[tile.getIndex().getX()][tile.getIndex().getY() - 1];
        } else return null;
    }

    private Tile getTopTile(Tile tile) {
        if (tile.getIndex().getX() != start.getX()) {
            return pole.getPole()[tile.getIndex().getX() -1][tile.getIndex().getY()];
        } else return null;
    }

    private Tile getBottomTile(Tile tile) {
        if (tile.getIndex().getX() != end.getX()) {
            return pole.getPole()[tile.getIndex().getX() + 1][tile.getIndex().getY()];
        } else return null;
    }


}
