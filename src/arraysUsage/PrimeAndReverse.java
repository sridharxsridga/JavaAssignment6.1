/*
 *	Problem Statement: Declare and initialize an integer array of size 10.
	Fill it with only prime numbers. (step-1) Create another integer array of size
	10 and copy the values of first array into second array in the reverse order
	and print them. (step-2)
 * 
 */


package arraysUsage;

public class PrimeAndReverse {

	static int increment = 0;
	static int number = 1;
	static boolean counter;

	public static void main(String[] args) {
		int[] primeArrays = new int[10];  //Declaring an integer array of size 10 which holds only prime values
		System.out.println("Prime Numbers in first array:");
		while (increment != 10) {// continue till 10 values are added to array
			counter = true; 
			number++;// each time number is incremented and checked whether this number is prime or not , if it is prime , this will be added to the primeArrays
			for (int init = 2; init < number; init++) { //prime number is divisible by 1 and its own number, if number is divisible by another number then the number is not a prime number
				if (number % init == 0) {
					counter = false; // If number is  divisible by other numbers , making counter false or else true
				}
			}

			if (counter == true) {// checking  when number is not divisible by other numbers , 
				primeArrays[increment] = number; //inserting number to primeArray.
				increment++; //incrementing the index position so that number can be inserted into next position
				System.out.println(number);
				
			}

		}
		
		
		int[] reverseCopyPrimeArrays = new int[10]; //Declaring another array to store the reverse order of prime values stored in primeArrays array
		int counter=0; //To increment the index of primeArrays
		for(int value=(reverseCopyPrimeArrays.length -1); value >= 0;value--){ //Starting storing from the last position of the array
			
			reverseCopyPrimeArrays[value]=primeArrays[counter];
			counter++;
		}
		System.out.println("Prime numbers in reverse order from second array:");
		for(int values: reverseCopyPrimeArrays){ //Printing the values stored in reverseCopyPrimeArrays
			System.out.println(values);
		}
		
		
		
		
		
		
	}
	
}
