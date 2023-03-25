// Java Program to print pattern
// Palindrome triangle
import java.util.*;

public class PalindromePyramid {
	// Function to demonstrate pattern
	public static void main(String args[])
	{
		int i, j, n=6;

		// outer loop to handle number of rows
		for (i = 1; i <= n; i++) {
			// inner loop to print the spaces
			for (j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}

			// inner loop to print the first part
			for (j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}

			// inner loop to print the second part
			for (j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}

			// printing new line for each row
			System.out.println();
		}
	}
}
