//--------------------------------------------------------------
//-- Name:       Naveen Natesh
//-- Class:      CIS-1400 Summer 2015
//-- Assignment: Homework 3
//-- File:       Homework_03.java
//-- Purpose:    BMI calculator
//--------------------------------------------------------------

package assignments;

import global.Cod;

public class Homework_03 
{
	public static void main(String[] args) 
	{
		double weight; // variable for weight in pounds
		double feet; // variable for height in feet
		double inches; // variable for extra inches
		
		// prompts user to enter weight in pounds
		System.out.print("Pounds: ");
		weight = Cod.nextDouble();
		
		// prompts user to enter height in feet
		System.out.print("Feet: ");
		feet = Cod.nextDouble();
		
		// prompts user to enter extra height in inches
		System.out.print("Inches: ");
		inches = Cod.nextDouble();
		
		// converts feet to inches and adds extra inches for total height
		double totalHeight = (feet*12.0) + inches; 
		
		displayBmi(totalHeight, weight); // calculates and displays BMI
		
		
	} // main()
	
	
	// Calculates and displays BMI
	public static void displayBmi(double theTotalInches, double thePounds)
	{
		// calculates BMI
		double bmi = ((thePounds) / (theTotalInches * theTotalInches)) * (703);
		
		// displays BMI to user
		System.out.println();
		System.out.println();
		System.out.println("Your BMI is " + bmi);
		
	} // displayBmi()

} // class
