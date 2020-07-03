package pages;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.PageElement;

public class HairLossPage extends BasePage {

	public HairLossPage(WebDriver driver) {
		super(driver);
	}

	public final String expectedTitleOnHairLossPage = "Buy Hair Loss Medication & Treatments Online - Works for 9/10 Men - UK Licensed Pharmacy | Manual";

	public final String expectedTitleOnQuestionBlock_1 = "Answer six quick questions about your hair loss to get the most effective clinically proven treatments for you.";

	public final String expectedTitleOnQuestionBlock_10 = "Almost Done";

	public final String expectedTitleOnQuestionBlock_11 = "Complete your order";
	
	public final String expectedTitleAfterOrder = "Thank you";
	
	public String newEmail = "testmail@harakirimail" + new Random().nextInt(999) + ".com";
	
	public final PageElement completeHairLossPlanBlock = new PageElement("Complete Hair Loss Plan Block",
			By.cssSelector("span[class='heading-5 inline-block']"), true);
	
	public final PageElement alternativePlansBlock = new PageElement("Alternative Plans Block",
			By.cssSelector("span[class='heading-5 inline-block']"), true);

	public final PageElement doctorBlock = new PageElement("Doctor Block",
			By.cssSelector("div[class='AskClinician image-earim']"), true);

	public final PageElement howItWorksBlock = new PageElement("How It Works Block",
			By.cssSelector("div[class='HowItWorks noArrows noTrustpilot']"), true);

	public final PageElement quastionsAnsweredBlock = new PageElement("Quastions Answered Block",
			By.cssSelector("h2[class='rm-title text-center']"), true);

	public final PageElement helpingHairBlock = new PageElement("Helping Hair Block",
			By.cssSelector("div[class='ratings--reviewCount']"), true);

	public final PageElement stickyBlock = new PageElement("Sticky Block",
			By.cssSelector("h4[class='Footer-title text-left h4 no-wrap']"), true);

	public final PageElement addToCartButton_1 = new PageElement("Add To Cart Button For 'The complete hair loss plan'",
			By.cssSelector("body.webp:nth-child(2) div.main-content section.section--hair-plans:nth-child(8) div.container:nth-child(3) div.HairPlanCard.mostEffective:nth-child(1) div.HairPlanCard--btn > button.btn"),
			true);
	
	public final PageElement addToCartButton_2 = new PageElement("Add To Cart Button For 'Finasteride hair loss plan'",
			By.cssSelector("body.webp:nth-child(2) div.main-content section.section--hair-plans:nth-child(8) div.container:nth-child(3) div.HairPlanCard:nth-child(2) div.HairPlanCard--btn > button.btn"),
			true);

	public final PageElement closeCartButton = new PageElement("Close Cart Button",
			By.cssSelector("div[class='cart__back']"), true);

	public final PageElement iconCart = new PageElement("Icon Cart", By.xpath("//div[@class='cart-btn__counter']"),
			true);

	public final PageElement addedToCartButton = new PageElement("Added To Cart Button",
			By.cssSelector("button[class='btn btn--bg-light']"), true);

	public final PageElement itemsInCart = new PageElement("Items In Cart",
			By.cssSelector("div[class='cart__header-label']"), true);

	public final PageElement deliveryFrequency_Every3Months_FirstPlan = new PageElement("Every 3 Months Options", By.cssSelector(
			"body.webp:nth-child(2) div.main-content section.section--hair-plans:nth-child(8) div.container:nth-child(3) div.HairPlanCard.mostEffective:nth-child(1) div.HairPlanCard--frequency div.HairPlanCard--frequency-select > div.HairPlanCard--frequency-option.selected:nth-child(2)"),
			true);
	
	public final PageElement deliveryFrequency_Every3Months_SecondPlan = new PageElement("Every 3 Months Options", By.cssSelector(
			"body.webp:nth-child(2) div.main-content section.section--hair-plans:nth-child(8) div.container:nth-child(3) div.HairPlanCard:nth-child(2) div.HairPlanCard--frequency div.HairPlanCard--frequency-select > div.HairPlanCard--frequency-option.selected:nth-child(2)"),
			true);

	public final PageElement checkoutButton = new PageElement("Checkout Button",
			By.xpath("//button[contains(text(),'CHECKOUT')]"), true);

	public final PageElement actualTitleOnQuestionBlock_1 = new PageElement("Actual Title On Question Block 1",
			By.cssSelector("div[class='questions__ttl']"), true);

	public final PageElement buttonYes = new PageElement("Button YES On The Question 1, Question 3",
			By.cssSelector("div[class='radio__button--question']"), true);

