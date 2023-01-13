package hw2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)


public class StringTest {
	
	private char[] empty_A = {};
	private String empty_S = new String(empty_A);
	private String empty_S_Copy = new String(empty_A);

	private char[] book_A = {'b','o','o','k'};
	private String book_S;
	private String book_S_Copy;

	private char[] bookkeeper_A = {'b','o','o','k','k','e','e','p','e','r'};
	private String bookkeeper_S;
	private String bookkeeper_S_Copy;

	private char[] boot_A = {'b','o','o','t'};
	private String boot_S;

	private char[] cover_A = {'c','o','v','e','r'};
	private String cover_S;

	private char[] steal_A = {'s','t','e','a','l'};
	private String steal_S;
	private String steal_S_Copy;

	private char[] steel_A = {'s','t','e','e','l'};
	private String steel_S;

	private char[] tan_A = {'t','a','n'};
	private String tan_S;
	private String tan_S_Copy;


	private char[] tangerine_A = {'t','a','n','g','e','r','i','n','e'};
	private String tangerine_S;

	private char[] tangle_A = {'t','a','n','g','l','e'};
	private String tangle_S;

	private char[] vector_A = {'v','e','c','t','o','r'};
	private String vector_S;
	private String vector_S_Copy;	
	
	@Rule
	public Timeout globalTimeout = Timeout.seconds(2);
	

	@Before
	public void initialize() {
	empty_S = new String(empty_A);
	empty_S_Copy = new String(empty_A);

	book_S = new String(book_A);
	book_S_Copy = new String(book_A);

	bookkeeper_S = new String(bookkeeper_A);
	bookkeeper_S_Copy = new String(bookkeeper_A);

	boot_S = new String(boot_A);

	cover_S = new String(cover_A);

	steal_S = new String(steal_A);
	steal_S_Copy = new String(steal_A);

	steel_S = new String(steel_A);

	tan_S = new String(tan_A);
	tan_S_Copy = new String(tan_A);

	tangerine_S = new String(tangerine_A);

	tangle_S = new String(tangle_A);

	vector_S = new String(vector_A);
	vector_S_Copy = new String(vector_A);

	}
	
	@Test
	public void testCompareToDifferent05() {
		assertTrue(book_S.compareTo(tan_S) < 0);
		assertTrue(tan_S.compareTo(book_S) > 0);
		assertTrue(vector_S.compareTo(cover_S) > 0);
		assertTrue(cover_S.compareTo(vector_S) < 0);
		assertTrue(steal_S.compareTo(steel_S) < 0);
		assertTrue(steel_S.compareTo(steal_S) > 0);
		assertTrue(book_S.compareTo(boot_S) < 0);
		assertTrue(boot_S.compareTo(book_S) > 0);
	}
	
	@Test
	public void testCompareToEmpty05() {
		assertTrue(empty_S.compareTo(empty_S_Copy) == 0);
		assertTrue(empty_S_Copy.compareTo(empty_S) == 0);
		assertTrue(empty_S.compareTo(tan_S) < 0);
		assertTrue(book_S.compareTo(empty_S) > 0);	
	}
	
	
	@Test
	public void testCompareToSmall05() {
		char[] aArray = { 'a' };
		char[] bArray = { 'b' };
		char[] yArray = { 'y' };
		String a = new String(aArray);
		String b = new String(bArray);
		String y = new String(yArray);

		assertTrue(a.compareTo(b) < 0);
		assertTrue(a.compareTo(y) < 0);
		assertTrue(y.compareTo(a) > 0);
		assertTrue(y.compareTo(b) > 0);
		assertTrue(b.compareTo(a) > 0);
		assertTrue(b.compareTo(y) < 0);
	}

