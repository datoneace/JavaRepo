package GameZone;

public class pickTwoCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int CARDS_IN_SUIT = 13;
		int myValue;
		int yourValue;
		
		Card myCard = new Card(); 
		Card yourCard = new Card();
		myValue = ((int)(Math.random()*100)% CARDS_IN_SUIT +1); 
		yourValue = ((int)(Math.random()*100)% CARDS_IN_SUIT +1); 
		
		myCard.setValue(myValue, yourValue);
		yourCard.setValue(yourValue, yourValue);
		myCard.setSuit('s');
		myCard.setSuit('h');
		
		System.out.println("My card is the " + myCard.getValue() + " of " + myCard.getSuit());
		System.out.println("My card is the " + yourCard.getValue() + " of " + yourCard.getSuit());
		
		
		
		
	}

}
