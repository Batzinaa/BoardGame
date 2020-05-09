package org.example.model.domain;


public class Player {

    private String pNickname;
    private boolean yourTurn;
    private Square square;

    public Player(String pNickname) {
        this.pNickname = pNickname;
        this.yourTurn = false;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public int getPosition() {
        return square.getPosition()+1;
    }

    public String getNickname() {
        return pNickname;
    }

    public boolean wins() {
        return square.isLastSquare();
    }


    public void move(int roll) {
        square.leave(this);
        square = square.moveAndLand(roll);
        square.enter(this);
    }
}
