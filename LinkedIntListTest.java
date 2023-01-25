package hw4;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class LinkedIntListTest {
	
	// @Rule
	// public Timeout globalTimeout = Timeout.seconds(4);

	@Test
	public void testRemoveLastOccurrenceEmpty05() {
		LinkedIntList l1 = new LinkedIntList();
		assertFalse(l1.removeLastOccurrence(0));
		assertFalse(l1.removeLastOccurrence(1));
		assertFalse(l1.removeLastOccurrence(-1));
		assertFalse(l1.removeLastOccurrence(42));
		assertFalse(l1.removeLastOccurrence(3));
		assertEquals("[]", l1.toString());
	}
	
	@Test
	public void testRemoveLastOccurrenceNotPresent05() {
		int[] data1 = {5, 0, -1, 42, 9, -5};
		int[] data2 = {6, 0, 1, 42, 99, 4};
		LinkedIntList l1 = new LinkedIntList(data1);
		LinkedIntList l2 = new LinkedIntList(data2);
		assertFalse(l1.removeLastOccurrence(1));
		assertFalse(l1.removeLastOccurrence(2));
		assertFalse(l1.removeLastOccurrence(-3));
		assertFalse(l1.removeLastOccurrence(40));
		assertFalse(l1.removeLastOccurrence(100));
		assertEquals("[5, 0, -1, 42, 9, -5]", l1.toString());
		assertEquals("[6, 0, 1, 42, 99, 4]", l2.toString());
	}
	
	@Test
	public void testRemoveLastOccurrenceSingleOccurrence05() {
		int[] data1 = {0, 1, -1, 92, 19, -15, 22, 400, -7, 2};
		int[] data2 = {1, 2, 0, 93, 20, -15, 23, 401, -6, 3};
		LinkedIntList l1 = new LinkedIntList(data1);
		LinkedIntList l2 = new LinkedIntList(data2);
		assertTrue(l1.removeLastOccurrence(0));
		assertEquals("[1, -1, 92, 19, -15, 22, 400, -7, 2]", l1.toString());
		assertEquals("[1, 2, 0, 93, 20, -15, 23, 401, -6, 3]", l2.toString());
		assertTrue(l2.removeLastOccurrence(3));
		assertEquals("[1, -1, 92, 19, -15, 22, 400, -7, 2]", l1.toString());
		assertEquals("[1, 2, 0, 93, 20, -15, 23, 401, -6]", l2.toString());
		assertTrue(l1.removeLastOccurrence(-15));
		assertEquals("[1, -1, 92, 19, 22, 400, -7, 2]", l1.toString());
		assertEquals("[1, 2, 0, 93, 20, -15, 23, 401, -6]", l2.toString());
		assertTrue(l2.removeLastOccurrence(23));
		assertEquals("[1, -1, 92, 19, 22, 400, -7, 2]", l1.toString());
		assertEquals("[1, 2, 0, 93, 20, -15, 401, -6]", l2.toString());
		assertTrue(l1.removeLastOccurrence(1));
		assertEquals("[-1, 92, 19, 22, 400, -7, 2]", l1.toString());
		assertEquals("[1, 2, 0, 93, 20, -15, 401, -6]", l2.toString());
		assertTrue(l2.removeLastOccurrence(1));
		assertEquals("[-1, 92, 19, 22, 400, -7, 2]", l1.toString());
		assertEquals("[2, 0, 93, 20, -15, 401, -6]", l2.toString());
	}
	
	@Test
	public void testRemoveLastOccurrenceMultipleOccurrence05() {
		int[] data1 = {5, 7, 3, 5, 5, -1, 2, 0, 5, 9, 7, 5, 5};
		int[] data2 = {3, 7, 3, 3, 5, -1, 2, 0, 3, 9, 7, 3, 5};
		LinkedIntList l1 = new LinkedIntList(data1);
		LinkedIntList l2 = new LinkedIntList(data2);
		assertTrue(l1.removeLastOccurrence(5));
		assertEquals("[5, 7, 3, 5, 5, -1, 2, 0, 5, 9, 7, 5]", l1.toString());
		assertEquals("[3, 7, 3, 3, 5, -1, 2, 0, 3, 9, 7, 3, 5]", l2.toString());
		assertTrue(l1.removeLastOccurrence(5));
		assertEquals("[5, 7, 3, 5, 5, -1, 2, 0, 5, 9, 7]", l1.toString());
		assertEquals("[3, 7, 3, 3, 5, -1, 2, 0, 3, 9, 7, 3, 5]", l2.toString());
		assertTrue(l2.removeLastOccurrence(7));
		assertEquals("[5, 7, 3, 5, 5, -1, 2, 0, 5, 9, 7]", l1.toString());
		assertEquals("[3, 7, 3, 3, 5, -1, 2, 0, 3, 9, 3, 5]", l2.toString());
		assertTrue(l2.removeLastOccurrence(7));
		assertEquals("[5, 7, 3, 5, 5, -1, 2, 0, 5, 9, 7]", l1.toString());
		assertEquals("[3, 3, 3, 5, -1, 2, 0, 3, 9, 3, 5]", l2.toString());
		assertFalse(l2.removeLastOccurrence(7));
		assertEquals("[5, 7, 3, 5, 5, -1, 2, 0, 5, 9, 7]", l1.toString());
		assertEquals("[3, 3, 3, 5, -1, 2, 0, 3, 9, 3, 5]", l2.toString());
		assertTrue(l1.removeLastOccurrence(5));
		assertEquals("[5, 7, 3, 5, 5, -1, 2, 0, 9, 7]", l1.toString());
		assertEquals("[3, 3, 3, 5, -1, 2, 0, 3, 9, 3, 5]", l2.toString());
		assertTrue(l1.removeLastOccurrence(5));
		assertEquals("[5, 7, 3, 5, -1, 2, 0, 9, 7]", l1.toString());
		assertEquals("[3, 3, 3, 5, -1, 2, 0, 3, 9, 3, 5]", l2.toString());
		assertTrue(l1.removeLastOccurrence(5));
		assertEquals("[5, 7, 3, -1, 2, 0, 9, 7]", l1.toString());
		assertEquals("[3, 3, 3, 5, -1, 2, 0, 3, 9, 3, 5]", l2.toString());
		assertTrue(l2.removeLastOccurrence(5));
		assertEquals("[5, 7, 3, -1, 2, 0, 9, 7]", l1.toString());
		assertEquals("[3, 3, 3, 5, -1, 2, 0, 3, 9, 3]", l2.toString());
		assertTrue(l2.removeLastOccurrence(5));
		assertEquals("[5, 7, 3, -1, 2, 0, 9, 7]", l1.toString());
		assertEquals("[3, 3, 3, -1, 2, 0, 3, 9, 3]", l2.toString());
		assertTrue(l1.removeLastOccurrence(5));
		assertEquals("[7, 3, -1, 2, 0, 9, 7]", l1.toString());
		assertEquals("[3, 3, 3, -1, 2, 0, 3, 9, 3]", l2.toString());
	}
	
	@Test
	public void testRemoveLastOccurrenceTIMING() {
		long start, finish, diff1, diff2;
		final int SMALL = 20000;
		final int LARGE = 2 * SMALL;
		LinkedIntList l1 = new LinkedIntList();
		LinkedIntList l2 = new LinkedIntList();
		for(int i = SMALL; i > 0; i--) {
			l1.addFirst(i);
		}
		for(int i = LARGE; i > 0; i--) {
			l2.addFirst(i);
		}
		start = System.currentTimeMillis();
		l1.removeLastOccurrence(1);
		finish = System.currentTimeMillis();
		diff1 = finish - start;
		start = System.currentTimeMillis();
		l2.removeLastOccurrence(1);
		finish = System.currentTimeMillis();
		diff2 = finish - start;
		assertFalse("RemoveLastOccurrence: " + diff1 + " --> " + diff2, diff2 > diff1 * 3 && diff2 - diff1 > 100);
		
		start = System.currentTimeMillis();
		l1.removeLastOccurrence(SMALL);
		finish = System.currentTimeMillis();
		diff1 = finish - start;
		start = System.currentTimeMillis();
		l2.removeLastOccurrence(LARGE);
		finish = System.currentTimeMillis();
		diff2 = finish - start;
		assertFalse("RemoveLastOccurrence: " + diff1 + " --> " + diff2, diff2 > diff1 * 3 && diff2 - diff1 > 100);
	}
	
	@Test
	public void testIndexOfEmpty05() {
		LinkedIntList l1 = new LinkedIntList();
		assertEquals(-1, l1.indexOf(0));
		assertEquals(-1, l1.indexOf(1));
		assertEquals(-1, l1.indexOf(-1));
		assertEquals(-1, l1.indexOf(42));
		assertEquals(-1, l1.indexOf(3));
		assertEquals("[]", l1.toString());
	}
	
	@Test
	public void testIndexOfNotPresent05() {
		int[] data1 = {5, 0, -1, 42, 9, -5};
		int[] data2 = {6, 0, 1, 42, 99, 4};
		LinkedIntList l1 = new LinkedIntList(data1);
		LinkedIntList l2 = new LinkedIntList(data2);
		assertEquals(-1, l1.indexOf(1));
		assertEquals(-1, l1.indexOf(2));
		assertEquals(-1, l1.indexOf(-3));
		assertEquals(-1, l1.indexOf(40));
		assertEquals(-1, l1.indexOf(99));
		assertEquals(-1, l2.indexOf(-1));
		assertEquals(-1, l2.indexOf(9));
		assertEquals("[5, 0, -1, 42, 9, -5]", l1.toString());
		assertEquals("[6, 0, 1, 42, 99, 4]", l2.toString());
	}
	
	@Test
	public void testIndexOfSingleOccurrence05() {
		int[] data1 = {0, 1, -1, 92, 19, -15, 22, 400, -7, 2};
		int[] data2 = {1, 2, 0, 93, 20, -15, 23, 401, -6, 3};
		LinkedIntList l1 = new LinkedIntList(data1);
		LinkedIntList l2 = new LinkedIntList(data2);
		assertEquals(0, l1.indexOf(0));
		assertEquals(9, l2.indexOf(3));
		assertEquals(1, l1.indexOf(1));
		assertEquals(8, l2.indexOf(-6));
		assertEquals(2, l1.indexOf(-1));
		assertEquals(7, l2.indexOf(401));
		assertEquals(3, l1.indexOf(92));
		assertEquals(6, l2.indexOf(23));
		assertEquals(4, l1.indexOf(19));
		assertEquals(5, l2.indexOf(-15));
		assertEquals(9, l1.indexOf(2));
		assertEquals(0, l2.indexOf(1));
		assertEquals("[0, 1, -1, 92, 19, -15, 22, 400, -7, 2]", l1.toString());
		assertEquals("[1, 2, 0, 93, 20, -15, 23, 401, -6, 3]", l2.toString());
	}
	
	@Test
	public void testIndexOfMultipleOccurrence05() {
		int[] data1 = {5, 7, 3, 5, 5, -1, 2, 0, 5, 9, 7, 5, -1};
		int[] data2 = {3, 7, 3, 3, 6, -1, 2, 0, 3, 5, 7, 3, 5};
		LinkedIntList l1 = new LinkedIntList(data1);
		LinkedIntList l2 = new LinkedIntList(data2);
		assertEquals(0, l1.indexOf(5));
		assertEquals(9, l2.indexOf(5));
		assertEquals(1, l1.indexOf(7));
		assertEquals(0, l2.indexOf(3));
		assertEquals(5, l1.indexOf(-1));
		assertEquals(1, l2.indexOf(7));
		assertEquals("[5, 7, 3, 5, 5, -1, 2, 0, 5, 9, 7, 5, -1]", l1.toString());
		assertEquals("[3, 7, 3, 3, 6, -1, 2, 0, 3, 5, 7, 3, 5]", l2.toString());
	}
	
	@Test
	public void testIndexOfTIMING() {
		long start, finish, diff1, diff2;
		final int SMALL = 20000;
		final int LARGE = 2 * SMALL;
		LinkedIntList l1 = new LinkedIntList();
		LinkedIntList l2 = new LinkedIntList();
		for(int i = SMALL; i > 0; i--) {
			l1.addFirst(i);
		}
		for(int i = LARGE; i > 0; i--) {
			l2.addFirst(i);
		}
		start = System.currentTimeMillis();
		assertEquals(0, l1.indexOf(1));
		finish = System.currentTimeMillis();
		diff1 = finish - start;
		start = System.currentTimeMillis();
		assertEquals(0, l2.indexOf(1));
		finish = System.currentTimeMillis();
		diff2 = finish - start;
		assertFalse("IndexOf: " + diff1 + " --> " + diff2, diff2 > diff1 * 3 && diff2 - diff1 > 100);
		
		start = System.currentTimeMillis();
		assertEquals(SMALL-1, l1.indexOf(SMALL));
		finish = System.currentTimeMillis();
		diff1 = finish - start;
		start = System.currentTimeMillis();
		assertEquals(LARGE-1, l2.indexOf(LARGE));
		finish = System.currentTimeMillis();
		diff2 = finish - start;
		assertFalse("IndexOf: " + diff1 + " --> " + diff2, diff2 > diff1 * 3 && diff2 - diff1 > 100);
	}
	
	@Test
	public void testSumEmpty05() {
		LinkedIntList l1 = new LinkedIntList();
		assertEquals(0, l1.sum());
		assertEquals("[]", l1.toString());
	}
	
	@Test
	public void testSumSingle05() {
		int[] data1 = {-1};
		int[] data2 = {0};
		LinkedIntList l1 = new LinkedIntList(data1);
		LinkedIntList l2 = new LinkedIntList(data2);
		assertEquals(-1, l1.sum());
		assertEquals("[-1]", l1.toString());
		assertEquals("[0]", l2.toString());
		assertEquals(0, l2.sum());
		assertEquals("[-1]", l1.toString());
		assertEquals("[0]", l2.toString());
		assertEquals(-1, l1.sum());
		assertEquals("[-1]", l1.toString());
		assertEquals("[0]", l2.toString());
	}
	
	@Test
	public void testSumSmall05() {
		int[] data1 = {5, 0, -1, 42, 9, -5};
		int[] data2 = {6, 0, 1, 42, 99, 4};
		LinkedIntList l1 = new LinkedIntList(data1);
		LinkedIntList l2 = new LinkedIntList(data2);
		assertEquals(50, l1.sum());
		assertEquals("[5, 0, -1, 42, 9, -5]", l1.toString());
		assertEquals("[6, 0, 1, 42, 99, 4]", l2.toString());
		assertEquals(152, l2.sum());
		assertEquals("[5, 0, -1, 42, 9, -5]", l1.toString());
		assertEquals("[6, 0, 1, 42, 99, 4]", l2.toString());
		assertEquals(50, l1.sum());
		assertEquals("[5, 0, -1, 42, 9, -5]", l1.toString());
		assertEquals("[6, 0, 1, 42, 99, 4]", l2.toString());
	}
	
	@Test
	public void testSumLarge05() {
		int[] data1 = {0, 1, -9, 2, -8, 3, -7, 4, -6, 5, -5, 6, -4, 7, -3, 8, -2, 9, -1};
		int[] data2 = {100, -1, 200, -2, 300, -3, 400, -4, 500, -5, 600, 700, 800, -8, -7, -6};
		LinkedIntList l1 = new LinkedIntList(data1);
		LinkedIntList l2 = new LinkedIntList(data2);
		assertEquals(0, l1.sum());
		assertEquals("[0, 1, -9, 2, -8, 3, -7, 4, -6, 5, -5, 6, -4, 7, -3, 8, -2, 9, -1]", l1.toString());
		assertEquals("[100, -1, 200, -2, 300, -3, 400, -4, 500, -5, 600, 700, 800, -8, -7, -6]", l2.toString());
		assertEquals(3564, l2.sum());
		assertEquals("[0, 1, -9, 2, -8, 3, -7, 4, -6, 5, -5, 6, -4, 7, -3, 8, -2, 9, -1]", l1.toString());
		assertEquals("[100, -1, 200, -2, 300, -3, 400, -4, 500, -5, 600, 700, 800, -8, -7, -6]", l2.toString());
		assertEquals(0, l1.sum());
		assertEquals("[0, 1, -9, 2, -8, 3, -7, 4, -6, 5, -5, 6, -4, 7, -3, 8, -2, 9, -1]", l1.toString());
		assertEquals("[100, -1, 200, -2, 300, -3, 400, -4, 500, -5, 600, 700, 800, -8, -7, -6]", l2.toString());
	}
	
	@Test
	public void testSumTIMING() {
		long start, finish, diff1, diff2;
		final int SMALL = 20000;
		final int LARGE = 2 * SMALL;
		LinkedIntList l1 = new LinkedIntList();
		LinkedIntList l2 = new LinkedIntList();
		for(int i = SMALL; i > 0; i--) {
			l1.addFirst(i);
		}
		for(int i = LARGE; i > 0; i--) {
			l2.addFirst(i);
		}
		start = System.currentTimeMillis();
		assertEquals(SMALL*(SMALL+1)/2, l1.sum());
		finish = System.currentTimeMillis();
		diff1 = finish - start;
		start = System.currentTimeMillis();
		assertEquals(LARGE*(LARGE+1)/2, l2.sum());
		finish = System.currentTimeMillis();
		diff2 = finish - start;
		assertFalse("Sum: " + diff1 + " --> " + diff2, diff2 > diff1 * 3 && diff2 - diff1 > 100);
	}
	
	
	@Test
	public void testIncreasingEvensNone05() {
		int[] a1 = {};
		int[] a2 = {7};
		int[] a3 = {21, 25, 5};
		LinkedIntList l;
		l = new LinkedIntList(a1);
		assertTrue(l.increasingEvens());
		l = new LinkedIntList(a2);
		assertTrue(l.increasingEvens());
		l = new LinkedIntList(a3);
		assertTrue(l.increasingEvens());
	}
	
	@Test
	public void testIncreasingEvensSingle05() {
		int[] a1 = {4};
		int[] a2 = {47, 22};
		int[] a3 = {22, 11};
		int[] a4 = {97, 56, 41};
		LinkedIntList l;
		l = new LinkedIntList(a1);
		assertTrue(l.increasingEvens());
		l = new LinkedIntList(a2);
		assertTrue(l.increasingEvens());
		l = new LinkedIntList(a3);
		assertTrue(l.increasingEvens());
		l = new LinkedIntList(a4);
		assertTrue(l.increasingEvens());
	}
		
	
	@Test
	public void testIncreasingEvensSmall05() {
		int[] a1 = {11, 44, 33, 22, 55};
		int[] a2 = {33, 22, 11, 44, 55};
		int[] a3 = {11, 33, 55, 22, 44};
		int[] a4 = {22, 11, 33, 55, 44};
		int[] a5 = {44, 55, 77, 88, 22};
		LinkedIntList l;
		l = new LinkedIntList(a1);
		assertFalse(l.increasingEvens());
		l = new LinkedIntList(a2);
		assertTrue(l.increasingEvens());
		l = new LinkedIntList(a3);
		assertTrue(l.increasingEvens());
		l = new LinkedIntList(a4);
		assertTrue(l.increasingEvens());
		l = new LinkedIntList(a5);
		assertFalse(l.increasingEvens());
	}
	
	@Test
	public void testIncreasingEvensLarge05() {
		int[] a1 = {7, 8, 12, 15, 18, 21, 23, 28, 32, 50, 61, 79, 82, 89, 100, 105};
		int[] a2 = {7, 8, 12, 18, 21, 23, 28, 32, 50, 61, 79, 15, 82, 89, 100, 105};
		int[] a3 = {7, 8, 12, 18, 21, 23, 32, 50, 61, 79, 15, 82, 89, 28, 100, 105};
		int[] a4 = {8, 12, 18, 28, 32, 50, 82, 100, 105, 89, 79, 61, 23, 21, 15, 7};
		int[] a5 = {105, 89, 79, 61, 23, 21, 15, 7, 8, 12, 18, 28, 32, 50, 82, 100};
		int[] a6 = {8, 12, 18, 28, 32, 50, 105, 89, 79, 61, 23, 82, 100, 21, 15, 7};
		int[] a7 = {8, 12, 18, 28, 32, 50, 105, 89, 79, 100, 61, 23, 82, 21, 15, 7};
		LinkedIntList l;
		l = new LinkedIntList(a1);
		assertTrue(l.increasingEvens());
		l = new LinkedIntList(a2);
		assertTrue(l.increasingEvens());
		l = new LinkedIntList(a3);
		assertFalse(l.increasingEvens());
		l = new LinkedIntList(a4);
		assertTrue(l.increasingEvens());
		l = new LinkedIntList(a5);
		assertTrue(l.increasingEvens());
		l = new LinkedIntList(a6);
		assertTrue(l.increasingEvens());
		l = new LinkedIntList(a7);
		assertFalse(l.increasingEvens());
	}
	
	@Test
	public void testIncreasingEvensTIMING() {
		long start, finish, diff1, diff2;
		final int SMALL = 20000;
		final int LARGE = 2 * SMALL;
		LinkedIntList l1 = new LinkedIntList();
		LinkedIntList l2 = new LinkedIntList();
		for(int i = SMALL; i > 0; i--) {
			l1.addFirst(i);
		}
		for(int i = LARGE; i > 0; i--) {
			l2.addFirst(i);
		}
		start = System.currentTimeMillis();
		l1.increasingEvens();
		finish = System.currentTimeMillis();
		diff1 = finish - start;
		start = System.currentTimeMillis();
		l2.increasingEvens();
		finish = System.currentTimeMillis();
		diff2 = finish - start;
		assertFalse("Sum: " + diff1 + " --> " + diff2, diff2 > diff1 * 3 && diff2 - diff1 > 100);
	}
	
	@Test
	public void testListAdditionEmpty05() {
		LinkedIntList l1 = new LinkedIntList();
		LinkedIntList l2 = new LinkedIntList();
		LinkedIntList s = l1.listAddition(l2);
		assertEquals("[]", l1.toString());
		assertEquals("[]", l2.toString());
		assertEquals("[]", s.toString());
		s = l2.listAddition(l1);
		assertEquals("[]", l1.toString());
		assertEquals("[]", l2.toString());
		assertEquals("[]", s.toString());
	}
	
	@Test
	public void testListAdditionSmall05() {
		int[] d1_a = {43};
		int[] d1_b = {-3};
		int[] d2_a = {2, -34};
		int[] d2_b = {-5, 10};
		
		LinkedIntList l1_a = new LinkedIntList(d1_a);
		LinkedIntList l1_b = new LinkedIntList(d1_b);
		LinkedIntList l2_a = new LinkedIntList(d2_a);
		LinkedIntList l2_b = new LinkedIntList(d2_b);
		LinkedIntList s1_a = l1_a.listAddition(l1_b);
		LinkedIntList s1_b = l1_b.listAddition(l1_a);
		LinkedIntList s2_a = l2_a.listAddition(l2_b);
		LinkedIntList s2_b = l2_b.listAddition(l2_a);
		
		assertEquals("[43]", l1_a.toString());
		assertEquals("[-3]", l1_b.toString());
		assertEquals("[40]", s1_a.toString());
		assertEquals("[40]", s1_b.toString());
		assertFalse(s1_a == s1_b);
		
		assertEquals("[2, -34]", l2_a.toString());
		assertEquals("[-5, 10]", l2_b.toString());
		assertEquals("[-3, -24]", s2_a.toString());
		assertEquals("[-3, -24]", s2_b.toString());
		assertFalse(s2_a == s2_b);
	}
	
	@Test
	public void testListAdditionLarge05() {
		int[] d1_a = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23};
		int[] d1_b = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24};	
		LinkedIntList l1_a = new LinkedIntList(d1_a);
		LinkedIntList l1_b = new LinkedIntList(d1_b);
		LinkedIntList s1_a = l1_a.listAddition(l1_b);
		LinkedIntList s1_b = l1_b.listAddition(l1_a);
	
		assertEquals("[1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23]", l1_a.toString());
		assertEquals("[2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24]", l1_b.toString());
		assertEquals("[3, 7, 11, 15, 19, 23, 27, 31, 35, 39, 43, 47]", s1_a.toString());
		assertEquals("[3, 7, 11, 15, 19, 23, 27, 31, 35, 39, 43, 47]", s1_b.toString());
		assertFalse(s1_a == s1_b);
	}
	
	@Test
	public void testListAdditionException05() {
		LinkedIntList l1 = new LinkedIntList();
		LinkedIntList l2 = new LinkedIntList();
		LinkedIntList s;
		l1.addFirst(43);
		try {
			l1.listAddition(l2);
			fail("Should have thrown IllegalArgumentException");
		} catch(IllegalArgumentException e) {}
		try {
			l2.listAddition(l1);
			fail("Should have thrown IllegalArgumentException");
		} catch(IllegalArgumentException e) {}
		l2.addFirst(-3);
		s = l1.listAddition(l2);
		assertEquals("[40]", s.toString());
		l2.addFirst(10);
		try {
			l1.listAddition(l2);
			fail("Should have thrown IllegalArgumentException");
		} catch(IllegalArgumentException e) {}
		try {
			l2.listAddition(l1);
			fail("Should have thrown IllegalArgumentException");
		} catch(IllegalArgumentException e) {}
		l1.addFirst(40);
		s = l1.listAddition(l2);
		assertEquals("[50, 40]", s.toString());
		l1.addFirst(100);
		try {
			l1.listAddition(l2);
			fail("Should have thrown IllegalArgumentException");
		} catch(IllegalArgumentException e) {}
		try {
			l2.listAddition(l1);
			fail("Should have thrown IllegalArgumentException");
		} catch(IllegalArgumentException e) {}
		l2.addFirst(200);
		s = l1.listAddition(l2);
		assertEquals("[300, 50, 40]", s.toString());
	}
	
	@Test
	public void testListAdditionTIMING() {
		long start, finish, diff1, diff2;
		final int SMALL = 20000;
		final int LARGE = 2 * SMALL;
		LinkedIntList l1 = new LinkedIntList();
		LinkedIntList l2 = new LinkedIntList();
		for(int i = SMALL; i > 0; i--) {
			l1.addFirst(i);
		}
		for(int i = LARGE; i > 0; i--) {
			l2.addFirst(i);
		}
		start = System.currentTimeMillis();
		l1.listAddition(l1);
		finish = System.currentTimeMillis();
		diff1 = finish - start;
		start = System.currentTimeMillis();
		l2.listAddition(l2);
		finish = System.currentTimeMillis();
		diff2 = finish - start;
		assertFalse("Sum: " + diff1 + " --> " + diff2, diff2 > diff1 * 3 && diff2 - diff1 > 100);
	}
}
