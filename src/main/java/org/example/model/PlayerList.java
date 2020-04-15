package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class PlayerList {

    private List<Player> playerList = new ArrayList<>();
    private Player currentPlayer;
    private Player nextPlayer;

    public void add(Player player) {
        playerList.add(player);
    }

    public void remove(Player player) {
        playerList.remove(player);
    }

    //TODO: bug fix prepei na apofasizei ton next player vash to isPlaying
    public Player getNextPlayer() {
        for (int i = 0; i < playerList.size(); i++) {
            if (playerList.get(i).isPlaying()) {
                playerList.get(i).setPlaying(false);
                if (playerList.indexOf(i) == playerList.lastIndexOf(i))
                    nextPlayer = getFirstPlayer();
                else
                    playerList.get(i + 1).setPlaying(true);
                nextPlayer = playerList.get(i + 1);
            }
        }
        return nextPlayer;
    }

    public Player getFirstPlayer() {
        playerList.get(0).setPlaying(true);
        return playerList.get(0);
    }

    public Player getCurrentPlayer() {
        for (int i = 0; i < playerList.size(); i++) {
            if (playerList.get(i).isPlaying())
                currentPlayer = playerList.get(i);
        }
        return currentPlayer;
    }
}
