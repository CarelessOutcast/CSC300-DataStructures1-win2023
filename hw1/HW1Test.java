package hw1;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HW1Test {

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@Test
	public void testWordsInOrderSizeZeroOrOne05() {
		char[] empty= {};
        assertTrue(HW1.wordsInOrder(empty));

        char[] apple =
        {
            'a', 'p', 'p', 'l', 'e'
        };
        assertTrue(HW1.wordsInOrder(apple));

        char[] car =
        {
            'c', 'a', 'r'
        };
        assertTrue(HW1.wordsInOrder(car));

        char[] zoo =
        {
            'z', 'o', 'o'
        };
        assertTrue(HW1.wordsInOrder(zoo));
	}
	
	@Test
	public void testWordsInOrderSizeTwo05() {
        char[] appleBox =
        {
            'a', 'p', 'p', 'l', 'e', ' ',
            'b', 'o', 'x'
        };
        assertTrue(HW1.wordsInOrder(appleBox));

        char[] boxApple =
        {
            'b', 'o', 'x', ' ',
            'a', 'p', 'p', 'l', 'e'
        };
        assertFalse(HW1.wordsInOrder(boxApple));

        char[] apeApple =
        {
            'a', 'p', 'e', ' ',
            'a', 'p', 'p', 'l', 'e'
        };
        assertTrue(HW1.wordsInOrder(apeApple));

        char[] appleApe =
        {
            'a', 'p', 'p', 'l', 'e', ' ',
            'a', 'p', 'e'
        };
        assertFalse(HW1.wordsInOrder(appleApe));	
	}
	
	@Test
	public void testWordsInOrderSizeThree05() {
        char[] appleCarZoo =
        {
            'a', 'p', 'p', 'l', 'e', ' ',
            'c', 'a', 'r', ' ',
            'z', 'o', 'o'
        };
        assertTrue(HW1.wordsInOrder(appleCarZoo));

        char[] appleZooCar =
        {
            'a', 'p', 'p', 'l', 'e', ' ',
            'z', 'o', 'o', ' ',
            'c', 'a', 'r'
        };
        assertFalse(HW1.wordsInOrder(appleZooCar));

        char[] dogBannaStop =
        {
            'd', 'o', 'g', ' ',
            'b', 'a', 'n', 'n', 'a', ' ',
            's', 't', 'o', 'p'
        };
        assertFalse(HW1.wordsInOrder(dogBannaStop));

        char[] dogStopBanana =
        {
            'd', 'o', 'g', ' ',
            's', 't', 'o', 'p', ' ',
            'b', 'a', 'n', 'a', 'n', 'a'
        };
        assertFalse(HW1.wordsInOrder(dogStopBanana));

        char[] moonMoreMost =
        {
            'm', 'o', 'o', 'n', ' ',
            'm', 'o', 'r', 'e', ' ',
            'm', 'o', 's', 't'
        };
        assertTrue(HW1.wordsInOrder(moonMoreMost));

        char[] moonMostMore =
        {
            'm', 'o', 'o', 'n', ' ',
            'm', 'o', 's', 't', ' ',
            'm', 'o', 'r', 'e'
        };
        assertFalse(HW1.wordsInOrder(moonMostMore));

        char[] mostMoreMoon =
        {
            'm', 'o', 's', 't', ' ',
            'm', 'o', 'r', 'e', ' ',
            'm', 'o', 'o', 'n'
        };
        assertFalse(HW1.wordsInOrder(mostMoreMoon));
	}

	@Test
	public void testWordsInOrderLargeSize05() {
        char[] appleDogHelloHelpHelperStopZoo =
        {
            'a', 'p', 'p', 'l', 'e', ' ',
            'd', 'o', 'g', ' ',
            'h', 'e', 'l', 'l', 'o', ' ',
            'h', 'e', 'l', 'p', ' ',
            'h', 'e', 'l', 'p', 'e', 'r', ' ',
            's', 't', 'o', 'p', ' ',
            'z', 'o', 'o'
        };
        assertTrue(HW1.wordsInOrder(appleDogHelloHelpHelperStopZoo));

        char[] appleDogHelloHelperHelpStopZoo =
        {
            'a', 'p', 'p', 'l', 'e', ' ',
            'd', 'o', 'g', ' ',
            'h', 'e', 'l', 'l', 'o', ' ',
            'h', 'e', 'l', 'p', 'e', 'r', ' ',
            'h', 'e', 'l', 'p', ' ',
            's', 't', 'o', 'p', ' ',
            'z', 'o', 'o'
        };
        assertFalse(HW1.wordsInOrder(appleDogHelloHelperHelpStopZoo));

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
        assertFalse(HW1.wordsInOrder(zooAppleDogHelloHelpHelperStop));

        char[] appleDogHelloHelperStopZoo =
        {
            'a', 'p', 'p', 'l', 'e', ' ',
            'd', 'o', 'g', ' ',
            'h', 'e', 'l', 'l', 'o', ' ',
            'h', 'e', 'l', 'p', 'e', 'r', ' ',
            's', 't', 'o', 'p', ' ',
            'z', 'o', 'o'
        };
        assertTrue(HW1.wordsInOrder(appleDogHelloHelperStopZoo));

        char[] appleBagDogHelloHelpHelperStop =
        {
            'a', 'p', 'p', 'l', 'e', ' ',
            'b', 'a', 'g', ' ',
            'd', 'o', 'g', ' ',
            'h', 'e', 'l', 'l', 'o', ' ',
            'h', 'e', 'l', 'p', ' ',
            'h', 'e', 'l', 'p', 'e', 'r', ' ',
            's', 't', 'o', 'p'
        };
        assertTrue(HW1.wordsInOrder(appleBagDogHelloHelpHelperStop));
	}
	
	
	@Test
	public void testDuplicatesSizeZeroOrOne05() {
        char[] empty  = {};
        assertFalse(HW1.containsDuplicates(empty));

        char[] apple =
        {
            'a', 'p', 'p', 'l', 'e'
        };
        assertFalse(HW1.containsDuplicates(apple));

        char[] car =
        {
            'c', 'a', 'r'
        };
        assertFalse(HW1.containsDuplicates(car));

        char[] zoo =
        {
            'z', 'o', 'o'
        };
        assertFalse(HW1.containsDuplicates(zoo));
	}


	@Test
	public void testDuplicatesSizeTwo05() {
        char[] boxBox =
        {
            'b', 'o', 'x', ' ',
            'b', 'o', 'x'
        };
        assertTrue(HW1.containsDuplicates(boxBox));

        char[] boxFox =
        {
            'b', 'o', 'x', ' ',
            'f', 'o', 'x'
        };
        assertFalse(HW1.containsDuplicates(boxFox));

        char[] foxBox =
        {
            'f', 'o', 'x', ' ',
            'b', 'o', 'x'
        };
        assertFalse(HW1.containsDuplicates(foxBox));

        char[] foxFox =
        {
            'f', 'o', 'x', ' ',
            'f', 'o', 'x'
        };
        assertTrue(HW1.containsDuplicates(foxFox));
	}

	@Test
	public void testDuplicatesSizeThree05() {
        char[] carDogBox =
        {
            'c', 'a', 'r', ' ',
            'd', 'o', 'g', ' ',
            'b', 'o', 'x'
        };
        assertFalse(HW1.containsDuplicates(carDogBox));

        char[] carDogCar =
        {
            'c', 'a', 'r', ' ',
            'd', 'o', 'g', ' ',
            'c', 'a', 'r'
        };
        assertTrue(HW1.containsDuplicates(carDogCar));

        char[] dogDogDog =
        {
            'd', 'o', 'g', ' ',
            'd', 'o', 'g', ' ',
            'd', 'o', 'g'
        };
        assertTrue(HW1.containsDuplicates(dogDogDog));

        char[] dogCarBox =
        {
            'd', 'o', 'g', ' ',
            'c', 'a', 'r', ' ',
            'b', 'o', 'x'
        };
        assertFalse(HW1.containsDuplicates(dogCarBox));

        char[] boxCarFox =
        {
            'b', 'o', 'x', ' ',
            'c', 'a', 'r', ' ',
            'f', 'o', 'x'
        };
        assertFalse(HW1.containsDuplicates(boxCarFox));
	}

	@Test
	public void testDuplicatesLargeSize05() {
        char[] boxCarDogBirdHouseCarStop =
        {
            'b', 'o', 'x', ' ',
            'c', 'a', 'r', ' ',
            'd', 'o', 'g', ' ',
            'b', 'i', 'r', 'd', ' ',
            'h', 'o', 'u', 's', 'e', ' ',
            'c', 'a', 'r', ' ',
            's', 't', 'o', 'p'
        };
        assertTrue(HW1.containsDuplicates(boxCarDogBirdHouseCarStop));

        char[] carBoxDogBirdHouseStopCar =
        {
            'c', 'a', 'r', ' ',
            'b', 'o', 'x', ' ',
            'd', 'o', 'g', ' ',
            'b', 'i', 'r', 'd', ' ',
            'h', 'o', 'u', 's', 'e', ' ',
            's', 't', 'o', 'p', ' ',
            'c', 'a', 'r'
        };
        assertTrue(HW1.containsDuplicates(carBoxDogBirdHouseStopCar));

        char[] TboxCarDogBirdHouseLstStop =
        {
            'T', 'b', 'o', 'x', ' ',
            'c', 'a', 'r', ' ',
            'd', 'o', 'g', ' ',
            'b', 'i', 'r', 'd', ' ',
            'h', 'o', 'u', 's', 'e', ' ',
            'l', 's', 't', ' ',
            's', 't', 'o', 'p'
        };
        assertFalse(HW1.containsDuplicates(TboxCarDogBirdHouseLstStop));

        char[] carBoxDogBirdHouseStopLast =
        {
            'c', 'a', 'r', ' ',
            'b', 'o', 'x', ' ',
            'd', 'o', 'g', ' ',
            'b', 'i', 'r', 'd', ' ',
            'h', 'o', 'u', 's', 'e', ' ',
            's', 't', 'o', 'p', ' ',
            'l', 'a', 's', 't'
        };
        assertFalse(HW1.containsDuplicates(carBoxDogBirdHouseStopLast));

        char[] carDogDogDogDogStopBird =
        {
            'c', 'a', 'r', ' ',
            'd', 'o', 'g', ' ',
            'd', 'o', 'g', ' ',
            'd', 'o', 'g', ' ',
            'd', 'o', 'g', ' ',
            's', 't', 'o', 'p', ' ',
            'b', 'i', 'r', 'd'
        };
        assertTrue(HW1.containsDuplicates(carDogDogDogDogStopBird));

        char[] andBatCatDogFarGateHitIceJarLastMoreNoPutQuizRatSitTestVaseWaxZoo =
        {
            'a', 'n', 'd', ' ',
            'b', 'a', 't', ' ',
            'c', 'a', 't', ' ',
            'd', 'o', 'g', ' ',
            'f', 'a', 'r', ' ',
            'g', 'a', 't', 'e', ' ',
            'h', 'i', 't', ' ',
            'i', 'c', 'e', ' ',
            'j', 'a', 'r', ' ',
            'l', 'a', 's', 't', ' ',
            'm', 'o', 'r', 'e', ' ',
            'n', 'o', ' ',
            'p', 'u', 't', ' ',
            'q', 'u', 'i', 'z', ' ',
            'r', 'a', 't', ' ',
            's', 'i', 't', ' ',
            't', 'e', 's', 't', ' ',
            'v', 'a', 's', 'e', ' ',
            'w', 'a', 'x', ' ',
            'z', 'o', 'o'
        };
        assertFalse(HW1.containsDuplicates(andBatCatDogFarGateHitIceJarLastMoreNoPutQuizRatSitTestVaseWaxZoo));

        char[] andBatCatDogFarGateHitIceJarLastMoreNoPutQuizRatSitTestFarWaxZoo =
        {
            'a', 'n', 'd', ' ',
            'b', 'a', 't', ' ',
            'c', 'a', 't', ' ',
            'd', 'o', 'g', ' ',
            'f', 'a', 'r', ' ',
            'g', 'a', 't', 'e', ' ',
            'h', 'i', 't', ' ',
            'i', 'c', 'e', ' ',
            'j', 'a', 'r', ' ',
            'l', 'a', 's', 't', ' ',
            'm', 'o', 'r', 'e', ' ',
            'n', 'o', ' ',
            'p', 'u', 't', ' ',
            'q', 'u', 'i', 'z', ' ',
            'r', 'a', 't', ' ',
            's', 'i', 't', ' ',
            't', 'e', 's', 't', ' ',
            'f', 'a', 'r', ' ',
            'w', 'a', 'x', ' ',
            'z', 'o', 'o'
        };
        assertTrue(HW1.containsDuplicates(andBatCatDogFarGateHitIceJarLastMoreNoPutQuizRatSitTestFarWaxZoo));
	}
	
	@Test
	public void testSignSizeZeroOrOne05() {
		int result;
		
		int[] empty = {};
		result = HW1.sign(empty);
		assertEquals(0, result);
		
		int[] onePos = {42};
		result = HW1.sign(onePos);
		assertTrue(result > 0);
		
		int[] oneNeg = {-2};
		result = HW1.sign(oneNeg);
		assertTrue(result < 0);
		
		int[] oneZero = {0};
		result = HW1.sign(oneZero);
		assertTrue(result == 0);
	}

	@Test
	public void testSignSizeTwo05() {
		int result;
		
		int[] twoA = {4, 7};
		result = HW1.sign(twoA);
		assertTrue(result > 0);
		
		int[] twoB = {0, 7};
		result = HW1.sign(twoB);
		assertTrue(result > 0);
		
		int[] twoC = {4, 0};
		result = HW1.sign(twoC);
		assertTrue(result > 0);
		
		int[] twoD = {0, 0};
		result = HW1.sign(twoD);
		assertTrue(result == 0);
		
		int[] twoE = {7, -4};
		result = HW1.sign(twoE);
		assertTrue(result == 0);
		
		int[] twoF = {-2, 1};
		result = HW1.sign(twoF);
		assertTrue(result == 0);
		
		int[] twoG = {-4, -9};
		result = HW1.sign(twoG);
		assertTrue(result < 0);
		
		int[] twoH = {0, -9};
		result = HW1.sign(twoH);
		assertTrue(result < 0);
		
		int[] twoI = {-4, 0};
		result = HW1.sign(twoI);
		assertTrue(result < 0);
	}
	
	@Test
	public void testSignSizeThree05() {
		int result;
	
		int[] threeA = {-4, 0, 7};
		result = HW1.sign(threeA);
		assertTrue(result == 0);
		
		int[] threeB = {0, -10, 7};
		result = HW1.sign(threeB);
		assertTrue(result == 0);
		
		int[] threeC = {31, -4, 0};
		result = HW1.sign(threeC);
		assertTrue(result == 0);
		
		int[] threeD = {-40, 7, 31};
		result = HW1.sign(threeD);
		assertTrue(result > 0);
		
		int[] threeE = {-2, -4, 1};
		result = HW1.sign(threeE);
		assertTrue(result < 0);
		
		int[] threeF = {0, -4, 0};
		result = HW1.sign(threeF);
		assertTrue(result < 0);
		
		int[] threeG = {0, 0, 1};
		result = HW1.sign(threeG);
		assertTrue(result > 0);
		
		int[] threeH = {31, 1, 2};
		result = HW1.sign(threeH);
		assertTrue(result > 0);
		
		int[] threeI = {-31, -4, -7};
		result = HW1.sign(threeI);
		assertTrue(result < 0);
	}
	
	@Test
	public void testSignSizeLarge05() {
		int result;
		
		int[] largeA = {-31, -4, -7, 4, 9, 1, 1};
		result = HW1.sign(largeA);
		assertTrue(result > 0);
		
		int[] largeB = {-31, -4, -7, 4, 9, -1, 1};
		result = HW1.sign(largeB);
		assertTrue(result < 0);
		
		int[] largeC = {-31, -4, -7, 0, 9, 1, 1};
		result = HW1.sign(largeC);
		assertTrue(result == 0);
		
		int[] largeD = {-31, -4, 7, -4, 9, 1};
		result = HW1.sign(largeD);
		assertTrue(result == 0);
		
		int[] largeE= {-31, -4, 0, 7, -4, 90, 0, 1};
		result = HW1.sign(largeE);
		assertTrue(result == 0);
	}
	
	@Test
	public void testcountEvensEmpty05() {
		int[] empty = {};
		assertEquals(0, HW1.countEvens(empty));
	}

	@Test
	public void testcountEvensSingle05() {
		int[] seven = { 7 };
		int[] neg2 = { -2 };

		assertEquals(0, HW1.countEvens(seven));
		assertEquals(1, HW1.countEvens(neg2));
	}

	@Test
	public void testcountEvensDouble05() {
		int[] a = { 2, -6 };
		int[] b = { -1, 7 };

		assertEquals(2, HW1.countEvens(a));
		assertEquals(0, HW1.countEvens(b));

		a[1] = -3;
		b[1] = 4;

		assertEquals(1, HW1.countEvens(a));
		assertEquals(1, HW1.countEvens(b));
	}

	@Test
	public void testcountEvensLong05() {
		int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		assertEquals(5, HW1.countEvens(a));
		a[0] = 20;
		assertEquals(5, HW1.countEvens(a));
		a[1] = 22;
		assertEquals(6, HW1.countEvens(a));
		a[3] = 66;
		assertEquals(7, HW1.countEvens(a));
		a[6] = 120;
		assertEquals(7, HW1.countEvens(a));
		a[3] = 33;
		assertEquals(6, HW1.countEvens(a));
	}

	@Test
	public void testgetEvensEmpty05() {
		int[] empty1 = {};
		int[] empty2 = {};
		assertArrayEquals(empty2, HW1.getEvens(empty1));
		assertArrayEquals(empty1, HW1.getEvens(empty1));
	}

	@Test
	public void testgetEvensSingle05() {
		int[] empty = {};
		int[] seven = { 7 };
		int[] neg2 = { -2 };
		assertArrayEquals(empty, HW1.getEvens(seven));
		assertArrayEquals(neg2, HW1.getEvens(neg2));
	}
	
	@Test
	public void testgetEvensDouble05() {
		int[] empty = {};
		int[] ee = { 4, -2 };
		int[] eo = { -2, 7 };
		int[] oe = { 7, -2 };
		int[] oo = { -5, 7 };
		int[] negTwo = { -2 };
		
		assertArrayEquals(empty, HW1.getEvens(oo));
		assertArrayEquals(negTwo, HW1.getEvens(eo));
		assertArrayEquals(negTwo, HW1.getEvens(oe));
		assertArrayEquals(ee, HW1.getEvens(ee));
	}
	
	@Test
	public void testgetEvensLong05() {
		int[] count = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] evens = {0, 2, 4, 6, 8};
		int[] evens10 = {0, 10, 2, 4, 6, 8};
		int[] evens1030 = {0, 10, 2, 30, 4, 6, 8};
		int[] evens30 = {0, 2, 30, 4, 6, 8};
		
		assertArrayEquals(evens, HW1.getEvens(count));
		count[1] = 10;
		assertArrayEquals(evens10, HW1.getEvens(count));
		count[3] = 30;
		assertArrayEquals(evens1030, HW1.getEvens(count));
		count[1] = 17;
		assertArrayEquals(evens30, HW1.getEvens(count));
	}
}
