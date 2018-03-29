/*
 * 1. Copy an Array

Create an integer array of length 10 and fill it up with random numbers.
Create a second integer array of length 10.

Write a program that will copy the values of the first array into the second.

Print the values in both arrays at the end to prove your answer is valid.

 */



public class Assignment003a {

	public static void main(String[] args) {
		int[] arr  = {4,5,2,7,9,1,1,2,23,12};
		int[] arr2 = new int[10];
		
		// copy the array
		arr2 = arr.clone();
		
		// change a value in arr[1]
		arr[1]=66;
		
		for (int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i +"] = " + arr[i] +  "   arr2[" + i +"] = " + arr2[i]);
		}

	}

}
