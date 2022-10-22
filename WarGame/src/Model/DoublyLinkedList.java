package Model;

/**
 * Class for DLL of type card that uses class Dnode to store data
 */
public class DoublyLinkedList<Card>{
	
	// reference to the first node of the list
	private Dnode<Card> start; 
	
	// reference to the last node of the list
	private Dnode<Card> end; 

	// Size of DLL 
	private int size;
	
	/**
	 * Data to be inserted first in the DLL
	 * @param Data to be inserted in first node
	 */
	public void insertFirst(Card data) {
		Dnode node = new Dnode<Card>(data);
		node.setNext(start);
		node.setPrev(null);
		if (start != null) {
			start.setPrev(node);
		}
		start = node;
	}
	
	/**
	 * Data to be inserted last in the DLL
	 * @param Data to be inserted in the last node
	 */
	public void insertLast(Card data) {
		Dnode node = new Dnode(data);
		Dnode last = start;
		
		node.setNext(null);
		
		if (start == null) {
			node.setPrev(null);
			start = node;
			return;
		}
		
		while (last.getNext() != null) {
			last = last.getNext();
		}
		
		last.setNext(node);
		node.setPrev(last);
	}
	
	/**
	 * Insert data at a certain index of the DLL
	 * @param Data to be inserted in the DLL
	 * @param Index position of where the data should be inserted
	 */
	public void insert (Card data, int index ) {
		if (index == 0) {
			insertFirst(data);
			return;
		}
		
		if (index == size) {
			insertLast(data);
			return;
		}
		
		Dnode temp = start;
		for (int i = 1; i < index; i++) {
			temp = temp.getNext();
		}
		
		Dnode node = new Dnode(data, temp.getNext(), temp.getPrev());
	
		temp.setNext(node);
		size++;
	}
	
	/**
	 * Prints all data stored in DLL 
	 */
	public void display() {
		Dnode node = start;
		while (node != null) {
			System.out.println(node.getData());
			node = node.getNext();
		}
		System.out.println("END ");
	}

	/**
	 * Gets the size of the DLL 
	 * @return the size of the DLL
	 */
	public int getSize() {
		return size;
	}
	

	/**
	 * Pop/remove method that takes the top Node(containing card) and removes it
	 * @return The top node that was removed from the DLL
	 */
	public Card deal() {
		Card x = null;		

		if(start != null) {
		    if(start.getNext() == null) {
                x = start.getData();
                start = null;
            }
		    else {
				Dnode node = start;
				x = start.getData();
				start = start.getNext();
				node.setNext(null);
		    }
		}
		   size--;		
		return x;	
	}
	
}
