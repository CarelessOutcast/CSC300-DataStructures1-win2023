package week1;

import edu.princeton.cs.algs4.*;

// HW2
// isSorted
// hasDuplicate

public class Exercise1 {	
	public static void main(String[] args) {
		System.out.println("Type in 3 words");
		String word1 = StdIn.readString();
		String word2 = StdIn.readString();
		String word3 = StdIn.readString();
		
		Exercise1 ex1 = new Exercise1();
		
		String first = ex1.firstWord(word1, word2, word3);
		StdOut.println("First word in dictionary is " + first);
	}
	
	public String firstWord(String w1, String w2, String w3) {
		throw new RuntimeException("Not implemented");
	}
	

}
