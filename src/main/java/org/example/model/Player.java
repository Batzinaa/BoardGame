package org.example.model;

public class Player {

    private String pNickname;
    private boolean isPlaying;

    public Player(String pNickname) {
        this.pNickname = pNickname;
        this.isPlaying = false;
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


}
