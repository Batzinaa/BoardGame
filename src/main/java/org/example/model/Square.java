package org.example.model;

import org.example.behaviours.Behaviour;
import org.example.behaviours.DefaultBehaviour;


public class Square {

    private Behaviour behaviour = new DefaultBehaviour();

    public Square() {
    }

    public void executeBehaviour(GameState gameState) {
        behaviour.execute(gameState);
    }

    public void setBehaviour(Behaviour behaviour) {
        this.behaviour = behaviour;
    }
}
