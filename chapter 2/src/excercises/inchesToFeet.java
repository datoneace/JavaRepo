package excercises;
import java.util.Scanner;
public class inchesToFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int feet;
		int inches;
		int inchesInFeet = 12;
		int inchesRemainder;
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("How many inches is there?>>> ");
		inches = inputDevice.nextInt();
		
		feet = inches / inchesInFeet;
		inchesRemainder = feet % inchesInFeet;  
		
		System.out.println("You have " + feet + " feet and " + inchesRemainder + " inches.");
		
	}

}
