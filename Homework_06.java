//--------------------------------------------------------------
//-- Name:       Naveen Natesh
//-- Class:      CIS-1400 Summer 2015
//-- Assignment: Homework 6
//-- File:       Homework_06.java
//-- Purpose:    Hypotenuse Calculator
//--------------------------------------------------------------

package assignments;

import global.Cod;

public class Homework_06 
{
	public static void main(String[] args) 
	{
		
		
		double length1; // variable for length of leg #1
		double length2; // variable for length of leg #2
		
		length1 = 1; // initial value
		
		// keeps iterating until length1 equals 0
		do
		{
			
			// Prompts user for length of leg #1
			System.out.print("Enter the length of leg #1 < or 0 to exit > : ");
			length1 = Cod.nextDouble();
			
			// if length1 does not equal 0
			if(length1 != 0)
			{
				// Prompts user for length of leg #2
				System.out.print("Enter the length of leg #2: ");
				length2 = Cod.nextDouble();
				
				// Displays length of hypotenuse through function calling
				System.out.println();
				System.out.println("The length of hypotenuse is " + hypotenuseLength(length1, length2));
				System.out.println();
			} // end if
		
		} while(length1 != 0); // ends iteration once length1 equals 0
		
		
	} // main()
	
	
	// Calculates length of hypotenuse and returns the result
	public static double hypotenuseLength(double leg1, double leg2)
	{
		double hypotenuse = (Math.sqrt(Math.pow(leg1,2) + Math.pow(leg2,2))); // calculates length of hypotenuse
		hypotenuse = Math.round(hypotenuse * 1000.0) / 1000.0; // rounds result to the second decimal place
		return hypotenuse; // returns value of hypotenuse
		
	} // hypotenuseLength()

} // class