	public final PageElement templesSection = new PageElement("Temples Section", By.cssSelector(
			"body.webp:nth-child(2) div.main-content div.Quiz.main.bg-light div.main__wrapper div.main__content section.section.section--checkout div.container.container--quiz div.checkout div.questions div.questions__item.pop-in div.radio-wrap.mt-25 div.radio-wrap__item:nth-child(1) > label.radio.radio--img"),
			true);

	public final PageElement templesAndCrownSection = new PageElement("Temples Section", By.cssSelector(
			"body.webp:nth-child(2) div.main-content div.Quiz.main.bg-light div.main__wrapper div.main__content section.section.section--checkout div.container.container--quiz div.checkout div.questions div.questions__item.pop-in div.radio-wrap.mt-25 div.radio-wrap__item:nth-child(2) label.radio.radio--img span.radio__label span.radio__img span:nth-child(1) > img:nth-child(1)"),
			true);
	
	public final PageElement buttonNo = new PageElement("Button NO On The Question 4, Question 5, Question 6, Question 7",
			By.xpath("//div[contains(text(),'No')]"), true);

	public final PageElement textField_Q7 = new PageElement("Text Field On The Question 7",
			By.cssSelector("textarea[class='textarea']"), true);

	public final PageElement continueButton = new PageElement("Continue Button",
			By.cssSelector("button[class='btn btn--spinner']"), true);

	public final PageElement skipAndContinueButton = new PageElement("Skip And Continue Button",
			By.cssSelector("#not-added"), true);

	public final PageElement actualTitleOnQuestionBlock_10 = new PageElement("Actual Title On Question Block 10",
			By.cssSelector("div[class='SignupCheckout--ttl SocialsSignupExperiment__VariantA']"), true);
	
	public final PageElement firstNameField = new PageElement("First Name Field",
			By.cssSelector("input[data-test='fName']"), true);
	
	public final PageElement lastNameField = new PageElement("Last Name Field",
			By.cssSelector("input[data-test='lName'][name='lastName']"), true);
	
	public final PageElement dateOfBirthField = new PageElement("Date Of Birth Field",
			By.cssSelector("input[name='birthday']"), true);
	
	public final PageElement phoneNumberField = new PageElement("Phone Number Field",
			By.cssSelector("input[data-test='lName'][name='phoneNumber']"), true);
	
	public final PageElement emailField = new PageElement("Email Field",
			By.cssSelector("input[data-test='email']"), true);
	
	public final PageElement passwordField = new PageElement("Password Field",
			By.cssSelector("input[data-test='pass']"), true);
	
	public final PageElement iAgreeCheckBox = new PageElement("I Agree CheckBox",
			By.cssSelector("body.webp:nth-child(2) div.main-content div.SignupCheckout.main.bg-light div.main__wrapper div.main__content section.section.section--checkout div.container.SignupCheckout--container div.SignupCheckout__form-wrapper:nth-child(3) div.Signup.checkout div.checkout__row.flex.flex-wrap form.checkout__form.form div.form__row:nth-child(6) label.checkbox > span.checkbox__label"), true);
	
	public final PageElement keepMeInformedCheckBox = new PageElement("Keep Me Informed CheckBox",
			By.cssSelector("body.webp:nth-child(2) div.main-content div.SignupCheckout.main.bg-light div.main__wrapper div.main__content section.section.section--checkout div.container.SignupCheckout--container div.SignupCheckout__form-wrapper:nth-child(3) div.Signup.checkout div.checkout__row.flex.flex-wrap form.checkout__form.form div.form__row:nth-child(7) label.checkbox > span.checkbox__label"), true);
	
	public final PageElement submitButton = new PageElement("Submit Button",
			By.cssSelector("button[type='submit']"), true);
	
	public final PageElement actualTitleOnQuestionBlock_11 = new PageElement("Actual Title On Question Block 11",
			By.cssSelector("div[class='OrderReview--ttl']"), true);
	
	public final PageElement enterAddressManuallyLink = new PageElement("Enter Address Manually Link",
			By.cssSelector("button[class='link font-sm mt-15']"), true);
	
	public final PageElement shippingAddressField = new PageElement("Shipping Address Field",
			By.cssSelector("input[name='shipping-street']"), true);
	
	public final PageElement shippingCityField = new PageElement("Shipping City Field",
			By.cssSelector("input[name='shipping-city']"), true);
	
	public final PageElement shippingPostCodeField = new PageElement("Shipping PostCode Field",
			By.cssSelector("input[name='shipping-postcode']"), true);
	
	public final PageElement paymentMethodTitle = new PageElement("Payment Method Title",
			By.cssSelector("div[class='BillingManager--ttl semibold']"), true);
	
	
	public final PageElement cardNumberField = new PageElement("Card Number Field",
			By.cssSelector("#checkout-frames-card-number"), true);
	
