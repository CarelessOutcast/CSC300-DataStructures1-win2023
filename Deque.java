package hw5;

import java.util.NoSuchElementException;

/**
 * This is a skeleton file for your homework. Complete the functions below. You
 * may also edit the function "main" to test your code.
 * 
 * You should not use any loops or recursions. Your code needs to run in
 * constant time. It is OK if your testing code has loops (like in
 * checkInvariants).
 *
 * You must not add fields or static variables. As always, you must not change
 * the declaration of any method nor the name of the class or of this file.
 */

public class Deque<T> {

	private Node first; 	// A reference to the first item in the Dequeue (or
							// null if empty)
	private Node last; 		// A reference to the last item in the Dequeue (or
							// null if empty)
	private int N; 			// The number of items currently in the Dequeue

	private class Node {

		public T item; 		// The data stored at this node.
		public Node next; 	// The node to the right (or null if there is no
							// node to the right)
		public Node prev; 	// The node to the lett (or null if there is no
							// node to the left)
	}

	/**
	 * Construct an empty <code>Deque</code>.
	 */
	public Deque() {
        first = null;
        last = null;
        N = 0;
	}

	/**
	 * Tests if the <code>Dequeue</code> is empty.
	 * 
	 * @return <code>true</code> if this <code>Deque</code> is empty and false
	 *         otherwise.
	 */
	public boolean isEmpty() {
        return N == 0;
	}

	/**
	 * Returns the number of items currenlty in this <code>Deque</code>.
	 * 
	 * @return the number of items currenlty in this <code>Deque</code>
	 */
	public int size() {
        return N;
	}

	/**
	 * Inserts an item into the front of this <code>Deque</code>.
	 * 
	 * @param item the item to be inserted
	 */
	public void pushFront(T item) {
        Node temp = new Node();
        temp.item = item;

        if (N == 0)
        {
            first = temp;
            last = temp;
            N++;
        }
        else
        {
            first.prev = temp;
            temp.next = first;
            first = temp;
            N++;
        }
	}

	/**
	 * Inserts an item into the back of this <code>Deque</code>.
	 * 
	 * @param item the item to be inserted
	 */
	public void pushBack(T item) {
        Node temp = new Node();
        temp.item = item;

        if (N==0)
        {
            first = temp;
            last = temp;
            N++;
        }
        else
        {
            temp.prev = last;
            last.next = temp;
            last = temp;
            N++;
        }
	}

	/**
	 * Removes and returns the item at the front of this <code>Deque</code>.
	 * 
	 * @return the item at the front of this <code>Deque</code>.
	 * @throws NoSuchElementException if this <code>Deque</code> is empty.
	 */
	public T popFront() {
        Node temp = first;
        if (N==0)
        {
            throw new NoSuchElementException();
        }
        else
        {
        	if (N==1)
        	{
        		first = null;
        		N--;
        	}
        	else 
        	{
        		first = first.next;
                first.prev = null;
                N--;	
        	}
        }
        return temp.item;
	}

	/**
	 * Removes and returns the item at the back of this <code>Deque</code>.
	 * 
	 * @return the item at the back this <code>Deque</code>.
	 * @throws NoSuchElementException if this <code>Deque</code> is empty.
	 */
	public T popBack() {
        Node temp = last;
        if (N==0)
        {
            throw new NoSuchElementException();
        }
        else
        {
        	if (N==1)
        	{
        		last = null;
        		N--;
        	}
        	else 
        	{
        		last = last.prev;
                last.next = null;
                N--;	
        	}
        }
        return temp.item;
	}
}
