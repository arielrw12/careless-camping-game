package carelesscampinggame.campingcrew;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

import carelesscampinggame.items.Item;

public class CampingIndividualTest {

	@Test
	public void shouldBeAbleToAddToInventory() {
		CampingIndividual underTest = new MainCharacter("Ariel");
		Item item = new Item("Bucket");
		
		Collection<Item> itemsBefore = underTest.getItems();
		
		int sizeBefore = itemsBefore.size();
		
		System.out.println(sizeBefore);
		
		underTest.addItemToCamperInventory(item);
		
		Collection<Item> itemsAfter = underTest.getItems();
		
		int sizeAfter = itemsAfter.size();
		
		System.out.println(sizeAfter);
		
		Assert.assertEquals(sizeAfter, sizeBefore + 1);
		
		
	}
}
