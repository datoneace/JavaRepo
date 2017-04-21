package excersises;
import java.util.Scanner;
public class AscendingAndDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, num2, num3;
		
		Scanner input = new Scanner(System.in);  
		
		System.out.print("Enter 1 interger>> ");
		num = input.nextInt();
		System.out.print("Enter 1 interger>> ");
		num2 = input.nextInt();
		System.out.print("Enter 1 interger>> ");
		num3 = input.nextInt();
		
		if (num > num2 & num> num3)
		{
			if (num2 > num3)
			{
				System.out.print("decending " + num + num2 + num3);
				System.out.print("Accending " + num3 + num2 + num);
			}
		}
		if (num > num3 & num> num2)
		{
			if (num3 > num2)
			{
				System.out.print("decending " + num + num3 + num2);
				System.out.print("Accending " + num2 + num3 + num);
			}
		}
		if (num2 > num & num2> num3)
		{
			if (num > num3)
			{
				System.out.print("decending " + num2 + num + num3);
				System.out.print("Accending " + num3 + num + num2);
			}
		}
		if (num2 > num3 & num2> num)
		{
			if (num3 > num)
			{
				System.out.print("decending " + num2 + num3 + num);
				System.out.print("Accending " + num + num3 + num2);
			}
		}
		if (num3 > num & num3> num2)
		{
			if (num > num2)
			{
				System.out.print("decending " + num3 + num + num2);
				System.out.print("Accending " + num2 + num + num3);
			}
		}
		if (num3 > num2 & num3> num)
		{
			if (num2 > num)
			{
				System.out.print("decending " + num3 + num2 + num);
				System.out.print("Accending " + num + num2 + num3);
			}
		}
	
		
	}

}
