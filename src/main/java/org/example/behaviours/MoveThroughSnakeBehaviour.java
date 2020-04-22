package org.example.behaviours;


import org.example.model.BoardGame;

public class MoveThroughSnakeBehaviour implements Behaviour {

    private int leadsToPosition;

    public MoveThroughSnakeBehaviour(int leadsToPosition) {
        this.leadsToPosition = leadsToPosition;
    }

    @Override
    public void execute(BoardGame boardGame) {
        boardGame.setCurrentPlayerPosition(getLeadsToPosition());
    }

    private int getLeadsToPosition() {
        return leadsToPosition;
    }
}
