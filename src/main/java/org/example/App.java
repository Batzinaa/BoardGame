package org.example;

import org.example.model.*;

public class App {
    public static void main(String[] args) {
        String[] playerNames = {"Batzinaa", "Komposta"};
        int numberOfSquares = 50;

        int[][] snakes = {{10, 1}, {20, 2}, {30, 3}};
        int[][] ladders = {{6, 16}, {7, 17}, {8, 18}};

        BoardGame boardGame = new BoardGame(numberOfSquares,
                snakes,
                ladders,
                playerNames);

        boardGame.play();
    }
}
