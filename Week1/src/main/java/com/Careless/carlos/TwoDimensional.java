package week1;

import edu.princeton.cs.algs4.StdOut;

public class TwoDimensional {
    public static void main(String[] args) {
        int[][] table = new int[3][2];
        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[i].length; j++) {
                table[i][j] = i * 10 + j;
            }
        }
        StdOut.printf("table[2][1] = %d", table[2][1]);
    }
}
