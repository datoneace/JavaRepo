package examples;
import java.util.scanner;
public class GetUserInfo3 {
	string name;
	int age;
	
	scanner inputDevice = new Scanner(System.in);
	System.out.println("please enter your age>>");
	age = inputDevice.nextInt();
	inputDevice.nextLine();
	system.out.println("please enter your name>>");
	name = inputDevice.nextLine();
	
	System.out.println("your name is " + name + " and you are " + " yearls old.");
	
}
