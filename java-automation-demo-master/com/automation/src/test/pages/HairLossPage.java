package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.PageElement;

public class HairLossPage extends BasePage {

	public HairLossPage(WebDriver driver) {
		super(driver);
	}

	public final String expectedTitleOnHairLossPage = "Buy Hair Loss Medication & Treatments Online - Works for 9/10 Men - UK Licensed Pharmacy | Manual";
	
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

	public final PageElement addToCartButton_1 = new PageElement("Add To Cart Button For 'The complete hair loss plan'", By.cssSelector(
			"body.webp:nth-child(2) div.main-content section.section--hair-plans:nth-child(8) div.container:nth-child(3) div.HairPlanCard.mostEffective:nth-child(1) div.HairPlanCard--btn > button.btn"),
			true);

	public final PageElement addToCartButton_2 = new PageElement("Add To Cart Button For 'Finasteride hair loss plan'", By.cssSelector(
			"	body.webp:nth-child(2) div.main-content section.section--hair-plans:nth-child(8) div.container:nth-child(3) div.HairPlanCard:nth-child(2) div.HairPlanCard--btn > button.btn"),
			true);

	public final PageElement closeCartButton = new PageElement("Close Cart Button",
			By.cssSelector("div[class='cart__back']"), true);

	public final PageElement iconCart = new PageElement("Icon Cart", By.xpath("//div[@class='cart-btn__counter']"),
			true);

	public final PageElement addedToCartButton = new PageElement("Added To Cart Button",
			By.cssSelector("button[class='btn btn--bg-light']"), true);

	public final PageElement itemsInCart = new PageElement("Items In Cart",
			By.cssSelector("div[class='cart__header-label']"), true);

	public void clickAddToCartButton(PageElement pageElement) {
		waitToBeClickable(pageElement, 5);
		click(pageElement);
	}

	public void clickCloseCartButton() {
		waitToBeClickable(closeCartButton, 5);
		click(closeCartButton);
	}
}
