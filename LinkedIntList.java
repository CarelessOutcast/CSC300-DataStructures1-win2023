package hw7;

public class LinkedIntList {

	// helper linked list node class
	private class Node {
		private int item;
		private Node next;

		public Node() {
		}

		public Node(int number, Node nextNode) {
			item = number;
			next = nextNode;
		}
	}

	private Node first; // first node of the list

	/**
	 * Constructs an empty list.
	 */
	public LinkedIntList() {
		first = null;
	}

	/**
	 * Constructs a list containing the elements of the specified array, in the
	 * order they appear in the array.
	 *
	 * @param data the array whose elements are to be placed into this list
	 * @throws NullPointerException if the specified array is null
	 */
	
	public LinkedIntList(int[] data) {
		first = LinkedIntListH(0, data);
	}
	
	private Node LinkedIntListH(int index, int[] data) {
		if (index >= data.length)
			return null;
		else {
			Node temp = LinkedIntListH(index+1, data);
			Node answer = new Node();
			answer.item = data[index];
			answer.next = temp;
			return answer;
		}
	}

	/**
	 * Constructs a string representing the list. The ints in the list appear in a
	 * comma separated list contained inside square brackets.
	 * 
	 * @return a string represeting the list.
	 */
	public String toString() {
		if (first == null)
			return "[]";
		return "[" + toStringH(first) + "]";
	}
	
	private String toStringH(Node front) {
		if (front.next == null)
			return "" + front.item;
		else {
			String temp = toStringH(front.next);
			return front.item + ", " + temp;
		}
		
	}

	public void addFirst(int data) {
		first = new Node(data, first);
	}


	/********************* HOMEWORK ************************/

	/**
	 * Returns the index of the first occurrence of the specified int in this list,
	 * or -1 if this list does not contain the int.
	 *
	 * @param i int to search for
	 * @return the index of the first occurrence of the specified int in this list,
	 *         or -1 if this list does not contain the int
	 */
	public int indexOf(int i) {
		return indexOfH(first, i);
	}

	private int indexOfH(Node front, int i) {
        if (front == null)
            return -1; 
        else if (front.item == i) 
            return 0; 
        else{
            int temp = indexOfH(front.next, i) + 1;
            if (temp == 0)
            	return -1;
            return temp;
        }
        
	}

	/**
	 * Returns the number of times a specified number appears in the list.
	 *
	 * @param i int to be counted
	 * @return the number of times the number {@code i} appears in the list
	 */
	public int count(int i) {
		return countH(first, i);
	}

	private int countH(Node front, int i) { 
        if (front == null)  
            return 0; 
        else if (front.item == i) 
            return countH(front.next, i) + 1; 
        else  
            return countH(front.next, i); 
	}


	/**
	 * Constructs a new {@code LinkedIntList} consisting of just the even number
	 * from this list appearing in the same order as they occur in this list.
	 * 
	 * @return a new list that looks like this list be with all the odds removed.
	 */
	public LinkedIntList evens() {
		LinkedIntList answer = new LinkedIntList();
		answer.first = evensH(first);
		return answer;
	}

	public Node evensH(Node front) { 
        if (front == null) return null;
        else
        {
            Node temp = evensH(front.next);
            if (front.item % 2 == 0)
            {
                Node temp2 = new Node();
                temp2.item = front.item;
                temp2.next = temp;
                return temp2;

            }
            return temp;

        }
	}
	
	
	/**
	 * Creates a new list consisting of the partial sums of this list.  In other
	 * words, slot i of the answer list will be the sum of all numbers in slots
	 * greater than or equal to i in this list.  For example, if this list is the
	 * list [1, -4, 2, 9] then the answer list would be the list [8, 7, 11, 9].
	 * 
	 * @return a new list that contains the partial sums of this list.
	 */
	public LinkedIntList partialSums() {
		LinkedIntList answer = new LinkedIntList();
		answer.first = partialSumsH(first);
		return answer;
	}
	
	private Node partialSumsH(Node front) {
        if (front == null)
        {
            return null;
        }
        else if (front.next == null)
        {   
            Node temp = new Node();
            temp.item = front.item;
            return temp;
        }
        else {
            Node temp = partialSumsH(front.next);
            Node answer = new Node();
            answer.item = temp.item + front.item;
            answer.next = temp;

            return answer;
        }
	}
	
	
	/**
	 * Constructs a new int list where each entry in the new list is the sum of the
	 * corresponding entries in this list and the argument list.
	 * 
	 * @arg otherList the other list to be added to this list
	 * @return a new list where each entry in the new list is the sum of the
	 *         corresponding entries in this list and the argument list
	 * @throws IllegalArgumentException if this list and the other list have have
	 *                                  different lengths
	 */
	public LinkedIntList listAddition(LinkedIntList otherList) {
		LinkedIntList answer = new LinkedIntList();
		answer.first = listAdditionH(first, otherList.first);
		return answer;
	}

	public Node listAdditionH(Node thisFront, Node otherFront) { 
        if (thisFront == null && otherFront == null)
            return null;
        else if (thisFront == null || otherFront == null)
            throw new IllegalArgumentException();
        else if (thisFront.next == null && otherFront.next == null)
        {
            Node temp = new Node();
            temp.item = otherFront.item + thisFront.item;
            return temp;
        }
        else 
        {
            Node Returned = listAdditionH(thisFront.next, otherFront.next);
            Node answer = new Node();
            answer.item = otherFront.item + thisFront.item;
            answer.next = Returned;
            return answer;
        }
	}
}
