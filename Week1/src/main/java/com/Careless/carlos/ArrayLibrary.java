package week1;

public class ArrayLibrary {
	/**
	 * Create an array of the first n positive integers
	 * 
	 * @param n the number of integers to include
	 * @return an array of the first n positive integers
	 */
    public int[] makeIntArray(int n) {
        int[] answer;
        answer = new int[n];
        int i = 1;
        while (i <= n) {
            answer[i - 1] = i;
            i++;
        }
        return answer;
    }
    
    /**
     * Prints out the numbers in an intArray
     * 
     * @param intArray the array to be printed out
     */
    public void printIntArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("A[%d] = %d%n", i, intArray[i]);
        }
    }

    public static void main(String[] args) {
    	ArrayLibrary ex4 = new ArrayLibrary();
        int[] countList = ex4.makeIntArray(5);
        ex4.printIntArray(countList);
    }
}
