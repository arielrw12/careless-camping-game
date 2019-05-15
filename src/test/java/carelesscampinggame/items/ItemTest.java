package carelesscampinggame.items;

import org.junit.Assert;
import org.junit.Test;

public class ItemTest {

	@Test
	public void shouldTogglePossession() {
		Item item = new Item("Map");
		boolean possessionBefore = item.getPossession();
		item.togglePossession();
		boolean possessionAfter = item.getPossession();
		Assert.assertEquals(possessionBefore, !possessionAfter);
	}
}
