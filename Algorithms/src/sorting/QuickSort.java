package sorting;

import java.util.Arrays;
// bringing in the java utility to use arrays
import java.util.Scanner;
// bringing in the scanner utility to allow user input

public class QuickSort {

	// 1st you must partition array data

	private static int[] Array1;
	// creates a new int array named Array1
	private static int array1Size;
	// creates a new int which will state how large Array1 will be

	public static void main(String[] args) {

		System.out.println("Please enter size of array you wish to sort: ");
		Scanner int_input = new Scanner(System.in);
		int choice = int_input.nextInt();
		// requests user input for size of array to be sorted by quick sort
		QuickSort quick = new QuickSort(choice);
		// calls new instance of method QuickSort which will partition the array
		// via a pivot
		int_input.close();
		// closes scanner to prevent further user input
		// quick.quickSort((int)(Math.random() * 10), (int)(Math.random() *10));
		quick.quickSort(0, 2);
		// selects initial left & right elements to be checked against pivot -
		// position 1 & 3 in this case
		System.out.println("Sorted array is: " + System.lineSeparator() + Arrays.toString(QuickSort.Array1));
		// prints sorted array
	} // closes main method

	QuickSort(int newArray1Size) {
		array1Size = newArray1Size;
		Array1 = new int[array1Size];
		// declares that Array1 is an int of size array1Size
		// rPopulate1(Array1);
		// calls populate method to randomly populate array of user inputed size
		// instead of user input
		System.out.println("Please enter " + array1Size + " numbers to populate array:  ");
		// Requests user to populate the array with numbers
		Scanner input = new Scanner(System.in);
		// initialises new scanner input
		for (int x = 0; x < array1Size; x++) {
			Array1[x] = input.nextInt();
		}
		// For loop which asks for user input to match the size of the array
		System.out.println("Array before Sorting: " + Arrays.toString(Array1));
		// prints out randomly populated array in original ordering before
		// sorting
		input.close();
		// closes scanner to prevent further user input
	} // closes method

	public void quickSort(int left, int right) {
		// sorting method
		if (right - left <= 0) {
			return;
		} else {
			int pivot = Array1[right];
			// assigns the int pivot to the right index of the array

			System.out.println("Value in right " + Array1[right] + " is made the pivot");
			// prints out value of the pivot location on the right

			System.out.println("left= " + left + " right = " + right + " pivot = " + pivot + " sent to be partitioned");
			// identifies elements to be partitioned and examined

			int pivotLocation = partioningArray1(left, right, pivot);
			// assigns the pivot location to being partitioned to either the
			// left or right index of the array

			System.out.println("Value in left " + Array1[left] + " is made the pivot");

			quickSort(left, pivotLocation - 1);
			quickSort(pivotLocation + 1, right);
			// recursion taking place here, calls the quick sort method to rerun
			// over until the final condition is met (above if)
			// cycles through each location to ensure it adheres to the if
			// condition, if not, runs through partitioning & sorting
		} // ends else

	} // closes quickSort method

	public int partioningArray1(int left, int right, int pivot) {
		int leftPointer = left - 1;
		int rightPointer = right;

		while (true) {
			while (Array1[++leftPointer] < pivot) {
				; // iterates through each value by starting at -1 and
			}
			// incrementing forward 1
			// for every value in the left index that is less than pivot, move
			// past
			System.out
					.println(Array1[leftPointer] + " in index " + leftPointer + " is larger than pivot value " + pivot);
			// prints out each value that is skipped over as being less than
			// pivot
			while (rightPointer > 0 && Array1[--rightPointer] > pivot) {
				; // iterates through each value by starting at end of array and
			}
			// decrementing by 1
			// for every value in the right index that is greater than pivot,
			// move past
			System.out
					.println(Array1[rightPointer] + " in index " + rightPointer + " is less than pivot value " + pivot);
			// prints out each value that is skipped over as being larger than
			// pivot

			if (leftPointer >= rightPointer) {
				// if the value in the left pointer equals or exceeds the right
				// value
				// while condition above will break & process will start again
				// as relative order confirmed
				break;
			} // closes if
			else {
				swapValues(leftPointer, rightPointer);
				// swaps the left & right pointers values when right pointer is
				// greater than left pointer
				System.out.println(Array1[leftPointer] + " was swapped for " + Array1[rightPointer]);
			} // closes else

		} // closes first while

		swapValues(leftPointer, right);
		// swap values of the left pointer with right element
		return leftPointer;
		// required return statement - knocks left pointer in to relative order
		// after swapping it with right index element.
	}

	public void swapValues(int leftPointer, int rightPointer) {
		int temp = Array1[leftPointer];
		Array1[leftPointer] = Array1[rightPointer];
		Array1[rightPointer] = temp;
	} // swap value method - uses a temporary variable to swap the values in the
		// left and right pointers.

	public static int[] rPopulate1(int[] B) {
		for (int z = 0; z < B.length; z++) {
			B[z] = (int) (Math.random() * 100);
		}
		return B; // returns method to randomly populate the generated array
	} // closes method

} // closes class
