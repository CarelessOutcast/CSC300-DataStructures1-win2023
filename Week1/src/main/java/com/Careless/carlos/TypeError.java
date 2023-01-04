package week1;

import edu.princeton.cs.algs4.*;

public class TypeError {
	public static void main(String[] args) {
		String x;
		x = "Bob";
		StdOut.println("Hello " + x);
		//x = 42; // Compiler error
		//StdOut.println(x - 1); // Compiler error
		AddHello ah = new AddHello();
		StdOut.println(ah.addHello("Alice"));
		//StdOut.println(ah.addHello(42)); //Compiler error	
	}
}
