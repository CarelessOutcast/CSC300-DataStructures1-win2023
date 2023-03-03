package hw7;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)


public class LinkedIntListTest {
	
	// @Rule
	// public Timeout globalTimeout = Timeout.seconds(2);

	@Test
	public void testCountEmpty05() {
		LinkedIntList l1 = new LinkedIntList();
		assertEquals(0, l1.count(5));
		assertEquals(0, l1.count(0));
		assertEquals(0, l1.count(-1));
	}
	
	@Test
	public void testCountSingleton05() {
		int[] data1 = {5};
		int[] data2 = {-6};
		int[] data3 = {0};
		LinkedIntList l1 = new LinkedIntList(data1);
		LinkedIntList l2 = new LinkedIntList(data2);
		LinkedIntList l3 = new LinkedIntList(data3);
		assertEquals(1, l1.count(5));
		assertEquals(0, l1.count(-6));
		assertEquals(0, l1.count(0));
		assertEquals(0, l2.count(5));
		assertEquals(1, l2.count(-6));
		assertEquals(0, l2.count(0));
		assertEquals(0, l3.count(5));
		assertEquals(0, l3.count(-6));
		assertEquals(1, l3.count(0));
	}
	
	@Test
	public void testCountDoublteon05() {
		int[] data1 = {5, 5};
		int[] data2 = {-6, 0};
		int[] data3 = {0, -6};
		LinkedIntList l1 = new LinkedIntList(data1);
		LinkedIntList l2 = new LinkedIntList(data2);
		LinkedIntList l3 = new LinkedIntList(data3);
		assertEquals(2, l1.count(5));
		assertEquals(0, l1.count(-6));
		assertEquals(0, l1.count(0));
		assertEquals(0, l2.count(5));
		assertEquals(1, l2.count(-6));
		assertEquals(1, l2.count(0));
		assertEquals(0, l3.count(5));
		assertEquals(1, l3.count(-6));
		assertEquals(1, l3.count(0));
	}
	
