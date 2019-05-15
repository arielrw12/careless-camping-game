package carelesscampinggame.campingcrew;

import java.util.ArrayList;
import java.util.Collection;

import carelesscampinggame.items.Item;

public class WholeCrew {
	
	private String name;
	private Collection<Item> items;
	
	public WholeCrew(String name) {
		this.name = name;
		this.items = new ArrayList<Item>();
		
	}

	public String getName() {
		return name;
	}

	public Collection<Item> getItems() {
		return items;
	}
	
	public void addItemToCamperInventory(Item item) {
		items.add(item);
		item.togglePossession();
	}

}
