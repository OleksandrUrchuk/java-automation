package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.PageElement;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public final PageElement loginTextField = new PageElement("Login Text Field",
			By.xpath("//span[contains(text(),'Or log in with your email address')]"), true);

	public final PageElement emailField = new PageElement("Email Field", By.cssSelector("input[data-test='email']"),
			true);

	public final PageElement passwordField = new PageElement("Password Field", By.cssSelector("input[data-test='pass']"),
			true);

	public final PageElement submitButton = new PageElement("Submit Button", By.cssSelector("button[type='submit']"),
			true);

	public void login(String email, String password) {
		scrollToView(loginTextField);
		enterText(emailField, email);
		enterText(passwordField, password);
		click(submitButton);
	}

}
