package org.example.model;


import java.util.ArrayList;
import java.util.List;

public class Board {

    private final List<Square> board;
    private final int boardSize;

    public Board(int boardSize) {
        this.boardSize = boardSize;
        this.board = new ArrayList<Square>(boardSize);
    }

    public void setSquareInBoard(Square square) {
        this.board.add(square.getPosition(), square);
    }

    public int getFirstSquare() {
        return 0;
    }

    public Square getLastSquare() {
        return board.get(boardSize - 1);
    }

    public List<Square> getBoard() {
        return new ArrayList<>(board);
    }

}
