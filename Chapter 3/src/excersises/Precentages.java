package excersises;

import java.util.Scanner;

public class Precentages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1 = 2.0;
		double num2 = 5.0;
		
Scanner inputDevice = new Scanner (System.in); 
		
		System.out.print("Pick a number >>>>");
		num1 = inputDevice.nextInt();
		inputDevice.nextLine();
		System.out.print("Pick another number >>>>");
		num2 = inputDevice.nextInt();
		inputDevice.nextLine();
		
		computePercent(num1, num2); 
	}
public static void computePercent(double num1, double num2)
{
	System.out.println(num1 + " is " + (num1 /num2) + " percent of " + num2); 
}
}
