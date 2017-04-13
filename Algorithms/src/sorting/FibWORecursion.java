package sorting;

import java.util.Scanner;
//bringing in the scanner utility

public class FibWORecursion {

	public static void fibonacci(int n)
	// creates a long variable within which index location i is placed
	// must be static to be called in static main
	{

		int fib1 = 0;
		int fib2 = 0;
		int fib3 = 1;
		// creates 3 new int variables to be passed in to for loop
		for (int i = 0; i < n; i++) {
			// iterates through each index location until user selected n is
			// reached
			// instantiates new temp int variable equal to the sum of the
			// previous
			fib1 = fib2;
			fib2 = fib3;
			fib3 = fib1 + fib2;
			System.out.println(fib1);
			// swaps values as loop is iterated through
		} // closes for loop
	} // closes method

	public static void main(String[] args) {
		// main method
		int n;
		// Value the Fibonacci series will be calculated to
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter in value 'n' to be used:");
		n = input.nextInt();
		// Scanner instantiated & next user input assigned to int n
		System.out.println("Fibonacci number(s) to the " + n + "th are: ");
		fibonacci(n);
		// calls the fibonacci method from above
		input.close();
		// closes to prevent further input
	} // closes main

} // closes class
