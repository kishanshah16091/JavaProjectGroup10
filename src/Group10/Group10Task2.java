package Group10;

public class Group10Task2 {

	public static void main(String[] args) {
		// (Gulnar ) Create a 2D array of integer values. Print the sum of all numbers.

		int[][] a = { { 1, 1, 2 }, { 3, 1, 2 }, { 3, 5, 3 }, { 0, 1, 2 } };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}
			// System.out.println(sum);
			// sum=0;

		}
		System.out.println(sum);
		sum = 0;

	}

}
