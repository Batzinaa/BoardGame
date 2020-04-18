package org.example;

import org.example.model.*;

import java.util.Random;

public class App {

    public static void main(String[] args) {



        Random n = new Random();

        PlayerList playerList = new PlayerList();
        Player batzinaa = new Player("batzinaa",new Square());
        Player dimitris = new Player("blackline",new Square());
        playerList.add(batzinaa);
        playerList.add(dimitris);

        BoardGame game = new BoardGame(new Board(n.nextInt(100)),playerList);



        do {

            int diceResult = Dice.rollDice();


        } while (false/*!gameState.isFinished()*/);

    }
}
