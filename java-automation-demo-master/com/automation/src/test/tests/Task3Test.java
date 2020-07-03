package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Task3Test extends BaseTest {

	@Test(description = "The second product is not added to the cart")
	public void secondProductIsNotAdded() {
		mainPage.navigetingToHairLossPage();
		hairLossPage.waitToBeVisible(hairLossPage.completeHairLossPlanBlock, 5);
		assertEquals(driver.getTitle(), hairLossPage.expectedTitleOnHairLossPage);
		hairLossPage.clickOnButton(hairLossPage.addToCartButton_1);
		hairLossPage.clickOnButton(hairLossPage.closeCartButton);
		// click "added to cart" button
		hairLossPage.clickOnButton(hairLossPage.addToCartButton_1);
		assertEquals(hairLossPage.getText(hairLossPage.itemsInCart), "1 ITEM IN CART");
	}
}
