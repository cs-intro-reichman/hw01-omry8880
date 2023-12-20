/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		int sideOne = Integer.parseInt(args[0]);
		int sideTwo = Integer.parseInt(args[1]);
		int sideThree = Integer.parseInt(args[2]);

		System.out.println(sideOne + ", " + sideTwo + ", " + sideThree + ": " + 
						   sideOne + sideTwo > sideThree && sideOne + sideThree > sideTwo && sideTwo + sideThree > sideOne);
	}
}
