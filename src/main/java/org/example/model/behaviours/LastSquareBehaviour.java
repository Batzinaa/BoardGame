package org.example.model.behaviours;

import org.example.model.domain.Square;

public final class LastSquareBehaviour extends SquareBehaviour {

    public LastSquareBehaviour(Square square) {
        super(square);
    }

    @Override
    public boolean isLastSquare() {
        return true;
    }
}
