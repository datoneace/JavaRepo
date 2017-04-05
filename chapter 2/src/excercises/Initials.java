package excercises;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Initials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String first;
		String second;
		String third;
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("what is your first initial>>> ");
		first = inputDevice.nextLine(); 
		System.out.println("what is your second initial>>> ");
		second = inputDevice.nextLine(); 
		System.out.println("what is your third initial>>> ");
		third = inputDevice.nextLine(); 
		System.out.println("Your initials are " + first + ". " + second + ". " + third + ".");
		
	}

}
