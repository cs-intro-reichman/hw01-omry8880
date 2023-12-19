/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
import java.util.Random;

public class GenThree {
	public static void main(String[] args) {
		Random rand = new Random();
		int argsZero = Integer.parseInt(args[0]);
		int argsOne = Integer.parseInt(args[1]);
		
		int randomOne = rand.nextInt(argsOne) + argsZero; // range: starts from argsZero and ends in argsOne (argsZero - argsOne)
		int randomTwo = rand.nextInt(argsOne) + argsZero;
		int randomThree = rand.nextInt(argsOne) + argsZero;
		int minRandom = Math.min(Math.min(randomOne, randomTwo), randomThree);

		System.out.println("Random numbers: " + randomOne + ", " + randomTwo + ", " + randomThree + ". The minimum random: " + minRandom + ".");
	}
}
