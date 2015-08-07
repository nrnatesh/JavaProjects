//--------------------------------------------------------------
//-- Name:       Naveen Natesh
//-- Class:      CIS-1400 Summer 2015
//-- Assignment: Homework 9
//-- File:       Homework_09.java
//-- Purpose:    Sorting Array
//--------------------------------------------------------------

package assignments;

import global.Cod;

public class Homework_09 
{
	public static void main(String[] args) 
	{
		String[] names = new String[20]; // array of size 20 to hold names
		System.out.println("Please enter 20 names:"); // prompting user for 20 names
		
		// inputs each entry into names[i]
		for(int i = 0; i < names.length; i++)
		{
			// inputs each entry into names[i]
			System.out.println((i+1) + ": ");
			names[i] = Cod.next();
		}
		
		int maxElement; // marks last element to compare
		int index; // index of element
		String temp; // temporary variable for swapping
		
		// runs through loop as long as maxElement >= 0
		for(maxElement = names.length - 1; maxElement >= 0; maxElement--)
		{
			// runs through loop as long as index <= maxElement
			for(index = 0; index <= maxElement - 1; index++)
			{
				// if index is greater than the next index, swap the two.
				if(names[index].compareTo(names[index+1]) > 0)
				{
					temp = names[index]; // temp variable storage
					names[index] = names[index+1]; // swapping
					names[index+1] = temp; // swapping
				} // if(names[index]...)
				
			} // for(index = 0...)
			
		} // for(maxElement = names.length - 1...)
		
		// displays "The sorted names are:"
		System.out.println("The sorted names are:");
		
		// displays sorted names in array
		for(int i = 0; i < names.length; i++)
		{
			System.out.println(names[i]); // displays names[i]
		}
		
// BUBBLE SORT
		
// --------------------------------------------------------BINARY SEARCH
		
		String value; // variable for "value" to be inputted
		
		// Binary Search occurs here
		do
		{
			// Prompts user to enter a search value
			System.out.print("Enter a name to search for <or ENTER to exit>: ");
			value = Cod.next();
			
			// if value.length() != 0
			if(value.length() != 0)
			{
				int first; // first array element
				int last; // last array element
				int middle; // middle array element
				int position; // position of search value
				boolean found; // flag variable
				int counter = 0; // counter for array lookups
				
				first = 0; // initialization of first
				last = names.length - 1; // initial value
				position = -1; // initial value
				found = false; // initial value
				
				// searches array for value
				while(!found && first <= last)
				{
					middle = (first+last) / 2; // calculates midpoint
					
					// if midpoint equals the search value
					if(names[middle].equals(value))
					{
						found = true; // flag is set to true
						position = middle; // position of value is middle
					}
					// else if value is in lower half
					else if(names[middle].compareTo(value) > 0)
						last = middle - 1; // changes position of last
					// else if value is in upper half
					else if(names[middle].compareTo(value) < 0)
						first = middle + 1; // changes position of first
					
					counter++; // increments counter per array lookup
					
				} // while(!found && first <= last)
				
				// if(found = true)
				if(found)
				{
					// Display name, position, and how many array lookups
					System.out.println("Name found: " + names[position]);
					System.out.println("Position: " + position);
					System.out.println("Array lookups: " + counter);	
				}
				// else if(found = false)
				else if(!found)
				{
					// Displays appropriate message and number of array lookups
					System.out.println("Name not found.");
					System.out.println("Array lookups: " + counter);
				}
			
			} // if(value.length() != 0)
				
		} while(value.length() != 0); // loop iterates while value.length() != 0
		
		
	} // main()

} // class
