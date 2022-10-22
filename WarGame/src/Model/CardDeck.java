package Model;

/**
 * Card Deck class used to make a card deck
 */
public class CardDeck {

	//DoublyLinkedList to hold a fresh set of cards
	public DoublyLinkedList<Card> cardHolder = new DoublyLinkedList<>();


	
	/**
	 * Constructor for Card Deck Object
	 */
	public CardDeck() {
		makeDeck();
	}


	/**
	 * Makes a deck when the constructor is called
	 * @return A full deck containing 52 cards as a DoublyLinkedList
	 */
	public DoublyLinkedList<Card> makeDeck() {
		String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
		Card card;
		int[] values = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12, 13};
		for(int i = 0; i < 4 ; i++) {
			for(int j = 0 ; j < 13; j++) {
				card = new Card(values[j] , suits[i]);
				cardHolder.insertFirst(card);
			}
		}

		return cardHolder;
	}
	
	/**
	 * Prints the makeDeck() method
 	 */
	public void printDeck() {
		cardHolder.display();
	}

}
