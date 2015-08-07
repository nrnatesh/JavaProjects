//--------------------------------------------------------------
//-- Name:       Naveen Natesh
//-- Class:      CIS-1400 Summer 2015
//-- Assignment: Homework 5b
//-- File:       Homework_05b.java
//-- Purpose:    Factorial calculator
//--------------------------------------------------------------

package assignments;

import global.Cod;

public class Homework_05b 
{
	public static void main(String[] args) 
	{
		int num; // variable for number to be inputed
		// prompts user for an integer
		System.out.print("Enter an integer: ");
		num = Cod.nextInt();
		
		int counter = 1; // establishes counter initial value (1)
		int total = 1; // establishes total initial value (1)
		// displays the number and "! = " for formatting
		System.out.print(num + "! = ");
		
		// while counter is less than or equal to num
		while(counter <= num)
		{
		
			System.out.print(counter); // displays counter (calculation)
			total = counter * total; // calculates factorial 
			counter += 1; // establishes the counter as increasing by one
			
			// if counter is less than or equal to num	
			if(counter <= num)
				System.out.print(" x "); // displays "x"
			
		} // while()
		
		System.out.println(" = " + total); // displays the answer
		
	
		
	} // main()

} // class
