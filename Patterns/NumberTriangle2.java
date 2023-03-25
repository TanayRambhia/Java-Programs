// Java Program to print pattern
// Number-changing pyramid
import java.util.*;

// Java code for printing pattern
public class NumberTriangle2 {
	// Function to demonstrate pattern
	public static void main(String args[])	{
		int i, j,n=6;
		int num = 1;
		// outer loop to handle number of rows
		for (i = 1; i <= n; i++) {
			// inner loop to handle number of columns
			for (j = 1; j <= i; j++) {
				// printing value of num in each iteration.
				System.out.print(num + " ");
				// increasing the value of num.
				num++;
			}

			// printing new line for each row
			System.out.println();
		}
	}
}
