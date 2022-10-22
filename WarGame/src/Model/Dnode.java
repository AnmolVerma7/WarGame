package Model;

/**
 * This is the Node for the DoublyLinkedList of type Card
 */
public class Dnode<Card> {
	
	// Data of type Card
	private Card data;
	
	// Next node type Card
	private Dnode<Card> next = null;
	
	// Previous node type Card
	private Dnode<Card> prev = null;

	/**
	 * Main constructor for Dnode class
	 * @param The data that will be assigned to the node constructor
	 */
	public Dnode(Card data) {
		this.data  = data;
	}
	
	/**
	 * Copy constructor that assigns Data, next Node, and previous node
	 * @param Card data that must be stored in node
	 * @param Stores next node
	 * @param Stores previous node
	 */
	public Dnode(Card data, Dnode next, Dnode prev) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
	
	/**
	 * Gets the data from type card
	 * @return data from Card
	 */
	public Card getData() {
		return data;
	}
	
	/**
	 * Sets the data of the Card that is in the node
	 * @param Data to be set for the node
	 */
	public void setData(Card data) {
		this.data = data;
	}
	
	/**
	 * Gets the next node 
	 * @return the node after the current node
	 */
	public Dnode<Card> getNext() {
		return next;
	}
	
	/**
	 * Sets the next node
	 * @param next node that needs to be set
	 */
	public void setNext(Dnode<Card> next) {
		this.next = next;
	}
	
	/**
	 * Gets the previous node 
	 * @return the previous node
	 */
	public Dnode<Card> getPrev() {
		return prev;
	}
	
	/**
	 * Sets the previous node 
	 * @param Previous node that needs to be set
	 */
	public void setPrev(Dnode<Card> prev) {
		this.prev = prev;
	}
}
