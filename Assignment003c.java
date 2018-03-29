/*
 * 3. Largest Value

Create an integer array of length 10 and fill it up with random numbers.
Print the values in the array for the user to see.

Locate the largest number in the array and print out that number and its position.

 */

public class Assignment003c {
	
	public static void main(String[] args) {
		int[] arr  = {4,51,1,7,9,1,32,2,23,12};
		int[] j = arr;
		int maxIndex=0;
		
		// display the array
		for (int i=0; i<arr.length; i++) {
			System.out.println("Position [" + i +"] = " + arr[i]);
			if (arr[i]>j[maxIndex]) maxIndex=i;
		}
		
		// here!!!!!!!!!!!!!
		
		// search the array
		// will search to the end of the array, to search for multiple occurences of the same number 
		System.out.println("Largest number in the array and its position is... ");	
		System.out.println("Position [" + maxIndex +"] = " + j[maxIndex]);
				
	}
}

