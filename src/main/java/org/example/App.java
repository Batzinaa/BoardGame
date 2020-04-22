package org.example;

import org.example.model.*;


public class App {

    public static void main(String[] args) {

        //TODO: PlayerService use JSON to setup playerList
        PlayerList playerList = new PlayerList();
        Player batzinaa = new Player("batzinaa");
        Player dimitris = new Player("blackline");
        playerList.add(batzinaa);
        playerList.add(dimitris);

        BoardGame boardGame = new BoardGame();
        boardGame.setPlayers(playerList.getPlayerList());
        boardGame.setBoard(); //TODO: use JSON to setup Board
        boardGame.startGame();


    }
}
