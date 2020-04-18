package org.example.behaviours;

import org.example.model.GameState;

public class LoseTurnBehaviour implements  Behaviour {
    @Override
    public void execute(GameState gameState) {
        //Decide here what lose turn means

        System.out.println("Xaneis tin seira sou");
    }
}
