package hw3;

public class Board {
	// Add whatever private fields you need here.
	// Remember, only variables of type int, char, boolean, and 1D and 2D arrays
	// of these types are allowed.
    final int ROW = 6, COL = 7;
    final char BOARD_SYMBOL = '.';
    char[][] board = new char[ROW][COL]; //Row and Col
    //
    int[] last_play = new int[2];
    boolean win = false;
    int turn = 1;
    
	// As always, you may also add private helper methods to the class.  That will
	// likely be very useful on this assignment.

	/**
	 * Constructs a new empty connect 4 game board with player X being the first player
	 * and player 'O' being the second player.
	 */
	public Board() {
        int temp = 1;
        for (int i = 0; i < ROW; i++)
        {
            for (int j = 0; j < COL; j++)
            {
                board[i][j] = BOARD_SYMBOL;
            }
        }
	}

	/**
	 * Gets the current player (either 'X' or 'O')
	 * 
	 * @return the current player
	 */
	public char currentPlayer() {
        if (turn % 2 == 1) return 'X';
        return 'O';
	}

	/**
	 * The current player makes a move in a given column if it is a valid move.
	 * Throws an exception if the game is already over.
	 * 
	 * @param column the column in which to make a move.  For the move to be valid,
	 * the column value must an {@code int} between 1 and 7 inclusive, and
	 * there must have been fewer than 6 moves already made in the given column.
	 * @return {@code true} if the move is valid and false if it is not valid.
	 * @throws RuntimeException if the game is already over.
	 */
	public boolean play(int column) {
		char check = gameStatus();
        if (check == 'X' || check == 'O' || check == 'D') throw new RuntimeException();
        if (column > COL || column < 0) return false;
        char player = currentPlayer();
        
        for (int i = ROW-1; i >= 0; i--)
        {
            if (board[i][column-1] == BOARD_SYMBOL)
            {
                board[i][column-1] = player;
                last_play[0] = i;
                last_play[1] = column-1;
                turn++;
                return true;
            }
        }
        return false;
	}

	/**
	 * Determine the status of the game.
	 * 
	 * @return {@code 'X'} or {@code 'O'} if either player has won, {@code 'D'} if
	 * the game is a draw, and {@code 'U'} if the game is still undecided.
	 */
	public char gameStatus() {
        if (turn > 7)
        {
            int count = 1, n = 1,
            row = last_play[0],
            col = last_play[1];

            if (checkDraw(turn))
            {
                return 'D';
            }
            if (checkPosDiagnalWin(row, col, n, count))
            {
                return board[row][col];
            }
            if (checkNegDiagnalWin(row, col, n, count))
            {
                return board[row][col];
            }
            if (checkHorizontalWin(row, col, n, count))
            {
                return board[row][col];
            }
            if (checkVerticalWin(row, col, n, count))
            {
                return board[row][col];
            }

        }
        return 'U';
	}
    private boolean checkDraw(int turn)
    {
        return turn > 42;
    }
    
    private boolean checkVerticalWin(int row,int col,int n,int count)
    {
        // Case: Vert
        while (row + n < ROW)
        {
            // if (row + n == ROW) break;

            if (board[row][col] == board[row+n][col])
            {
                count++;
            }
            else 
            {
                break;
            }
            n++;
        }
        return checkWin(count);
    }

    private boolean checkHorizontalWin(int row, int col, int n, int count)
    {
        // Check right
        while (col + n < COL)
        {
            // if (col + n == COL) break; 

            if (board[row][col] == board[row][col + n])
            {
                count++;
            }
            else 
            {
                break;
            }
            n++;
        }

        // Check left
        n = 1;
        while (col - n >= 0)
        {
            // if (col - n < 0) break; 

            if (board[row][col] == board[row][col - n])
            {
                count++;
            }
            else 
            {
                break;
            }
            n++;
        }
        return checkWin(count);
    }
    private boolean checkPosDiagnalWin(int row, int col, int n, int count)
    {
        // Check upper right
        while (row - n >= 0 && col + n < COL)
        {
            if (board[row][col] == board[row-n][col+n])
            {
                count++;
            }
            else 
            {
                break;
            }
            n++;
        }
        n = 1;
        // Check lower left
        while (row + n < ROW && col - n >= 0)
        {
            if (board[row][col] == board[row+n][col-n])
            {
                count++;
            }
            else 
            {
                break;
            }
            n++;
        }
        return checkWin(count);
    }

    private boolean checkNegDiagnalWin(int row, int col, int n, int count)
    {
        while (row - n >= 0 && col - n >= 0)
        {
            // Check upper left;
            if (board[row][col] == board[row-n][col-n])
            {
                count++;
            }
            else 
            {
                break;
            }
            n++;
        }
        n = 1;
        while (row + n < ROW && col + n < COL)
        {
            // Check lower right
            if (board[row][col] == board[row+n][col+n])
            {
                count++;
            }
            else 
            {
                break;
            }
            n++;
        }
        return checkWin(count);
    }

    private boolean checkWin(int count)
    {
        return count >= 4;
    }
	/**
	 * Construct a string that depicts the sate of the game.
	 * (See the writeup for what that string should look like.)
	 * 
	 * @return a string depicting the game board
	 */
	public String toString() {
        String finalString = "";
        String[] rows = new String[ROW + 2]; 
        for (int i = 0; i < ROW; i++)
        {
            // Adding spaces between Columns
            char[] temp = new char[COL*2];
            for(int j = 0, n = 0; j < COL; j++)
            {
                temp[n] = board[i][j];
                n++;
                temp[n] = ' ';
                n++;
            }
            // Make the row into a string with newline
            rows[i] = new String(temp) + '\n';
        }
        // offset for UI elements
        rows[ROW] = "-------------\n";
        rows[ROW+1] = "1 2 3 4 5 6 7\n";
        // Push all rows into one string to print
        for (int i = 0, j = ROW + 2; i < j; i++)
        {
            finalString += rows[i];
        }

        return finalString;
	}
}
