package youDoIt;
import java.util.Scanner; 
public class CreateSpaService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String service;
		double price;
		
		spaService firstService = new spaService();
		spaService secondService = new spaService();
		Scanner k = new Scanner(System.in);
		System.out.print("Enter service >> ");
		service = keyboard.nextLine();
		System.out.print("Enter price >>");
		price = keyboard.nextDouble();
		
		firstService.setServiceDescription(service);
		firstService.setPrice(price);
		
		System.out.println("First service details:");
		System.out.println(firstService.getServiceDescription() + " $" + secondService.getPrice());
		
	}

}
