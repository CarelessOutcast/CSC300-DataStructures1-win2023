package week1;
import edu.princeton.cs.algs4.*;

public class ArrayPrinter {
	public void printWithIndexedFor(String[] x) {
        for (int i = 0; i < x.length; i++)
            StdOut.println(x[i]);
    }
	
	public void printWithWhile(String[] x) {
        int i = 0;
        while (i < x.length) {
            StdOut.println(x[i]);
            i++;
        }
    }
	
    public void printWithForeach(String[] x) {
        for (String s : x)
            StdOut.println(s);
    }
}
