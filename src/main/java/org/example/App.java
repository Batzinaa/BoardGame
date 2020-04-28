package org.example;

import org.example.model.*;

public class App {
    public static void main(String[] args) {
        String[] playerNames = {"Batzinaa", "Komposta"};
        int numberOfSquares = 50;

        int[][] snakes = {};
        int[][] ladders = {};

        BoardGame boardGame = new BoardGame(numberOfSquares,
                snakes,
                ladders,
                playerNames);

        boardGame.play();
    }
}
