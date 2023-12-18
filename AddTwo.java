/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		int firstInteger = Integer.parseInt(args[0]);
		int secondInteger = Integer.parseInt(args[1]);
		
		System.out.println("The sum of the given integers is: " +
		 (firstInteger + secondInteger));
	}
}
