package org.example.model.behaviours;


import org.example.model.domain.Player;
import org.example.model.domain.Square;

import java.util.ArrayList;

public final class FirstSquareBehaviour extends SquareBehaviour {
    private ArrayList<Player> players = new ArrayList<Player>();

    public FirstSquareBehaviour(Square square) {
        super(square);
    }

    @Override
    public boolean isFirstSquare() {
        return true;
    }

    @Override
    public void enter(Player player) {
        players.add(player);
        player.setSquare(square);
    }

    @Override
    public void leave(Player player) {
        players.remove(player);
    }

    @Override
    public boolean isOccupied() {
        return !players.isEmpty();
    }
}
