package org.example.model;


public class BoardGame {

    GameState gameState;
    Display display;

    Board board;
    PlayerList playerList;
    Player activePlayer;
    boolean gameIsFinished;


    public BoardGame(Board board, PlayerList playerList) {
        this.playerList = playerList;
        this.board = board;
        activePlayer = getFirstPlayer();

    }

    public boolean getGameIsFinished() {
        return gameIsFinished;
    }

    public void setGameIsFinished(boolean gameIsFinished) {
        this.gameIsFinished = gameIsFinished;
    }

    public boolean isFinished() {
        return gameIsFinished;
    }

    public Player getFirstPlayer() {
        return playerList.getFirstPlayer();
    }

    public Player getActivePlayer() {
        return playerList.getCurrentPlayer();
    }


    public void moveCurrentPlayer(int diceResult) {

    }
}
