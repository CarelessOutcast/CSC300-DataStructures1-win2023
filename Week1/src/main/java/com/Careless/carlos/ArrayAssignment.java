package week1;

import java.util.Arrays;
import edu.princeton.cs.algs4.StdOut;


public class ArrayAssignment {
	public static void main(String[] args) {
		String[] orig = {"red", "white", "blue"};
		String[] copy = orig;
		
		StdOut.println(Arrays.toString(orig));
		StdOut.println(Arrays.toString(copy));
		
		orig[1] = "yellow";
		
		StdOut.println(Arrays.toString(orig));
		//StdOut.println(Arrays.toString(copy));
	}
}
