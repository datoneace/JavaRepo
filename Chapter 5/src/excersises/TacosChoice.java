package excersises;
import java.util.Scanner;
public class TacosChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choiceYes = null;
	tacoTruck();
	menu();
	do{
		orderingFood();
		Scanner input = new Scanner(System.in); 
		System.out.print("Would you like anything else? yes or no>>>>>>>");
		choiceYes = input.nextLine(); 
	
	}while(choiceYes.equals("Yes"));
	}
	public static void orderingFood()
	{
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
		int nachoOrdered = 0;
		int tacoOrdered = 0;
		int burritoOrdered = 0;
		int riceOrdered = 0;
		int saladOrdered = 0;
		int soupOrdered = 0;
		int fajitaOrdered = 0;
		int churroOrdered = 0;
		int guacamoleOrdered = 0;
		int quesadillaOrdered = 0 ;
		double totalPrice;
		int Choice; 
		 
		
		Scanner inputDevice = new Scanner (System.in);
		Scanner input = new Scanner(System.in); 
		
		
		
		
		
		System.out.print("What would you like to order>>> ");
		Choice = input.nextInt(); 
		
		if(Choice == 1)
		{
			System.out.print("How many Tacos do you want>>> ");
			tacoOrdered = input.nextInt();   
			
		}
		if(Choice == 2)
		{
			System.out.print("How many burritos do you want>>> ");
			burritoOrdered = input.nextInt();   
		}
		if(Choice == 3)
		{
			System.out.print("How many nachos do you want>>> ");
			nachoOrdered = input.nextInt();   
		}
		if(Choice == 4)
		{
			System.out.print("How many rices do you want>>> ");
			riceOrdered = input.nextInt();   
		}
		if(Choice == 5)
		{
			System.out.print("How many salads do you want>>> ");
			saladOrdered = input.nextInt();   
		}
		if(Choice == 6)
		{
			System.out.print("How many soup do you want>>> ");
			soupOrdered = input.nextInt();   
		}
		if(Choice == 7)
		{
			System.out.print("How many fajitas do you want>>> ");
			fajitaOrdered = input.nextInt();   
		}
		if(Choice == 8)
		{
			System.out.print("How many churro do you want>>> ");
			churroOrdered = input.nextInt();   
		}
		if(Choice == 9)
		{
			System.out.print("How many guacamoles do you want>>> ");
			guacamoleOrdered = input.nextInt();   
		}
		if(Choice == 10)
		{
			System.out.print("How many quesadillas do you want>>> ");
			quesadillaOrdered = input.nextInt();   
		}
		
		
		
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
	public static void tacoTruck()
	{
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
		
		
	}
	public static void menu()
	{
		System.out.println(" ***        DELGATAOS TACOS   *** ");
		System.out.println(" ***  1 for Tacos - 0.99      *** ");
		System.out.println(" ***  2 for burritos - 1.99   *** ");
		System.out.println(" ***  3 for nachos - 2.99     *** ");
		System.out.println(" ***  4 for rice - 0.99       *** ");
		System.out.println(" ***  5 for salad - 2.99      *** ");
		System.out.println(" ***  6 for soup - 1.99       *** ");
		System.out.println(" ***  7 for fajita - 0.99     *** ");
		System.out.println(" ***  8 for Churro - 0.99     *** ");
		System.out.println(" *** 9 for Guacamole - 0.99   *** ");
		System.out.println(" *** 10 for Quesadilla - 0.99 *** ");
		System.out.println(" ***         THANK YOU        *** ");
		
	}
}
