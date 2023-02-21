/*
 * Problem Set 1
 * LoopTheLoop.java
 * 
 * @author Ira Goldstein
 * @version Spring 2023
 * 
 * An application that prints a multiplication table
 */

import java.util.*;


public class LoopTheLoop {
	static final String DASHES = "-------";

	/**
	* Main method to get input and create the multiplication table.
	*
	* @param no arguments
	*/
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		int low = scanner.nextInt();	// The starting number
		int high = scanner.nextInt();	// The ending number

		// Switch the two numbers if high is smaller than low
		if (high < low) {
			int temp = low;
			low = high;
			high = temp;
		}
		
		// Print the top line
		System.out.print("	X");
		for (int i = low; i <= high; i++) {
			System.out.printf("%7d", i);
		}
		System.out.println();
		
		// Print the dashes between the top line and the body
		System.out.print("-----");
		for (int i = low; i <= high; i++) {
			System.out.print(DASHES);
		}
		System.out.println();
		
		// Nested loop to print the left column and the body
		for (int i = low; i <= high; i++) {
			System.out.printf("%5d", i);
			for (int j = low; j <= high; j++){
				System.out.printf("%7d", i*j);
			}	
			System.out.println();
		}
	}
	
}
