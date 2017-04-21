package excersises;

import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter an Interger>> ");
		number = input.nextInt();
		
		if ( number % 2 == 0)
		
			System.out.print("You entered an even number. ");
		else 
			System.out.print("You entered a odd number. ");
	}

}
