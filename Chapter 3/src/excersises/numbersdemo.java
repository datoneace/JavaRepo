package excersises;

public class numbersdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5;
		int num2 = 10;
		displayTwiceTheNumber(num1, num2);
		displayNumberPlusFive(num1, num2);
		displayNumberSquared(num1, num2); 
	}
	public static void displayTwiceTheNumber(int n, int y)
	{
		int factor = 2;
		System.out.println(n + " times " + factor + " is " + (n * factor)); 
		System.out.println(y + " times " + factor + " is " + (y * factor)); 
	}
	public static void displayNumberPlusFive(int n, int y){
		int factor = 5;
		System.out.println(n + " plus " + factor + " is " + (n * factor)); 
		System.out.println(y + " plus " + factor + " is " + (y * factor)); 
	}
	public static void displayNumberSquared(int n, int y){
		System.out.println(n + " squared is " + (n * n)); 
		System.out.println(y + " squared is " + (y * y)); 
	}
}
