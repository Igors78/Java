import java.util.Scanner;

public class HiLo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playAgain = "";
		int tries;
		do {
			int theNumber = (int) (Math.random() * 100 + 1);
			tries = 0;
			int guess = 0;
			while (guess != theNumber) {
				System.out.println("Guess the Number between 1 and 100:");
				guess = scan.nextInt();
				// System.out.println("You entered " + guess);
				if (guess < theNumber)
					System.out.println("Too low. Try again");
				else if (guess > theNumber)
					System.out.println("Too high. Try again");
				else
					System.out.println("Gotcha!!!");
				tries++;
			}
			System.out.println("You  got it in " + tries + " tries!");
			System.out.println("Play again? (y/n)?");
			playAgain = scan.next();
		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("Thank you for playing!");
		scan.close();
	}

}
