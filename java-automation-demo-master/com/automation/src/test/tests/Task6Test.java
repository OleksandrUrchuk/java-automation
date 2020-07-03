package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Task6Test extends BaseTest {

	@Test(description = "User can order 'The complete hair loss plan'")
	public void OrderTheCompleteHairLossPlan() {
		mainPage.navigetingToHairLossPage();
		hairLossPage.choosingHairLossPlan(hairLossPage.deliveryFrequency_Every3Months_FirstPlan, hairLossPage.addToCartButton_1);
		assertEquals(hairLossPage.getText(hairLossPage.actualTitleOnQuestionBlock_1), hairLossPage.expectedTitleOnQuestionBlock_1);
		hairLossPage.answerQuestions(hairLossPage.templesSection);
		hairLossPage.creatingNewAccount(hairLossPage.newEmail);
		assertEquals(hairLossPage.getText(hairLossPage.actualTitleOnQuestionBlock_11), hairLossPage.expectedTitleOnQuestionBlock_11);
		hairLossPage.completingOrder();

		assertEquals(hairLossPage.getText(hairLossPage.actualTitleAfterOrder), hairLossPage.expectedTitleAfterOrder);
	}
}
