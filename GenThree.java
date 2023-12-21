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

		int range = argsOne - argsZero;

		int randomOne = (int) (range * Math.random() + argsZero); // 10 - 15 | 0.9 * 15 + 10
		int randomTwo = (int) (range * Math.random() + argsZero);
		int randomThree = (int) (range * Math.random() + argsZero);

		int minRandom = Math.min(Math.min(randomOne, randomTwo), randomThree);

		System.out.println(randomOne + "\n" + randomTwo + "\n" + randomThree + "\nThe minimum random is " + minRandom);
	}
}
