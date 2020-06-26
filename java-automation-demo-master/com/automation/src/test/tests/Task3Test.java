package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Task3Test extends BaseTest {

	@Test
	public void justTest() {
		mainPage.navigetingToHairLossPage();
		Assert.assertEquals(hairLossPage.getText(hairLossPage.baseTitleOnHairLossPage), "Hair Loss");
		hairLossPage.clickAddToCartButton(hairLossPage.addToCartButton_1);
		hairLossPage.clickCloseCartButton();
		// click "added to cart" button
		hairLossPage.clickAddToCartButton(hairLossPage.addToCartButton_1);
		Assert.assertEquals(hairLossPage.getText(hairLossPage.itemsInCart), "1 ITEM IN CART");
	}
}
