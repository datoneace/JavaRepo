package gamezone;

import java.util.Random;
import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rock;
		int scissors;
		int paper;
		int Choice;
		Random rn = new Random();
		int answer = rn.nextInt(2);
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Please choose 0 for rock, 1 for Paper, or 2 for Scissors.>>> ");
		
		Choice = input.nextInt();
		if(Choice == 0)
		{
			System.out.println("You said Rock. they said " + answer);
			
			if (answer == 0)
			{
				System.out.println("It's a tie");
			}
			if (answer == 1)
			{
				System.out.println("You lose, paper covers rock! ");
			}
			if (answer == 2)
			{
				System.out.println("You win, Rock breacks Scissors");
			}
			
		}

		if(Choice == 1)
		{
			System.out.println("You said Paper. they said " + answer);
			
			if (answer == 0)
			{
				System.out.println("You win, paper covers rock. ");
			}
			if (answer == 1)
			{
				System.out.println("It's a tie.");
			}
			if (answer == 2)
			{
				System.out.println("You lose, Scissors cut paper");
			}
		}
		if(Choice == 2)
		{
			System.out.println("You said Scissors. they said " + answer);
			
			if (answer == 0)
			{
				System.out.println("You lose, rock smashes scissors.");
			}
			if (answer == 1)
			{
				System.out.println("You Win, Scissors cut paper ");
			}
			if (answer == 2)
			{
				System.out.println("It's a tie");
			}
		}
		if(Choice >= 3)
		{
			System.out.println("Thats not a choice ");
		}
	}

}