	public final PageElement monthYearField = new PageElement("Month Year Field",
			By.cssSelector("input[name='exp-date']"), true);
	
	public final PageElement cvvCodeField = new PageElement("CVV Code Field",
			By.cssSelector("input[name='cvc']"), true);
	
	public final PageElement billingAddressCheckBox = new PageElement("Billing Address CheckBox",
			By.cssSelector("label[class='checkbox']"), true);
	
	public final PageElement placeOrderButton = new PageElement("Place Order Button",
			By.cssSelector("body.webp:nth-child(2) div.main-content div.OrderReview.main div.main__wrapper div.main__content section.section.section--checkout div.container.container--OrderReview div.checkout div.checkout__row form:nth-child(2) div.OrderReview__content div.OrderReview__col.OrderReview__col--info:nth-child(2) div.order-cart__btn > button.btn.btn--full.btn--spinner"), true);
	
	public final PageElement actualTitleAfterOrder = new PageElement("Actual Title After Order",
			By.cssSelector("h1[class='OrderSuccess--ttl']"), true);
	
	public final PageElement iframe = new PageElement("iframe",
			By.id("cardNumber"), true);

	public void choosingHairLossPlan (PageElement deliveryFrequency, PageElement addToCartButton) {
		waitToBeVisible(alternativePlansBlock, 5);
		assertEquals(driver.getTitle(), expectedTitleOnHairLossPage);
		clickOnButton(deliveryFrequency);
		clickOnButton(addToCartButton);
		clickOnButton(checkoutButton);
	}
	
	public void answerQuestions (PageElement imageSection) {
		clickOnButton(buttonYes);
		clickOnButton(imageSection);
		clickOnButton(buttonYes);
		clickOnButton(buttonNo);
		clickOnButton(buttonNo);
		clickOnButton(buttonNo);
		clickOnButton(buttonNo);
		clickOnButton(buttonNo);
		enterText(textField_Q7, "Test text");
		clickOnButton(continueButton);
		clickOnButton(skipAndContinueButton);
	}
	
	public void creatingNewAccount (String email) {
		assertEquals(getText(actualTitleOnQuestionBlock_10),
				expectedTitleOnQuestionBlock_10);
		fillingTextFieldWithValidData("Test", "User", "01021980", "1234567890", email, "12345678"); 			// testmail@harakiri.com
	}
	
	public void fillingTextFieldWithValidData(String firstName, String lastName, String dateOfBirth, String phoneNumber, String email, String password) {
		enterText(firstNameField, firstName);
		enterText(lastNameField, lastName);
		enterText(dateOfBirthField, dateOfBirth);
		enterText(phoneNumberField, phoneNumber);
		enterText(emailField, email);
		enterText(passwordField, password);
		click(iAgreeCheckBox);
		click(keepMeInformedCheckBox);
		click(submitButton);
	}
	
	public void fillingDeliveryAddress(String address, String town, String postCode) {
		enterText(shippingAddressField, address);
		enterText(shippingCityField, town);
		enterText(shippingPostCodeField, postCode);
	}
	
	public void fillingPaymentMethod(String cardNumber, String monthYear, String cvvCode) {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
		scrollToView(paymentMethodTitle);
		
//		js.executeScript("document.getElementById('checkout-frames-card-number').value='4242424242424242'");
//		js.executeScript("document.getElementsByClassName('card-number-frame frame--activated').item(0).value='4242424242424242'");

		driver.switchTo().frame("cardNumber");
		enterText(cardNumberField, cardNumber, false);
		driver.switchTo().defaultContent();
		
//		js.executeScript("document.getElementsByName('exp-date').item(0).value='1121'");

		driver.switchTo().frame("expiryDate");
		enterText(monthYearField, monthYear);
		driver.switchTo().defaultContent();
		
//		js.executeScript("document.getElementsByName('cvc').item(0).value='100'");

		driver.switchTo().frame("cvv");
		enterText(cvvCodeField, cvvCode);
		driver.switchTo().defaultContent();
		
		selectCheckBox(billingAddressCheckBox);
	}
	
	public void completingOrder () {
		clickOnButton(enterAddressManuallyLink);
		waitToBeVisible(shippingAddressField);
		fillingDeliveryAddress("72 Hilary Avenue", "Liverpool", "L14 6TL");
		fillingPaymentMethod("4242424242424242", "1121", "100");
		clickOnButton(placeOrderButton);
	}
	
	public void clickOnButton(PageElement pageElement) {
		waitToBeClickable(pageElement, 5);
		click(pageElement);
	}
}
