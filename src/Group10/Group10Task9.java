package Group10;

public class Group10Task9 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in array.

		int largest = 0;
		int secondL = 0;
		int[] arr = { 9, 88, 1, 65, 47 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondL = largest;
				largest = arr[i];
			} else if (arr[i] > secondL) {
				secondL = arr[i];
			}
		}
		System.out.println("Second largest number is " + secondL);

	}

}
