package sorting;

public class MergeSort1 {
	/**
	 * perform a merge sort on the data in c
	 * 
	 * @param c
	 *            c! = null, all elements of c are the same data type
	 */

	public static void mergeSort(Comparable[] c) {
		Comparable[] temp = new Comparable[c.length];
		sort(c, temp, 0, c.length - 1);
	}

	private static void sort(Comparable[] list, Comparable[] temp, int low, int high) {
		if (low < high) {
			int centre = (low + high) / 2;
			sort(list, temp, low, centre);
			sort(list, temp, centre + 1, high);
			merge(list, temp, low, centre + 1, high);
		}
	}

	private static void merge(Comparable[] list, Comparable[] temp, int leftPos, int rightPos, int rightEnd) {
		int leftEnd = rightPos - 1;
		int tempPos = leftPos;
		int numElements = rightEnd - leftPos + 1;
		// main loop
		while (leftPos <= leftEnd && rightPos <= rightEnd) {
			if (list[leftPos].compareTo(list[rightPos]) <= 0) {
				temp[tempPos] = list[leftPos];
				leftPos++;
			} else {
				temp[tempPos] = list[rightPos];
				rightPos++;
			}
			tempPos++;
		}
		// copy rest of left half
		while (leftPos <= leftEnd) {
			temp[tempPos] = list[leftPos];
			tempPos++;
			leftPos++;
		}
		// copy rest of right half
		while (rightPos <= rightEnd) {
			temp[tempPos] = list[rightPos];
			tempPos++;
			rightPos++;
		}
		// copy temp back into list
		for (int i = 0; i < numElements; i++, rightEnd--)
			list[rightEnd] = temp[rightEnd];
	}
}
