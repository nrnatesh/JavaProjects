//--------------------------------------------------------------
//-- Name:       Naveen Natesh
//-- Class:      CIS-1400 Summer 2015
//-- Assignment: Homework 7
//-- File:       Homework_07.java
//-- Purpose:    Speeding violation tester and displayer
//--------------------------------------------------------------

package assignments;

import global.Cod;

public class Homework_07 
{
	static boolean test = false; // boolean that will keep main() running
	
	public static void main(String[] args) 
	{
		// keeps iterating while test = false
		do
		{
			int speedlimit; // variable for speed limit
			
			// Prompts user for speed limit
			System.out.print("Please enter the speed limit: ");
			speedlimit = Cod.nextInt();
			
			// while speedlimit is less than 20 or greater than 70
			while(speedlimit < 20 || speedlimit > 70)
			{
				// displays error message
				System.out.println();
				System.out.println("ERROR: Speed limit must be between 20 and 70.");
				// Prompts user to enter speed limit
				System.out.println();
				System.out.print("Please enter the speed limit: ");
				speedlimit = Cod.nextInt();
			} // while()
			
			getMph(speedlimit); // Prompts user for vehicle speed
			
		} while(test == false); // keeps iterating loop while test = false
			
		
	} // main()
	
	
	// Gets user's vehicle speed (sl = speed limit)
	public static void getMph(int sl)
	{
		int speed; // variable for speed
		
		// Prompts user for vehicle speed
		System.out.println();
		System.out.print("Please enter vehicle speed: ");
		speed = Cod.nextInt();
		
		// keeps iterating loop while speed less than or equal to speed limit or speed is greater than 200
		do
		{
			// if speed is less than speed limit
			if(speed <= sl)
			{
				// Displays error message and prompts user for vehicle speed again
				System.out.println();
				System.out.println("ERROR: Vehicle speed must be greater than speed limit.");
				// Prompts user to enter vehicle speed
				System.out.println();
				System.out.print("Please enter vehicle speed: ");
				speed = Cod.nextInt();
			}
			// if speed is greater than 200
			if(speed >= 200)
			{
				// Displays error message and prompts user for vehicle speed again
				System.out.println();
				System.out.println("ERROR: Vehicle speed must be less than 200.");
				// Prompts user to enter vehicle speed
				System.out.println();
				System.out.print("Please enter vehicle speed: ");
				speed = Cod.nextInt();
			}
		} while(speed <= sl || speed >= 200); // iterates until speed > sl or speed is less than 200
		
		checkFine(speed, sl); // Checks what kind of penalty required and displays it
		
	} // getMph()
	

	// Checks what kind of penalty required and displays it
	public static void checkFine(int mph, int limit)
	{
		int penalty = mph - limit; // variable and calculation for speed over speed limit
		// if penalty is greater than or equal to 1 and less than or equal to 10
		if(penalty >= 1 && penalty <= 10)
		{	
			// Displays fault and appropriate fine
			System.out.println();
			System.out.println("Exceeded speed limit by 1-10 MPH. $50 fine.");
		}
		// if penalty is greater than or equal to 11 and less than or equal to 15
		else if(penalty >= 11 && penalty <= 15)
		{	
			// Displays fault and appropriate fine
			System.out.println();
			System.out.println("Exceeded speed limit by 11-15 MPH. $75 fine.");
		}
		// if penalty is greater than or equal to 16 and less than or equal to 20
		else if(penalty >= 16 && penalty <= 20)
		{	
			// Displays fault and appropriate fine
			System.out.println();
			System.out.println("Exceeded speed limit by 16-20 MPH. $150 fine.");
		}
		// if penalty is greater than or equal to 21
		else if(penalty >= 21)
		{	
			// Displays fault and appropriate fine
			System.out.println();
			System.out.println("Exceeded speed limit by 21+ MPH. $300 fine.");
		}
		
		test = true; // changes value of test to true in order to end main() do while loop
		
	} // checkFine()

} // class
