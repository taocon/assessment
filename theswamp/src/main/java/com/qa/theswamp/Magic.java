package com.qa.theswamp;

import java.util.Scanner;

public class Magic {

	int pSideWays = 0;
	int pUpDown = 0;
	int tSideWays = 4;
	int tUpDown = 7;
	double finalDistance = 0;
	Person adventurer = new Person("Jimmy", 0, 0);
	Person treasureChest = new Person("TheChest", 4, 7);

	public String name;

	public Magic(String name) {
		this.name = name;

	}

	public void compassCalculator() {

		double finalX = tSideWays - pSideWays;
		double finalXSquared = finalX * finalX;
		double finalY = tUpDown - pUpDown;
		double finalYSquared = finalY * finalY;

		 finalDistance = Math.sqrt(finalXSquared + finalYSquared);

		System.out.println("Distance is:" + finalDistance);

	}

	public void areaMover() {

		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		int test = 2;
		// Integer.parseInt(input);

		String direction = input;

		System.out.println(direction);

		if (direction.equalsIgnoreCase("north")) {

			pUpDown = pUpDown + 1;
			adventurer.setxCord(pUpDown);

		}

		if (direction.equalsIgnoreCase("south")) {

			pUpDown = pUpDown - 1;
			adventurer.setxCord(pUpDown);

		}

		if (direction.equalsIgnoreCase("west")) {

			pSideWays = pSideWays - 1;
			adventurer.setyCord(pSideWays);

		}

		if (direction.equalsIgnoreCase("east")) {

			pSideWays = pSideWays + 1;
			adventurer.setyCord(pSideWays);

		}

		System.out.println("You venture >" + input);

	
		System.out.println(adventurer);
	}

	public void winCondition() {
		if (finalDistance == 0) {
			System.out.println("congrats you win");

		}
	}

}
