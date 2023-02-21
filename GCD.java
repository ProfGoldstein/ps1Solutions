/*
 * Problem Set 1
 * GCD.java
 * 
 * @author Ira Goldstein
 * @version Spring 2023
 * 
 * An application that uses recursion to find the 
 * greatest common divisor of two integers
 */

import java.util.*;


public class GCD {
	/**
	* A recursive method for finding greatest common divisor of
	* two integers, a and b, entered by the user
	*
	* @param a	first integer 
	* @param b	second integer
	* @returns 	the greatest common divisor of integers a and b 
	*/  
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		else {
			return gcd(b, (a % b));
		}
	}  
	
	/**
	* Main method to get input and call the gcd method.
	*
	* @param no arguments
	*/	
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
	
		int intOne = scanner.nextInt();
		int intTwo = scanner.nextInt();
		int result = gcd(intOne, intTwo);
		
		System.out.println(result);
		
	}
	
}
