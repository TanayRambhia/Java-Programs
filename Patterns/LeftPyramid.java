// Java Program to print
// Pyramid pattern
import java.util.*;

public class LeftPyramid {
	// Function to demonstrate pattern
	public static void main(String args[])
	{
		int i, j, n=6;

		// outer loop to handle rows
		for (i = 1; i <= n; i++) {

			// inner loop to handle columns
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// printing new line for each row
			System.out.println();
		}
	}


}
