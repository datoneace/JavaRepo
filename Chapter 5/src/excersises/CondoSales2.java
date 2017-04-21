package excersises;

import java.util.Scanner;

public class CondoSales2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		int choice2;
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("What view do you want? Choose 1 for park view, 2 for golf course view, or 3 for lake view. ");
		choice = input.nextInt();
		
		if (choice == 1)
		{ 
			System.out.print(" You chose the park view. That is 150,000. Would you like a 1 for garage or a 2 for parking space");
			choice2 = input.nextInt();
			
			if (choice2 == 1)
			{
				System.out.print("You want the park view for 150,000 with the grage for an additional 5,000. ");
				System.out.println("Your total is $155,000. ");
			}
			
			if (choice2 == 2)
			{
				System.out.print("You want the park view for 150,000 with the parking space. ");
				System.out.println("Your total is $150,000. ");
			}
		}
		
		if (choice == 2)
		{ 
			System.out.print(" You chose the golf course view. That is 170,000. Would you like a 1 for garage or a 2 for parking space");
			choice2 = input.nextInt();
			
			if (choice2 == 1)
			{
				System.out.print("You want the Golf course view for 170,000 with the grage for an additional 5,000. ");
				System.out.println("Your total is $175,000. ");
			}
			
			if (choice2 == 2)
			{
				System.out.print("You want the golf course view for 170,000 with the parking space. ");
				System.out.println("Your total is $170,000. ");
			}
		}
		
		if (choice == 3)
		{ 
			System.out.print(" You chose the lake view. That is 210,000. Would you like a 1 for garage or a 2 for parking space");
			choice2 = input.nextInt();
			
			if (choice2 == 1)
			{
				System.out.print("You want the lake view for 210,000 with the grage for an additional 5,000. ");
				System.out.println("Your total is $215,000. ");
			}
			
			if (choice2 == 2)
			{
				System.out.print("You want the lake view for 210,000 with the parking space. ");
				System.out.println("Your total is $210,000. ");
			}
		}
		
	}

}
