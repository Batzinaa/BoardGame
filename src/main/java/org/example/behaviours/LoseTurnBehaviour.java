package org.example.behaviours;


import org.example.model.BoardGame;

public class LoseTurnBehaviour implements  Behaviour {
    @Override
    public void execute(BoardGame boardGame) {
        System.out.println("Xaneis tin seira sou");
    }
}
