package carelesscampinggame.campingcrew;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

import carelesscampinggame.items.Item;
import carelesscampinggame.items.Tent;

public class WholeCrewTest {
	
	@Test
	public void shouldBeAbleToAddToInventory() {
		WholeCrew underTest = new WholeCrew("crew");
		Tent tentUnderTest = new Tent(false);
		
		Collection<Item> itemsBefore = underTest.getItems();
		int sizeBefore = itemsBefore.size();
		System.out.println(sizeBefore);
		
		underTest.addItemToCamperInventory(tentUnderTest);
		
		Collection<Item> itemsAfter = underTest.getItems();
		int sizeAfter = itemsAfter.size();
		System.out.println(sizeAfter);
		
		Assert.assertEquals(sizeAfter, sizeBefore + 1);
		
	}

}
