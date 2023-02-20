/*
 * Problem Set 1
 * HowLong.java
 * 
 * @author Ira Goldstein
 * @author Luke Ostrander
 * @version Spring 2023
 * 
 * An application that takes the time in seconds and converts it
 * to the number of years, days, hours, minutes, and seconds.
 * As is the case with written numbers, leading units can not
 * have a value of zero
 */

import java.util.*;


public class HowLong {

	/**
	* Main method to get the number of seconds and displays
	* the converted results
	*
	* @param no arguments
	*/	
	public static void main(String[] args) { 
		// "Time" variables
		int years;
		int days;
		int hours;
		int minutes;
		int seconds;

		// flag to determine if we have already started displaying results
		boolean priorUnit = false;
		
		// Character for plural
		String s = "s";
	
		// Create a scanner and get the user's input
		Scanner scanner = new Scanner(System.in);
		seconds = scanner.nextInt();
		
		// Calculate the number of years, days, hours, minutes, and seconds.
		// Using Luke Ostrander's explicit approach.
		years = seconds / (365 * 24 * 60 * 60);
		seconds = seconds % (365 * 24 * 60 * 60);
		days = seconds / (24 * 60 * 60);
		seconds = seconds % (24 * 60 * 60);
		hours = seconds / (60 * 60);
		seconds = seconds % (60 * 60);
		minutes = seconds / 60;
		seconds = seconds % 60;		
  
		// If not zero, print years, adjusting for single/plural
		if (years > 0) {
			priorUnit = true;
			System.out.print(years + " year");
			if (years != 1) {
				System.out.print(s);
			}
			System.out.println();
		}

		// If not zero and have previously started printing, 
		// print days, adjusting for single/plural
		if (days > 0 || priorUnit == true) {
			priorUnit = true;
			System.out.print(days + " day");
			if (days != 1) {
				System.out.print(s);
			}
			System.out.println();
		}
		
		// If not zero and have previously started printing, 
		// print hours, adjusting for single/plural
		if (hours > 0 || priorUnit == true) {
			priorUnit = true;
			System.out.print(hours + " hour");
			if (hours != 1) {
				System.out.print(s);
			}
			System.out.println();
		}		

		// If not zero and have previously started printing, 
		// print minutes, adjusting for single/plural		
		if (minutes > 0 || priorUnit == true) {
			priorUnit = true;
			System.out.print(minutes + " minute");
			if (minutes != 1) {
				System.out.print(s);
			}
			System.out.println();
		}		

		// Print seconds no matter what.  This way if the input is zero
		// we have some output.  Adjust for single/plural		
		System.out.print(seconds + " second");
		if (seconds != 1) {
			System.out.print(s);
		}
		System.out.println();
	}
	
}
