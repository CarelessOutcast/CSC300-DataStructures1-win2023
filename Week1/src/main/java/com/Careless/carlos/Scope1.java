package week1;
import edu.princeton.cs.algs4.*;

public class Scope1 {
    public void f() {
        int i = 10;
        StdOut.println("i in f equals " + i);
        g(i);
        StdOut.println("i in f equals " + i);
    }
    
    public void g(int i) {
    	StdOut.println("i in g equals " + i);
        i = 100;
        StdOut.println("i in g equals " + i);
    }

    public static void main(String[] args) {
    	Scope1 s = new Scope1();
        s.f();
    }

}
