package sorting;

import java.util.*;
import java.util.Scanner;
// imports scanner & array utilities
public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int array1[] = { 55, 4, 334, 21, 1, 5, 200, 33 };

		// System.out.println("Initial array: " + Arrays.toString(array1));

		System.out.println("Please enter size of array you wish to sort: ");
		Scanner int_input = new Scanner(System.in);
		int choice = int_input.nextInt();
		int A[] = new int[choice];
		// requests user input for size of array to be sorted by merge sort program
		System.out.println("Please enter " + choice + " numbers to populate array:  ");
		// Requests user to populate the array with numbers
		Scanner input = new Scanner(System.in);
		// initialises new scanner input
		for (int x = 0; x < choice; x++)
		{
			A[x] = input.nextInt();
		}
		// For loop which asks for user input to match the size of the array
		//rPopulate(A);
		// calls populate method to randomly populate array of user inputed size if you don't want user input
		System.out.println("Before Sorting: " + Arrays.toString(A));
		// prints out randomly populated array in original ordering before sorting
		A = merge_sort(A);
		// calls the merge sort method from below to sort array
		System.out.println("After Sorting: " + Arrays.toString(A));
		// prints out sorted array
int_input.close();
input.close();
// closes scanner utility so more data may be entered by user
	} // closes method

	public static int[] merge_sort(int[] B) {
		// dividing method
		if (B.length <= 1) {
			return B; // array is single element & is sorted
		} // close if
		int midpoint = B.length / 2; // Divides array in half until it reaches a
										// single element that's sorted
		int[] left = new int[midpoint]; // creates 2 subarray - 1 left & 1 right
		int[] right; // trickier
		if (B.length % 2 == 0) // checking if length of array is even # or not,
								// if
								// it is, midpoint can be used for
		// right as well as left, if not, right midpoint = midpoint +1
		{
			right = new int[midpoint];
		} // closes if
		else {
			right = new int[midpoint + 1]; // if odd number, makes right array 1
											// element larger
		} // closes else
		int[] result = new int[B.length]; // stores merge result

		for (int i = 0; i < midpoint; i++) // left hand side
		{ // populates left array with elements which existed from 0 to midpoint
			left[i] = B[i];
		} // closes for
		int x = 0;
		for (int j = midpoint; j < B.length; j++) // right hand side
		{ // populates right array - have to start at "x" as it's after the
			// midpoint, not zero like with left - this time it's less than the
			// whole array (.length)
			if (x < right.length) {
				right[x] = B[j];
				x++;
			} // closes if
		} // closes for

		left = merge_sort(left); 
		// recursion to get to 1 element
		right = merge_sort(right); 
		// keeps dividing the array

		result = merge(left, right);

		return result;
	}// closes method

	public static int[] merge(int[] left, int[] right) {
// merging method
		int lengthResult = left.length + right.length; 
		// result = totals of both arrays combined
		int[] result = new int[lengthResult];
		// result is an int = to size of result
		int indexL = 0; // elements on the left
		int indexR = 0; // elements on the right
		int indexRes = 0; // elements in the result

		while (indexL < left.length || indexR < right.length) {
			if (indexL < left.length && indexR < right.length)
			// check to make sure that there are elements on
			// both sides of the array array
			{
				if (left[indexL] <= right[indexR]) {
					// if left is less than right, put left first, then update index
					result[indexRes] = left[indexL];
					indexL++;
					indexRes++;
				} // closes if
				else {
					result[indexRes] = right[indexR];
					// if right is bigger, put right first, then update index
					indexR++;
					indexRes++;
				} // closes else
			} // closes if
			else if (indexL < left.length) {
				result[indexRes] = left[indexL];
				// if left index is less than the size, keep going
				indexL++;
				indexRes++;
			} // closes else if
			else if (indexR < right.length) {
				// if right index is less than the size, keep going
				result[indexRes] = right[indexR];
				indexR++;
				indexRes++;
			} // closes else if
		} // closes while
		return result; // must return sorted array
	} // closes method

	public static int[] rPopulate(int[] B) {
		for (int z = 0; z < B.length; z++) {
			B[z] = (int) (Math.random() * 100);
		}
		return B; // returns method to randomly populate the generated array
	} // closes method
} // closes class
