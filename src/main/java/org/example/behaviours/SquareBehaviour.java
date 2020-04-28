package org.example.behaviours;

import org.example.model.BoardGame;
import org.example.model.Player;
import org.example.model.Square;

public abstract class SquareBehaviour {
    protected Square square;

    public SquareBehaviour(Square square) {
        this.square = square;
    }

    public boolean isOccupied() {
        return square.getPlayer() != null;
    }

    public boolean isFirstSquare() {
        return false;
    }

    public boolean isLastSquare() {
        return false;
    }

    public abstract void execute(BoardGame boardGame);

    public void enter(Player player) {
        square.setPlayer(player);
        player.setSquare(square);
    }

    public void leave(Player player) {
        square.setPlayer(null);
        player.setSquare(null);
    }

    public Square moveAndLand(int moves) {
        int lastPosition = square.findLastSquare().getPosition();
        int currentPosition = square.getPosition();
        if (currentPosition + moves > lastPosition){
            System.out.println("");
            return square;
        }else{
            System.out.println("");
            return square.findRelativeSquare(moves).landHereOrGoHome();
        }
    }

    public Square landHereOrGoHome() {
        return null;
    }
}
