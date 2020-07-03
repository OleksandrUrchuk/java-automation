package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Task8Test extends BaseTest {

	@Test(description = "User can change delivery date")
	public void changeDeliveryDate() {
		mainPage.navigetingToLoginPage();
		loginPage.login("testmail@harakirimail20.com", "12345678");
		mainPage.navigetingToAccountPage();
		accountPage.click(accountPage.yourPlansSection);

		assertEquals(accountPage.getText(accountPage.orderStatus), accountPage.expectedOrderStatusMessage);
	}
}
