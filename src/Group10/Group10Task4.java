package Group10;

public class Group10Task4 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integers. Develop a program which will calculate the sum
		 * of even and odd numbers for that array.
		 */

		int[][] twoDArray = { { 1, 2, 3, 4, 5, 6 }, { 6, 7, 8, 9, 1, 2 } };

		int evenSum = 0;
		int oddSum = 0;

		for (int i = 0; i < twoDArray.length; i++)
			for (int j = 0; j < twoDArray[i].length; j++)
				if (twoDArray[i][j] % 2 == 0)
					evenSum += twoDArray[i][j];
				else {
					oddSum += twoDArray[i][j];
				}
		System.out.println("Even index positions sum: " + evenSum);
		System.out.println("Odd index positions sum: " + oddSum);
	}

}
