/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("ace", "spades", 11);
		Card card2 = new Card("ace", "spades", 11);
		Card card3 = new Card("2", "clubs", 12);
		if (card1.matches(card2)) {
			System.out.println("Match.");
	} else {
		System.out.println("No Match.");
	}



	if (card2.matches(card3)) {
			System.out.println("Match.");
	} else {
		System.out.println("No Match.");
	}

}


}
