package week1;

import edu.princeton.cs.algs4.StdOut;

public class PrintArray {
	public static void main(String[] args) {
		String[] arr = {"one", "two", "three"};
		
		StdOut.println(arr);
		StdOut.println("****************************");
		
		ArrayPrinter ap = new ArrayPrinter();
		ap.printWithIndexedFor(arr);
		StdOut.println("****************************");
		ap.printWithWhile(arr);
		StdOut.println("****************************");
		ap.printWithForeach(arr);
	}
}
