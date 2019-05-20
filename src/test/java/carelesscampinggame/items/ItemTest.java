package carelesscampinggame.items;

import org.junit.Assert;
import org.junit.Test;

public class ItemTest {
	
	@Test
	public void shouldGetPossessionStatus() {
		Tent underTest = new Tent("", false);
		boolean possession = underTest.getPossession();
		Assert.assertEquals(false, possession);
	}
	
	@Test
	public void shouldTogglePossession() {
		Tent underTest = new Tent("", false);
		boolean possessionBefore = underTest.getPossession();
		underTest.togglePossession();
		boolean possessionAfter = underTest.getPossession();
		Assert.assertEquals(possessionBefore, !possessionAfter);
	}
	
	
}