	@Test
	public void testCountLarge05() {
		int[] data1 = {5, 7, 3, 5, 5, -1, 2, 0, 5, 9, 7, 5, 5};
		int[] data2 = {3, 7, 3, 3, 5, -1, 2, 0, 3, 9, 7, 3, 5};
		LinkedIntList l1 = new LinkedIntList(data1);
		LinkedIntList l2 = new LinkedIntList(data2);
		assertEquals(6, l1.count(5));
		assertEquals(2, l2.count(5));
		assertEquals(1, l1.count(3));
		assertEquals(5, l2.count(3));
		assertEquals(1, l1.count(0));
		assertEquals(1, l2.count(0));
		assertEquals(0, l1.count(4));
		assertEquals(0, l2.count(4));
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
	
/*	
	@Test
	public void testSumEmpty() {
		LinkedIntList l1 = new LinkedIntList();
		assertEquals(0, l1.partialSums().toString());
		assertEquals("[]", l1.toString());
	}
	
	@Test
	public void testSumSingle() {
		int[] data1 = {-1};
		int[] data2 = {0};
		LinkedIntList l1 = new LinkedIntList(data1);
		LinkedIntList l2 = new LinkedIntList(data2);
		assertEquals(-1, l1.partialSums().toString());
		assertEquals("[-1]", l1.toString());
		assertEquals("[0]", l2.toString());
		assertEquals(0, l2.partialSums().toString());
		assertEquals("[-1]", l1.toString());
		assertEquals("[0]", l2.toString());
		assertEquals(-1, l1.partialSums().toString());
		assertEquals("[-1]", l1.toString());
		assertEquals("[0]", l2.toString());
	}
	
	@Test
	public void testSumSmall() {
		int[] data1 = {5, 0, -1, 42, 9, -5};
		int[] data2 = {6, 0, 1, 42, 99, 4};
		LinkedIntList l1 = new LinkedIntList(data1);
		LinkedIntList l2 = new LinkedIntList(data2);
		assertEquals(50, l1.partialSums().toString());
		assertEquals("[5, 0, -1, 42, 9, -5]", l1.toString());
		assertEquals("[6, 0, 1, 42, 99, 4]", l2.toString());
		assertEquals(152, l2.partialSums().toString());
		assertEquals("[5, 0, -1, 42, 9, -5]", l1.toString());
		assertEquals("[6, 0, 1, 42, 99, 4]", l2.toString());
		assertEquals(50, l1.partialSums().toString());
		assertEquals("[5, 0, -1, 42, 9, -5]", l1.toString());
		assertEquals("[6, 0, 1, 42, 99, 4]", l2.toString());
	}
	
	@Test
	public void testSumLarge() {
		int[] data1 = {0, 1, -9, 2, -8, 3, -7, 4, -6, 5, -5, 6, -4, 7, -3, 8, -2, 9, -1};
		int[] data2 = {100, -1, 200, -2, 300, -3, 400, -4, 500, -5, 600, 700, 800, -8, -7, -6};
		LinkedIntList l1 = new LinkedIntList(data1);
		LinkedIntList l2 = new LinkedIntList(data2);
		assertEquals(0, l1.partialSums().toString());
		assertEquals("[0, 1, -9, 2, -8, 3, -7, 4, -6, 5, -5, 6, -4, 7, -3, 8, -2, 9, -1]", l1.toString());
		assertEquals("[100, -1, 200, -2, 300, -3, 400, -4, 500, -5, 600, 700, 800, -8, -7, -6]", l2.toString());
		assertEquals(3564, l2.partialSums().toString());
		assertEquals("[0, 1, -9, 2, -8, 3, -7, 4, -6, 5, -5, 6, -4, 7, -3, 8, -2, 9, -1]", l1.toString());
		assertEquals("[100, -1, 200, -2, 300, -3, 400, -4, 500, -5, 600, 700, 800, -8, -7, -6]", l2.toString());
		assertEquals(0, l1.partialSums().toString());
		assertEquals("[0, 1, -9, 2, -8, 3, -7, 4, -6, 5, -5, 6, -4, 7, -3, 8, -2, 9, -1]", l1.toString());
		assertEquals("[100, -1, 200, -2, 300, -3, 400, -4, 500, -5, 600, 700, 800, -8, -7, -6]", l2.toString());
	}
*/	
	
	@Test
	public void testEvensEmpty05() {
		LinkedIntList l1 = new LinkedIntList();
		LinkedIntList e1 = l1.evens();
		assertEquals("[]", e1.toString());
		assertEquals("[]", l1.toString());
		assertFalse(e1 == l1);
		e1.addFirst(7);
		assertEquals("[7]", e1.toString());
		assertEquals("[]", l1.toString());
	}
	
	@Test
	public void testEvensSingle05() {
		int[] a1 = {7};
		int[] a2 = {20};
		LinkedIntList l1 = new LinkedIntList(a1);
		LinkedIntList l2 = new LinkedIntList(a2);
		LinkedIntList e1 = l1.evens();
		LinkedIntList e2 = l2.evens();
		
		assertEquals("[]", e1.toString());
		assertEquals("[7]", l1.toString());
		assertEquals("[20]", e2.toString());
		assertEquals("[20]", l2.toString());
		assertFalse(e2 == l2);
	}
	
	@Test
	public void testEvensDouble05() {
		int[] a1 = {7, 5};
		int[] a2 = {20, 3};
		int[] a3 = {7, 10};
		int[] a4 = {20, 2};
		LinkedIntList l1 = new LinkedIntList(a1);
		LinkedIntList l2 = new LinkedIntList(a2);
		LinkedIntList l3 = new LinkedIntList(a3);
		LinkedIntList l4 = new LinkedIntList(a4);
		LinkedIntList e1 = l1.evens();
		LinkedIntList e2 = l2.evens();
		LinkedIntList e3 = l3.evens();
		LinkedIntList e4 = l4.evens();
		
		assertEquals("[]", e1.toString());
		assertEquals("[7, 5]", l1.toString());
		assertEquals("[20]", e2.toString());
		assertEquals("[20, 3]", l2.toString());
		assertEquals("[10]", e3.toString());
		assertEquals("[7, 10]", l3.toString());
		assertEquals("[20, 2]", e4.toString());
		assertEquals("[20, 2]", l4.toString());
		assertFalse(e4 == l4);
	}
	
	@Test
	public void testEvensLarge05() {
		int[] data1 = {0, 1, -9, 2, -8, 3, -7, 4, -6, 5, -5, 6, -4, 7, -3, 8, -2, 9, -1};
		int[] data2 = {100, -1, 200, -2, 300, -3, 400, -4, 500, -5, 600, 700, 800, -8, -7, -6};
		int[] data3 = {83, 91, -5, 1, 1983, -4821, 43, -5, 1, 7, -9, 17, 43, 1, 19, 341, 91, 65};
		LinkedIntList l1 = new LinkedIntList(data1);
		LinkedIntList l2 = new LinkedIntList(data2);
		LinkedIntList l3 = new LinkedIntList(data3);
		LinkedIntList e1 = l1.evens();
		LinkedIntList e2 = l2.evens();
		LinkedIntList e3 = l3.evens();
		
		assertEquals("[0, 2, -8, 4, -6, 6, -4, 8, -2]", e1.toString());
		assertEquals("[0, 1, -9, 2, -8, 3, -7, 4, -6, 5, -5, 6, -4, 7, -3, 8, -2, 9, -1]", l1.toString());
		assertEquals("[100, 200, -2, 300, 400, -4, 500, 600, 700, 800, -8, -6]", e2.toString());
		assertEquals("[100, -1, 200, -2, 300, -3, 400, -4, 500, -5, 600, 700, 800, -8, -7, -6]", l2.toString());
		assertEquals("[]", e3.toString());
		assertEquals("[83, 91, -5, 1, 1983, -4821, 43, -5, 1, 7, -9, 17, 43, 1, 19, 341, 91, 65]", l3.toString());	
	}
	
	@Test
	public void testPartialSumsEmpty05() {
		LinkedIntList l1 = new LinkedIntList();
		assertEquals("[]", l1.partialSums().toString().toString());
		assertEquals("[]", l1.toString());
	}
	
	@Test
	public void testPartialSumsSingle05() {
		int[] data1 = {-1};
		int[] data2 = {0};
		LinkedIntList l1 = new LinkedIntList(data1);
		LinkedIntList l2 = new LinkedIntList(data2);
		assertEquals("[-1]", l1.partialSums().toString());
		assertEquals("[-1]", l1.toString());
		assertEquals("[0]", l2.toString());
		assertEquals("[0]", l2.partialSums().toString());
		assertEquals("[-1]", l1.toString());
		assertEquals("[0]", l2.toString());
		assertEquals("[-1]", l1.partialSums().toString());
		assertEquals("[-1]", l1.toString());
		assertEquals("[0]", l2.toString());
	}
	
	@Test
	public void testPartialSumsSmall05() {
		int[] data1 = {5, 0, -1, 42, 9, -5};
		int[] data2 = {6, 0, 1, 42, 99, 4};
		LinkedIntList l1 = new LinkedIntList(data1);
		LinkedIntList l2 = new LinkedIntList(data2);
		assertEquals("[50, 45, 45, 46, 4, -5]", l1.partialSums().toString());
		assertEquals("[5, 0, -1, 42, 9, -5]", l1.toString());
		assertEquals("[6, 0, 1, 42, 99, 4]", l2.toString());
		assertEquals("[152, 146, 146, 145, 103, 4]", l2.partialSums().toString());
		assertEquals("[5, 0, -1, 42, 9, -5]", l1.toString());
		assertEquals("[6, 0, 1, 42, 99, 4]", l2.toString());
		assertEquals("[50, 45, 45, 46, 4, -5]", l1.partialSums().toString());
		assertEquals("[5, 0, -1, 42, 9, -5]", l1.toString());
		assertEquals("[6, 0, 1, 42, 99, 4]", l2.toString());
	}
	
	@Test
	public void testPartialSumsLarge05() {
		int[] data1 = {0, 1, -9, 2, -8, 3, -7, 4, -6, 5, -5, 6, -4, 7, -3, 8, -2, 9, -1};
		int[] data2 = {100, -1, 200, -2, 300, -3, 400, -4, 500, -5, 600, 700, 800, -8, -7, -6};
		LinkedIntList l1 = new LinkedIntList(data1);
		LinkedIntList l2 = new LinkedIntList(data2);
		assertEquals("[0, 0, -1, 8, 6, 14, 11, 18, 14, 20, 15, 20, 14, 18, 11, 14, 6, 8, -1]", l1.partialSums().toString());
		assertEquals("[0, 1, -9, 2, -8, 3, -7, 4, -6, 5, -5, 6, -4, 7, -3, 8, -2, 9, -1]", l1.toString());
		assertEquals("[100, -1, 200, -2, 300, -3, 400, -4, 500, -5, 600, 700, 800, -8, -7, -6]", l2.toString());
		assertEquals("[3564, 3464, 3465, 3265, 3267, 2967, 2970, 2570, 2574, 2074, 2079, 1479, 779, -21, -13, -6]", l2.partialSums().toString());
		assertEquals("[0, 1, -9, 2, -8, 3, -7, 4, -6, 5, -5, 6, -4, 7, -3, 8, -2, 9, -1]", l1.toString());
		assertEquals("[100, -1, 200, -2, 300, -3, 400, -4, 500, -5, 600, 700, 800, -8, -7, -6]", l2.toString());
		assertEquals("[0, 0, -1, 8, 6, 14, 11, 18, 14, 20, 15, 20, 14, 18, 11, 14, 6, 8, -1]", l1.partialSums().toString());
		assertEquals("[0, 1, -9, 2, -8, 3, -7, 4, -6, 5, -5, 6, -4, 7, -3, 8, -2, 9, -1]", l1.toString());
		assertEquals("[100, -1, 200, -2, 300, -3, 400, -4, 500, -5, 600, 700, 800, -8, -7, -6]", l2.toString());
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
}
