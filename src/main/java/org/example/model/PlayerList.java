package org.example.model;

import java.util.LinkedList;

public class PlayerList {

    private LinkedList<Player> playerList = new LinkedList<Player>();
    private Player currentPlayer;

    public PlayerList(String[] playerNames) {
        setPlayers(playerNames);
    }

    public int getNumberOfPlayers() {
        return playerList.size();
    }

    public Player getNextPlayer() {
        currentPlayer = playerList.poll();
        playerList.offer(currentPlayer);
        return currentPlayer;
    }

    public Player getFirstPlayer() {
        return playerList.getFirst();
    }

    public void setPlayers(String[] playerNames) {
        System.out.println("Players are: ");
        for (String str : playerNames) {
            Player player = new Player(str);
            playerList.add(player);
        }
    }

    public Player getCurrentPlayer() {
        return playerList.peek();
    }

    public Player getPlayer(int index) {
        return playerList.get(index);
    }
}
