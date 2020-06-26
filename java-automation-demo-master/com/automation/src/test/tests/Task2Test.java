package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Task2Test extends BaseTest {

	@Test
	public void justTest() {
		mainPage.navigetingToHairLossPage();
		assertEquals(driver.getTitle(), hairLossPage.expectedTitleOnHairLossPage);
		hairLossPage.clickAddToCartButton(hairLossPage.addToCartButton_1);
		hairLossPage.clickCloseCartButton();
		assertEquals(hairLossPage.getText(hairLossPage.iconCart), "1");
		assertEquals(hairLossPage.getText(hairLossPage.addedToCartButton), "ADDED TO CART");
	}
}
