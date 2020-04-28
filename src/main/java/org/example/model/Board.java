package org.example.model;


import org.example.behaviours.*;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private final List<Square> board = new ArrayList<Square>();

    public Board(int numOfSquares, int[][] snakes, int[][] ladders) {
        createSquares(numOfSquares);
        createSnakes(snakes);
        createLadders(ladders);
    }


    public void createSquares(int numOfSquares) {
        System.out.println("There are " + numOfSquares + " squares.");
        for (int i = 0; i < numOfSquares; i++) {
            Square square = new Square(this, i);
            board.add(square);
            square.setBehaviour(new DefaultBehaviour(square));
        }
        getFirstSquare().setBehaviour(new FirstSquareBehaviour(getFirstSquare()));
        getLastSquare().setBehaviour(new LastSquareBehaviour(getLastSquare()));
    }

    public void createSnakes(int[][] snakes) {
        for (int i = 0; i < snakes.length; i++) {
            int fromPosition = snakes[i][0] - 1;
            int toPosition = snakes[i][1] - 1;
            int transport = toPosition - fromPosition;

            System.out.println("Snake from " + (fromPosition + 1) + " to " + (toPosition + 1));
            Square snakeSquare = board.get(fromPosition);
            snakeSquare.setBehaviour(new SnakeBehaviour(snakeSquare, transport));
        }
    }

    public void createLadders(int[][] ladders) {
        for (int i = 0; i < ladders.length; i++) {
            int fromPosition = ladders[i][0] - 1;
            int toPosition = ladders[i][1] - 1;
            int transport = toPosition - fromPosition;

            System.out.println("ladder from " + (fromPosition + 1) + " to " + (toPosition + 1));
            Square ladderSquare = board.get(fromPosition);
            ladderSquare.setBehaviour(new LadderBehaviour(ladderSquare, transport));
        }
    }


    public Square getFirstSquare() {
        return board.get(0);
    }

    public Square getLastSquare() {
        return board.get(numberOfSquares() - 1);
    }

    public Square findSquare(int position) {
        if (!(position > 0 && position < numberOfSquares())) {
            System.out.println("There is no such square here.");
        }
        return board.get(position);
    }

    private int numberOfSquares() {
        return board.size();
    }


}
