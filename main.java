//Το δοκίμασα στο παλιό για να δώ αν τρέχει
package app;

import javax.swing.JFrame;
import model.*;
import services.EndingEvent;

public class App 
{

	public static void main(String[] args) 
	{		
		EndingEvent endgame = new EndingEvent();
		String[] playerNames = {"Batzinaa", "Komposta"};
        int numberOfSquares = 50;

        int[][] snakes = {{20,10}};
        int[][] ladders = {{21,30}};

        BoardGame boardGame = new BoardGame(numberOfSquares,
                snakes,
                ladders,
                playerNames);
        
        boardGame.play();
        endgame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        endgame.setSize(200, 100);
		endgame.setVisible(true);

	}

}
