package carelesscampinggame.campingcrew;

import java.util.ArrayList;
import java.util.Collection;

import carelesscampinggame.items.Item;

public abstract class CampingIndividual {

	private String name;
	private int health;
	private int hunger;
	private int energy;
	private Collection<Item> items;
	
	public CampingIndividual(String name) {
		this.name = name;
		this.health = health;
		this.hunger = hunger;
		this.energy = energy;
		this.items = new ArrayList<Item>();
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getHunger() {
		return hunger;
	}

	public int getEnergy() {
		return energy;
	}

	public Collection<Item> getItems() {
		return items;
	}
	
	public void addItemToCamperInventory(Item item) {
		items.add(item);
	}
}
