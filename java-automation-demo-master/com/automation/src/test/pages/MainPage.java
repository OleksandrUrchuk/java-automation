package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

	public final String expectedTitleOnMainPage = "Manual: Men's Healthcare. Made easy. More than a pharmacy.";

	public final PageElement shopButton = new PageElement("Shop Button", By.cssSelector("span[class='menu__link']"),
			true);

	public final PageElement hairButton = new PageElement("Hair Button",
			By.xpath("//a[@class='mobile-menu__item md-screen-hidden']//div[text()='Hair']"), true);

	public final PageElement accountButton = new PageElement("Login Button", By.cssSelector(
			"body.webp:nth-child(2) div.main-content header.header.header-home div.header__wrap.container.container.container--xl nav.header__menu.flex.justify-content-end:nth-child(3) ul.menu li.menu__item:nth-child(2) > a.menu__link"),
			true);

	
	public void closeCookie() {
		waitToBeClickable(cookies, 5);
		waitToBeClickable(covidBannerCloseButton, 5);
		click(covidBannerCloseButton);
		click(covidBannerCloseButton);
	}

	public void navigetingToHairLossPage() {
		log.info("Navigeting to the: " + HairLossPage.class);
		closeCookie();
		assertEquals(driver.getTitle(), expectedTitleOnMainPage);

		waitToBeClickable(shopButton);
		click(shopButton);
		waitToBeClickable(hairButton);
		click(hairButton);
	}

	public void navigetingToLoginPage() {
		log.info("Navigeting to the: " + LoginPage.class);
		closeCookie();
		assertEquals(driver.getTitle(), expectedTitleOnMainPage);
		click(accountButton);
	}
	
	public void navigetingToAccountPage() {
		click(accountButton);
		log.info("Navigeting to the: " + AccountPage.class);
	}
}
