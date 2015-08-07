//--------------------------------------------------------------
//-- Name:       Naveen Natesh
//-- Class:      CIS-1400 Summer 2015
//-- Assignment: Homework 10
//-- File:       Homework_10.java
//-- Purpose:    Number file reader
//--------------------------------------------------------------

package assignments;

import java.io.*;
import java.util.Scanner;

public class Homework_10 
{
	public static final String FILE_NAME = "Numbers.txt";
	
	public static void main(String[] args) throws IOException
	{
		Scanner inputFile = new Scanner(new File(FILE_NAME)); // opening file for reading
		int counter = 0; // initial value of counter
		
		// loop iterates while inputFile has another number
		do
		{
			double number = inputFile.nextDouble(); // first number goes into number variable and so on
			counter++; // increments counter
			
		} while(inputFile.hasNextDouble()); // while inputFile has another number
		
		mathAndDisplay(counter); // calls mathAndDisplay and passes counter variable
		
		inputFile.close(); // closes inputFile
		
	} // main()

	
	// inputs numbers into an array, calculates information, and displays
	public static void mathAndDisplay(int count) throws IOException
	{
		Scanner inputFile = new Scanner(new File(FILE_NAME)); // opens file for reading
		
		double numbers[] = new double[count]; // array of size count that will hold all numbers from file
		double maxNum; // variable for number of highest value
		double minNum; // variable for number of lowest value
		double average; // variable for average of all numbers
		
		// loop inputs each number into respective element of array
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = inputFile.nextDouble(); // inputs each number into respective element of array
		}
		
		int maxElement; // marks last element to compare
		int index; // index of element
		double  temp; // temporary variable for swapping
		
		// runs through loop as long as maxElement >= 0
		for(maxElement = numbers.length - 1; maxElement >= 0; maxElement--)
		{
			// runs through loop as long as index <= maxElement
			for(index = 0; index <= maxElement - 1; index++)
			{
				// if index is greater than the next index, swap the two.
				if(numbers[index] > numbers[index+1])
				{
					temp = numbers[index]; // temporary variable storage
					numbers[index] = numbers[index+1]; // swapping
					numbers[index+1] = temp; // swapping
				} // if(numbers[index]...)
		
			} // for(index = 0...)
			
		} // for(maxElement = numbers.length - 1...)
		
		maxNum = numbers[numbers.length - 1]; // maxNum is last number in array
		minNum = numbers[0]; // minNum is first number in array
		
		double total = 0; // initial value for total
		
		// loop to go through numbers[]
		for(int i = 0; i < numbers.length; i++)
		{
			total = numbers[i] + total; // running total
		}
		
		average = total / count; // calculates average
		
		// Displays amount of numbers in file
		System.out.print("Count: ");
		System.out.println(String.format("%10d",count));
		
		// Displays maximum number in file
		System.out.print("Maximum: ");
		System.out.println(String.format("%12.3f",maxNum));
		
		// Displays minimum number in file
		System.out.print("Minimum: ");
		System.out.println(String.format("%12.3f",minNum));
		
		// Displays total of all numbers in file
		System.out.print("Total: ");
		System.out.println(String.format("%,14.3f", total));
		
		// Displays average of all numbers in file
		System.out.print("Average: ");
		System.out.println(String.format("%,12.3f", average));
		
		inputFile.close(); // closes inputFile
		
	} // mathAndDisplay()
	
} // class
