package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Task1Test extends BaseTest {

	@Test(description = "Scrolling through blocks")
	public void scrollingThroughBlocks() {
		mainPage.navigetingToHairLossPage();
		hairLossPage.waitToBeVisible(hairLossPage.completeHairLossPlanBlock, 5);
		assertEquals(driver.getTitle(), hairLossPage.expectedTitleOnHairLossPage);
		hairLossPage.scrollToView(hairLossPage.completeHairLossPlanBlock);
		hairLossPage.scrollToView(hairLossPage.alternativePlansBlock);
		hairLossPage.scrollToView(hairLossPage.doctorBlock);
		hairLossPage.scrollToView(hairLossPage.howItWorksBlock);
		hairLossPage.scrollToView(hairLossPage.quastionsAnsweredBlock);
		assertEquals(hairLossPage.getText(hairLossPage.quastionsAnsweredBlock), "Read me, I’m important");
		hairLossPage.scrollByPixels(7000);
		hairLossPage.scrollToView(hairLossPage.helpingHairBlock);
		hairLossPage.scrollToView(hairLossPage.stickyBlock);
		assertEquals(hairLossPage.getText(hairLossPage.stickyBlock), "HAVE A QUESTION?");
	}
}
