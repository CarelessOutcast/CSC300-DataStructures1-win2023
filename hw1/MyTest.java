package hw1;

//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

public class MyTest {
	public static void main(String[] args) {
		char[] carBox = {'c', 'a', 'r', ' ', 'b', 'o', 'x'};
		char[] boxCar = {'b', 'o', 'x', ' ', 'c', 'a', 'r'};
		char[] boxBox = {'b', 'o', 'x', ' ', 'b', 'o', 'x'};

		int[] ints1 = {-5, 2, 1};
		int[] ints2 = {-5, 2, -1};
		int[] ints3 = {5, 2, 0, 9};

		StdOut.println("HW1.wordsInOrder(carBox) = " + HW1.wordsInOrder(carBox));
		StdOut.println("HW1.wordsInOrder(boxCar) = " + HW1.wordsInOrder(boxCar));
		
		StdOut.println("HW1.containsDuplicates(boxCar) = " + HW1.containsDuplicates(boxCar));
		StdOut.println("HW1.containsDuplicates(boxBox) = " + HW1.containsDuplicates(boxBox));
		
		StdOut.println("HW1.sign(ints1) = " + HW1.sign(ints1));
		StdOut.println("HW1.sign(ints2) = " + HW1.sign(ints2));
		
		StdOut.println("HW1.countEvens(ints1) = " + HW1.countEvens(ints1));
		StdOut.println("HW1.countEvens(ints3) = " + HW1.countEvens(ints3));
		
		StdOut.println("HW1.getEvens(ints3) = " + Arrays.toString(HW1.getEvens(ints3)));

	}
}





