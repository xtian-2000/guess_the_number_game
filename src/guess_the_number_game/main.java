package guess_the_number_game;

import java.util.Scanner;
import java.util.Random;

public class main {
	public static void main(String[] args) {
		Random rand = new Random(); 															// variable for random
		
		int answer;
		int guess;
		int counter;
		
		String userInput;
		
		answer = 1 + rand.nextInt(100);
				
		// State the mechanics of the game
		System.out.println("Welcome to the guessing game!!! \n");
		System.out.println("Mechanics:");
		System.out.println("- The game will have a number that should be guessed. For example, 36. \r\n"
				+ "- Player will guess from a range of numbers. \r\n"
				+ "- The game will output if the guess is greater than or less than. \r\n"
				+ "- The player wins if he guesses the correct number. \n");
		
		Scanner sc = new Scanner(System.in); 												// variable for user input
		System.out.println("Press any keys to start the game. Or press 'x' to exit");
		userInput = sc.nextLine();

		if (userInput.equals("x")) {
			System.out.println("Program is closed. Thank you for playing!");
			System.exit(0);
		} else {
			guess = 0; 																		// initial value of guess
			counter = 0; 																	// initial value of counter
			System.out.println("Guess the number from (1 - 100):");
			
			// while loop for the game
			while (guess != answer) {
				guess = sc.nextInt();
				if (guess > answer) {														// If guess is greater than the correct answer
					System.out.println("Guess is greater than the correct answer.");
				} else if (guess < answer){													// If guess is less than the correct answer
					System.out.println("Guess is less than the correct answer.");
				} else { 																	// If guess is right
					System.out.println("Congratulations! You have won the game.\n");
					System.out.println("The correct answer is: " + answer);
				}
				counter++; 																	// counter increment
				System.out.println("Number of guesses: " + counter);
			}
		}	
		sc.close();	// Closes the scanner variable
	}
}
