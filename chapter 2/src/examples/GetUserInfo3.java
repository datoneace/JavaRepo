package examples;
import java.util.Scanner;
public class GetUserInfo3 {
	
	private static Scanner inputDevice;
	private static int age;

	public static void main(String[] args){
	String name;
	inputDevice = new Scanner(System.in);
	System.out.println("please enter your age>>");
	age = inputDevice.nextLine );
	System.out.println("please enter your name>>");
	name = inputDevice.nextLine();
	
	System.out.println("your name is " + name + " and you are " + " yearls old.");
	}
}
