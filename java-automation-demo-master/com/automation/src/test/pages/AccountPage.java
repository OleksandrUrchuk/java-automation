package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.PageElement;

public class AccountPage extends BasePage {

	public AccountPage(WebDriver driver) {
		super(driver);
	}

	public String expectedOrderStatusMessage = "PENDING";

	public final PageElement yourPlansSection = new PageElement("Your Plans Section", By.cssSelector(
			"body.webp:nth-child(2) div.main-content div.bg-light-deep section.Account div.container div.AccountMenuCard--list a.AccountMenuCard--wrapper:nth-child(1) > div.AccountMenuCard"),
			true);

	public final PageElement orderStatus = new PageElement("Order Status",
			By.cssSelector("div[class='PlanCard--status-badge PlanCard--status-badge-warn']"), true);

}
