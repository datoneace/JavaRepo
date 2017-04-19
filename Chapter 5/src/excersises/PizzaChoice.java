package excersises;

import java.util.Scanner;

public class PizzaChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String choice;
		int choice2;
		int toppingChoice;
		double large = 10.99;
		double medium = 7.99;
		double small = 4.99;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Would you like a pizza? yes or no>>>>>>>");
		choice = input.nextLine();
		
		if("Yes".equals(choice) ||"yes".equals(choice)||"Y".equals(choice)||"y".equals(choice) )
		{	
			System.out.println("You said " + choice + " to eating pizza");
			System.out.print("Please choose a topping 1 for Hamburger, 2 for Peperoni, or 3 for Canadian Bacon. ");
			toppingChoice = input.nextInt();
			if(toppingChoice == 1)
			{
				System.out.println("You said hamburger pizza, what size do you want? 1 for Small, 2 for Medium, or 3 for Large");
				choice2 = input.nextInt();
				if (choice2 == 1)
				{
					System.out.println("You have ordered a small hamburger pizza. Thats going to be " + small);
				}
				if (choice2 == 2)
				{
					System.out.println("You have ordered a medium hamburger pizza. Thats going to be " + medium);
				}
				if (choice2 == 3)
				{
					System.out.println("You have ordered a large hamburger pizza. Thats going to be " + large);
				}
			}
			if(toppingChoice == 2)
			{
				System.out.println("You said Peperoni pizza, what size do you want? 1 for Small, 2 for Medium, or 3 for Large");
				choice2 = input.nextInt();
				if (choice2 == 1)
				{
					System.out.println("You have ordered a small Peperoni pizza. Thats going to be " + small);
				}
				if (choice2 == 2)
				{
					System.out.println("You have ordered a medium Peperoni pizza. Thats going to be " + medium);
				}
				if (choice2 == 3)
				{
					System.out.println("You have ordered a large Peperoni pizza. Thats going to be " + large);
				}
			}
			if(toppingChoice == 3)
			{
				System.out.println("You said Canadian Bacon pizza, what size do you want? 1 for Small, 2 for Medium, or 3 for Large");
				choice2 = input.nextInt();
				if (choice2 == 1)
				{
					System.out.println("You have ordered a small Canadian Bacon pizza. Thats going to be " + small);
				}
				if (choice2 == 2)
				{
					System.out.println("You have ordered a medium Canadian Bacon pizza. Thats going to be " + medium);
				}
				if (choice2 == 3)
				{
					System.out.println("You have ordered a large Canadian Bacon pizza. Thats going to be " + large);
				}
			}
			if(toppingChoice >= 4)
			{
				System.out.println("We do not have that size. ");
			}
		}
	}

}
