package hw1;

import java.lang.String;

public class HW1 {

	/**
	 * Determines if the words in a charArray appear in sorted order
	 * 
	 * @param charArray An array of letters containing multiple words separated by
	 *                  space characters. All letters are lower case.
	 * @return {@code true} if the words appear in alphabetical order and
	 *         {@code false} otherwise.
	 */
	public static boolean wordsInOrder(char[] charArray) {
        // I finished this before realizing we could use the java api: It works tho...
        if (charArray.length < 1) 
        { 
        	return true;
        }

        int n = 0;
        
        for (int i = 0, j = 1; j < charArray.length - 1; j++)
        {
            // You found a new word
            if(charArray[j] == ' ')
            {
                // check the first letter of next word;
                int k = j + 1;
                // if first letter is less return false
                if (charArray[k] < charArray[i])
                {
                    return false;
                }
                // if the first letter is the same as first
                if (charArray[k] == charArray[i])
                {
                    // check the remaining letters until end, or new word
                    while (charArray[k + n] != ' ' || charArray[i + n] != ' ' || i+n != charArray.length || j+n != charArray.length)
                    {
                        // look for next different letter
                        if (charArray[k + n] != charArray[i + n])
                        {
                            break;
                        }
                        n++;
                    }
                    // next different character is less than first; 
                    // return false
                    if (charArray[k+n] < charArray[i+n])
                    {
                    	return false;
                    	
                    }
                    // reset the temp mover
                    n = 0;
                }
                // move the variable to next word
                i = k;
            }
        }
        return true;
	}

	/**
	 * Determines if any of the words in a charArray appear more than once.
	 * 
	 * @param charArray An array of letters containing multiple words separated by
	 *                  space characters. All letters are lower case.
	 * @return {@code true} if there is at least one word that appears more than
	 *         once and {@code false} otherwise.
	 */
	public static boolean containsDuplicates(char[] charArray) {
		String wordsObj = new String(charArray);
        String[] words = wordsObj.split(" ");

        for (int i = 0; i < words.length; i++)
        {
            for (int j = i + 1; j < words.length; j++)
            {
            	if(words[i].compareTo(words[j]) == 0)
            	{
            		return true;
            	}
            }
        }
		return false;
	}
	/**
	 * Determines if there are more positive numbers or more negative numbers in a
	 * given array.
	 * 
	 * @param numbers the array of numbers to be checked
	 * @return a positive number if the array contains more positive numbers than
	 *         negative numbers, a negative number if the array contains more
	 *         negative numbers than positive numbers, or zero if the array contains
	 *         the same number of positive numbers as negative numbers
	 */
	public static int sign(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            // don't count 0
            if (numbers[i] == 0)
            {
                continue;
            }
            // check if it's greater than 0
            if (numbers[i] > 0)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
		return count;
	}

	/**
	 * Returns the number of even ints in an array.
	 * 
	 * @param a an array of ints
	 * @return the number of even ints in the array
	 */
	public static int countEvens(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] % 2 == 0)
            {
                count++;
            }
        }
		return count;
	}

	/**
	 * Returns a new array containing the even ints from a given array in the same
	 * order they appear in the given array.
	 * 
	 * @param a an array of ints
	 * @return a new array containing the even ints from {@code a} input array in
	 *         the same order they appear in the array
	 */
	public static int[] getEvens(int[] a) {

        int n = 0;
        int[] answer = new int[countEvens(a)];

        for (int i = 0, j = 0; i < a.length; i++)
        {
            if (a[i]%2 == 0)
            {
                answer[j] = a[i];
                j++;
            }
        }
		return answer;
	}
}
