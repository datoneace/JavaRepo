package gameZone;
import java.util.Scanner;

public class MadLibs {

	private static Scanner inputDevice;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color;
		String wordEST;
		String bodyPartPlural;
		String animal;
		String noun;
		String pluralNoun;
		int a, b, c;
		
		inputDevice = new Scanner(System.in);
		System.out.println("Welcome to my MadLibs Game.");
		

		System.out.println("Enter a color>> ");
		color = inputDevice.nextLine();
		
		
		System.out.println("Enter a word ending in EST>> ");
		wordEST = inputDevice.nextLine();

		
		System.out.println("Enter a body part plural>> ");
		bodyPartPlural = inputDevice.nextLine();

		
		System.out.println("Enter an animal>> ");
		animal = inputDevice.nextLine();
	
		
		System.out.println("Enter a noun>> ");
		noun = inputDevice.nextLine();

		
		System.out.println("Enter a plural noun>> ");
		pluralNoun = inputDevice.nextLine();
		
	
	
		System.out.println("The " + color + " Dragon is the " + wordEST + 
				" dragon of all! It has alot of " + bodyPartPlural +
				". It can only be defeated by the " + animal + ". The dragons breath smells like " + noun + 
				". Some people say the Dragon looks like " + pluralNoun + "."); 
	}

}
