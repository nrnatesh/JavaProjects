//--------------------------------------------------------------
//-- Name:       Naveen Natesh
//-- Class:      CIS-1400 Summer 2015
//-- Assignment: Homework 5a
//-- File:       Homework_5a.java
//-- Purpose:    Distance calculator and display
//--------------------------------------------------------------

package assignments;

import global.Cod;

public class Homework_5a 
{
	public static void main(String[] args) 
	{
		int COUNT_FROM; // variable for start of counter
		int COUNT_TO; // variable for end of counter
		int speed; // variable for speed
		int hours; // variable for time
		int distance; // variable for distance
		
		// prompts user to enter speed in MPH
		System.out.print("Speed of train in MPH: ");
		speed = Cod.nextInt();
		
		// prompts user to enter number of hours travelled
		System.out.print("Number of hours travelled: ");
		hours = Cod.nextInt();
		
		// hours inputed is beginning of counter; easy to read
		COUNT_TO = hours;
		
		// blank lines
		System.out.println();
		System.out.println();
		
		// displaying "Hour" and "Distance
		System.out.println("Hour" + "    " + "Distance");
		System.out.println("----" + "    " + "--------");
	
		// initial value of counter
		COUNT_FROM = 1;
		
		do // sets up loop to run when COUNT_FROM <= COUNT_TO
		{
			if(hours != 0) // if hours does not equal 0
			{
				distance = speed * COUNT_FROM; // calculates distance
				
				// displays hour and distance
				System.out.println(COUNT_FROM + "       " + distance);
				
				// 1 is added to counter
				COUNT_FROM += 1;
			} // if(hours != 0)
			
		} while(COUNT_FROM <= COUNT_TO); //keeps iterating loop until 
		// certain conditions are met
		
		
		
	} // main()

} // class
