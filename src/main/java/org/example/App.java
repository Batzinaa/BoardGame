package org.example;

import org.example.model.*;

import java.util.Random;

public class App {

    public static void main(String[] args) {

        Player player1 = new Player("batzinaa");
        PlayerList playerList = new PlayerList();
        playerList.add(player1);

        //creating board for game (board is my squareList)
        Random n = new Random();

        Board board = new Board(n.nextInt(100));

        //creating game
        BoardGame game = new BoardGame(board, playerList);
        //main game loop
        game.getFirstPlayer();
        Display.welcomePlayers();

        do {

            int diceResult = Dice.rollDice();
            game.moveCurrentPlayer(diceResult);


        } while (!game.isFinished());

    }
}
