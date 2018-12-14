package com.qa.theswamp;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Magic gamemaster = new Magic("jim");

		// Magic adventurer = new Magic("test");
		boolean playing = true;

		
		System.out.println("Welcome to TheeSwamp v0.0.1. There is a treasure chest here with various dangers in certain areas. Safely navigate to the treasure chest for untold riches!");
		System.out.println("please type north,south,east,or west to proceeed in those directions");
		System.out.println("Your starting distance is:");
		
		do {
			System.out.println(gamemaster.finalDistance);
			gamemaster.areaMover();
			gamemaster.compassCalculator();
			gamemaster.winCondition();

			if (gamemaster.winCondition) {

				System.out.println("Congratulations you have found the treasure!");
				System.out.println("Please restart the console to play again.");
				break;
				
				}

			}  while (playing);

	}

}
