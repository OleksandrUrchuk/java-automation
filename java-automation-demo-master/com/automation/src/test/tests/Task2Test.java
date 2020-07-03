package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Task2Test extends BaseTest {

	@Test(description = "The 'Added to cart' button is displayed")
	public void addedToCartButtonIsDisplayed() {
		mainPage.navigetingToHairLossPage();
		hairLossPage.waitToBeVisible(hairLossPage.completeHairLossPlanBlock, 5);
		assertEquals(driver.getTitle(), hairLossPage.expectedTitleOnHairLossPage);
		hairLossPage.clickOnButton(hairLossPage.addToCartButton_1);
		hairLossPage.clickOnButton(hairLossPage.closeCartButton);
		assertEquals(hairLossPage.getText(hairLossPage.iconCart), "1");
		assertEquals(hairLossPage.getText(hairLossPage.addedToCartButton), "ADDED TO CART");
	}
}
