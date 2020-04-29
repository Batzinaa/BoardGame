package org.example.model;

import org.example.behaviours.SquareBehaviour;


public class Square {
    private Board board;
    private Player player;
    private int position;
    private SquareBehaviour squareBehaviour;

    public Square(Board board, int position) {
        this.board = board;
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setBehaviour(SquareBehaviour squareBehaviour) {
        this.squareBehaviour = squareBehaviour;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean isOccupied() {
        return squareBehaviour.isOccupied();
    }

    public boolean isLastSquare() {
        return squareBehaviour.isLastSquare();
    }


    public void enter(Player player) {
        squareBehaviour.enter(player);
    }

    public void leave(Player player) {
        squareBehaviour.leave(player);
    }

    public Square moveAndLand(int moves) {
        return squareBehaviour.moveAndLand(moves);
    }

    public Square landHereOrGoHome() {
        return squareBehaviour.landHereOrGoHome();
    }

    public Square findLastSquare() {
        return board.getLastSquare();
    }

    public Square findFirstSquare() {
        return board.getFirstSquare();
    }

    public Square findRelativeSquare(int shift) {
        return board.findSquare(position + shift);
    }
}
