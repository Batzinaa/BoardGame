package org.example.model;

import org.example.behaviours.Behaviour;
import org.example.behaviours.DefaultBehaviour;
import org.example.behaviours.LoseTurnBehaviour;

public class Square {

    private Behaviour behaviour = new DefaultBehaviour();

    public Square() {
    }

    public void executeBehaviour() {
        behaviour.execute();
    }

    public void setBehaviour(Behaviour behaviour) {
        this.behaviour = behaviour;
    }
}
