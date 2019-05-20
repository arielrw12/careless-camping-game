package carelesscampinggame.items;

import carelesscampinggame.campingcrew.CampingIndividual;

public abstract class Item {

	//private String name;
	private boolean possession;

	public Item(boolean possession) {
		//this.name = name;
		this.possession = false;
	}

//	public String getName() {
//		return name;
//	}
	
	public boolean getPossession() {
		return possession;
	}
	
	public void togglePossession() {
		possession = !possession;
	}
	
	
}
