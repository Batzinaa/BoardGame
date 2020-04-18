package org.example.model;



public class Player {

    private String pNickname;
    private boolean isPlaying;
    private Square position;

    public Player(String pNickname, Square startingPosition) {
        this.pNickname = pNickname;
        this.isPlaying = false;
        this.position = startingPosition;
    }


    public String getNickname() {
        return pNickname;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public Square getPosition() {
        return position;
    }

    public void setPosition(Square position) {
        this.position = position;
    }
}
