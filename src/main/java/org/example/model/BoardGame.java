package org.example.model;


import org.example.behaviours.MoveThroughSnakeBehaviour;

import java.util.List;

public class BoardGame {

    private Display display = new Display();
    private Board board;
    private int numberOfPlayers;
    private Player activePlayer;
    private PlayerList playerList;
    private boolean gameIsFinished;
    private int numberOfDices;

    private static final int DEFAULT_BOARD_SIZE = 100;
    private static final int DEFAULT_NO_OF_DICES = 1;


    public BoardGame(int boardSize) {
        this.board = new Board(boardSize);
        this.playerList = new PlayerList();
        this.numberOfDices = DEFAULT_NO_OF_DICES;
    }

    public BoardGame() {
        this(BoardGame.DEFAULT_BOARD_SIZE);
    }

    public void setNumberOfDices(int numberOfDices) {
        this.numberOfDices = numberOfDices;
    }

    /**
     * ==================Initialize board==================
     */

    public void setBoard() {
        board.setSquareInBoard(new Square(0));
        board.setSquareInBoard(new Square(1));
        board.setSquareInBoard(new Square(2));
        board.setSquareInBoard(new Square(3));
        board.setSquareInBoard(new Square(4));
        board.getBoard().get(4).setBehaviour(new MoveThroughSnakeBehaviour(0));
        board.setSquareInBoard(new Square(5));
        board.getBoard().get(5).setBehaviour(new MoveThroughSnakeBehaviour(0));
        board.setSquareInBoard(new Square(6));
        board.getBoard().get(6).setBehaviour(new MoveThroughSnakeBehaviour(0));
    }

    public void setPlayers(List<Player> players) {
        this.playerList.setPlayers(players);
        this.numberOfPlayers = players.size();
        spawnPlayers();
        activePlayer = playerList.getPlayerList().get(0);
    }

    private void spawnPlayers() {
        for (Player player : playerList.getPlayerList()) {
            player.setPosition(board.getFirstSquare());
        }
    }

    private boolean gameIsFinished() {
        return gameIsFinished;
    }

    private void setGameIsFinished(boolean gameIsFinished) {
        this.gameIsFinished = gameIsFinished;
    }

    /**
     * ====================================================
     */

    public void setCurrentPlayerPosition(int index) {
        activePlayer.setPosition(index);
    }

    private void executeCurrentSquare() {
        int i = activePlayer.getPosition();
        board.getBoard().get(4).executeBehaviour(this);
    }

    private int getTotalValueAfterDiceRoll() {
        return (numberOfDices * Dice.roll());
    }

    private void movePlayer(Player player, int diceValue) {
        int oldPosition = player.getPosition();
        int newPosition = oldPosition + diceValue;
        if (newPosition <= board.getBoard().size())
            player.setPosition(newPosition);
    }

    public void startGame() {
        display.welcomePlayers();
        while (!gameIsFinished()) {
            Player currentPlayer = playerList.getNextPlayer();
            display.whoIsPlaying(currentPlayer);
            display.rollingDice(currentPlayer);
            int totalDiceValue = getTotalValueAfterDiceRoll();
            movePlayer(currentPlayer, totalDiceValue);
            executeCurrentSquare();
            display.yourTurnIsOver(currentPlayer);
        }
    }




}
