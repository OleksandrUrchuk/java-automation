package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Task4Test extends BaseTest {

	@Test(description = "The 'Added to cart' button is displayed in the Sticky block")
	public void addedToCartButtonIsDisplayedInStickyBlock() {
		mainPage.navigetingToHairLossPage();
		hairLossPage.waitToBeVisible(hairLossPage.completeHairLossPlanBlock, 5);
		assertEquals(driver.getTitle(), hairLossPage.expectedTitleOnHairLossPage);
		hairLossPage.clickAddToCartButton(hairLossPage.addToCartButton_2);
		hairLossPage.clickCloseCartButton();
		assertEquals(hairLossPage.getText(hairLossPage.iconCart), "1");
		assertEquals(hairLossPage.getText(hairLossPage.addedToCartButton), "ADDED TO CART");
	}
}
