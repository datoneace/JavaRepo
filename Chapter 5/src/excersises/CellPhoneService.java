package excersises;

import java.util.Scanner;

public class CellPhoneService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min;
		int text;
		int data;
		
		Scanner input = new Scanner(System.in); 

		System.out.print("How many min of calling do you want? ");
		min = input.nextInt();
		
		if (min <= 500)
		{
			System.out.print("Do you want texting? 1 for yes and 2 for no ");
			text = input.nextInt();
			
			if (text == 1)
			{
				
			}
		}
	}

}
