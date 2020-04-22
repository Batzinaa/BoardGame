package org.example.model;

import java.util.LinkedList;
import java.util.List;

public class PlayerList {

    private LinkedList<Player> playerList = new LinkedList<>();
    private Player currentPlayer;


    public void add(Player player) {
        playerList.add(player);
    }

    public int getSize() {
        return playerList.size();
    }

    public Player getNextPlayer() {
        currentPlayer = playerList.poll();
        playerList.offer(currentPlayer);
        return currentPlayer;
    }

    public void setPlayerList(List<Player> players) {
        for (Player player : players) {
            add(player);
        }
    }

    public Player getFirstPlayer() {
        return playerList.getFirst();
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayers(List<Player> players) {
        for(Player player : players){
            add(player);
        }
    }
}
