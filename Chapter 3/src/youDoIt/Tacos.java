package youDoIt;
import java.util.Scanner; 
public class Tacos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tacoString, burritoString;
		double tacoPrice = 0.99;
		double burritoPrice = 1.99;
		double nachoPrice = 2.99;
		double ricePrice = 0.99;
		double saladPrice = 2.99;
		double soupPrice = 1.99;
		double fajitaPrice = 0.99;
		double churroPrice = 0.99;
		double guacamolePrice = 0.99;
		double quesadillaPrice = 0.99;
		double nachoOrdered;
		double tacoOrdered;
		double burritoOrdered;
		double riceOrdered;
		double saladOrdered;
		double soupOrdered;
		double fajitaOrdered;
		double churroOrdered;
		double guacamoleOrdered;
		double quesadillaOrdered;
		double totalPrice;
		
		
		Scanner inputDevice = new Scanner (System.in); 
		
		System.out.println(" ***  DELGATAOS TACOS  *** ");
		System.out.println(" ***  Tacos - 0.99     *** ");
		System.out.println(" ***  burritos - 1.99  *** ");
		System.out.println(" ***  nachos - 2.99    *** ");
		System.out.println(" ***  rice - 0.99      *** ");
		System.out.println(" ***  salad - 2.99     *** ");
		System.out.println(" ***  soup - 1.99      *** ");
		System.out.println(" ***  fajita - 0.99    *** ");
		System.out.println(" ***  Churro - 0.99    *** ");
		System.out.println(" *** Guacamole - 0.99  *** ");
		System.out.println(" *** Quesadilla - 0.99 *** ");
		System.out.println(" ***    THANK YOU      *** ");
		
		System.out.println("                                 ");
		System.out.println("                                 ");
		
		System.out.println(" **************************");
		System.out.println(" *                        *");
		System.out.println(" *                        *");
		System.out.println(" *   ******************   *");
		System.out.println(" *   *                *   *");
		System.out.println(" *   *                *   **************");
		System.out.println(" *   *                *        *********");
		System.out.println(" *   *                *        *       *");
		System.out.println(" *   ******************        *********");
		System.out.println(" *                                     *");
		System.out.println(" *                                    **");
		System.out.println(" *                                     *");
		System.out.println(" ***************************************");
		System.out.println("    ********            ********");
		System.out.println("    ********            ********");
		
		System.out.print("How many tacos do you want? >>>>");
		tacoOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.print("How many burritos do you want? >>>>");
		burritoOrdered = inputDevice.nextDouble();
		inputDevice.nextLine(); 
		
		System.out.print("How many nachos do you want? >>>>");
		nachoOrdered = inputDevice.nextDouble();
		inputDevice.nextLine(); 
		
		System.out.print("How many rices do you want? >>>>");
		riceOrdered = inputDevice.nextDouble();
		inputDevice.nextLine(); 
		
		System.out.print("How many salads do you want? >>>>");
		saladOrdered = inputDevice.nextDouble();
		inputDevice.nextLine(); 
		
		System.out.print("How many soups do you want? >>>>");
		soupOrdered = inputDevice.nextDouble();
		inputDevice.nextLine(); 
		
		System.out.print("How many fajitas do you want? >>>>");
		fajitaOrdered = inputDevice.nextDouble();
		inputDevice.nextLine(); 
		
		System.out.print("How many churros do you want? >>>>");
		churroOrdered = inputDevice.nextDouble();
		inputDevice.nextLine(); 
		
		System.out.print("How many guacomles do you want? >>>>");
		guacamoleOrdered = inputDevice.nextDouble();
		inputDevice.nextLine(); 
		
		System.out.print("How many quesadillas do you want? >>>>");
		quesadillaOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();  
		
		totalPrice = (tacoPrice * tacoOrdered) + (burritoPrice * burritoOrdered) + (nachoPrice * nachoOrdered) + (ricePrice * riceOrdered) + 
				(saladPrice * saladOrdered) + (soupPrice * soupOrdered) + (fajitaPrice * fajitaOrdered) + (churroPrice * churroOrdered) + 
				(guacamolePrice * guacamoleOrdered) + (quesadillaPrice * quesadillaOrdered);
		
		System.out.println(" you have ordered " + tacoOrdered + " tacos, " + burritoOrdered + " burritos, " + nachoOrdered + " nachos, " + 
				riceOrdered + " rices, " + saladOrdered + " salads, " + soupOrdered + " soups, " + fajitaOrdered + " fajitas, " + 
				churroOrdered + " churros, " + guacamoleOrdered + " guacamoles, and " + quesadillaOrdered + " quesadillas, for a total price of " +
				 totalPrice + ". ");
		
	
		double totalWithTax;
		final double tax = 1.075;
		totalWithTax = totalPrice * tax;
		
		System.out.println(" Total with tax is " + totalWithTax);
		
	}
	

}