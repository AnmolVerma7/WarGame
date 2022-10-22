package Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This the test class for the LinkedListStack of type Card
 * @author Anmol Verma
 *
 */
class LinkedListStackTest {

	// LinkedListStack object
	private LinkedListStack<Card> LLS;
	
	/**
	 * Initializes a LinkedListStack before each test
	 */
	@BeforeEach
	public void init() {
		LLS = new LinkedListStack<>();
	}
	
	/**
	 * Tests the push method of the LLS
	 */
	@Test
	public void testPush() {
		Card testCard = new Card(1, "Spades");
		LLS.push(testCard);
		Card expectedCard = LLS.peek();
		
		assertEquals(expectedCard, testCard , "Equals same");
	}
	
	/**
	 * Tests the pop method of the LLS
	 */
	@Test
	public void testPop() {
		Card testCard = new Card(2, "Hearts");
		LLS.push(testCard);
		Card poppedCard = LLS.pop();
		
		assertEquals(poppedCard, testCard);
	}
	
	/**
	 * Tests the peek method of the LLS
	 */
	@Test
	public void testPeek() {
		Card testCard = new Card(3, "Diamonds");		
		LLS.push(testCard);
		Card peekedCard = LLS.peek();
		
		assertEquals(testCard, peekedCard);
	}
	
	/**
	 * Tests the is empty method of the LLS 
	 */
	@Test
	public void testIsEmpty() {
		Card card1 = new Card(1, "Spades");
		Card card2 = new Card(2, "Hearts");
		Card card3 = new Card(3, "Diamonds");
		Card card4 = new Card(4, "Clubs");
		LLS.push(card1);
		LLS.push(card2);
		LLS.push(card3);
		LLS.push(card4);
		boolean empty = LLS.isEmpty();
		
		assertFalse(empty);
	}
}
