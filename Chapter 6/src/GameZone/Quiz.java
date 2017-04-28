package GameZone;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);  
		
		int answer1;
		int answer2;
		int answer3;
		int answer4;
		int answer5;
		int correct = 0;
		int wrong = 0;
		int percent;
		
		
		System.out.println("Welcome to the Pop Culture quiz. Let's Begin. ");
		System.out.println("								 ");
		 System.out.println("Question 1: Who is the oldest of the Kardashian sisters? ");
		 
		 System.out.println("type 1 for kim, 2 for kourtney, 3 for khloe, and 4 for kylie.  ");
		 answer1 = input.nextInt();
		
		 	if (answer1 == 1)
		 {
			 System.out.println("Wrong. The correct answer was 2, Kourtney ");
			 wrong = wrong + 1;
		 }
		 	if (answer1 == 2)
		 {
			 System.out.println("Correct, Kourtney is the oldest Kardashian sister. ");
			 correct = correct + 1;
		 }
		 	if (answer1 == 3)
		 {
			 System.out.println("Wrong. The correct answer was 2, Kourtney ");
			 wrong = wrong + 1;
		 }
		 	if (answer1 == 4)
		 {
			 System.out.println("Wrong. The correct answer was 2, Kourtney ");
			 wrong = wrong + 1;
		 }
		 	
		System.out.println("								 ");
		System.out.println("Question 2: Who played Bruce Wayne in 1989 Tim Burton's Batman? ");
		 
		 System.out.println("type 1 for Adam West, 2 for Christan Bale, 3 for Jack Nicholson, and 4 for Micheal Keaton.  ");
		 answer2 = input.nextInt();
		
		 if (answer2 == 1)
		 {
			 System.out.println("Wrong. The correct answer was 4 Micheal Keaton  ");
			 wrong = wrong + 1;
		 }
		 if (answer2 == 2)
		 {
			 System.out.println("Wrong. The correct answer was 4 Micheal Keaton  ");
			 wrong = wrong + 1;
		 }
		 if (answer2 == 3)
		 {
			 System.out.println("Wrong. The correct answer was 4 Micheal Keaton ");
			 wrong = wrong + 1;
		 }
		 if (answer2 == 4)
		 {
			 System.out.println("Correct, Micheal Keaton played Bruce Wayne in 1989 Tim Burton's Batman? ");
			 correct = correct + 1;
		 }
		 
		 System.out.println("								 ");
		 System.out.println("Question 3: Why did Andy get Buzz Lightyear? ( Toy Story ) ");
		 
		 System.out.println("type 1 for Its Christmas, 2 for It's his birthday, 3 for It's Hanukkah, and 4 for It's Easter.  ");
		 answer3 = input.nextInt();
		
		 if (answer3 == 1)
		 {
			 System.out.println("Wrong. The correct answer was 2, his Birthday.  ");
			 wrong = wrong + 1;
		 }
		 if (answer3 == 2)
		 {
			 System.out.println("Correct, Andy got Buzz for his Birthday.   ");
			 correct = correct + 1;
		 }
		 if (answer3 == 3)
		 {
			 System.out.println("Wrong. The correct answer was 2, his Birthday. ");
			 wrong = wrong + 1;
		 }
		 if (answer3 == 4)
		 {
			 System.out.println("Wrong. The correct answer was 2, his Birthday. ");
			 wrong = wrong + 1;
		 }
		 
		 System.out.println("								 ");
		 System.out.println("Question 4: What is Scrooge's first name? ");
		 		 
		 	System.out.println("type 1 for Ethard, 2 for Ernie, 3 for Ebenezer, and 4 for Elvis.  ");
		 		 answer4 = input.nextInt();
		 		
		 		 if (answer4 == 1)
		 		 {
		 			 System.out.println("Wrong. The correct answer was 3, Ebenezer.  ");
		 			wrong = wrong + 1;
		 		 }
		 		 if (answer4 == 2)
		 		 {
		 			 System.out.println("Wrong. The correct answer was 3, Ebenezer. ");
		 			wrong = wrong + 1;
		 		 }
		 		 if (answer4 == 3)
		 		 {
		 			 System.out.println("Correct, his name was Ebenezer.");
		 			correct = correct + 1;
		 		 }
		 		 if (answer4 == 4)
		 		 {
		 			 System.out.println("Wrong. The correct answer was 3, Ebenezer.  ");
		 			wrong = wrong + 1;
		 		 }
		 
		 		 
		 	System.out.println("								 ");
				 System.out.println("Question 5: Who were the brothers that founded the Walt Disney Company?");
				 		 
				 	System.out.println("type 1 for Walt and Charles Disney, 2 for Walt and Allen Disney, 3 for Walt and Roman Disney, and 4 for Walt and Roy Disney.  ");
				 		 answer5 = input.nextInt();
				 		
				 		 if (answer5 == 1)
				 		 {
				 			 System.out.println("Wrong. The correct answer was 4, Walt and Roy Disney.  ");
				 			wrong = wrong + 1;
				 		 }
				 		 if (answer5 == 2)
				 		 {
				 			 System.out.println("Wrong. The correct answer was 4, Walt and Roy Disney.  ");
				 			wrong = wrong + 1;
				 		 }
				 		 if (answer5 == 3)
				 		 {
				 			 System.out.println("Wrong. The correct answer was 4, Walt and Roy Disney.  ");
				 			wrong = wrong + 1;
				 		 }
				 		 if (answer5 == 4)
				 		 {
				 			 System.out.println("Correct, it was Walt and Roy Disney.  ");
				 			correct = correct + 1;
				 		 }	
				 		
				 	percent = correct * 100 / 5;	 
			System.out.println("								 ");
			System.out.println("That is the end of the quiz. You got " + correct + " correct, and " + wrong + " incorrect. You got " + percent + " percent. ");
			
		 
	}

}
