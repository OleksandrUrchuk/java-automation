package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Task7Test extends BaseTest {

	@Test(description = "User can order the 'Finasteride hair loss plan'")
	public void OrderTheFinasterideHairLossPlan() {
		mainPage.navigetingToHairLossPage();
		hairLossPage.choosingHairLossPlan(hairLossPage.deliveryFrequency_Every3Months_SecondPlan, hairLossPage.addToCartButton_2);
		assertEquals(hairLossPage.getText(hairLossPage.actualTitleOnQuestionBlock_1), hairLossPage.expectedTitleOnQuestionBlock_1);
		hairLossPage.answerQuestions(hairLossPage.templesAndCrownSection);
		hairLossPage.creatingNewAccount(hairLossPage.newEmail);
		assertEquals(hairLossPage.getText(hairLossPage.actualTitleOnQuestionBlock_11), hairLossPage.expectedTitleOnQuestionBlock_11);	
		hairLossPage.completingOrder();
		assertEquals(hairLossPage.getText(hairLossPage.actualTitleAfterOrder), hairLossPage.expectedTitleAfterOrder);
	}
}
