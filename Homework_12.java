//--------------------------------------------------------------
//-- Name:       Naveen Natesh
//-- Class:      CIS-1400 Summer 2015
//-- Assignment: Homework 12
//-- File:       Homework_12.java
//-- Purpose:    String manipulator
//--------------------------------------------------------------

package assignments;

import global.Cod;

public class Homework_12 
{
	public static void main(String[] args) 
	{
		String text; // variable for text
		
		// loops while text entered is not blank
		do
		{
			// prompts user to enter text
			System.out.println("Please enter some text or press <ENTER> to exit: ");
			text = Cod.next();
			
			// if text length is not equal to 0
			if(text.length() != 0)
			{
				System.out.println("Vowels: " + vowels(text)); // displays number of vowels
				System.out.println("Capitalized: " + capitalizeString(text)); // displays capitalized text
				System.out.println("Sum of digits: " + sumOfDigits(text)); // displays sum of digits in text
				System.out.println("Backwards: " + backwardsString(text)); // displays text backwards
			}
				
			// blank lines
			System.out.println();
			System.out.println();
			
		} while(text.length() != 0); // while text length is not equal to 0
		
	} // main()

	
	// Receives txt and looks for vowels, incrementing counter on each instance and returns it
	public static int vowels(String txt)
	{
		char chr; // variable for characters
		int counter; // counter variable
		counter = 0; // initial value
		
		// searches through txt
		for(int i = 0; i < txt.length(); i++)
		{
			// assigns each character in lower case to the respective element of chr
			chr = Character.toLowerCase(txt.charAt(i));
			
			// if chr is a vowel
			if(chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u')
			{
				counter++; // increments counter
			}
		
		}
		return counter; // returns counter
		
	} // vowels()
	
	
	// Receives string and capitalizes each first letter of every word and returns the string value
	public static String capitalizeString(String txt) 
	{

	    char[] chars = txt.toCharArray(); // makes char array and converts string to a char array
	    boolean found = false; // flag variable
	    
	    // searches chars array
	    for(int i = 0; i < chars.length; i++) 
	    {
	    	// if not found and chars[i] is a letter
		    if(!found && Character.isLetter(chars[i])) 
		    {
		    	chars[i] = Character.toUpperCase(chars[i]); // converts that letter to uppercase
		    	found = true; // flag
		    } 
		    // else if chars[i] is whitespace or a period
		    else if(Character.isWhitespace(chars[i]) || chars[i]=='.') 
		    { 
		    	found = false; // resets flag
		    }
	    } // for()
	  
	  return String.valueOf(chars); // returns the string value of chars (converts from array into String)
		
	} // capitalizeString()
	
	
	// Receives txt and finds any digits in it and sums them
	public static int sumOfDigits(String txt)
	{		
		int sum = 0; // initial value of sum
		
		char chr; // char variable
		// searches txt for digits and sums them
		for(int i = 0; i < txt.length(); i++)
		{
			chr = txt.charAt(i); // assigns txt to chr for each respective element
			
			// if chr is a digit
			if(Character.isDigit(chr))
			{
				sum = sum + Integer.parseInt(chr + ""); // increment sum by the integer value of chr
			}
			
		} // for()
		
		return sum; // returns sum
		
	} // sumOfDigits()
	
	
	// Receives txt, makes it backwards and returns it
	public static String backwardsString(String txt)
	{
		String backwards = ""; // String for backwards string
		
		// loops through txt from end to beginning
		for(int i = txt.length() - 1; i >= 0; i--)
		{
			backwards = backwards + txt.charAt(i); // adds each character into the string from end to beginning
		}
		
		return backwards; // returns the string
		
	} // backwardsString()
	
} // class
