package Model;

/**
 * Model for the Card object
 */
public class Card {

	// Value of card
	private int value;
	
	// Suit of card
	private String suit;
	
	/**
	 * Primary constructor of Card object
	 * @param value of the card
	 * @param suit of the card
	 */
	public Card(int value, String suit) {
		super();
		this.value = value;
		this.suit = suit;
	}

	/**
	 * Gets card value
	 * @return value of card
	 */
	public int getValue() {
		return value;
	}


	/**
	 * Sets value of card
	 * @param value of card to be set to
	 */
	public void setValue(int value) {
		this.value = value;
	}


	/**
	 * Gets suit of card
	 * @return suit of the card
	 */
	public String getSuit() {
		return suit;
	}

	/**
	 * Sets suit of card
	 * @param suit of card
	 */
	public void setSuit(String suit) {
		this.suit = suit;
	}

	/**
	 * To string method to print card
	 */
	@Override
	public String toString() {
		if(value == 11) {
			return "Jack of "  +  suit + "";
		}
		if(value == 12) {
			return "Queen of "  +  suit + "";
		}
		if(value==13) {
			return "King of "  +  suit + "";
		}
		if(value==1) {
			return "Ace of "  +  suit + "";
		}
			return  value + " of " + suit + "";
		}
	
	/**
	 * Prints card rank and suit
	 * @return Printed Card according to value 
	 */
	public String printCard() {
		if(value == 11) {
			return "Jack of "  +  suit + "";
		}
		if(value == 12) {
			return "Queen of "  +  suit + "";
		}
		if(value==13) {
			return "King of "  +  suit + "";
		}
		if(value==1) {
			return "Ace of "  +  suit + "";
		}
			return  value + " of " + suit + "";
	}
	
	/**
	 * Comparison for when value alone does not assign a winner. 
	 * Spades > Hearts > Diamonds > Spades
	 * @param opponentCard
	 * @return
	 */
	public String isEqual(Card opponentCard) {
		
		String winner ="";
		
		if (this.value > opponentCard.getValue()) {
			winner = "Player";
		}
		else if (this.value < opponentCard.getValue()) {
			winner = "Dealer";
		}
		else {
			
			if(this.suit.equals("Hearts")){
				
				if(opponentCard.getSuit().equals("Diamonds")) {
					winner = "Player";

				}if(opponentCard.getSuit().equals("Clubs")) {
					winner = "Player";

				}if(opponentCard.getSuit().equals("Spades")) {
					winner = "Dealer";

				}
			}
			
			if(this.suit.equals("Clubs")){
				
				if(opponentCard.getSuit().equals("Spades")) {
					winner = "Dealer";

				}if(opponentCard.getSuit().equals("Hearts")) {
					winner = "Dealer";

				}if(opponentCard.getSuit().equals("Diamonds")) {
					winner = "Dealer";

				}
				
			}if(this.suit.equals("Diamonds")){
				
				if(opponentCard.getSuit().equals("Clubs")) {
					winner = "Player";

				}if(opponentCard.getSuit().equals("Spades")) {
					winner = "Dealer";

				}if(opponentCard.getSuit().equals("Hearts")) {
					winner = "Dealer";

				}
				
			}if(this.suit.equals("Spades")){
				
				if(opponentCard.getSuit().equals("Diamonds")) {
					winner = "Player";

				}if(opponentCard.getSuit().equals("Diamonds")) {
					winner = "Player";

				}if(opponentCard.getSuit().equals("Diamonds")) {
					winner = "Player";

				}
			}
		}
		return winner;
	}
	
}
