// Java Program to print pattern
// Reverse number triangle
import java.util.*;

public class ReverseTrianglePattern {

	// Function to demonstrate pattern
	public static void main(String args[])
	{
		int i, j, n=6;
		// outer loop to handle rows
		for (i = 1; i <= n; i++) {

			// inner loop to print spaces.
			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}

			// inner loop to print value of j.
			for (j = i; j <= n; j++) {
				System.out.print(j + " ");
			}

			// printing new line for each row
			System.out.println();
		}
	}
	}
