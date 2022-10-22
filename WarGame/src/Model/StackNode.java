package Model;

/**
 * Class for StackNode object that used in LLS 
 */
public class StackNode<Card> {

	// Card Data
	public Card data; 
	
	// Reference variable StackNode
	public StackNode <Card> next;
	
	/**
	 * No arg constructor
	 */
	public StackNode() {
		
	}
	
	/**
	 * Default constructor
	 * @param Data to be added to StackNode
	 * @param Next node to be assigned
	 */
	public StackNode(Card data, StackNode <Card> next) {
		this.data = data;
		this.next = next; //When creating a new node 
	}
	
	/**
	 * Formats StackNode data to toString
	 */
	public String toString() {
		return (String)data;
	}
}
