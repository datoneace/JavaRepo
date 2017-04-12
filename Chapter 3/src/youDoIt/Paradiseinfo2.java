package youDoIt;
import java.util.Scanner; 
public class Paradiseinfo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double price;
		double discount;
		double savings;
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.print("Enter cutoff price for discount>> ");
		price = keyboard.nextDouble();
		savings = computeDiscountInfo(price, discount);
		System.out.print("Special this week in any service over " + price);
		System.out.print("Discount of " + discount + "precent");
		System.out.print("That's a savings of at least $ " + savings);
		
	}
	public static double computeDiscountInfo(double pr, double dscnt)
	{
		double savings;
		savings = pr * dscnt / 100;
		return savings;
		
	}

}
