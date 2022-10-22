package Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import Model.Card;
import Model.CardDeck;
import Model.DoublyLinkedList;

/**
 * Shuffler class 
 */
public class Shuffler {
	
	// Card Object
	Card card;
	
	// Card Deck object to be shuffled
	DoublyLinkedList<Card> shufDeck;
	
	// Array list to shuffle
	ArrayList<Card> tempDeck;
	
	// Shuffler Constructor
	public Shuffler(){
		
	}
	
	/**
	 * Shuffles a deck of cards by adding cards to ArrayList, shuffling, and then putting into a new DLL
	 * @return A shuffled DoublyLinkedList
	 */
	public DoublyLinkedList<Card> shuffleDeck() {
		String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"}; 
		int[] values = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12, 13};
		
		shufDeck = new DoublyLinkedList<>();
		tempDeck = new ArrayList<>();
		
		// Makes 
		for(int i = 0; i < 4 ; i++) {
			for(int j = 0 ; j < 13; j++) {
				card = new Card(values[j] , suits[i]);
				tempDeck.add(card);
			}
		}
		Collections.shuffle(tempDeck);
		
		for (Card card: tempDeck) {
			shufDeck.insertFirst(card);
		}
		return shufDeck;
	}
	
	/**
	 * This method prints the shuffled cards
	 */
	public void printShuffledCards() {
		shufDeck.display();
	}
	
}
