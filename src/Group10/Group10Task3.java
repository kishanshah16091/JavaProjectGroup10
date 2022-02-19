package Group10;

public class Group10Task3 {

	public static void main(String[] args) {
		// 3. Create a 2D array or integer type
		// where you will store odd and even numbers.
		// Develop a program which will identify/print the even numbers only.

		int[][] twoDArray = { { 5, 6, 7, 8, 9 }, // index 0
				{ 15, 16, 17, 18, 19 }, // index 1
				{ 25, 26, 27, 28, 29 } // index 2

		};

		for (int[] eachArray : twoDArray) {

			for (int eachElementOfArray : eachArray) {

				if (eachElementOfArray % 2 == 0)

					System.out.println(eachElementOfArray + " ");

			}
		}

	}

}
