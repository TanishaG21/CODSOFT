import java.util.Random;
import java.util.Scanner;

public class NumberGame{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int maximumAttempts = 10;
		int roundsDone = 0;
		int score = 0;
		
		System.out.println("Number Guessing Game");
		String playAgain = "yes";
		while(playAgain.equalsIgnoreCase("yes")){
			int numToGuess = ran.nextInt(100)+1;
			int attempts = 0;
			boolean guessIsCorrect = false;
			System.out.println("guess a number between 1 and 100");
			
			while(attempts<maximumAttempts) {
				System.out.println("enter your guess: ");
				int guess = sc.nextInt();
				attempts++;
				if(guess == numToGuess){
					System.out.println("correct guess");
					score++;
					guessIsCorrect = true;
					break;
				}
				else if(guess<numToGuess){
					System.out.println("less than generated number");
				}
				else{
					System.out.println("more than generated number");
				}
			}
			if(!guessIsCorrect){
				System.out.println("you are out of attempts..the number is: " + numToGuess);
			}
			roundsDone++;
			System.out.println("do you want to play another round? (yes/no): ");
			playAgain = sc.next();	
		}
		System.out.println("\nGAME OVER");
		System.out.println("You played: " + roundsDone + "rounds");
		System.out.println("Score: " + score);
        sc.close();
	}
}
