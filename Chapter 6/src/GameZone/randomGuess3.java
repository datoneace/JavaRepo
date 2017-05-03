package GameZone;

import javax.swing.JOptionPane; 

public class randomGuess3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int guess = 0;
		int result;
		String msg = null;
		final int LOW = 1;
		final int HIGH = 10;
		int counter = 0;
		
		result = LOW + (int)(Math.random() * HIGH);
		while(result != guess){ 
		
		String guessString = JOptionPane.showInputDialog(null, "Try to guess my number between " + LOW + " and " + HIGH);
		guess = Integer.parseInt(guessString);
		if(guess == result)
			msg = "\nRight!";
		else 
			if (guess < result)
				msg = "\nYour guess was too low";
			else 
				msg = "\nYour guess was too High";
			counter++;
			
		JOptionPane.showMessageDialog(null, "The number is " + result + msg + "in this many attempts " + counter);
		};	
	}

}
