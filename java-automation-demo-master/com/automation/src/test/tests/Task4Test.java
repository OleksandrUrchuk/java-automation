package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Task4Test extends BaseTest {
	
	@Test
	public void justTest() {
		mainPage.navigetingToHairLossPage();
		Assert.assertEquals(hairLossPage.getText(hairLossPage.baseTitleOnHairLossPage), "Hair Loss");
		
		
	}
}
