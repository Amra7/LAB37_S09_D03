package vjezbe;

public class LinkedListInt {

	private Node head;
	private int size;

	/**
	 * Constructor for {@link LinkedListInt}
	 */
	public LinkedListInt() {
		this.head = null;
		this.size = 0;
	}

	/**
	 * Method for adding Node
	 * 
	 * @param value
	 */
	public void add(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			size++;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		size++;
	}

	/**
	 * Remove valuse from LinkedList.
	 * @param index -  index from where we want to remove. 
	 */
	public void removeAt(int index) {
		if (index < 0 && index >= size)
			throw new IndexOutOfBoundsException("Index of list does not exist!");
		if (head.next == null) {
			head = null;
			size--;
			return;
		}
		if (index == 0) {
			head = head.next;
			size--;
			return;

		}
		Node current = head.next;
		Node previous = head;
		int counter = 1;

		while (counter < index) {
			current = current.next;
			previous = previous.next;
			counter++;

		}
		previous.next = current.next;
		current.next = null;
	}

	/**
	 * Add value on LinkedList on given index.
	 * @param value - new value that we want to set.
	 * @param index - index where we want to set new value.
	 */
	public void addAt(int value, int index) {
		if (index < 0 && index >= size)
			throw new IndexOutOfBoundsException("Index of list does not exist!");
		Node newNode = new Node(value);
		if (index == 0) {
			newNode.next = head;
			head = newNode;
			size++;
			return;
		}
		if (index == size) {
			add(value);
			return;
		}
		Node current =  head;
		int counter = 1;

		while (counter < index) {
			current = current.next;
			counter++;
		}
		
		newNode.next = current.next;
		current.next = newNode;
		size++;

	}
	/**
	 * All values of LinkedList writes into array list of integers.
	 * @return array of integers.
	 */
	public int[]toArray(){
		int[] array = new int[size];
		Node current = head;
		for( int i = 0; i<size; i++){
			array[i] = current.value;
			current = current.next;
		}
		return array;
	}
	
	public void add(LinkedListInt other){
		Node current = this.head;
		if( head == null){
			
		}
		while( current.next == null){
			current=current.next;
			current.next = other.head;
		}
		size +=other.size;
	}

	/**
	 * Prints LinkedList
	 */
	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}

	/**
	 * Inner class Node
	 * 
	 * @author amrapoprzanovic
	 *
	 */
	private class Node  <T>{

		public int value;
		public Node next;

		/**
		 * Constructor for Node
		 * 
		 * @param value
		 */
		public Node(int value) {
			this.value = value;
			this.next = null;
		}

		/**
		 * Second constructor for Node
		 * 
		 * @param value
		 * @param next
		 */
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
}
