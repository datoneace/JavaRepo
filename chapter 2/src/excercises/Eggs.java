package excercises;

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int dozenEggs, remainderEggs, eggInput;
		double dozenEggTotal, singleEggTotal;
		double dozenEggPrice;
		double singleEggPrice;
		double total;
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("how many eggs do you want? ");
		eggInput = inputDevice.nextInt();
		dozenEggs = eggInput / 12;
		remainderEggs = eggInput % 12;
		dozenEggPrice = dozenEggs * 3.25;
		singleEggPrice = remainderEggs * .45;
		total = dozenEggPrice + singleEggPrice; 
		
		System.out.println("You ordered " + eggInput + " eggs. That's " + dozenEggs + " dozen at $3.25 per dozen and " + remainderEggs + " loose eggs at 45 cents each for a total of " + total );
		
			
	}

}
