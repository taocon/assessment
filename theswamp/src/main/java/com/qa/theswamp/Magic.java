package com.qa.theswamp;

import java.util.Scanner;

public class Magic {

	int personXAxis = 0;
	int personYAxis = 0;
	int treasureXAxis = 4;
	int tYAxis = 7;
	double finalDistance = Math.sqrt(65);
	boolean winCondition = false;
	boolean consolePower = true;
	
	
	
	Person adventurer = new Person("Jimmy", 0, 0);
	Person treasureChest = new Person("TheChest", 4, 7);
	Person danger1 = new Person("Monster",4,0);

	
	
	public String name;

	public Magic(String name) {
		this.name = name;
	}

	
	
	
	
	public void compassCalculator() {
	
			System.out.println("psideways is" + personXAxis);
			System.out.println("pupdown is " + personYAxis);
			double finalX = treasureXAxis - personXAxis;
			double finalXSquared = finalX * finalX;
			double finalY = tYAxis - personYAxis;
			double finalYSquared = finalY * finalY;
	
			finalDistance = Math.sqrt(finalXSquared + finalYSquared);
	
			System.out.println("Distance is:" + finalDistance);

		}

	public void areaMover() {

		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		String direction = input;

		System.out.println(direction);

				if (direction.equalsIgnoreCase("north")) {
		
					personYAxis = personYAxis + 1;
					adventurer.setyCord(personYAxis);
		
				}
		
				if (direction.equalsIgnoreCase("south")) {
		
					personYAxis = personYAxis - 1;
					adventurer.setyCord(personYAxis);
		
				}
		
				if (direction.equalsIgnoreCase("west")) {
		
					personXAxis = personXAxis - 1;
					adventurer.setxCord(personXAxis);
		
				}
		
				if (direction.equalsIgnoreCase("east")) {
		
					personXAxis = personXAxis + 1;
					adventurer.setxCord(personXAxis);
		
				}
		
				System.out.println("You venture >" + input);
		
				System.out.println(adventurer);
			}

	
	
	
	public void winCondition() {
		
		
				if (finalDistance == 0) {
					winCondition = true;

				}
			}
	
	
	
	
//	public void deathCondition()
//	{
//		if (personXAxis=4 && personYAxis=0)
//		
//		
//	}

}
