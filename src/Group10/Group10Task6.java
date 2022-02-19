package Group10;

import java.util.Scanner;

public class Group10Task6 {

	public static void main(String[] args) {
		
		// Write a java program to check whether a given number is prime or not?


				int num, b, c;
				Scanner s = new Scanner(System.in);
				System.out.println("Enter A Number");
				num = s.nextInt();
				b = 1;
				c = 0;
				while (b <= num) {
					if ((num % b) == 0)
						c = c + 1;
					b++;
				}
				if (c == 2)
					System.out.println(num + " is a prime number");
				else
					System.out.println(num + " is not a prime number");

			s.close();
	}

}
