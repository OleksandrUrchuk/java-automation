package tests;

import common.ProjectConfig;
import common.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.AccountPage;
import pages.HairLossPage;
import pages.LoginPage;
import pages.MainPage;

public class BaseTest {

	protected MainPage mainPage;
	protected HairLossPage hairLossPage;
	protected AccountPage accountPage;
	protected LoginPage loginPage;

	public static WebDriver driver;

	@BeforeMethod
	public void setupTestRun() {
		driver = new DriverFactory().getDriver();
		initPages();
		driver.get(ProjectConfig.getBaseUrl());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	/**
	 * Method of initialization page for pages packages should be write as for
	 * Example loginPage = new LoginPage(driver);
	 **/
	private void initPages() {
		mainPage = new MainPage(driver);
		hairLossPage = new HairLossPage(driver);
		accountPage = new AccountPage(driver);
		loginPage = new LoginPage(driver);
	}
}
