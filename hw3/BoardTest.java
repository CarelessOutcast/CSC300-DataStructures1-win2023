package hw3;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BoardTest {
	
	//@Rule
	//public Timeout globalTimeout = Timeout.seconds(2);

	@Test
	public void test10Draw() {
		Board b = new Board();
		assertTrue(b.play(1));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(2));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(1));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(2));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(3));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(4));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(3));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(4));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(5));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(6));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(5));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(6));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(7));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(1));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(2));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(1));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(2));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(3));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(4));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(3));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(4));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(5));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(6));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(5));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(6));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(7));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(1));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(2));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(1));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(2));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(3));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(4));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(3));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(4));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(5));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(6));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(5));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(6));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(7));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(7));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(7));
		assertEquals('U', b.gameStatus());
		assertTrue(b.play(7));
		assertEquals('D', b.gameStatus());
	}

	@Test
	public void test05HorizontalXWin() {
		Board b1 = new Board();
		Board b2 = new Board();
		Board b3 = new Board();

		// X wins along bottom row
		assertTrue(b1.play(1));
		assertTrue(b1.play(7));
		assertTrue(b1.play(7));
		assertTrue(b1.play(7));
		assertTrue(b1.play(2));
		assertTrue(b1.play(1));
		assertEquals('U', b1.gameStatus());
		assertTrue(b1.play(4));
		assertTrue(b1.play(6));
		assertTrue(b1.play(6));
		assertTrue(b1.play(5));
		assertTrue(b1.play(3));
		assertEquals('X', b1.gameStatus());

		// X wins along top row
		assertTrue(b2.play(7));
		assertTrue(b2.play(6));
		assertTrue(b2.play(7));
		assertTrue(b2.play(6));
		assertTrue(b2.play(6));
		assertTrue(b2.play(7));
		assertTrue(b2.play(6));
		assertTrue(b2.play(7));
		assertTrue(b2.play(1));
		assertTrue(b2.play(2));
		assertTrue(b2.play(3));
		assertTrue(b2.play(4));
		assertTrue(b2.play(5));
		assertTrue(b2.play(4));
		assertTrue(b2.play(5));
		assertTrue(b2.play(5));
		assertTrue(b2.play(4));
		assertTrue(b2.play(5));
		assertTrue(b2.play(1));
		assertTrue(b2.play(4));
		assertEquals('U', b2.gameStatus());
		assertTrue(b2.play(1));
		assertTrue(b2.play(2));
		assertTrue(b2.play(7));
		assertTrue(b2.play(5));
		assertTrue(b2.play(5));
		assertTrue(b2.play(6));
		assertTrue(b2.play(6));
		assertTrue(b2.play(4));
		assertTrue(b2.play(7));
		assertTrue(b2.play(1));
		assertTrue(b2.play(4));
		assertEquals('X', b2.gameStatus());

		// X wins in a center row
		assertTrue(b3.play(1));
		assertTrue(b3.play(2));
		assertTrue(b3.play(3));
		assertTrue(b3.play(4));
		assertTrue(b3.play(5));
		assertTrue(b3.play(6));
		assertTrue(b3.play(7));
		assertTrue(b3.play(1));
		assertTrue(b3.play(2));
		assertTrue(b3.play(3));
		assertTrue(b3.play(4));
		assertTrue(b3.play(5));
		assertTrue(b3.play(6));
		assertTrue(b3.play(7));
		assertTrue(b3.play(1));
		assertTrue(b3.play(2));
		assertTrue(b3.play(3));
		assertTrue(b3.play(7));
		assertTrue(b3.play(1));
		assertTrue(b3.play(2));
		assertTrue(b3.play(4));
		assertTrue(b3.play(1));
		assertTrue(b3.play(6));
		assertTrue(b3.play(7));
		assertTrue(b3.play(1));
		assertTrue(b3.play(2));
		assertEquals('U', b3.gameStatus());
		assertTrue(b3.play(5));
		assertEquals('X', b3.gameStatus());
	}

	@Test
	public void test05HorizontalOWin() {
		Board b1 = new Board();
		Board b2 = new Board();
		Board b3 = new Board();

		// X wins along bottom row
		assertTrue(b1.play(6));
		assertTrue(b1.play(1));
		assertTrue(b1.play(7));
		assertTrue(b1.play(7));
		assertTrue(b1.play(7));
		assertTrue(b1.play(2));
		assertTrue(b1.play(1));
		assertTrue(b1.play(4));
		assertTrue(b1.play(6));
		assertEquals('U', b1.gameStatus());
		assertTrue(b1.play(6));
		assertTrue(b1.play(5));
		assertTrue(b1.play(3));
		assertEquals('O', b1.gameStatus());

		// O wins along top row
		assertTrue(b2.play(2));
		assertTrue(b2.play(7));
		assertTrue(b2.play(6));
		assertTrue(b2.play(7));
		assertTrue(b2.play(6));
		assertTrue(b2.play(6));
		assertTrue(b2.play(7));
		assertTrue(b2.play(6));
		assertTrue(b2.play(7));
		assertTrue(b2.play(1));
		assertTrue(b2.play(2));
		assertTrue(b2.play(3));
		assertTrue(b2.play(4));
		assertTrue(b2.play(5));
		assertTrue(b2.play(4));
		assertTrue(b2.play(5));
		assertTrue(b2.play(5));
		assertTrue(b2.play(4));
		assertTrue(b2.play(5));
		assertTrue(b2.play(1));
		assertTrue(b2.play(4));
		assertTrue(b2.play(1));
		assertTrue(b2.play(2));
		assertTrue(b2.play(7));
		assertTrue(b2.play(5));
		assertTrue(b2.play(5));
		assertEquals('U', b2.gameStatus());
		assertTrue(b2.play(6));
		assertTrue(b2.play(6));
		assertTrue(b2.play(4));
		assertTrue(b2.play(7));
		assertTrue(b2.play(1));
		assertTrue(b2.play(4));
		assertEquals('O', b2.gameStatus());

		// O wins in a center row
		assertTrue(b3.play(7));
		assertTrue(b3.play(1));
		assertTrue(b3.play(2));
		assertTrue(b3.play(3));
		assertTrue(b3.play(4));
		assertTrue(b3.play(5));
		assertTrue(b3.play(6));
		assertTrue(b3.play(7));
		assertTrue(b3.play(1));
		assertTrue(b3.play(2));
		assertTrue(b3.play(3));
		assertTrue(b3.play(4));
		assertTrue(b3.play(5));
		assertTrue(b3.play(6));
		assertTrue(b3.play(7));
		assertTrue(b3.play(1));
		assertTrue(b3.play(2));
		assertTrue(b3.play(3));
		assertTrue(b3.play(7));
		assertTrue(b3.play(1));
		assertTrue(b3.play(2));
		assertTrue(b3.play(4));
		assertTrue(b3.play(1));
		assertTrue(b3.play(6));
		assertTrue(b3.play(7));
		assertTrue(b3.play(1));
		assertTrue(b3.play(2));
		assertEquals('U', b3.gameStatus());
		assertTrue(b3.play(5));
		assertEquals('O', b3.gameStatus());
	}

	@Test
	public void test05VerticalXWin() {
		Board b1 = new Board();
		Board b2 = new Board();
		Board b3 = new Board();

		// X wins along left column
		assertTrue(b1.play(1));
		assertTrue(b1.play(2));
		assertTrue(b1.play(1));
		assertTrue(b1.play(3));
		assertTrue(b1.play(4));
		assertEquals('U', b1.gameStatus());
		assertTrue(b1.play(2));
		assertTrue(b1.play(1));
		assertTrue(b1.play(7));
		assertTrue(b1.play(6));
		assertTrue(b1.play(7));
		assertTrue(b1.play(1));
		assertEquals('X', b1.gameStatus());

		// X wins along right column
		assertTrue(b2.play(7));
		assertTrue(b2.play(7));
		assertTrue(b2.play(7));
		assertTrue(b2.play(6));
		assertTrue(b2.play(1));
		assertTrue(b2.play(2));
		assertTrue(b2.play(7));
		assertTrue(b2.play(6));
		assertTrue(b2.play(6));
		assertTrue(b2.play(5));
		assertTrue(b2.play(7));
		assertTrue(b2.play(5));
		assertTrue(b2.play(5));
		assertEquals('U', b2.gameStatus());
		assertTrue(b2.play(6));
		assertTrue(b2.play(6));
		assertTrue(b2.play(2));
		assertTrue(b2.play(7));
		assertEquals('X', b2.gameStatus());

		// X wins in center column
		assertTrue(b3.play(1));
		assertTrue(b3.play(2));
		assertTrue(b3.play(3));
		assertTrue(b3.play(4));
		assertTrue(b3.play(5));
		assertTrue(b3.play(6));
		assertTrue(b3.play(7));
		assertTrue(b3.play(1));
		assertTrue(b3.play(4));
		assertTrue(b3.play(2));
		assertTrue(b3.play(7));
		assertTrue(b3.play(1));
		assertTrue(b3.play(4));
		assertTrue(b3.play(7));
		assertTrue(b3.play(4));
		assertTrue(b3.play(5));
		assertTrue(b3.play(5));
		assertTrue(b3.play(5));
		assertEquals('U', b3.gameStatus());
		assertTrue(b3.play(4));
		assertEquals('X', b3.gameStatus());
	}

	@Test
	public void test05VerticalOWin() {
		Board b1 = new Board();
		Board b2 = new Board();
		Board b3 = new Board();

		// O wins along left column
		assertTrue(b1.play(1));
		assertTrue(b1.play(1));
		assertTrue(b1.play(2));
		assertTrue(b1.play(1));
		assertTrue(b1.play(3));
		assertTrue(b1.play(4));
		assertEquals('U', b1.gameStatus());
		assertTrue(b1.play(2));
		assertTrue(b1.play(1));
		assertTrue(b1.play(7));
		assertTrue(b1.play(6));
		assertTrue(b1.play(7));
		assertTrue(b1.play(1));
		assertEquals('O', b1.gameStatus());

		// O wins along right column
		assertTrue(b2.play(1));
		assertTrue(b2.play(7));
		assertTrue(b2.play(7));
		assertTrue(b2.play(7));
		assertTrue(b2.play(6));
		assertTrue(b2.play(1));
		assertTrue(b2.play(2));
		assertTrue(b2.play(7));
		assertTrue(b2.play(6));
		assertTrue(b2.play(6));
		assertTrue(b2.play(5));
		assertTrue(b2.play(7));
		assertTrue(b2.play(5));
		assertTrue(b2.play(5));
		assertEquals('U', b2.gameStatus());
		assertTrue(b2.play(6));
		assertTrue(b2.play(6));
		assertTrue(b2.play(2));
		assertTrue(b2.play(7));
		assertEquals('O', b2.gameStatus());

		// O wins in center column
		assertTrue(b3.play(2));
		assertTrue(b3.play(1));
		assertTrue(b3.play(2));
		assertTrue(b3.play(3));
		assertTrue(b3.play(4));
		assertTrue(b3.play(5));
		assertTrue(b3.play(6));
		assertTrue(b3.play(7));
		assertTrue(b3.play(1));
		assertTrue(b3.play(4));
		assertTrue(b3.play(2));
		assertTrue(b3.play(7));
		assertTrue(b3.play(1));
		assertTrue(b3.play(4));
		assertTrue(b3.play(7));
		assertTrue(b3.play(4));
		assertTrue(b3.play(5));
		assertTrue(b3.play(5));
		assertTrue(b3.play(5));
		assertEquals('U', b3.gameStatus());
		assertTrue(b3.play(4));
		assertEquals('O', b3.gameStatus());
	}

	@Test
	public void test10DiagonalUpXWin() {
		Board b1 = new Board();
		Board b2 = new Board();
		Board b3 = new Board();

		// X wins in bottom left
		assertTrue(b1.play(1));
		assertTrue(b1.play(2));
		assertTrue(b1.play(2));
		assertTrue(b1.play(3));
		assertTrue(b1.play(3));
		assertEquals('U', b1.gameStatus());
		assertTrue(b1.play(4));
		assertTrue(b1.play(4));
		assertTrue(b1.play(6));
		assertTrue(b1.play(6));
		assertTrue(b1.play(6));
		assertTrue(b1.play(6));
		assertTrue(b1.play(4));
		assertTrue(b1.play(4));
		assertTrue(b1.play(4));
		assertTrue(b1.play(3));
		assertEquals('X', b1.gameStatus());

		// X wins in top right
		assertTrue(b2.play(7));
		assertTrue(b2.play(7));
		assertTrue(b2.play(7));
		assertTrue(b2.play(7));
		assertTrue(b2.play(7));
		assertTrue(b2.play(6));
		assertTrue(b2.play(7));
		assertTrue(b2.play(6));
		assertTrue(b2.play(6));
		assertTrue(b2.play(6));
		assertTrue(b2.play(6));
		assertTrue(b2.play(5));
		assertTrue(b2.play(1));
		assertTrue(b2.play(5));
		assertTrue(b2.play(4));
		assertTrue(b2.play(5));
		assertEquals('U', b2.gameStatus());
		assertTrue(b2.play(4));
		assertTrue(b2.play(1));
		assertTrue(b2.play(4));
		assertTrue(b2.play(1));
		assertTrue(b2.play(1));
		assertTrue(b2.play(2));
		assertTrue(b2.play(5));
		assertEquals('X', b2.gameStatus());

		// X wins in middle
		assertTrue(b3.play(3));
		assertTrue(b3.play(1));
		assertTrue(b3.play(3));
		assertTrue(b3.play(1));
		assertTrue(b3.play(4));
		assertTrue(b3.play(4));
		assertTrue(b3.play(4));
		assertTrue(b3.play(5));
		assertTrue(b3.play(6));
		assertTrue(b3.play(5));
		assertTrue(b3.play(6));
		assertTrue(b3.play(6));
		assertTrue(b3.play(5));
		assertTrue(b3.play(6));
		assertTrue(b3.play(6));
		assertTrue(b3.play(2));
		assertTrue(b3.play(4));
		assertTrue(b3.play(2));
		assertEquals('U', b3.gameStatus());
		assertTrue(b3.play(5));
		assertEquals('X', b3.gameStatus());
	}

	@Test
	public void test10DiagonalUpOWin() {
		Board b1 = new Board();
		Board b2 = new Board();
		Board b3 = new Board();

		// O wins in bottom left
		assertTrue(b1.play(5));
		assertTrue(b1.play(1));
		assertTrue(b1.play(2));
		assertTrue(b1.play(2));
		assertTrue(b1.play(3));
		assertTrue(b1.play(3));
		assertEquals('U', b1.gameStatus());
		assertTrue(b1.play(7));
		assertTrue(b1.play(4));
		assertTrue(b1.play(6));
		assertTrue(b1.play(6));
		assertTrue(b1.play(6));
		assertTrue(b1.play(6));
		assertTrue(b1.play(4));
		assertTrue(b1.play(3));
		assertTrue(b1.play(4));
		assertTrue(b1.play(4));
		assertEquals('O', b1.gameStatus());

		// O wins in top right
		assertTrue(b2.play(3));
		assertTrue(b2.play(7));
		assertTrue(b2.play(7));
		assertTrue(b2.play(7));
		assertTrue(b2.play(7));
		assertTrue(b2.play(7));
		assertTrue(b2.play(6));
		assertTrue(b2.play(7));
		assertTrue(b2.play(6));
		assertTrue(b2.play(6));
		assertTrue(b2.play(6));
		assertTrue(b2.play(6));
		assertTrue(b2.play(5));
		assertTrue(b2.play(1));
		assertTrue(b2.play(5));
		assertEquals('U', b2.gameStatus());
		assertTrue(b2.play(4));
		assertTrue(b2.play(5));
		assertTrue(b2.play(4));
		assertTrue(b2.play(1));
		assertTrue(b2.play(4));
		assertTrue(b2.play(1));
		assertTrue(b2.play(1));
		assertTrue(b2.play(2));
		assertTrue(b2.play(5));
		assertEquals('O', b2.gameStatus());

		// O wins in middle
		assertTrue(b3.play(2));
		assertTrue(b3.play(3));
		assertTrue(b3.play(1));
		assertTrue(b3.play(3));
		assertTrue(b3.play(1));
		assertTrue(b3.play(4));
		assertTrue(b3.play(4));
		assertTrue(b3.play(4));
		assertTrue(b3.play(5));
		assertTrue(b3.play(6));
		assertTrue(b3.play(5));
		assertTrue(b3.play(6));
		assertTrue(b3.play(6));
		assertTrue(b3.play(5));
		assertTrue(b3.play(6));
		assertTrue(b3.play(6));
		assertTrue(b3.play(2));
		assertTrue(b3.play(4));
		assertTrue(b3.play(2));
		assertEquals('U', b3.gameStatus());
		assertTrue(b3.play(5));
		assertEquals('O', b3.gameStatus());
	}

	@Test
	public void test10DiagonalDownXWin() {
		Board b1 = new Board();
		Board b2 = new Board();
		Board b3 = new Board();

		// X wins in bottom left
		assertEquals('U', b1.gameStatus());
		assertTrue(b1.play(1));
		assertTrue(b1.play(1));
		assertTrue(b1.play(7));
		assertTrue(b1.play(2));
		assertTrue(b1.play(3));
		assertTrue(b1.play(5));
		assertTrue(b1.play(3));
		assertTrue(b1.play(1));
		assertTrue(b1.play(1));
		assertTrue(b1.play(6));
		assertTrue(b1.play(4));
		assertTrue(b1.play(5));
		assertTrue(b1.play(5));
		assertTrue(b1.play(6));
		assertTrue(b1.play(4));
		assertTrue(b1.play(2));
		assertTrue(b1.play(1));
		assertTrue(b1.play(3));
		assertTrue(b1.play(2));
		assertEquals('X', b1.gameStatus());

		// X wins in top right
		assertTrue(b2.play(6));
		assertTrue(b2.play(7));
		assertTrue(b2.play(6));
		assertTrue(b2.play(7));
		assertTrue(b2.play(7));
		assertTrue(b2.play(6));
		assertTrue(b2.play(6));
		assertTrue(b2.play(5));
		assertTrue(b2.play(4));
		assertTrue(b2.play(5));
		assertTrue(b2.play(4));
		assertTrue(b2.play(4));
		assertTrue(b2.play(5));
		assertTrue(b2.play(4));
		assertTrue(b2.play(5));
		assertEquals('U', b2.gameStatus());
		assertTrue(b2.play(4));
		assertTrue(b2.play(5));
		assertTrue(b2.play(1));
		assertTrue(b2.play(2));
		assertTrue(b2.play(1));
		assertTrue(b2.play(4));
		assertEquals('X', b2.gameStatus());

		// X wins in middle
		assertTrue(b3.play(5));
		assertTrue(b3.play(4));
		assertTrue(b3.play(5));
		assertTrue(b3.play(4));
		assertTrue(b3.play(4));
		assertTrue(b3.play(6));
		assertTrue(b3.play(3));
		assertTrue(b3.play(2));
		assertTrue(b3.play(3));
		assertTrue(b3.play(2));
		assertTrue(b3.play(2));
		assertTrue(b3.play(3));
		assertTrue(b3.play(3));
		assertTrue(b3.play(2));
		assertTrue(b3.play(1));
		assertTrue(b3.play(1));
		assertTrue(b3.play(1));
		assertTrue(b3.play(1));
		assertEquals('U', b3.gameStatus());
		assertTrue(b3.play(2));
		assertEquals('X', b3.gameStatus());
	}

	@Test
	public void test10DiagonalDownOWin() {
		Board b1 = new Board();
		Board b2 = new Board();
		Board b3 = new Board();

		// O wins in bottom left
		assertEquals('U', b1.gameStatus());
		assertTrue(b1.play(7));
		assertTrue(b1.play(1));
		assertTrue(b1.play(1));
		assertTrue(b1.play(7));
		assertTrue(b1.play(2));
		assertTrue(b1.play(3));
		assertTrue(b1.play(5));
		assertTrue(b1.play(3));
		assertTrue(b1.play(1));
		assertTrue(b1.play(1));
		assertTrue(b1.play(6));
		assertTrue(b1.play(4));
		assertTrue(b1.play(5));
		assertTrue(b1.play(5));
		assertTrue(b1.play(6));
		assertTrue(b1.play(4));
		assertTrue(b1.play(2));
		assertTrue(b1.play(1));
		assertTrue(b1.play(3));
		assertTrue(b1.play(2));
		assertEquals('O', b1.gameStatus());

		// O wins in top right
		assertTrue(b2.play(1));
		assertTrue(b2.play(6));
		assertTrue(b2.play(7));
		assertTrue(b2.play(6));
		assertTrue(b2.play(7));
		assertTrue(b2.play(7));
		assertTrue(b2.play(6));
		assertTrue(b2.play(6));
		assertTrue(b2.play(5));
		assertTrue(b2.play(4));
		assertTrue(b2.play(5));
		assertTrue(b2.play(4));
		assertTrue(b2.play(4));
		assertEquals('U', b2.gameStatus());
		assertTrue(b2.play(5));
		assertTrue(b2.play(4));
		assertTrue(b2.play(5));
		assertTrue(b2.play(4));
		assertTrue(b2.play(5));
		assertTrue(b2.play(1));
		assertTrue(b2.play(2));
		assertTrue(b2.play(1));
		assertTrue(b2.play(4));
		assertEquals('O', b2.gameStatus());

		// O wins in middle
		assertTrue(b3.play(6));
		assertTrue(b3.play(5));
		assertTrue(b3.play(4));
		assertTrue(b3.play(5));
		assertTrue(b3.play(4));
		assertTrue(b3.play(4));
		assertTrue(b3.play(6));
		assertTrue(b3.play(3));
		assertTrue(b3.play(2));
		assertTrue(b3.play(3));
		assertTrue(b3.play(2));
		assertTrue(b3.play(2));
		assertTrue(b3.play(3));
		assertTrue(b3.play(3));
		assertTrue(b3.play(2));
		assertTrue(b3.play(1));
		assertTrue(b3.play(1));
		assertTrue(b3.play(1));
		assertTrue(b3.play(1));
		assertEquals('U', b3.gameStatus());
		assertTrue(b3.play(2));
		assertEquals('O', b3.gameStatus());
	}

	@Test
	public void test10IllegalMove() {
		Board b1 = new Board();
		Board b2 = new Board();
		assertEquals('X', b1.currentPlayer());
		assertEquals('X', b2.currentPlayer());
		assertFalse(b1.play(-5));
		assertTrue(b1.play(3));
		assertEquals('O', b1.currentPlayer());
		assertEquals('X', b2.currentPlayer());
		assertTrue(b1.play(4));
		assertFalse(b1.play(-2));
		assertEquals('X', b1.currentPlayer());
		assertEquals('X', b2.currentPlayer());
		assertFalse(b1.play(8));
		assertTrue(b1.play(1));
		assertEquals('O', b1.currentPlayer());
		assertEquals('X', b2.currentPlayer());
		assertTrue(b2.play(1));
		assertFalse(b1.play(8));
		assertEquals('O', b1.currentPlayer());
		assertEquals('O', b2.currentPlayer());
		assertTrue(b2.play(2));
		assertEquals('O', b1.currentPlayer());
		assertEquals('X', b2.currentPlayer());
		assertTrue(b2.play(4));
		assertTrue(b1.play(4));
		assertEquals('X', b1.currentPlayer());
		assertEquals('O', b2.currentPlayer());
		assertTrue(b1.play(6));
		assertTrue(b1.play(6));
		assertTrue(b1.play(6));
		assertTrue(b1.play(6));
		assertTrue(b1.play(6));
		assertTrue(b1.play(6));
		assertFalse(b1.play(6));
	}

	@Test
	public void test10Exception() {
		Board b1 = new Board();
		Board b2 = new Board();
		Board b3 = new Board();


		assertTrue(b1.play(1));
		assertTrue(b1.play(7));
		assertTrue(b1.play(7));
		assertTrue(b1.play(7));
		assertTrue(b1.play(2));
		assertTrue(b1.play(1));
		assertEquals('U', b1.gameStatus());
		assertTrue(b1.play(4));
		assertTrue(b1.play(6));
		assertTrue(b1.play(6));
		assertTrue(b1.play(5));
		assertTrue(b1.play(3));
		// GAME OVER, X won
		try {
			b1.play(1);
			fail("Game was over, RuntimeException should have been thrown");
		} catch (RuntimeException e) {
		}

	
		
		assertTrue(b2.play(2));
		assertTrue(b2.play(1));
		assertTrue(b2.play(2));
		assertTrue(b2.play(3));
		assertTrue(b2.play(4));
		assertTrue(b2.play(5));
		assertTrue(b2.play(6));
		assertTrue(b2.play(7));
		assertTrue(b2.play(1));
		assertTrue(b2.play(4));
		assertTrue(b2.play(2));
		assertTrue(b2.play(7));
		assertTrue(b2.play(1));
		assertTrue(b2.play(4));
		assertTrue(b2.play(7));
		assertTrue(b2.play(4));
		assertTrue(b2.play(5));
		assertTrue(b2.play(5));
		assertTrue(b2.play(5));
		assertTrue(b2.play(4));
		// GAME OVER, O WON
		try {
			b1.play(7);
			fail("Game was over, RuntimeException should have been thrown");
		} catch (RuntimeException e) {
		}


		
		assertTrue(b3.play(1));
		assertTrue(b3.play(2));
		assertTrue(b3.play(1));
		assertTrue(b3.play(2));
		assertTrue(b3.play(3));
		assertTrue(b3.play(4));
		assertTrue(b3.play(3));
		assertTrue(b3.play(4));
		assertTrue(b3.play(5));
		assertTrue(b3.play(6));
		assertTrue(b3.play(5));
		assertTrue(b3.play(6));
		assertTrue(b3.play(7));
		assertTrue(b3.play(1));
		assertTrue(b3.play(2));
		assertTrue(b3.play(1));
		assertTrue(b3.play(2));
		assertTrue(b3.play(3));
		assertTrue(b3.play(4));
		assertTrue(b3.play(3));
		assertTrue(b3.play(4));
		assertTrue(b3.play(5));
		assertTrue(b3.play(6));
		assertTrue(b3.play(5));
		assertTrue(b3.play(6));
		assertTrue(b3.play(7));
		assertTrue(b3.play(1));
		assertTrue(b3.play(2));
		assertTrue(b3.play(1));
		assertTrue(b3.play(2));
		assertTrue(b3.play(3));
		assertTrue(b3.play(4));
		assertTrue(b3.play(3));
		assertTrue(b3.play(4));
		assertTrue(b3.play(5));
		assertTrue(b3.play(6));
		assertTrue(b3.play(5));
		assertTrue(b3.play(6));
		assertTrue(b3.play(7));
		assertTrue(b3.play(7));
		assertTrue(b3.play(7));
		assertTrue(b3.play(7));

		// GAME OVER, it's a draw
		System.out.println(b3);
		try {
			b3.play(4);
			fail("Game was over, RuntimeException should have been thrown");
		} catch (RuntimeException e) {
		}
	}
}