	@Test
	public void testCompareToSubstring05() {
		assertEquals(0, book_S.compareTo(book_S_Copy));
		assertEquals(0, book_S_Copy.compareTo(book_S));
		assertEquals(0, bookkeeper_S.compareTo(bookkeeper_S_Copy));
		assertEquals(0, bookkeeper_S_Copy.compareTo(bookkeeper_S));
		assertEquals(0, tan_S.compareTo(tan_S_Copy));
		assertEquals(0, tan_S_Copy.compareTo(tan_S));
		
		assertTrue(book_S.compareTo(bookkeeper_S) < 0);
		assertTrue(tangerine_S.compareTo(tan_S) > 0);
		assertTrue(tangle_S.compareTo(tan_S) > 0);
		assertTrue(tan_S.compareTo(tangerine_S) < 0);
	}
	

	@Test
	public void testConstructor() {
		char[] apple = {'a', 'p', 'p', 'l', 'e'};
		String s;
		s = new String(apple, 0, 5);
		assertEquals('a', s.charAt(0));
		assertEquals('p', s.charAt(1));
		assertEquals('p', s.charAt(2));
		assertEquals('l', s.charAt(3));
		assertEquals('e', s.charAt(4));
		try {
			s = new String(apple, -2, 2);
			fail();
		} catch (IndexOutOfBoundsException e) {}
		s = new String(apple, 1, 4);
		try {
			s = new String(apple, 1, 5);
			fail();
		} catch (IndexOutOfBoundsException e) {}
		s = new String(apple, 4, 1);
		try {
			s = new String(apple, 0, -2);
			fail();
		} catch (IndexOutOfBoundsException e) {}		
	}

	@Test
	public void testEquals10() {
	    char[] zooAppleDogHelloHelpHelperStop =
	        {
	            'z', 'o', 'o', ' ',
	            'a', 'p', 'p', 'l', 'e', ' ',
	            'd', 'o', 'g', ' ',
	            'h', 'e', 'l', 'l', 'o', ' ',
	            'h', 'e', 'l', 'p', ' ',
	            'h', 'e', 'l', 'p', 'e', 'r', ' ',
	            's', 't', 'o', 'p'
	        };
	    char[] zoo = {'z', 'o', 'o'};
	    char[] apple = {'a', 'p', 'p', 'l', 'e'};
	    char[] dog = {'d', 'o', 'g'};
	    //char[] hello = {'h', 'e', 'l', 'l', 'o'};
	    char[] helper = {'h', 'e', 'l', 'p', 'e', 'r'};
	    char[] help = {'h', 'e', 'l', 'p'};
	    //char[] stop = {'s', 't', 'o', 'p'};
	    
	    String zoo1 = new String(zooAppleDogHelloHelpHelperStop, 0, 3);
	    String zoo2 = new String(zoo);
	    String apple1 = new String(zooAppleDogHelloHelpHelperStop, 4, 5);
	    String apple2 = new String(apple);
	    String dog1 = new String(zooAppleDogHelloHelpHelperStop, 10, 3);
	    String dog2 = new String(dog);
	    String help1 = new String(zooAppleDogHelloHelpHelperStop, 20, 4);
	    String help2 = new String(help);
	    String helper1 = new String(zooAppleDogHelloHelpHelperStop, 25, 6);
	    String helper2 = new String(helper);
	    
	    assertTrue(zoo1.equals(zoo2));
	    assertTrue(zoo2.equals(zoo1));
	    assertTrue(apple1.equals(apple2));
	    assertTrue(apple2.equals(apple1));
	    assertTrue(dog1.equals(dog2));
	    assertTrue(dog2.equals(dog1));
	    assertTrue(help1.equals(help2));
	    assertTrue(help2.equals(help1));
	    assertTrue(helper1.equals(helper2));
	    assertTrue(helper2.equals(helper1));
	    
	    assertFalse(help1.equals(helper1));
	    assertFalse(helper2.equals(help1));
	    assertFalse(zoo2.equals(dog2));
	    assertFalse(dog1.equals(zoo1));
	}

