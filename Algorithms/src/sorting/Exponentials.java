package sorting;

import java.util.Scanner;

// imports Scanner utility from java library
public class Exponentials {

	public static void main(String[] args) {
		// Main Method

		Scanner input = new Scanner(System.in);
		// creates new input method for user to input into console
		System.out.println("Please enter choice 'x' for which exponential is to be calculated: ");
		// Request user input of only positive double
		int x = input.nextInt();
		// creates instance variable & assigns whatever user inputs
		System.out.println("Please enter exponent 'n' you wish to use: ");
		int n = input.nextInt();
		// creates integer instance variable & assigns whatever user inputs
		double result = 1;
		// initial result =1 as it starts by multiplying it against your choice
		// if zero is used - it will multiply by zero & answer will always be 0
		for (double i = 0; i <= n; i++) {
			result = result * x;
		}
		// for loop that starts at 0 and multiplies your answer through until
		// limit is reached at exponent choice
		// will round if negative exponent
		System.out.println("Exponential of choice is " + result);
		// prints to console the value of the exponential of choice
		input.close();
		// closes scanner input to prevent further user input
	} // closes main

} // closes class
