//--------------------------------------------------------------
//-- Name:       Naveen Natesh
//-- Class:      CIS-1400 Summer 2015
//-- Assignment: Optional 1
//-- File:       Optional_01.java
//-- Purpose:    Various Shape Area Calculator
//--------------------------------------------------------------

package assignments;

import global.Cod;

public class Optional_01 
{
	public static void main(String[] args) 
	{
		int menuSelection; // variable for menuSelection (choice)
		
		// loop runs while menuSelection does not equal 4
		do
		{
			menuSelection = displayMenu(); // displays menu for user and prompts choice
			
			// switch structure for menuSelection
			switch(menuSelection)
			{
				case 1: // if menuSelection == 1
					areaCircle(); // prompts for radius and calculates area of circle
					break; // ends case
				case 2:
					areaRectangle(); // prompts for base and width and calculates area of rectangle
					break; // ends case
				case 3:
					areaTriangle(); // prompts for base and height and calculates area of triangle
					break; // ends case
			} // switch()
			
			
		} while(menuSelection != 4); // while menuSelection does not equal 4
		
	} // main()
	
	
	// Displays menu and prompts user to choose
	public static int displayMenu()
	{
		// Display of menu
		System.out.println("1. Calculate the area of a Circle");
		System.out.println("2. Calculate the area of a Rectangle");
		System.out.println("3. Calculate the area of a Triangle");
		System.out.println("4. Quit");
		
		int choice; // variable for user choice
		
		// Prompts user for choice
		System.out.print("Enter your choice (1-4): ");
		choice = Cod.nextInt();
		
		// while choice is greater than 4 or less than 1
		while(choice > 4 || choice < 1)
		{
			// Scolds user and prompts again
			System.out.println("ERROR: Enter a valid number between 1 and 4.");
			System.out.print("Please enter your menu choice: ");
			choice = Cod.nextInt();
			
		} // while()
		
		return choice; // returns value of choice
		
	} // displayMenu()
	
	
	// Prompts user for radius and calculates area and displays
	public static void areaCircle()
	{
		
		System.out.println("---Area for a Circle---"); // Initial display
		double radius; // variable for radius
		// Prompts user for radius
		System.out.print("Enter the radius: ");
		radius = Cod.nextDouble();
		
		// while radius is less than 0
		while(radius <= 0)
		{
			// Scolds user and re-prompts
			System.out.println("ERROR: Enter a valid number.");
			System.out.print("Please enter the radius: ");
			radius = Cod.nextDouble();
		} // while()
		
		double area; // variable for area
		area = (Math.PI) * (Math.pow(radius, 2)); // calculates area
		
		System.out.println("The answer is: " + area); // displays area
		
	} // areaCircle()
	
	
	// Prompts user for base and width and calculates area and displays
	public static void areaRectangle()
	{
		System.out.println("---Area for a Rectangle---"); // initial display
		double base; // variable for base
		double width; // variable for width
		// Prompts user for base
		System.out.print("Enter the base: ");
		base = Cod.nextDouble();
		
		// while base is less than or equal to 0
		while(base <= 0)
		{
			
			// Scolds user and re-prompts
			System.out.println("ERROR: Enter a valid number.");
			System.out.print("Please enter the base: ");
			base = Cod.nextDouble();
		} // while()
		
		// Prompts user for width
		System.out.print("Enter the width: ");
		width = Cod.nextDouble();
		// while base is less than or equal to 0
		while(width <= 0)
		{
			// Scolds user and re-prompts
			System.out.println("ERROR: Enter a valid number.");
			System.out.print("Please enter the width: ");
			width = Cod.nextDouble();
		} // while()
			
		double area; // variable for area
		area = base*width; // calculates area
		System.out.println("The answer is: " + area); // displays area
		
	} // areaRectangle()
	
	
	// Prompts user for base and height and calculates area and displays
	public static void areaTriangle()
	{
		System.out.println("---Area for a Triangle---"); // initial display
		double base; // variable for base
		double height; // variable for height
		
		// Prompts user for base
		System.out.print("Enter the base: ");
		base = Cod.nextDouble();
		
		// while base is less than or equal to 0
		while(base <= 0)
		{
			// Scolds user and re-prompts
			System.out.println("ERROR: Enter a valid number.");
			System.out.print("Please enter the base: ");
			base = Cod.nextDouble();
		} // while()
		
		System.out.print("Enter the height: ");
		height = Cod.nextDouble();
		// while height is less than or equal to 0
		while(height <= 0)
		{
			// Scolds user and re-prompts
			System.out.println("ERROR: Enter a valid number.");
			System.out.print("Please enter the height: ");
			height = Cod.nextDouble();
		} // while()
		
		double area; // variable for area
		area = .5 * (base*height); // calculates area
		
		System.out.println("The answer is: " + area); // displays area
		
	} // areaTriangle()

} // class
