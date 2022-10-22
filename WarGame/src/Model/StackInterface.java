package Model;

/**
 * Interface for LLS
 */
public interface StackInterface<Card> {

	// Push card 
	public void push(Card x);
	
	// Pop (remove) top of stack
	public Card pop();
	
	// Peek (see) what is at the top of stack
	public Card peek();
	
	// Check if stack is empty
	public boolean isEmpty();
	
	// Returns the size of the stack
	public int size();
	
	// Prints the entire stack 
	public void display();
}
