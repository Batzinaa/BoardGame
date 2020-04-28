package org.example.behaviours;


import org.example.model.BoardGame;
import org.example.model.Square;

public final class LadderBehaviour extends SquareBehaviour {
    private int transport;

    public LadderBehaviour(Square square, int transport) {
        super(square);
        this.transport = transport;
    }

    @Override
    public void execute(BoardGame boardGame) {

    }

}

