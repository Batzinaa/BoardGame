package org.example.model;


public class BoardGame {

    private Display display = new Display();
    private Board board;
    private PlayerList playerList;

    private Player winner = null;

    private int numberOfDices;

    private static final int DEFAULT_BOARD_SIZE = 100;
    private static final int DEFAULT_NO_OF_DICES = 1;


    public BoardGame(int numberOfSquares, int[][] snakes, int[][] ladders, String[] playerNames) {
        this.board = new Board(numberOfSquares, snakes, ladders);
        this.playerList = new PlayerList(playerNames);
        this.numberOfDices = DEFAULT_NO_OF_DICES;
    }


    public void setNumberOfDices(int numberOfDices) {
        this.numberOfDices = numberOfDices;
    }

    private void spawnPlayersAtFirstSquare() {
        for (int i = 0; i < playerList.getNumberOfPlayers(); i++) {
            board.getFirstSquare().enter(playerList.getPlayer(i));
        }
    }


    /**
     * ====================================================
     **/

    private void movePlayer(int roll) {
        currentPlayer().move(roll);
    }

    private Player currentPlayer() {
        return playerList.getCurrentPlayer();
    }

    private Player getNextPlayer() {
        return playerList.getNextPlayer();
    }

    private boolean gameNotOver() {
        return winner == null;
    }

    private int getTotalValueAfterDiceRoll() {
        return (numberOfDices * Dice.roll());
    }

    /**
     * ====================================================
     **/

    private void startGame() {
        spawnPlayersAtFirstSquare();
        winner = null;
    }

    public void play() {
        startGame();

        System.out.println("Initial state : \n" + this);
        while (gameNotOver()) {
            int roll = getTotalValueAfterDiceRoll();
            System.out.println("Current player is " + currentPlayer().getNickname() + " and rolls " + roll);
            movePlayer(roll);
            System.out.println("State : \n" + this);
            getNextPlayer();
        }
        System.out.println(winner + " has won.");
    }

    @Override
    public String toString() {
        String str = new String();
        for (int i = 0; i < playerList.getNumberOfPlayers(); i++) {
            str += playerList.getPlayer(i).getNickname() + " is at square " + playerList.getPlayer(i).getPosition() + 1 + "\n";
        }
        return str;
    }


}
