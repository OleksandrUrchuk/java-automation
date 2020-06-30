package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Task5Test extends BaseTest {

	@Test(description = "The second product is not added to the cart in the Sticky block")
	public void secondProductIsNotAddedInTheStickyBlock() {
		mainPage.navigetingToHairLossPage();
		hairLossPage.waitToBeVisible(hairLossPage.completeHairLossPlanBlock, 5);
		assertEquals(driver.getTitle(), hairLossPage.expectedTitleOnHairLossPage);
		hairLossPage.clickAddToCartButton(hairLossPage.addToCartButton_2);
		hairLossPage.clickCloseCartButton();
		// click "added to cart" button
		hairLossPage.clickAddToCartButton(hairLossPage.addToCartButton_2);
		assertEquals(hairLossPage.getText(hairLossPage.itemsInCart), "1 ITEM IN CART");
	}
}
