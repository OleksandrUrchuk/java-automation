package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2Test extends BaseTest {

	@Test
	public void justTest() {
		mainPage.navigetingToHairLossPage();
		Assert.assertEquals(hairLossPage.getText(hairLossPage.baseTitleOnHairLossPage), "Hair Loss");
		hairLossPage.scrollToView(hairLossPage.completeHairLossPlanBlock);
		hairLossPage.clickAddToCartButton();
		hairLossPage.clickCloseCartButton();
		Assert.assertEquals(hairLossPage.getText(hairLossPage.iconCart), "1");
		Assert.assertEquals(hairLossPage.getText(hairLossPage.addedToCartButton), "ADDED TO CART");
	}
}
