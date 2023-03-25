// Java Program to print pattern Zero-One triangle
import java.util.*;
public class ZeroOnePyramid {
	// Function to demonstrate pattern
	public static void main(String args[])
	{
		int i, j,n=6;
		//outer loop to handle number of rows
		for (i = 1; i <= n; i++) {
			//inner loop to handle number of columns
			for (j = 1; j <= i; j++) {
				// if the sum of (i+j) is even then print 1
				if ((i + j) % 2 == 0) {
					System.out.print(1 + " ");
				}
				// otherwise print 0
				else {
					System.out.print(0 + " ");
				}
			}

			//printing new line for each row
			System.out.println();
		}
	}
}
