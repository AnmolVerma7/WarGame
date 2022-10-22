package Model;

import java.util.EmptyStackException;

/**
 * Class for the LLS of type Card that implementes the StackInterface and uses StackNode
 */
public class LinkedListStack<Card> implements StackInterface<Card> {

	// Stack node object called top
	private StackNode <Card> top;
	
	// Size of LLS
	private int size;
	
	/**
	 * Constructor for LinkedListStack of type Card
	 */
	public LinkedListStack() {
		size = 0;
        top = null;
    }

	/**
	 * Pushes a card into the stack
	 */
	public void push(Card x) {
		++size;
		StackNode temp = new StackNode();
		temp.data = x;
		temp.next = top;
		top = temp;
	}

	/**
	 * Removes card from stack and returns the data (x)
	 */
	public Card pop() {
		if (isEmpty())
			throw new EmptyStackException();
		Card x = top.data;
		top = top.next;
		size--;
		return x;
	}

	/**
	 * Returns value of top Card without removing
	 */
	public Card peek() {
		if (isEmpty()) throw new EmptyStackException();
		return top.data;
	}

	/**
	 * True if LLS size is 0
	 * False if LLS contains Cards
	 */
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns the size of the stack
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Prints LLS by checking top
	 */
	public void display() {
		if (top == null) {
			System.out.println("Stack Underflow");
		}
		else {
			StackNode<Card> temp  = top;
			while (temp != null) {
				System.out.println(temp.data + " ");
				temp = temp.next;
			}
		}
	}
}
