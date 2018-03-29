/*
 * 
4. How many times

Create an integer array of length 10 and fill it up with random numbers.
Print the values in the array for the user to see.

Ask the user for a value they'd like you to search for.
Search through the array.
Tell the user how many times that value appears in the array.


 */


import java.util.Scanner;
public class Assignment003d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr  = {4,51,1,7,4,1,4,2,23,12};
		int input;
		int found=0;
		
		// display the array
		for (int i=0; i<arr.length; i++) {
			System.out.println("Position [" + i +"] = " + arr[i]);
		}
		
		// prompt the user
		System.out.println("Enter an integer value to search, the program will return "
				               + "the number of times that value appears in the array.");
		input = sc.nextInt();
		
		// search the array, count # of occurences
		for (int i : arr) if(i==input) found++;
		
		System.out.println(found +" times the entered value is found in the array");
		sc.close();
				
	}
}
