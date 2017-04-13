package sorting;

import java.util.Scanner;
//bringing in the scanner utility

public class FibRecursion {

	public static long fibonacci(int n)
	// creates a long variable within which index location i is placed
	// must be static to be called in static main
	{
		if (n == 0) {
			return 0;
		} // closes if
		if (n <= 2) {
			return 1;
			// in a Fibonacci set, index 0 = 0 & index 1/2 = 1
		} // closes if

		long fibTerm = fibonacci(n - 1) + fibonacci(n - 2);
		// creates new variable equal to sum of two previous Fibonacci numbers
		return fibTerm;
	} // closes method

	public static void main(String args[]) {
		// main method
		int n;
		// Value the Fibonacci series will be calculated to
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter in value 'n' to be used:");
		n = input.nextInt();
		// Scanner instantiated & next user input assigned to int n
		System.out.println("Fibonacci number(s) before the " + n + "th are: ");
		for (int i = 0; i < n; i++) {
			System.out.println(fibonacci(i));
			// for loop which states for every number less than to input
			// print Fibonacci
			input.close();
			// prevents further user input
		} // closes for loop

	} // closes main method

} // closes class
