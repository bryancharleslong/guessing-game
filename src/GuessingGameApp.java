import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		int secretNumber = (int) (Math.random() * 10 + 1);
		System.out.println("Welcome to my guessing game!");
		System.out.println("What is your name?");
		String name = input.nextLine();
		System.out.println("Guess a number from 1 to 10");
		System.out.println("Press 0 for a hint");
		System.out.println("Press -1 to quit");
		boolean finished = false;
		int numberGuessed = 5;
		int numTries = 0;
		while (finished == false & numberGuessed != -1) {
			if (numTries == 3) {
				System.out.println("too many tries. Game over");
				System.exit(0);

			}

			numberGuessed = input.nextInt();

			while (numberGuessed == 0) {
				System.out.println("Let me think...");
				Thread.sleep(2000);
				if (secretNumber % 2 == 0) {
					System.out.println("Secret number is even.");

				} else {
					System.out.println("Secret number is odd.");

				}
				Thread.sleep(2000);
				System.out.println("Guess a number from 1 to 10");
				numberGuessed = input.nextInt();
			}

			if (numberGuessed == secretNumber) {
				System.out.println("You guessed it, Congrats! " + name);
				finished = true;
				System.exit(0);
			} else {
				if (numberGuessed > secretNumber) {
					System.out.println("Guessed too high. Guess again.");
					numTries++;
				} else {
					System.out.println("Guess too low. Guess again.");
					numTries++;
				}

			}
		}
		input.close();
	}

}
