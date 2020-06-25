package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.PageElement;

public class HairLossPage extends BasePage {

	public HairLossPage(WebDriver driver) {
		super(driver);
	}

	public final PageElement baseTitleOnHairLossPage = new PageElement("Base Title Of Page",
			By.cssSelector("h1[class='hc-title']"), true);

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

	public final PageElement addToCartButton = new PageElement("Add To Cart Button", By.cssSelector(
			"body.webp:nth-child(2) div.main-content section.section--hair-plans:nth-child(8) div.container:nth-child(3) div.HairPlanCard.mostEffective:nth-child(1) div.HairPlanCard--btn > button.btn"),
			true);

	public final PageElement closeCartButton = new PageElement("Close Cart Button",
			By.cssSelector("div[class='cart__back']"), true);

	public final PageElement iconCart = new PageElement("Icon Cart", By.xpath("//div[@class='cart-btn__counter']"),
			true);

	public final PageElement addedToCartButton = new PageElement("Added To Cart Button",
			By.cssSelector("span[class='semibold']"), true);

	public final PageElement itemsInCart = new PageElement("Items In Cart",
			By.cssSelector("div[class='cart__header-label']"), true);

	public void clickAddToCartButton() {
		waitToBeClickable(addToCartButton, 5);
		click(addToCartButton);
	}

	public void clickCloseCartButton() {
		waitToBeClickable(closeCartButton, 5);
		click(closeCartButton);
	}

	@Override
	public boolean pageIsDisplayed() {
		return allRequiredElementDisplayed();
	}
}