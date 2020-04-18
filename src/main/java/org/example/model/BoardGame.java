package org.example.model;


public class BoardGame {

    Display display;

    private Board board;
    private PlayerList playerList;
    private Player activePlayer;
    private boolean gameIsFinished;


    public BoardGame(Board board, PlayerList playerList) {
        this.playerList = playerList;
        this.board = board;
        activePlayer = getFirstPlayer();

        spawnPlayers();
    }

    public void spawnPlayers() {
        for (int i = 0; i < playerList.getPlayerList().size(); i++) {
            playerList.getPlayerList().get(i).setPosition(board.getFirstSquare());
        }
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

    public void getActivePlayer() {
        playerList.getCurrentPlayer();
    }


    public void moveCurrentPlayer(int diceResult) {

    }
}
