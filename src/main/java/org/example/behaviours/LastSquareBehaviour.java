package org.example.behaviours;

import org.example.model.Square;

public final class LastSquareBehaviour extends SquareBehaviour {

    public LastSquareBehaviour(Square square) {
        super(square);
    }

    @Override
    public boolean isLastSquare() {
        return true;
    }
}
