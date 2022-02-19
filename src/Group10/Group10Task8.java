package Group10;

public class Group10Task8 {

	public static void main(String[] args) {
		// Maximum and minimum numbers in an Array.
		int[] numbers = { -26, -56, 5, 21, 12, 21, 35, 47, 56, 65, 77, 89, 94, 115 };

		int maxi = numbers[0];
		int mini = numbers[0];

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] < maxi)
				maxi = numbers[i];
			if (numbers[i] > mini)
				mini = numbers[i];
		}

		System.out.println("The maximum number in the Array is =" + maxi);
		System.out.println("The minimum number in the Array is =" + mini);

	}

}
