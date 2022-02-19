package Group10;

import java.util.Scanner;

public class Group10Task1 {

	public static void main(String[] args) {
		
		// 1. Create an array on int values using a scanner and calculate the sum of all
				// stored elements in that array.

				System.out.println("Enter the required size of the array ");
				Scanner scan = new Scanner(System.in);
				int numbers = scan.nextInt();
				int myArray[] = new int[numbers];
				int sum = 0;
				System.out.println("Enter the elements of the array");
				for (int i = 0; i < numbers; i++) {

					myArray[i] = scan.nextInt();
					sum = sum + myArray[i];
				}
				System.out.println("The sum of the given array is " + sum);
				scan.close();
			}
		
		
	

}