	@Test
	public void testEqualsEmptyAndSame05() {
		assertTrue(empty_S.equals(empty_S_Copy));
		assertTrue(empty_S_Copy.equals(empty_S));
		assertFalse(empty_S.equals(book_S));
		assertFalse(book_S.equals(empty_S));
		assertFalse(empty_S.equals(steel_S));
		assertFalse(steel_S.equals(empty_S));
		
		assertTrue(book_S.equals(book_S));
		assertTrue(bookkeeper_S_Copy.equals(bookkeeper_S_Copy));
		assertTrue(steel_S.equals(steel_S));
		assertTrue(vector_S_Copy.equals(vector_S_Copy));
		assertTrue(tan_S.equals(tan_S_Copy));
	}


	@Test
	public void testIndexOf10() {
		assertEquals(0, bookkeeper_S.indexOf('b', 0));
		assertEquals(-1, bookkeeper_S.indexOf('b', 2));
		assertEquals(1, bookkeeper_S.indexOf('o', 0));
		assertEquals(1, bookkeeper_S.indexOf('o', 1));
		assertEquals(2, bookkeeper_S.indexOf('o', 2));
		assertEquals(-1, bookkeeper_S.indexOf('o', 3));
		assertEquals(3, bookkeeper_S.indexOf('k', 1));
		assertEquals(3, bookkeeper_S.indexOf('k', 2));
		assertEquals(3, bookkeeper_S.indexOf('k', 3));
		assertEquals(-1, bookkeeper_S.indexOf('a', 0));
		assertEquals(5, bookkeeper_S.indexOf('e', 0));
		assertEquals(5, bookkeeper_S.indexOf('e', 5));
		assertEquals(6, bookkeeper_S.indexOf('e', 6));
		assertEquals(8, bookkeeper_S.indexOf('e', 7));
		assertEquals(7, bookkeeper_S.indexOf('p', 0));
		assertEquals(9, bookkeeper_S.indexOf('r', 0));
		assertEquals(-1, bookkeeper_S.indexOf('c', 0));
				
		assertEquals(0, steal_S.indexOf('s', 0));
		assertEquals(1, steal_S.indexOf('t', 0));
		assertEquals(3, steal_S.indexOf('a', 0));
		assertEquals(3, steel_S.indexOf('e', 3));
		assertEquals(-1, steal_S.indexOf('e', 3));
		assertEquals(-1, steel_S.indexOf('a', 0));
	}
	
	@Test
	public void testIndexOfSmall05() {
		for (char c = 'a'; c <= 'z'; c++) {
			assertEquals(-1, empty_S.indexOf(c,0));
		}

		char[] aArray = { 'a' };
		char[] bArray = { 'b' };
		char[] yArray = { 'y' };
		String a = new String(aArray);
		String b = new String(bArray);
		String y = new String(yArray);
		assertEquals(0, a.indexOf('a', 0));
		assertEquals(0, a.indexOf('a', -1));
		assertEquals(-1, a.indexOf('a', 1));
		assertEquals(0, b.indexOf('b', 0));
		assertEquals(0, b.indexOf('b', -1));
		assertEquals(-1, b.indexOf('b', 1));
		assertEquals(0, y.indexOf('y', 0));
		assertEquals(0, y.indexOf('y', -5));
		assertEquals(-1, y.indexOf('y', 2));
		assertEquals(-1, a.indexOf('b',0));
		assertEquals(-1, a.indexOf('y', 0));
		assertEquals(-1, b.indexOf('a', 0));
		assertEquals(-1, y.indexOf('a', 0));
	}
	
