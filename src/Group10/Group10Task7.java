package Group10;

public class Group10Task7 {

	public static void main(String[] args) {
		// ( Imran ) Write a Java Program to print the first 10 numbers of Fibonacci
		// series.

		int a = 0;
		int b = 1;
		int c;

		for (int i = 1; i <= 10; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;// swap method
			b = c;// swap method
		}

	}

}
