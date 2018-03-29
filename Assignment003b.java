/*
 * 2. Find a value in an Array

Create an integer array of length 10 and fill it up with random numbers.
Print the values in the array for the user to see.

Ask the user for a value they'd like you to search for.
Search through the array.
If the value is in the array, tell them which position you found.  (ie. Position [0])

It's okay if the program prints the message more than once.


 */
import java.util.Scanner;
public class Assignment003b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr  = {4,51,1,7,9,1,32,2,23,12};
		int input;
		boolean notFound=true;
		
		// display the array
		for (int i=0; i<arr.length; i++) {
			System.out.println("Position [" + i +"] = " + arr[i]);
		}
		
		// prompt the user
		System.out.println("Enter an integer value to search, the program will return "
				               + "the position of that value in the array.");
		input = sc.nextInt();
		
		// search the array
		// will search to the end of the array, to search for multiple occurences of the same number 
		for (int i=0; i<arr.length; i++) {
			if(arr[i]==input) {
			System.out.println("Position [" + i +"] = " + arr[i]);
			notFound=false;
			}
		}
		
		if(notFound) System.out.println("Value entered is not found in the array");
				
	}
}
