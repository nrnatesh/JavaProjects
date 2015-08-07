//--------------------------------------------------------------
//-- Name:       Naveen Natesh
//-- Class:      CIS-1400 Summer 2015
//-- Assignment: Homework 4
//-- File:       Homework_04.java
//-- Purpose:    Time converter
//--------------------------------------------------------------

package assignments;

import global.Cod;

public class Homework_04 
{
	public static void main(String[] args) 
	{
		double seconds; // variable for seconds
		
		// prompts user for number of seconds
		System.out.print("Enter the number of seconds: ");
		seconds = Cod.nextDouble();
		
		// variables for minutes, hours, days (calculations)
		double minutes = seconds / 60;
		double hours = seconds / 3600;
		double days = seconds / 86400;
		
		// if seconds is greater than or equal to 60 and less than 3600
		if(seconds >= 60 && seconds < 3600)
		{
			
			// displays how many minutes
			System.out.print(seconds + " seconds is equal to ");
			System.out.println( + minutes + " minutes.");
		}
		// if seconds is greater than or equal to 3600 and less than 86400
		else if(seconds >= 3600 && seconds < 86400)
		{
			
			// displays how many minutes
			System.out.print(seconds + " seconds is equal to ");
			System.out.println( + minutes + " minutes.");
			
			// displays how many hours
			System.out.print(seconds + " seconds is equal to ");
			System.out.println( + hours + " hours.");
			
		}
		// if seconds is greater than or equal to 86400
		else if(seconds >= 86400)
		{
			
			// displays how many minutes
			System.out.print(seconds + " seconds is equal to ");
			System.out.println( + minutes + " minutes.");
			
			// displays how many hours
			System.out.print(seconds + " seconds is equal to ");
			System.out.println( + hours + " hours.");
			
			// displays how many days
			System.out.print(seconds + " seconds is equal to ");
			System.out.println( + days + " days.");
		} // else if(seconds >= 86400
		
	} // main()

} // class
