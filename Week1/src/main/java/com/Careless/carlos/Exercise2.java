package week1;

import edu.princeton.cs.algs4.*;

// HW2
// isSorted
// hasDuplicate

public class Exercise2 {
	public static void main(String[] args) {
		Exercise2 ex2 = new Exercise2();
		
		System.out.println("Type in a number followed by that many words");
		String[] words = ex2.readInWords();
		
		StdOut.println("The first letter of each word:");
		ex2.printFirstLetters(words);
		
		StdOut.print("The array of words is: ");
		String stringRepresentation = ex2.arrayToString(words);
		StdOut.println(stringRepresentation);
		
		StdOut.println("Creating the array of doubled entries:");
		String[] doubled = ex2.doubledArray(words);
		StdOut.println(ex2.arrayToString(doubled));
	}
	
	/**
	 * Prints out the first letter of each String in an array
	 * @param w the array of Strings
	 */
	public void printFirstLetters (String[] w) {
		throw new RuntimeException("Not implemented");
	}
	
	/**
	 * Creates a String representation of an array
	 * 
	 * @param arr the array
	 * @return a String representation of the array
	 */
	public String arrayToString(String[] arr) {
		throw new RuntimeException("Not implemented");
	}
	
	/**
	 * Creates an new array from the entries of an input array.  The entries are repeated in the new array.
	 * For example, if the orginal array looks like {"a", "bb", c"}, the new array looks like
	 * {"a", "a", "bb", "bb", "c", "c"}
	 * 
	 * @param w the original array
	 * @return a new array with repeated entries.
	 */
	public String[] doubledArray(String[] w) {
		throw new RuntimeException("Not implemented");
	}

	
	
	/**
	 * Read in a number followed by that many words from StdIn and create an array of those words.
	 * 
	 * @return an array with the words that were read in.
	 */
	private String[] readInWords() {
		throw new RuntimeException("Not implemented");
	}
}
