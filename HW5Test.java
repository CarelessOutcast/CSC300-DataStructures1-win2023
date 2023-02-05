package hw5;

//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HW5Test {
	
	@Rule
    public Timeout globalTimeout = Timeout.seconds(1);
	
	@Test
	public void test05newDeque() {
		Deque<Integer> d = new Deque<Integer>();
		assertTrue(d.isEmpty());
		assertEquals(0, d.size());
	}
	
	@Test
	public void test05SinglePush() {
		Deque<Integer> d = new Deque<Integer>();
		d.pushFront(5);
		assertFalse(d.isEmpty());
		assertEquals(1, d.size());
		d = new Deque<Integer>();
		d.pushBack(5);
		assertFalse(d.isEmpty());
		assertEquals(1, d.size());
	}
	
	@Test
	public void test10SinglePushSinglePop() {
		Deque<Integer> d = new Deque<Integer>();
		d.pushFront(3);
		assertEquals(3, d.popFront().intValue());
		assertTrue(d.isEmpty());
		assertEquals(0, d.size());
		d = new Deque<Integer>();
		d.pushFront(9);
		assertEquals(9, d.popBack().intValue());
		assertTrue(d.isEmpty());
		assertEquals(0, d.size());
		d = new Deque<Integer>();
		d.pushBack(42);
		assertEquals(42, d.popFront().intValue());
		assertTrue(d.isEmpty());
		assertEquals(0, d.size());
		d = new Deque<Integer>();
		d.pushBack(11);
		assertEquals(11, d.popBack().intValue());
		assertTrue(d.isEmpty());
		assertEquals(0, d.size());
	}
	
	@Test
	public void test10emptyPop() {
		Deque<Integer> d = new Deque<Integer>();
		try {
			d.popFront();
			fail("popping empty deque did not produce exception");
		} catch (NoSuchElementException e) {}
		d = new Deque<Integer>();
		try {
			d.popBack();
			fail("popping empty deque did not produce exception");
		} catch (NoSuchElementException e) {}
	}
	

	@Test
	public void test10pushFrontPopBack() {
		Deque<Integer> d1 = new Deque<Integer>();
		Deque<Integer> d2 = new Deque<Integer>();
		for(int i = 0; i < 10; i++) {
			d1.pushFront(i*11);
			d2.pushFront(i*11);
		}
		for(int i = 0; i < 10; i++)
			assertEquals(i*11, d1.popBack().intValue());
		for(int i = 0; i < 10; i++)
			assertEquals(i*11, d2.popBack().intValue());
	}
	
	@Test
	public void test10pushBackPopFront() {
		Deque<Integer> d1 = new Deque<Integer>();
		Deque<Integer> d2 = new Deque<Integer>();
		for(int i = 0; i < 10; i++) {
			d1.pushBack(i*11);
			d2.pushBack(i*11);
		}
		for(int i = 0; i < 10; i++)
			assertEquals(i*11, d1.popFront().intValue());
		for(int i = 0; i < 10; i++)
			assertEquals(i*11, d2.popFront().intValue());
	}
	
	@Test
	public void test10pushFrontPopFront() {
		Deque<Integer> d1 = new Deque<Integer>();
		Deque<Integer> d2 = new Deque<Integer>();
		for(int i = 0; i < 10; i++) {
			d1.pushFront(i*11);
			d2.pushFront(i*11);
		}
		for(int i = 9; i > 0; i--)
			assertEquals(i*11, d1.popFront().intValue());
		for(int i = 9; i > 0; i--)
			assertEquals(i*11, d2.popFront().intValue());
	}
	
	@Test
	public void test10pushBackPopBack() {
		Deque<Integer> d1 = new Deque<Integer>();
		Deque<Integer> d2 = new Deque<Integer>();
		for(int i = 0; i < 10; i++) {
			d1.pushBack(i*11);
			d2.pushBack(i*11);
		}
		for(int i = 9; i > 0; i--)
			assertEquals(i*11, d1.popBack().intValue());
		for(int i = 9; i > 0; i--)
			assertEquals(i*11, d2.popBack().intValue());
	}
	
	@Test
	public void test10tooManyPops() {
		Deque<Integer> d1 = new Deque<Integer>();
		Deque<Integer> d2 = new Deque<Integer>();
		for(int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				d1.pushFront(i);
				d2.pushBack(i);
			}
			else {
				d1.pushBack(i);
				d2.pushFront(i);
			}
		}
		for(int i = 0; i < 5; i++) {
			d1.popFront();
			d2.popBack();
		}
		for(int i = 0; i < 5; i++) {
			d1.popBack();
			d2.popFront();
		}
		try {
			d1.popFront();
			fail("popping empty deque did not produce exception");
		} catch (NoSuchElementException e) {}
		try {
			d2.popBack();
			fail("popping empty deque did not produce exception");
		} catch (NoSuchElementException e) {}
	}
	
	@Test
	public void test05pushFrontEmptyFront() {
		Deque<Integer> d1 = new Deque<Integer>();
		Deque<Integer> d2 = new Deque<Integer>();
		Deque<Integer> d3 = new Deque<Integer>();
		Deque<Integer> d4 = new Deque<Integer>();
		
		d1.pushFront(23);
		d2.pushFront(23);
		d3.pushFront(23);
		d4.pushFront(23);
		
		d1.pushFront(3);
		d2.pushFront(3);
		d3.pushFront(3);
		d4.pushFront(3);
		
		d1.popFront();
		d2.popFront();
		d3.popFront();
		d4.popFront();
		
		d1.popFront();
		d2.popFront();
		d3.popFront();
		d4.popFront();
		
		d1.pushFront(78);
		d1.pushFront(8);
		assertEquals(8, d1.popFront().intValue());
		assertEquals(78, d1.popFront().intValue());
		assertTrue(d1.isEmpty());
		assertEquals(0, d1.size());
		try {
			d1.popFront();
			fail("popping empty deque did not produce exception");
		} catch(NoSuchElementException e) {}
		
		d2.pushFront(78);
		d2.pushFront(8);
		assertEquals(78, d2.popBack().intValue());
		assertEquals(8, d2.popBack().intValue());
		assertTrue(d2.isEmpty());
		assertEquals(0, d2.size());
		try {
			d2.popFront();
			fail("popping empty deque did not produce exception");
		} catch(NoSuchElementException e) {}
		
		d3.pushBack(78);
		d3.pushBack(8);
		assertEquals(8, d3.popBack().intValue());
		assertEquals(78, d3.popBack().intValue());
		assertTrue(d3.isEmpty());
		assertEquals(0, d3.size());
		try {
			d3.popFront();
			fail("popping empty deque did not produce exception");
		} catch(NoSuchElementException e) {}
		
		d4.pushBack(78);
		d4.pushBack(8);
		assertEquals(78, d4.popFront().intValue());
		assertEquals(8, d4.popFront().intValue());
		assertTrue(d4.isEmpty());
		assertEquals(0, d4.size());
		try {
			d4.popFront();
			fail("popping empty deque did not produce exception");
		} catch(NoSuchElementException e) {}
	}
	
	@Test
	public void test05pushFrontEmptyBack() {
		Deque<Integer> d1 = new Deque<Integer>();
		Deque<Integer> d2 = new Deque<Integer>();
		Deque<Integer> d3 = new Deque<Integer>();
		Deque<Integer> d4 = new Deque<Integer>();
		
		d1.pushFront(23);
		d2.pushFront(23);
		d3.pushFront(23);
		d4.pushFront(23);
		
		d1.pushFront(3);
		d2.pushFront(3);
		d3.pushFront(3);
		d4.pushFront(3);
		
		d1.popBack();
		d2.popBack();
		d3.popBack();
		d4.popBack();
		
		d1.popBack();
		d2.popBack();
		d3.popBack();
		d4.popBack();
		
		d1.pushFront(78);
		d1.pushFront(8);
		assertEquals(8, d1.popFront().intValue());
		assertEquals(78, d1.popFront().intValue());
		assertTrue(d1.isEmpty());
		assertEquals(0, d1.size());
		try {
			d1.popFront();
			fail("popping empty deque did not produce exception");
		} catch(NoSuchElementException e) {}
		
		d2.pushFront(78);
		d2.pushFront(8);
		assertEquals(78, d2.popBack().intValue());
		assertEquals(8, d2.popBack().intValue());
		assertTrue(d2.isEmpty());
		assertEquals(0, d2.size());
		try {
			d2.popFront();
			fail("popping empty deque did not produce exception");
		} catch(NoSuchElementException e) {}
		
		d3.pushBack(78);
		d3.pushBack(8);
		assertEquals(8, d3.popBack().intValue());
		assertEquals(78, d3.popBack().intValue());
		assertTrue(d3.isEmpty());
		assertEquals(0, d3.size());
		try {
			d3.popFront();
			fail("popping empty deque did not produce exception");
		} catch(NoSuchElementException e) {}
		
		d4.pushBack(78);
		d4.pushBack(8);
		assertEquals(78, d4.popFront().intValue());
		assertEquals(8, d4.popFront().intValue());
		assertTrue(d4.isEmpty());
		assertEquals(0, d4.size());
		try {
			d4.popFront();
			fail("popping empty deque did not produce exception");
		} catch(NoSuchElementException e) {}
	}
	
	@Test
	public void test05pushBackEmptyFront() {
		Deque<Integer> d1 = new Deque<Integer>();
		Deque<Integer> d2 = new Deque<Integer>();
		Deque<Integer> d3 = new Deque<Integer>();
		Deque<Integer> d4 = new Deque<Integer>();
		
		d1.pushBack(23);
		d2.pushBack(23);
		d3.pushBack(23);
		d4.pushBack(23);
		
		d1.pushBack(3);
		d2.pushBack(3);
		d3.pushBack(3);
		d4.pushBack(3);
		
		d1.popFront();
		d2.popFront();
		d3.popFront();
		d4.popFront();
		
		d1.popFront();
		d2.popFront();
		d3.popFront();
		d4.popFront();
		
		d1.pushFront(78);
		d1.pushFront(8);
		assertEquals(8, d1.popFront().intValue());
		assertEquals(78, d1.popFront().intValue());
		assertTrue(d1.isEmpty());
		assertEquals(0, d1.size());
		try {
			d1.popFront();
			fail("popping empty deque did not produce exception");
		} catch(NoSuchElementException e) {}
		
		d2.pushFront(78);
		d2.pushFront(8);
		assertEquals(78, d2.popBack().intValue());
		assertEquals(8, d2.popBack().intValue());
		assertTrue(d2.isEmpty());
		assertEquals(0, d2.size());
		try {
			d2.popFront();
			fail("popping empty deque did not produce exception");
		} catch(NoSuchElementException e) {}
		
		d3.pushBack(78);
		d3.pushBack(8);
		assertEquals(8, d3.popBack().intValue());
		assertEquals(78, d3.popBack().intValue());
		assertTrue(d3.isEmpty());
		assertEquals(0, d3.size());
		try {
			d3.popFront();
			fail("popping empty deque did not produce exception");
		} catch(NoSuchElementException e) {}
		
		d4.pushBack(78);
		d4.pushBack(8);
		assertEquals(78, d4.popFront().intValue());
		assertEquals(8, d4.popFront().intValue());
		assertTrue(d4.isEmpty());
		assertEquals(0, d4.size());
		try {
			d4.popFront();
			fail("popping empty deque did not produce exception");
		} catch(NoSuchElementException e) {}
	}
	
	@Test
	public void test05pushBackEmptyBack() {
		Deque<Integer> d1 = new Deque<Integer>();
		Deque<Integer> d2 = new Deque<Integer>();
		Deque<Integer> d3 = new Deque<Integer>();
		Deque<Integer> d4 = new Deque<Integer>();
		
		d1.pushBack(23);
		d2.pushBack(23);
		d3.pushBack(23);
		d4.pushBack(23);
		
		d1.pushBack(3);
		d2.pushBack(3);
		d3.pushBack(3);
		d4.pushBack(3);
		
		d1.popBack();
		d2.popBack();
		d3.popBack();
		d4.popBack();
		
		d1.popBack();
		d2.popBack();
		d3.popBack();
		d4.popBack();
		
		d1.pushFront(78);
		d1.pushFront(8);
		assertEquals(8, d1.popFront().intValue());
		assertEquals(78, d1.popFront().intValue());
		assertTrue(d1.isEmpty());
		assertEquals(0, d1.size());
		try {
			d1.popFront();
			fail("popping empty deque did not produce exception");
		} catch(NoSuchElementException e) {}
		
		d2.pushFront(78);
		d2.pushFront(8);
		assertEquals(78, d2.popBack().intValue());
		assertEquals(8, d2.popBack().intValue());
		assertTrue(d2.isEmpty());
		assertEquals(0, d2.size());
		try {
			d2.popFront();
			fail("popping empty deque did not produce exception");
		} catch(NoSuchElementException e) {}
		
		d3.pushBack(78);
		d3.pushBack(8);
		assertEquals(8, d3.popBack().intValue());
		assertEquals(78, d3.popBack().intValue());
		assertTrue(d3.isEmpty());
		assertEquals(0, d3.size());
		try {
			d3.popFront();
			fail("popping empty deque did not produce exception");
		} catch(NoSuchElementException e) {}
		
		d4.pushBack(78);
		d4.pushBack(8);
		assertEquals(78, d4.popFront().intValue());
		assertEquals(8, d4.popFront().intValue());
		assertTrue(d4.isEmpty());
		assertEquals(0, d4.size());
		try {
			d4.popFront();
			fail("popping empty deque did not produce exception");
		} catch(NoSuchElementException e) {}
	}
}
