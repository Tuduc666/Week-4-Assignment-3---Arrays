/*
 * 5. Comma separated values

Ask the user to input multiple words separated by commas (,)

Put those words into a String array, and print out that String array 
for the user to see.

 */
import java.util.Scanner;
public class Assignment003e {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String input;
		String[] inputArr = new String[100];
		
		// prompt the user
		System.out.println("Enter multiple words separated by commas");
		
		input = sc.nextLine();
		inputArr = input.split(",");
		for (String i : inputArr)  System.out.println(i);
			
		sc.close();
	}
}
