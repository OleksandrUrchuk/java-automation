package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1Test extends BaseTest {

	@Test
	public void justTest() {
		mainPage.navigetingToHairLossPage();
		Assert.assertEquals(hairLossPage.getText(hairLossPage.baseTitleOnHairLossPage), "Hair Loss");
		hairLossPage.scrollToView(hairLossPage.completeHairLossPlanBlock);
		hairLossPage.scrollToView(hairLossPage.alternativePlansBlock);
		hairLossPage.scrollToView(hairLossPage.doctorBlock);
		hairLossPage.scrollToView(hairLossPage.howItWorksBlock);
		hairLossPage.scrollToView(hairLossPage.quastionsAnsweredBlock);
		Assert.assertEquals(hairLossPage.getText(hairLossPage.quastionsAnsweredBlock), "Read me, I’m important");
		hairLossPage.scrollByPixels(7000);
		hairLossPage.scrollToView(hairLossPage.helpingHairBlock);
		hairLossPage.scrollToView(hairLossPage.stickyBlock);
		Assert.assertEquals(hairLossPage.getText(hairLossPage.stickyBlock), "HAVE A QUESTION?");
	}
}
