package excersises;

import java.util.Scanner;


//PLAN A- 
//Call =  >500
//Text 0
//Data 0 
//
//PLAN B-
//Call =  >500
//Text - any
//Data 0
//
//PLAN c-
//Call =  < 500
//Text - 100
//Data 0
//
//PLAN D-
//Call =  <500
//Text - more than 100 
//Data 0
//
//PLAN E-
//Call =  500
//Text - any
//Data any 2 gigs 
//
//PLAN F-
//Call =  <500
//Text - any
//Data- more than 2 gigs 



public class CellPhoneService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min;
		int text;
		int data;
		int gigs;
		
		Scanner input = new Scanner(System.in); 

		System.out.print("How many min of calling do you want? ");
		min = input.nextInt();
		
		if (min <= 500)
		{
			System.out.print("Do you want texting? 1 for yes and 2 for no>> ");
			text = input.nextInt();
			
			if (text == 1)
			{
				System.out.print("You have need plan B for $55 a month.  ");
			}
			if (text == 2)
			{
				System.out.print("You have need plan A for $49 a month.  ");
			}
			
		}
		if (min >= 500)
		{
			System.out.print("Do you want more than 100 texts? 1 for yes 2 for no.  ");
			text = input.nextInt();
			
			if (text == 1)
			{
				System.out.print("Do you want data? 1 for yes 2 for no.");
				data = input.nextInt(); 
				
				if (data == 1)
				{
					System.out.print("Do you want more than 2 gigs. 1 for yes 2 for no. ");
					gigs = input.nextInt();
					
					if (gigs == 1)
					{
						System.out.print("You need plan F for $87 a month.  ");
						
					}
					if (gigs == 2)
					{
						System.out.print("You need plan E for $79 a month.  ");
					}
				}
				if (data == 2)
				{
					System.out.print("You need plan C for $61 a month.  ");
				}
			}
			if (text == 2)
			{
				System.out.print("You have need plan C for $61 a month.  ");
			}
		}
	}

}
