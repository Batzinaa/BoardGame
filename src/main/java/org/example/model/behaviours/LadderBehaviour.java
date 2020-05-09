package org.example.model.behaviours;


import org.example.model.domain.Square;

public final class LadderBehaviour extends SquareBehaviour {
    private int transport;

    public LadderBehaviour(Square square, int transport) {
        super(square);
        this.transport = transport;
    }

    @Override
    public Square landHereOrGoHome() {
        System.out.println("ladder from " + (square.getPosition() + 1)
                + " to " + (destination().getPosition() + 1));
        return destination().landHereOrGoHome();
    }

    private Square destination() {
        return square.findRelativeSquare(transport);
    }
}

