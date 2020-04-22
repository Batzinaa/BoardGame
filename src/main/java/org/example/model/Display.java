package org.example.model;

public class Display {
    public void welcomePlayers(){
        System.out.println("Welcome!");
    }

    public void whoIsPlaying(Player player){
        System.out.println(player.getNickname() + " is your turn.");
    }

    public void yourTurnIsOver(Player player){
        System.out.println(player.getNickname() + " your turn is over.");
    }

    public void rollingDice(Player player){
        System.out.println(player.getNickname() + " rolls dice");
    }
}
