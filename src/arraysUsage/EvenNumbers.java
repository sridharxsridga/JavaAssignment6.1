/*
   Problem Statement1:
   Declare an integer array of size 10. Initialize using for loop with 1 to 10, and print all even numbers from an array.
 */
package arraysUsage;

public class EvenNumbers {

	public static void main(String[] args) {
		int[] numbers = new int[10];// Declaring an int array of size 10
		int counter = 1; // int value to insert into array
		for (int init = 0; init < numbers.length; init++) {//Initialize numbers using for loop with 1 to 10
			numbers[init] = counter;
			counter++;
		}
		System.out.println("All even numbers from an array:");
		for (int value : numbers) {
			if (value % 2 == 0) {//to check for even numbers
				System.out.println(value);
			}
		}

	}

}
