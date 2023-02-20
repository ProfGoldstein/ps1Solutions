/*
 * Problem Set 1
 * UbbiDubbi.java
 * 
 * @author Ira Goldstein
 * @version Spring 2023
 * 
 * An application that converts an input string using the
 * rules of UbbiDubbi. See https://en.wikipedia.org/wiki/Ubbi_dubbi
 */

import java.util.*;


public class UbbiDubbi {
	// A string containing the upper and lower English vowels
	static final String VOWELS = "aeiouAEIOU";

	/**
	* Main method to get the input string, add "ub" as appropriate
	* and output the results
	*
	* @param no arguments
	*/ 
	public static void main(String[] args) { 
		// Create a scanner and get the user's text
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		// Use StringBuilder to create a mutable sequence of characters.
		StringBuilder output = new StringBuilder();
		
		// Initialize flag to assume we do not have a vowel
		boolean hasVowel = false;
		
		// Iterate over each of the characters in the input string
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			// Is the current character is in the list of VOWELS
			if ( VOWELS.indexOf(c) != -1 ) {
				// Add "ub" if we have the first vowel in a row
				if ( !hasVowel) {
					output.append( "ub" );
					hasVowel = true;
				}
			}
			// Set the flag to indicate we do not have a vowel
			else {
				hasVowel = false;
			} 
			
			// Add the current character to the output
			output.append(c);
		}
		
		// Print the results
		System.out.println(output);
	}
}
 