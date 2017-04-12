package excersises;

import java.util.Scanner;

public class numbersDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 ;
		int num2 ;
		
		Scanner inputDevice = new Scanner (System.in); 
		
		System.out.print("Pick a number >>>>");
		num1 = inputDevice.nextInt();
		inputDevice.nextLine();
		System.out.print("Pick another number >>>>");
		num2 = inputDevice.nextInt();
		inputDevice.nextLine();
		
		displayTwiceTheNumber(num1, num2);
		displayNumberPlusFive(num1, num2);
		displayNumberSquared(num1, num2); 
	}
	public static void displayTwiceTheNumber(int n, int y)
	{
		int factor = 2;
		System.out.println(n + " times " + factor + " is " + (n * factor)); 
		System.out.println(y + " times " + factor + " is " + (y * factor)); 
	}
	public static void displayNumberPlusFive(int n, int y){
		int factor = 5;
		System.out.println(n + " plus " + factor + " is " + (n * factor)); 
		System.out.println(y + " plus " + factor + " is " + (y * factor)); 
	}
	public static void displayNumberSquared(int n, int y){
		System.out.println(n + " squared is " + (n * n)); 
		System.out.println(y + " squared is " + (y * y)); 
	}

}
