package week1;
import edu.princeton.cs.algs4.*;

public class MoreTypes {
    public static void main(String[] args) {
        int i = 0;
        String s = "Hello";
        char c = 'z';
        double f = 3.14;
        while (i < 3) {
            StdOut.printf("s = %s, f = %f%n", s, f);
            i += 1;
            s = s + c;
            f = f + i;
        }
    }
}
