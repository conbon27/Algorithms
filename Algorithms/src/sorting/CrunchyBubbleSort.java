package sorting;

import java.util.Arrays;

public class CrunchyBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayList[] = { 5, 3, 44, 22, 3333, 904, 1, 2 };
		System.out.println("\nFinal result:" + Arrays.toString(CrunchyBubbleSortMethod(arrayList)));
	} // ends method

	public static int[] CrunchyBubbleSortMethod(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				} // closes loop
			} // closes loop
			System.out.println((i + 1) + "th iteration result: " + Arrays.toString(arr));
		}
		return arr;
	}
}
