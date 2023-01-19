package hw3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Game {
	/*
	 * This main can be used to play a game of Connect 4.  It requires that you also
	 * implement an appropriate toString method so that the board is displayed to the
	 * screen.  Put in the effort to get the board to display nicely.  You will be
	 * graded on how closely your output resembles the sample output shown in the
	 * writeup for HW3.
	 */
	public static void main(String[] args) {
		Board b = new Board();
		while (b.gameStatus() == 'U') {
			boolean legalMove = false;
			while (!legalMove) {
				StdOut.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
				StdOut.println(b);
				StdOut.println("Current player: " + b.currentPlayer());
				StdOut.println("Enter column number for next move: ");
				int col = StdIn.readInt();
				legalMove = b.play(col);
			}
		}
		StdOut.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
		StdOut.println(b);
		StdOut.println("GAME OVER");
		char winner = b.gameStatus();
		if (winner == 'D')
			StdOut.println("It's a draw");
		else
			StdOut.println(winner + " WINS!!!");
	}
}
