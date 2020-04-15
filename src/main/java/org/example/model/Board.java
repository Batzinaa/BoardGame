package org.example.model;


import java.util.ArrayList;
import java.util.List;

public class Board {

    private final List<Square> board;
    private final int boardSize;

    public Board(int boardSize) {
        this.boardSize = boardSize;
        this.board = new ArrayList<>(boardSize);
        fillWithSquares();
    }

    public void fillWithSquares() {
        for (int i = 0; i < boardSize; i++) {
            board.add(new Square());
        }
    }

    public Square getFirstSquare() {
        return board.get(0);
    }

    public Square getLastSquare() {
        return board.get(boardSize - 1);
    }

    public List<Square> getBoard() {
        return new ArrayList<>(board);
    }

}
