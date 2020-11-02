package com.volna.main;

import java.util.*;

public class Main {
    Pole pole;

    public static void main(String[] args) {
        Main main = new Main();
        main.createPole();
    }

    private void createPole() {
        int x = 10, y = 10;
        pole = new Pole(x, y);
        System.out.println("создано поле " + pole.getPole().length);
        System.out.println(pole.toString());

        MatcherColor matcherColor = new MatcherColor(pole);
        matcherColor.match();

    }


/*    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(Integer in : pole.keySet()){
            List<Tile> list = pole.get(in);

            for (int i = 0; i < list.size(); i++) {
                builder.append("|");

                    Color color = list.get(i).getColor();
                    builder.append(color);

                builder.append("|");
            }
            builder.append("\n");
        }

        return builder.toString();
    }*/
}
