package com.qa.theswamp;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Magic gm = new Magic("jim");

		// Magic adventurer = new Magic("test");

	
		boolean playing = true;

		do 
		{
			
			
			gm.areaMover();
			gm.compassCalculator();
			
			
			
			
			
			
		} while (playing);

		
		
	
	}
	// else {
	// System.out.println("Congratulations! You have found the treasure!");
	// }

}
