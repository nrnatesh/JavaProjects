//--------------------------------------------------------------
//-- Name:       Naveen Natesh
//-- Class:      CIS-1400 Summer 2015
//-- Assignment: Homework 8
//-- File:       Homework_08.java
//-- Purpose:    Company Database Indexer
//--------------------------------------------------------------

package assignments;

import global.Cod;

public class Homework_08 
{
	public static void main(String[] args) 
	{
		String[] names = new String[10]; // array for names
		String[] numbers = new String[10]; // array for phone numbers
		String[] emails = new String[10]; // array for email addresses
		String searchValue; // String variable for search value
		
		// loop that prompts user for info and inputs into respective array while i < names.length
		for(int i = 0; i < names.length; i++)
		{
			// Prompts user for name of employee #__
			System.out.print("Enter name #" + (i+1) + ": ");
			names[i] = Cod.next();
			
			// Prompts user for phone number of employee #__
			System.out.print("Enter phone number #" + (i+1) + ": ");
			numbers[i] = Cod.next();
			
			// Prompts user for email address of employee #__
			System.out.print("Enter email address #" + (i+1) + ": ");
			emails[i] = Cod.next();
			
			System.out.println(); // blank line
			
		} // for()
		
		// loop that will ask for search value and find value in arrays
		do
		{
			// Prompts user for search value
			System.out.println();
			System.out.print("Enter search value: ");
			searchValue = Cod.next();
			
			// if length of searchValue is not 0
			if(searchValue.length() != 0)
			{
				// Displays "Name", "Phone", "Email" with formatting
				System.out.println();
				System.out.print(String.format("%-20s", "Name"));
				System.out.print(String.format("%-20s", "Phone"));
				System.out.println(String.format("%-20s", "Email"));
				
				// Displays "-----" with formatting
				System.out.print(String.format("%-20s", "-----"));
				System.out.print(String.format("%-20s", "-----"));
				System.out.println(String.format("%-20s", "-----"));
				
				// loop that searches arrays for searchValue
				for(int i = 0; i < names.length; i++)
				{	
					// if search value is inside of the array "names"
					if(names[i].indexOf(searchValue) != -1)
					{
						// Displays information of respective employee(s)
						System.out.print(String.format("%-20s", names[i]));
						System.out.print(String.format("%-20s", numbers[i]));
						System.out.println(String.format("%-20s", emails[i]));
						
					} // if(names[i].indexOf(searchValue) != -1)
					
				} // for()
				
			} // if(searchValue.length() != 0)
			
		} while(searchValue.length() != 0); // keeps iterating while searchValue.length() != 0
		
	} // main()

} // class



