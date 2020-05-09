package org.example;

import org.example.model.domain.BoardGame;
import org.example.services.JsonFileParser;

import java.io.File;

public class App {
    public static void main(String[] args) {

        JsonFileParser jsonFileParser = new JsonFileParser();

        jsonFileParser.readFromJson(new File("C:\\Users\\" +
                "Batzinaa\\" +
                "Desktop\\" +
                "4200\\" +
                "Earino(2019-2020)\\" +
                "Methodologia\\" +
                "Project\\BoardGame\\src\\main\\java\\org\\example\\" +
                "data.json"));


        int numberOfSquares = jsonFileParser.getNumberOfSquares();

        String[] playerNames = jsonFileParser.getPlayerNames().toArray(new String[0]);

        //:TODO replace [][] with List of specialSquare

        int[][] snakes = {{20, 10}};
        int[][] ladders = {{21, 30}};

        BoardGame boardGame = new BoardGame(numberOfSquares,
                snakes,
                ladders,
                playerNames);

        boardGame.play();
    }
}
