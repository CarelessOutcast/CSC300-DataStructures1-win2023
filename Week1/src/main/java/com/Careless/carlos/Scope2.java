package week1;
import edu.princeton.cs.algs4.*;

public class Scope2 {
    private int i = 1;

    public void f() {
        int i = 10;
        StdOut.println("i in f equals " + i);
        g();
        StdOut.println("i in f equals " + i);
    }
    
    public void g() {
    	StdOut.println("i in g equals " + i);
        i = 100;
        StdOut.println("i in g equals " + i);
    }

    public static void main(String[] args) {
    	Scope2 s = new Scope2();
        s.f();
    }

}
