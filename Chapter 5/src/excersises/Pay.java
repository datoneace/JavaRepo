package excersises;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hours;
		int skill;
		int insurance;
		double pay;
		int overtimehours;
		double overtime;
		int hoursleft;
		int hourspay;
		double deduction;
		int retirment;
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("How many hours have you worked? ");
		hours = input.nextInt();
		System.out.print("What is your skill Level? 1, 2, or 3. >> ");
		skill = input.nextInt();
		if (skill == 1)
		{
			if (hours >= 40)
			{
				overtimehours = hours - 40;
				overtime = overtimehours * 25.5; 
				hoursleft = hours - overtimehours;
				hourspay = hoursleft * 17;
				pay = overtime + hourspay; 
				System.out.print("your pay is " + hourspay + " for regualr hours, and " + overtime + " for overtime. For a total of " 
						+ pay);
			}
			if (hours <= 40)
			{
				pay = hours * 17;
				System.out.print("Your pay is " + pay + " with 0 hours of over time. ");
			}
			
		}
		if (skill == 2)
		{
			
			System.out.print("Please choose an insurance: 1 for Medical, 2 for dental, or 3 for Long term disability.  ");
			insurance = input.nextInt();
			
			if(insurance == 1)
			{
				if (hours >= 40)
				{
					overtimehours = hours - 40;
					overtime = overtimehours * 30; 
					hoursleft = hours - overtimehours;
					hourspay = hoursleft * 20;
					pay = overtime + hourspay; 
					deduction = pay - 32.50;
					
					System.out.print("Your pay is " + hourspay + " for regualr hours, and " + overtime + " with a deduction of 32.50 for a insurance. Your total is " 
							+ deduction); 
				}
				if (hours <= 40)
				{
					pay = hours * 20;
					deduction = pay - 32.50;
					System.out.print("Your pay is " + pay + " with 0 hours of over time, and a deduction of 32.50 for insurance. ");
				}
			}
			if(insurance == 2)
			{
				if (hours >= 40)
				{
					overtimehours = hours - 40;
					overtime = overtimehours * 30; 
					hoursleft = hours - overtimehours;
					hourspay = hoursleft * 20;
					pay = overtime + hourspay; 
					deduction = pay - 20;
					
					System.out.print("your pay is " + hourspay + " for regualr hours, and " + overtime + " with a deduction of 20.00 for a insurance. Your total is " 
							+ deduction); 
				}
				if (hours <= 40)
				{
					pay = hours * 20;
					deduction = pay - 20.00;
					System.out.print("Your pay is " + pay + " with 0 hours of over time, and a deduction of 20.00 for insurance. ");
				}
			}
			if(insurance == 3)
			{
				if (hours >= 40)
				{
					overtimehours = hours - 40;
					overtime = overtimehours * 30; 
					hoursleft = hours - overtimehours;
					hourspay = hoursleft * 20;
					pay = overtime + hourspay; 
					deduction = pay - 10.00;
				
				System.out.print("your pay is " + hourspay + " for regualr hours, and " + overtime + " with a deduction of 10.00 for a insurance. Your total is " 
						+ deduction); 
				}
			}
			if (hours <= 40)
			{
				pay = hours * 20;
				deduction = pay - 10.00;
				System.out.print("Your pay is " + pay + " with 0 hours of over time, and a deduction of 10.00 for insurance. ");
			}
			
		}
		if (skill == 3)
		{
			retirment  = input.nextInt();
			
			System.out.print("Please choose an insurance: 1 for Medical, 2 for dental, or 3 for Long term disability.  ");
			insurance = input.nextInt();
			
			if(insurance == 1)
			{
				if (hours >= 40)
				{
					overtimehours = hours - 40;
					overtime = overtimehours * 30; 
					hoursleft = hours - overtimehours;
					hourspay = hoursleft * 22;
					pay = overtime + hourspay; 
					deduction = pay - 32.50;
					
					System.out.print("Your pay is " + hourspay + " for regualr hours, and " + overtime + " with a deduction of 32.50 for a insurance. Your total is " 
							+ deduction); 
				}
				if (hours <= 40)
				{
					pay = hours * 22;
					deduction = pay - 32.50;
					System.out.print("Your pay is " + pay + " with 0 hours of over time, and a deduction of 32.50 for insurance. ");
				}
			}
			if(insurance == 2)
			{
				if (hours >= 40)
				{
					overtimehours = hours - 40;
					overtime = overtimehours * 30; 
					hoursleft = hours - overtimehours;
					hourspay = hoursleft * 22;
					pay = overtime + hourspay; 
					deduction = pay - 20;
					
					System.out.print("your pay is " + hourspay + " for regualr hours, and " + overtime + " with a deduction of 20.00 for a insurance. Your total is " 
							+ deduction); 
				}
				if (hours <= 40)
				{
					pay = hours * 22;
					deduction = pay - 20.00;
					System.out.print("Your pay is " + pay + " with 0 hours of over time, and a deduction of 20.00 for insurance. ");
				}
			}
			if(insurance == 3)
			{
				
				if (hours >= 40)
				{
					
					overtimehours = hours - 40;
					overtime = overtimehours * 30; 
					hoursleft = hours - overtimehours;
					hourspay = hoursleft * 22;
					pay = overtime + hourspay; 
					deduction = pay - 10.00;
				
				System.out.print("your pay is " + hourspay + " for regualr hours, and " + overtime + " with a deduction of 10.00 for a insurance. Your total is " 
						+ deduction); 
				}
			}
			if (hours <= 40)
			{
				pay = hours * 22;
				deduction = pay - 10.00;
				System.out.print("Your pay is " + pay + " with 0 hours of over time, and a deduction of 10.00 for insurance. ");
			}
		}
	}

	
}
