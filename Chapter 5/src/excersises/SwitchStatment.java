package excersises;
import java.util.Scanner;
public class SwitchStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user;
		int choice; 
		
		Scanner input = new Scanner(System.in); 
		do {
		System.out.print("What is your student I.D.>> ");
		user = input.nextInt();
		switch(user)
		{
		case 138992:
			System.out.print("Your name is Dusty. ");
			break;
		case 131193:
			System.out.print("Your name is Evan. ");
			break;
		case 122190:
			System.out.print("Your name is Brandon. ");
			break;
		case 308508:
			System.out.print("Your name is AshLynn. ");
			break;
		case 304275:
			System.out.print("Your name is Gairren. ");
			break;
		case 112006:
			System.out.print("Your name is Nick. ");
			break;
		case 138076:
			System.out.print("Your name is Alex. ");
			break;
		}
		System.out.println("Would you like to scan another? 1 for yes, 2 for no");
		choice = input.nextInt();
		} while(choice == 1);
	}
	
	

}
