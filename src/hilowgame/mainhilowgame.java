package hilowgame;

import java.util.Scanner;

public class mainhilowgame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numdice =0;  // sets number of dice 
		int guess = 0;    // sets how many guess 
		int numCorrectGuesses = 0; // sets the number of correct guesses
		int numRolls = 0; // sets number of rolls 		  
		int plays =1;
	    int gamesplayed =0;
		
		while (plays >= 1 )
		{
			System.out.print("Enter Number of dice to Roll : ");
			numdice = scan.nextInt();       // user inputs Number of dice to role
			Die d = new Die(numdice);     // Gets dice class roll
			
			System.out.println();
			
			d.setNumDice(numdice);               // initiates number of roll
			numRolls++;       //keeps track of rolls
			
			System.out.print("Guess the dice result: ");  // User inputs guess
			guess = scan.nextInt();
			
			if(guess == d.roll())                  // adds one to correct guess if correct guess
			{
				numCorrectGuesses++;     //keeps track of correct guesses                 
			}
			
			System.out.println("computer output was "+d.roll()+" yours was "+guess); // outputs computer input and user input
		System.out.println("DO you want to Keep Playing 1 for yes and 2 for no : ");
		int playagain = scan.nextInt();
		if (playagain ==1)
			plays=1;
		else
			plays=0;
		gamesplayed++;
		}
		
		System.out.println("You were correct "+((numCorrectGuesses/(double)numRolls)*100)+ 
				"% of the time and made "+numCorrectGuesses+" correct guesses"); // gives percentage of number correct
		System.out.println("You were incorrect"+(((numRolls-numCorrectGuesses)/(double)numRolls)*100)
				+"% of the time and "+ "made "+(numRolls-numCorrectGuesses)+" Incorrect Guesses"); 
		//gives incorrect guesses
		System.out.println("You guessed a total of  " +gamesplayed+ " Times "); // gives number of times played or guessed
	}

}
