package hw3;


import static org.junit.Assert.*;

import org.junit.Test;

public class myTest {

    @Test 
    public void HorizontalXWinTest()
    {
        Board b = new Board();

        // .......
        // .......
        // ..O....
        // ..XXXX.
        // ..XOOO.
        // 1234567

        assertTrue(b.play(3)); // 1
        assertTrue(b.play(4)); // 2
        assertTrue(b.play(3)); // 3
        assertTrue(b.play(5)); // 4
        assertTrue(b.play(4)); // 5
        assertTrue(b.play(6)); // 6
        assertTrue(b.play(5)); // 7
        assertTrue(b.play(3)); // 8
        assertTrue(b.play(6)); // 9

        assertEquals('X',b.gameStatus());
    }

    @Test
    public void VerticalXWinTest()
    {
        Board b = new Board();

        // .......
        // ..X....
        // ..XO...
        // ..XXXO.
        // ..XOOO.
        // 1234567

        assertTrue(b.play(3)); // 1:X
        assertTrue(b.play(4)); // 2
        assertTrue(b.play(3)); // 3:X
        assertTrue(b.play(4)); // 4
        assertTrue(b.play(3)); // 5:X
        assertTrue(b.play(4)); // 6
        assertTrue(b.play(3)); // 7:X

        assertEquals('X',b.gameStatus());
    }

    @Test 
    public void HorizontalOWinTest()
    {
        Board b = new Board();

        // .......
        // .......
        // .......
        // ..XXX..
        // ..XOOOO
        // 1234567

        assertTrue(b.play(3)); // 1:X
        assertTrue(b.play(4)); // 2
        assertTrue(b.play(3)); // 3:X
        assertTrue(b.play(5)); // 4
        assertTrue(b.play(4)); // 5:X
        assertTrue(b.play(6)); // 6
        assertTrue(b.play(5)); // 7:X
        assertTrue(b.play(7)); // 8

        assertEquals('O',b.gameStatus());
    }
}


