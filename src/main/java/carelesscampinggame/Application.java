package carelesscampinggame;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What a beautiful weekend to go camping! Let's pack the car and hit the road!");

		System.out.println("You, your boyfriend, Bob, and your dog, Charles (or Charlie for short-kind of) will be camping in the Appalacian forest for 3 nights.");
		
		System.out.println("Bob is packing his own clothes and everything that Charlie will need for the weekend, but you have to pack everything else.");
		
		System.out.println("Bob drives a tiny car, so we have a limited amount of space for packing.");
		
		System.out.println("You can pick 5 of the following items to bring along:");
		
		System.out.println("1. Tent");
		
		System.out.println("2. Sleeping pads, sleeping bags, and blankets");
		
		System.out.println("3. Fire starters, kindling, and matches");
		
		System.out.println("4. A cooler with plenty of water, stuff for sandwiches, veggies, fruit, and smores");
		
		System.out.println("5. A bear bag to hoist your food up");
		
		System.out.println("6. A tarp");
		
		System.out.println("7. A guitar");
		
		System.out.println("8. A fully stocked first aid kit");
		
		System.out.println("9. A cardboard cutout of Danny DeVito");
		
		System.out.println("10. Sunscreen and bugspray");
		
		System.out.println("Which 5 items are you going to pack? Type one item number in then hit enter. You will then get to pick more items, one at a time.");
		
		String firstChoice = input.nextLine();
		String secondChoice = input.nextLine();
		String thirdChoice = input.nextLine();
		String fourthChoice = input.nextLine();
		String fifthChoice = input.nextLine();
		
		System.out.println("You have chosen items " + firstChoice +", " + secondChoice + ", " + thirdChoice + ", " + fourthChoice + ", and " + fifthChoice + ".");
		
		
	}

}
