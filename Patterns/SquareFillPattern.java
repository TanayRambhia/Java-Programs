// Java Program to print
// Square fill pattern
import java.util.*;

public class SquareFillPattern {

	// Function to demonstrate pattern
	public static void main(String args[])
	{
		int i, j, n=4;

		// outer loop to handle rows
		for (i = 0; i <= n; i++) {

			// inner loop to handle columns
			for (j = 0; j <= n; j++) {
				System.out.print("*");
			}

			// printing new line for each row
			System.out.println();
		}
	}
}
