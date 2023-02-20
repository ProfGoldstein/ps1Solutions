/*
 * Problem Set 1
 * WarmUp.java
 * 
 * @author Ira Goldstein
 * @version Spring 2023
 * 
 * An application that takes a user's input for the number of 
 * times to repeat and the text to repeat
 */

import java.util.*;


public class WarmUp {
	
	/**
	* Main method to get input and loop the output.
	*
	* @param no arguments
	*/
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		
		// Get the number of times to repeat
		int repeatCount = scanner.nextInt();
		
		// Since we asked for a number, we need to get rid of the CRLF
		scanner.nextLine();
		
		// Get the text to repeat
		String ourText = scanner.nextLine();
		
		//  Print ourText repeatCount number of times
		for(int i = 0; i < repeatCount; i++){
			System.out.println(ourText);
		}
	}
}
