package Excersices;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double sideA;
		double sideAMath;
		double sideB;
		double sideBMath;
		double sideC;
		double sideCMath;
		double area;
		double area1;
		double perimeter;
		
		System.out.println("What is side A>> ");
		sideA = input.nextInt();
		System.out.println("What is side B>> ");
		sideB = input.nextInt();
		
		sideAMath = sideA * sideA; 
		sideBMath = sideB * sideB; 
		sideCMath = sideAMath + sideBMath;
		sideC = Math.sqrt(sideCMath);
		
		area1 = sideA * sideB;
		area= area1 / 2;
		perimeter = sideA + sideB + sideC;
		
		System.out.println("Side C>> " + sideC);
		System.out.println("Area of Right triangle = " + area);
		System.out.println("Perimeter of Right triangle = " + perimeter);
		
	}

}
