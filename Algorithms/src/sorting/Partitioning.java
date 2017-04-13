package sorting;

import java.util.Arrays;
// bringing in the java utility to use arrays

public class Partitioning {
	 	// 1st you must partition array data

	 	private static int[] Array1;
	 	// creates a new int array named Array1
	 	private static int array1Size;
	 	// creates a new int which will state how large Array1 will be

	 	public static int[] getArray1() {
			return Array1;
		}

		public static void setArray1(int[] array1) {
			Array1 = array1;
		}

		public static void main(String[] args) {
	 		
	 		Partitioning partitioningArray = new Partitioning(10);
	 		
	 		partitioningArray.rPopulate1();
	 		
	 		System.out.println("Original Array is: " + System.lineSeparator() + Arrays.toString(Partitioning.getArray1()));

	 		partitioningArray.partitioningArray(35);
	 		
	 		System.out.println("Partitioned array is: " + System.lineSeparator() + Arrays.toString(Partitioning.getArray1()));

	 		
	 	} // closes main method

	 	public void partitioningArray(int pivot) {
	 		int leftPointer = -1;
	 		int rightPointer = array1Size;

	 		while (true) {
	 			while (leftPointer < (array1Size - 1) && getArray1()[++leftPointer] < pivot)
	 				; // iterates through each value by starting at -1 and incrementing forward 1
	 			// for every value in the left index that is less than pivot, move past
	 			System.out.println(getArray1()[leftPointer] + " in index " + leftPointer + " is larger than pivot value " + pivot); 
	 			// prints out each value that is skipped over as being less than pivot
	 			while (rightPointer > 0 && getArray1()[--rightPointer] > pivot)
	 				; // iterates through each value by starting at end of array and decrementing by 1
	 			// for every value in the right index that is greater than pivot, move past
	 			System.out.println(getArray1()[rightPointer] + " in index " + rightPointer + " is less than pivot value " + pivot); 
	 			// prints out each value that is skipped over as being larger than pivot
	 			
	 			if(leftPointer >= rightPointer) 
	 			{ // if the value in the left pointer equals or exceeds the right value, while above will break
	 				break;
	 			} // closes if
	 			else 
	 			{
	 				swapValues(leftPointer, rightPointer);
	 				
	 				System.out.println(getArray1()[leftPointer] + " was swapped for " + getArray1()[rightPointer]);
	 			} // closes else
	 			
	 		} // closes first while
	 		
	 	
	 	} // closes partitioningArray method
	 	
	 	Partitioning(int newArraySize)
	 	{
	 		array1Size = newArraySize;
	 		setArray1(new int[array1Size]);
	 		rPopulate1();
	 	}
	 	
	 	public void swapValues(int leftPointer, int rightPointer) 
	 	{
	 			int temp = getArray1()[leftPointer];
	 			getArray1()[leftPointer] = getArray1()[rightPointer];
	 			getArray1()[rightPointer] = temp;
	 		}
	 	
	 	public void rPopulate1() {
	 		for (int z = 0; z < array1Size; z++) {
	 			getArray1()[z] = (int) (Math.random() * 100);
	 		}
	 		// returns method to randomly populate the generated array
	 	} // closes method

	 } // closes class
