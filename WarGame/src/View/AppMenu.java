package View;

import java.util.Scanner;

import Model.Card;

/**
 * Class for the App Menu object, displays prompts that the user interacts with
 */
public class AppMenu {
	//Instance variable of scanner that takes input
	private Scanner scanner;
		
	//This is the constructor for the AppMenu object 
	public AppMenu() {
		this.scanner = new Scanner(System.in);	 
	}
	
	/**
	 * Main menu that is displayed to the user
	 * @return The choice the user has made for the options displayed 
	 */
	public int MainMenu() {
		System.out.println("\nSelect one of these options: ");
		System.out.println("   1. Play War Game ");
		System.out.println("   2. Shuffle Cards ");
		System.out.println("   3. Exit ");
		System.out.print("Enter your choice: ");
		
		int option = 0;
		while(true) {
			if (scanner.hasNextInt()) {
				option = scanner.nextInt();
				if(option < 1 || option > 3) {
					System.out.print("\nThat is not a valid option! Try again. \n");
					System.out.print("\nEnter Option: ");
					scanner.nextLine();
				}
				else {
					break;
				}
			}
			else {
				System.out.print("\nThat is NOT an integer number! Try again. \n");
				System.out.print("\nEnter Option: ");
				scanner.nextLine();
			}
		}
		return option;
	}

	/**
	 * Displays that the application has ended
	 */
	public void AppExit() {
		System.out.println("\nApplication Ended");
	}

	/**
	 * Prints prompts with error handling
	 * @return The amount of cards the user would like to deal
	 */
	public int dealAmount() {
		System.out.print("\nHow many cards would you like to deal: ");
		int option = 0;
		while(true) {
			if (scanner.hasNextInt()) {
				option = scanner.nextInt();
				if(option < 1 || option > 26) {
					System.out.print("\nThat is not a valid option! Try again. \n");
					System.out.print("\nEnter Option: ");
					scanner.nextLine();
				}
				else {
					break;
				}
			}
			else {
				System.out.print("\nThat is NOT an integer number! Try again. \n");
				System.out.print("\nEnter Option: ");
				scanner.nextLine();
			}
		}
		return option;
	}
	
	/**
	 * Prints the cards of each player
	 * @param Card 1 data to be printed
	 * @param Card 2 data to be printed
	 */
	public void printResults(Card card1, Card card2) {
		System.out.println("\nPlayer 1 Card: "+ card1.toString());
		System.out.println("Player 2 Card: " + card2.toString());
	}
	
	/**
	 * Prints the winner of game by comparing the points between both players
	 * @param Player 1 points
	 * @param Player 2 points
	 */
	public void printWinner(int p1Points, int p2Points) {
		if (p1Points > p2Points) {
			System.out.println("\nPlayer 1 Wins!");
		}
		else {
			System.out.println("\nPlayer 2 Wins!");
		}
	}
}
