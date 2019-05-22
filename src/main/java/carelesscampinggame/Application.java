package carelesscampinggame;

import java.util.Scanner;

import carelesscampinggame.campingcrew.WholeCrew;
import carelesscampinggame.items.DannyDevito;
import carelesscampinggame.items.FireSupplies;
import carelesscampinggame.items.FirstAidKit;
import carelesscampinggame.items.Guitar;
import carelesscampinggame.items.Item;
import carelesscampinggame.items.Map;
import carelesscampinggame.items.SleepSupplies;
import carelesscampinggame.items.SunscreenBugspray;
import carelesscampinggame.items.Tarp;
import carelesscampinggame.items.Tent;
import carelesscampinggame.items.WaterAndFood;

public class Application {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		WholeCrew crew = new WholeCrew("crew");

		System.out.println("What a beautiful weekend to go camping! Let's pack the car and hit the road!");

		System.out.println("You, your boyfriend, Bob, and your dog, Charles (or Charlie for short-kind of) will be camping in the Appalacian forest for 3 nights.");
		
		System.out.println("Bob is packing his own clothes and everything that Charlie will need for the weekend, but you have to pack everything else.");
		
//		line about having a bookbag with clothes, etc
		
		System.out.println("Bob drives a tiny car, so we have a limited amount of space for packing.");
		
//		add a line asking if you are ready to go, to break up the text some
		
		System.out.println("You can pick 5 of the following items to bring along:");
		
		System.out.println("1. Tent");
		
		System.out.println("2. Sleeping pads, sleeping bags, and blankets");
		
		System.out.println("3. Fire starters, kindling, and matches");
		
		System.out.println("4. A cooler with plenty of water, stuff for sandwiches, veggies, fruit, and smores");
		
		System.out.println("5. A map");
		
		System.out.println("6. A tarp");
		
		System.out.println("7. A guitar");
		
		System.out.println("8. A fully stocked first aid kit");
		
		System.out.println("9. A cardboard cutout of Danny DeVito");
		
		System.out.println("10. Sunscreen and bugspray");
		
		System.out.println("Which 5 items are you going to pack? Type one item number in then hit enter. You will then get to pick more items, one at a time.");
		
		//Make it so you cannot pick an item twice
		String firstChoice = input.nextLine();
		String secondChoice = input.nextLine();
		String thirdChoice = input.nextLine();
		String fourthChoice = input.nextLine();
		String fifthChoice = input.nextLine();
		
		System.out.println("You have chosen items " + firstChoice +", " + secondChoice + ", " + thirdChoice + ", " + fourthChoice + ", and " + fifthChoice + ".");
		
		if (firstChoice.equals("1") || secondChoice.equals("1") || thirdChoice.equals("1") || fourthChoice.equals("1") || fifthChoice.equals("1")) {
			Tent tent = new Tent(false);
			crew.addItemToCamperInventory(tent);
		}
		
		if (firstChoice.equals("2") || secondChoice.equals("2") || thirdChoice.equals("2") || fourthChoice.equals("2") || fifthChoice.equals("2")) {
			SleepSupplies sleepSupplies = new SleepSupplies(false);
			crew.addItemToCamperInventory(sleepSupplies);
		}
		
		if (firstChoice.equals("3") || secondChoice.equals("3") || thirdChoice.equals("3") || fourthChoice.equals("3") || fifthChoice.equals("3")) {
			FireSupplies fireSupplies = new FireSupplies(false);
			crew.addItemToCamperInventory(fireSupplies);
		}
		
		if (firstChoice.equals("4") || secondChoice.equals("4") || thirdChoice.equals("4") || fourthChoice.equals("4") || fifthChoice.equals("4")) {
			WaterAndFood waterAndFood = new WaterAndFood(false);
			crew.addItemToCamperInventory(waterAndFood);
		}
		
		if (firstChoice.equals("5") || secondChoice.equals("5") || thirdChoice.equals("5") || fourthChoice.equals("5") || fifthChoice.equals("5")) {
			Map map = new Map(false);
			crew.addItemToCamperInventory(map);
		}
		
		if (firstChoice.equals("6") || secondChoice.equals("6") || thirdChoice.equals("6") || fourthChoice.equals("6") || fifthChoice.equals("6")) {
			Tarp tarp = new Tarp(false);
			crew.addItemToCamperInventory(tarp);
		}
		
		if (firstChoice.equals("7") || secondChoice.equals("7") || thirdChoice.equals("7") || fourthChoice.equals("7") || fifthChoice.equals("7")) {
			Guitar guitar = new Guitar(false);
			crew.addItemToCamperInventory(guitar);
		}
		
		if (firstChoice.equals("8") || secondChoice.equals("8") || thirdChoice.equals("8") || fourthChoice.equals("8") || fifthChoice.equals("8")) {
			FirstAidKit firstAid = new FirstAidKit(false);
			crew.addItemToCamperInventory(firstAid);
		}
		
		if (firstChoice.equals("9") || secondChoice.equals("9") || thirdChoice.equals("9") || fourthChoice.equals("9") || fifthChoice.equals("9")) {
			DannyDevito devito = new DannyDevito(false);
			crew.addItemToCamperInventory(devito);
		}
		
		if (firstChoice.equals("10") || secondChoice.equals("10") || thirdChoice.equals("10") || fourthChoice.equals("10") || fifthChoice.equals("10")) {
			SunscreenBugspray sunBug= new SunscreenBugspray(false);
			crew.addItemToCamperInventory(sunBug);
		}
		
		System.out.println(crew.getItems());
		//make a to string for items
		
		System.out.println("Time to hit the road!");
		
		System.out.println("What music would you like to listen to? Here are your choices:");
		System.out.println("1. ");
		System.out.println("2. ");
		System.out.println("3. ");
		System.out.println("4. ");
		System.out.println("Type in one of these numbers to pick");
		String musicChoice = input.nextLine();
		if (!musicChoice.equals("1") && !musicChoice.equals("2") && !musicChoice.equals("3") && !musicChoice.equals("4")) {
			System.out.println("You must pick a number 1-4");
			//String musicChoice = input.nextLine();
		} else {
			switch (musicChoice) {
			case "1":
				//do a thing
				break;
				
			case "2":
				
				break;

			case "3":
				
				break;
				
			case "4":
				
				break;
			}
		}
		
		// what's next?
		
		

	}
}
