package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import common.PageElement;

public class MainPage extends BasePage {

	public MainPage(WebDriver driver) {
		super(driver);
	}

	public final PageElement cookies = new PageElement("Cookies", By.cssSelector(
			"body > div:nth-child(3) > div.optanon-alert-box-bg > div.optanon-alert-box-button-container > div.optanon-alert-box-button.optanon-button-allow > div > button"),
			true);

	public final PageElement covidBannerCloseButton = new PageElement("Covid Banner Close Button",
			By.cssSelector("div[class='covid-banner__close']"), true);

	public final PageElement baseTitleOnMainPage = new PageElement("Base Title Of Page",
			By.cssSelector("h1[class='hc-title']"), true);

	public final PageElement shopButton = new PageElement("Shop Button", By.cssSelector("span[class='menu__link']"),
			true);
	public final PageElement hairButton = new PageElement("Hair Button",
			By.xpath("//a[@class='mobile-menu__item md-screen-hidden']//div[text()='Hair']"), true);

	public void closeCookie() {
//		waitToBeClickable(cookies, 5);
		waitToBeClickable(covidBannerCloseButton);
		click(covidBannerCloseButton);
		click(covidBannerCloseButton);
	}

	public void navigetingToHairLossPage() {
		log.info("Navigeting to the: " + HairLossPage.class);
		closeCookie();
		Assert.assertEquals(getText(baseTitleOnMainPage), "Men’s health. The way it should be.");

		waitToBeClickable(shopButton);
		click(shopButton);
		waitToBeClickable(hairButton);
		click(hairButton);
	}

	@Override
	public boolean pageIsDisplayed() {
		return allRequiredElementDisplayed();
	}
}
