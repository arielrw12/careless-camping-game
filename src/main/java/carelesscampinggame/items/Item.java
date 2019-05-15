package carelesscampinggame.items;

import carelesscampinggame.campingcrew.CampingIndividual;

public class Item {

	private String name;
	private boolean possession;

	public Item(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public boolean getPossession() {
		return possession;
	}
	
	public void togglePossession() {
		possession = !possession;
	}
	
	
}
