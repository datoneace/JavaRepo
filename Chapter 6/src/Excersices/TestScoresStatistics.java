package Excersices;

import java.util.Scanner;

public class TestScoresStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // display operational messages
        System.out.println("Please enter test scores that range from 0 to 100.");
        System.out.println("To end the program enter 999.");
        System.out.println(); 

        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in); 
        
        String choice = "y";
//Integer.MIN_VALUE
// Integer.MAX_VALUE
      
        while (!choice.equalsIgnoreCase("n"))
        {
            int scoreTotal = 0;
            int scoreCount = 0;
            int testScore = 0;
            int large = 0;
            int smallest = 0;
            int num;
            
            System.out.println("Enter the number of test score to be entered: ");
            int numberOfTestScores = sc.nextInt();

            for (int i = 1; i <= numberOfTestScores; i++)
            {
                 
                 System.out.print("Enter score " + i + ": ");
                 testScore = sc.nextInt();

                 if (testScore <= 100)
                 {
                      scoreCount = scoreCount + 1;
                  
                   
                 }
                 else if (testScore > 100) 
              System.out.println("Invalid entry, not counted");
                 
             }
            for (int i = 2; i < n; i++) {
                num = input.nextInt();
                //comparing each time entered number with large one
                if (num > large) {
                    large = num;
                }
                //comparing each time entered number with smallest one
                if (num < smallest) {
                    smallest = num;
                }
           
             System.out.println( "Score count:   " + scoreCount );
             System.out.println();
             System.out.println("Enter more test scores? (y/n)");
             choice= sc.next();
             
          
        }
	}

}
