package Controller;

import java.util.Scanner;

import Model.Card;
import Model.CardDeck;
import Model.DoublyLinkedList;
import Model.LinkedListStack;
import View.AppMenu;

/**
 * Processing class that interacts with Model, View, and Controller packages
 */
public class WarGame {

	// Card Deck object so it can be shuffled etc
	CardDeck deckOfCards = new CardDeck();
	
	// Player Deck
	LinkedListStack<Card> player1Deck = new LinkedListStack<Card>();
	
	// Dealer Deck
	LinkedListStack<Card> player2Deck = new LinkedListStack<Card>();
	
	// Shuffler object that can shuffled cards (Currently returning a null somewhere)
	Shuffler cardShuffler  = new Shuffler();
	
	// Scanner object for some input
	private Scanner input = new Scanner(System.in);
	
	// App Menu object
	private AppMenu display;
		
	/**
	 * Primary constructor for WarGame class
	 */
	public WarGame() {
		display = new AppMenu();
		launchApplication();
	}

	/**
	 * Runs this method when constructor of class is called
	 */
	private void launchApplication() {
		int choice;
		boolean loopStart = true;
		
		while (loopStart) {
			choice = display.MainMenu();
			switch (choice) {
			case 1:
				PlayWarGame();
				break;
			case 2:
				ShuffleCards();
				break;
			case 3:
				display.AppExit();
				System.exit(0);
				loopStart = false;
			}
		}
		
	}

	/**
	 * Starts War card game when selected
	 * Takes values from player input and makes two Linked-lists
	 * Outputs the results of playing the top cards from both decks
	 */
	private void PlayWarGame() {
		DoublyLinkedList<Card> shuffled = cardShuffler.shuffleDeck();
		int player1Points = 0;
		int player2Points = 0;
		int deal;
		
		while (true) {
			deal = display.dealAmount();
			for (int i = 0; i < deal; i++) {
				player1Deck.push(shuffled.deal());
				player2Deck.push(shuffled.deal());
			}
			for (int i = 0; i < deal; i++) {			
				Card p1Card = player1Deck.peek();
				Card p2Card = player2Deck.peek();
				
				display.printResults(p1Card , p2Card);

				if(player1Deck.pop().isEqual(player2Deck.pop()).equals("Player")){
					player1Points++;
				}
				else {
					player2Points++;
				}
			}
			display.printWinner(player1Points, player2Points);
			break;
		}
		System.out.print("\nPress Enter to Continue...");
		input.nextLine();
		
	}
	
	/**
	 *  Shuffles cards when selected
	 */
	private void ShuffleCards() {
		Shuffler shuff = new Shuffler();
		DoublyLinkedList<Card> shuf = shuff.shuffleDeck();
		System.out.println("\nA shuffled deck of cards: ");
		shuf.display();
		
		System.out.print("\nPress Enter to Continue...");
		input.nextLine();
	}

}
