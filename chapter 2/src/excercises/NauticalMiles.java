package excercises;
import java.util.Scanner;
public class NauticalMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double mileToNM= 1.150779;//this is one mile to nautical mile
		double kilometerToNM = 1.852; //this is one nautical mile to kilometer
		double miles;
		double kilometers;
		double milesTotal;
		double kilometerTotal;
		
		Scanner inputDevice = new Scanner(System.in); 
		
		System.out.println("Enter the amount of miles>>");
		miles = inputDevice.nextInt();
		
		System.out.println("Enter the amount of Kilometers>>");
		kilometers = inputDevice.nextInt(); 
		
		milesTotal= miles * mileToNM;
		kilometerTotal = kilometers * kilometerToNM; 
		
		System.out.println("Number of kilometers to miles = " + kilometerTotal);
		System.out.println("Number of Nautical to miles = " + milesTotal);
		
		
		
	}

}
