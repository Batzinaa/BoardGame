package org.example.model;

import org.example.behaviours.Behaviour;
import org.example.behaviours.DefaultBehaviour;


public class Square {

    private Behaviour behaviour = new DefaultBehaviour();
    private int position;

    public Square(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void executeBehaviour(BoardGame boardGame) {
        behaviour.execute(boardGame);
    }

    public void setBehaviour(Behaviour behaviour) {
        this.behaviour = behaviour;
    }
}
