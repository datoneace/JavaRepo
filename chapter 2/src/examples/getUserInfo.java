package examples;
import java.util.Scanner;
public class getUserInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age; 
		
		Scanner blahblah = new Scanner(System.in);
		System.out.print(" please enter your name>> ");
		name = blahblah.nextLine();
		System.out.println("enter your age >>");
		age = blahblah.nextInt();
		System.out.print("Your name is " + name + " and you are " + age + " years old.");
	}

}
