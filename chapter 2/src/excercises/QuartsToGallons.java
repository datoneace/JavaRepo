package excercises;
import java.util.Scanner;
public class QuartsToGallons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int gallons;
		int quarts;
		int quartsInGallon = 4;
		int quartsRemainder;
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("How many quarts are needed for the job?>>> ");
		quarts = inputDevice.nextInt();
		
		gallons = quarts / quartsInGallon;
		quartsRemainder = quarts % quartsInGallon;  
		
		System.out.println("You need " + gallons + " and " + quartsRemainder);
		

	}

}