	@Test
	public void testLength05( ) {
	    char[] zooAppleDogHelloHelpHelperStop =
	        {
	            'z', 'o', 'o', ' ',
	            'a', 'p', 'p', 'l', 'e', ' ',
	            'd', 'o', 'g', ' ',
	            'h', 'e', 'l', 'l', 'o', ' ',
	            'h', 'e', 'l', 'p', ' ',
	            'h', 'e', 'l', 'p', 'e', 'r', ' ',
	            's', 't', 'o', 'p'
	        };
	    
	    String zoo1 = new String(zooAppleDogHelloHelpHelperStop, 0, 3);
	    String apple1 = new String(zooAppleDogHelloHelpHelperStop, 4, 5);
	    String hello1 = new String(zooAppleDogHelloHelpHelperStop, 14, 5);
	    String stop1 = new String(zooAppleDogHelloHelpHelperStop, 32, 4);
	    
	    assertEquals(3, zoo1.length());
	    assertEquals(5, apple1.length());
	    assertEquals(5, hello1.length());
	    assertEquals(4, stop1.length());
	    
		assertEquals(0, empty_S.length());
		assertEquals(4, book_S.length());
		assertEquals(10, bookkeeper_S.length());
		assertEquals(5, steal_S.length());
		assertEquals(4, boot_S.length());
		assertEquals(5, steel_S.length());
		assertEquals(6, tangle_S.length());
	}


	@Test
	public void testReplaceInWord10() {
		String result;
		result = book_S.replace('b', 'x');
		assertEquals('x', result.charAt(0));
		assertEquals('o', result.charAt(1));
		assertEquals('o', result.charAt(2));
		assertEquals('k', result.charAt(3));
		assertEquals('b', book_S.charAt(0));
		assertEquals('o', book_S.charAt(1));
		assertEquals('o', book_S.charAt(2));
		assertEquals('k', book_S.charAt(3));
		
		result = bookkeeper_S.replace('e', 'o');
		assertEquals('b', result.charAt(0));
		assertEquals('o', result.charAt(1));
		assertEquals('o', result.charAt(2));
		assertEquals('k', result.charAt(3));
		assertEquals('k', result.charAt(4));
		assertEquals('o', result.charAt(5));
		assertEquals('o', result.charAt(6));
		assertEquals('p', result.charAt(7));
		assertEquals('o', result.charAt(8));
		assertEquals('r', result.charAt(9));
		assertEquals('b', bookkeeper_S.charAt(0));
		assertEquals('o', bookkeeper_S.charAt(1));
		assertEquals('o', bookkeeper_S.charAt(2));
		assertEquals('k', bookkeeper_S.charAt(3));
		assertEquals('k', bookkeeper_S.charAt(4));
		assertEquals('e', bookkeeper_S.charAt(5));
		assertEquals('e', bookkeeper_S.charAt(6));
		assertEquals('p', bookkeeper_S.charAt(7));
		assertEquals('e', bookkeeper_S.charAt(8));
		assertEquals('r', bookkeeper_S.charAt(9));
		
		result = steal_S.replace('a', 'e');
		assertTrue(result.equals(steel_S));
		assertTrue(steel_S.equals(result));
		assertTrue(steal_S.equals(steal_S_Copy));
		assertTrue(steal_S_Copy.equals(steal_S));
	}

	@Test
	public void testReplaceOldNotPresent05() {
		String result;
		
		result = book_S.replace('a', 'b');
		assertTrue(result == book_S);
		result = steal_S.replace('r', 'c');
		assertTrue(result == steal_S);
		result = tan_S.replace('e', 'f');
		assertTrue(result == tan_S);
		result = vector_S.replace('b', 'x');
		assertTrue(result == vector_S);
		result = bookkeeper_S.replace('z', 'r');
		assertTrue(result == bookkeeper_S);
		result = empty_S.replace('t', 'u');
		assertTrue(result == empty_S);
	}	
	
	@Test
	public void testReplaceSmall05() {
		char[] aArray = { 'a' };
		char[] bArray = { 'b' };
		char[] yArray = { 'y' };
		String a = new String(aArray);
		String b = new String(bArray);
		String y = new String(yArray);
		String result = a.replace('a', 'y');
		assertEquals('y', result.charAt(0));
		assertEquals('a', a.charAt(0));
		result = b.replace('b', 'a');
		assertEquals('a', result.charAt(0));
		assertEquals('b', b.charAt(0));
		result = y.replace('y', 'b');
		assertEquals('b', result.charAt(0));
		assertEquals('y', y.charAt(0));
	}
	
