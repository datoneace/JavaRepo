package YouDoIt;
import java.util.Scanner;
public class AverageofQuizzes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = new int[10];
		int score = 0;
		int count = 0;
		int total = 0;
		int highest = 0;
		int lowest = 0;
		final int QUIT = 999;
		final int MAX = 10;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter quiz score or " + QUIT + " to quit >>>>>> ");
		 
		score = input.nextInt();
		while(score != QUIT)
		{
			scores[count] = score;
			total = total + scores[count];
			 if(highest <= score)
			 {
				 highest = score;
			 }
			 if(lowest >= score)
			 {
				 lowest = score;
			 }
			count = count + 1;
			if(count == MAX){
				score = QUIT;
			}
			else{
				 System.out.print("Enter next quiz score or " + QUIT + " to quit >>>>");
				 score = input.nextInt();
				 
			 }
			}
		 System.out.print("\nThe scores entered were: ");
		 for(int x = 0; x < count; x =x +1)
		 {
			 System.out.println(scores[x] +" ");

		 }
		 System.out.print("\nThe highest score was >>  " + highest);
		 System.out.print("\nThe lowest score was >>  " + lowest);
		 if(count!=0)
		 {
			 System.out.print("\nThe Average is " + (total * 1.0/count)); 
			
		 }
		 else 
			 System.out.print("No scores were entered ");
		 
	 }
	
	 }
		
	