	@Test
	public void testSplitEmptyAndMissing10() {
		char[] empty = {};
		char[] abacad = {'a', 'b', 'a', 'c', 'a', 'c'};
		String empty_S = new String(empty);
		String abacad_S = new String(abacad);
		String[] array1 = empty_S.split(' ');
		String[] array2 = abacad_S.split(' ');
		assertEquals(1, array1.length);
		assertEquals(empty_S, array1[0]);
		assertEquals(1, array2.length);
		assertEquals(abacad_S, array2[0]);
	}
	
	@Test
	public void testSplitLarge10() {
	    char[] zooAppleDogHelloHelpHelperStop =
	        {
	            'z', 'o', 'o', ' ',
	            'a', 'p', 'p', 'l', 'e', ' ',
	            'd', 'o', 'g', ' ',
	            'h', 'e', 'l', 'l', 'o', ' ',
	            'h', 'e', 'l', 'p', ' ',
	            'h', 'e', 'l', 'p', 'e', 'r', ' ',
	            's', 't', 'o', 'p'
	        };
	    char[] zoo = {'z', 'o', 'o'};
	    char[] apple = {'a', 'p', 'p', 'l', 'e'};
	    char[] dog = {'d', 'o', 'g'};
	    char[] hello = {'h', 'e', 'l', 'l', 'o'};
	    char[] help = {'h', 'e', 'l', 'p'};
	    char[] helper = {'h', 'e', 'l', 'p', 'e', 'r'};
	    char[] stop = {'s', 't', 'o', 'p'};
	    
	    char[] zoo_app = {'z', 'o', 'o', ' ', 'a', 'p', 'p'};
	    char[] e_dog_he = {'e', ' ', 'd', 'o', 'g', ' ', 'h', 'e'};
	    char[] empty = {};
	    char[] o_he = {'o', ' ', 'h', 'e'};
	    char[] p_he = {'p', ' ', 'h', 'e'};
	    char[] per_stop = {'p', 'e', 'r', ' ', 's', 't', 'o', 'p'};
	

	    String zooAppleDogHelloHelpHelperStop_S = new String(zooAppleDogHelloHelpHelperStop);
	    String[] array1 = zooAppleDogHelloHelpHelperStop_S.split(' ');
	    String[] array2 = zooAppleDogHelloHelpHelperStop_S.split('l');
	    String zoo_S = new String(zoo);
	    String apple_S = new String(apple);
	    String dog_S = new String(dog);
	    String hello_S = new String(hello);
	    String help_S = new String(help);
	    String helper_S = new String(helper);
	    String stop_S = new String(stop);
	    String zoo_app_S = new String(zoo_app);
	    String e_dog_he_S = new String(e_dog_he);
	    String empty_S = new String(empty);
	    String o_he_S = new String(o_he);
	    String p_he_S = new String(p_he);
	    String per_stop_S = new String(per_stop);
	    
	    assertEquals(7, array1.length);
	    assertEquals(6, array2.length);
	    assertEquals(zoo_S, array1[0]);
	    assertEquals(array1[1], apple_S);
	    assertEquals(dog_S, array1[2]);
	    assertEquals(array1[3], hello_S);
	    assertEquals(help_S, array1[4]);
	    assertEquals(array1[5], helper_S);
	    assertEquals(stop_S, array1[6]);
	    
	    assertNotEquals(zoo_S, array1[4]);
	    assertNotEquals(array1[3], apple_S);
	    
	    assertEquals(zoo_app_S, array2[0]);
	    assertEquals(array2[1], e_dog_he_S);
	    assertEquals(empty_S, array2[2]);
	    assertEquals(array2[3], o_he_S);
	    assertEquals(p_he_S, array2[4]);
	    assertEquals(array2[5], per_stop_S);
	    
	    assertNotEquals(o_he_S, array2[4]);
	    assertNotEquals(array2[3], p_he_S);
	}
}
