package com.amazon.qa.tests;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.amazon.qa.test.base.BasePage;
import com.amazon.qa.test.pages.HomePage;
import com.amazon.qa.test.util.Constants;

public class HomePageTest {

	WebDriver driver;
	BasePage basePage;
	Properties prop;
	HomePage homePage;

	SoftAssert softAssert;

	@BeforeTest
	public void setUp() {
		basePage = new BasePage();
		prop = basePage.init_properties();
		driver = basePage.init_driver(prop);
		// loginPage = new LoginPage(driver);
		//homePage = new HomePage(driver);
		homePage = PageFactory.initElements(driver, HomePage.class);
		
		
		// homePage = loginPage.doLogin(prop.getProperty("username"),
		// prop.getProperty("password"));
		softAssert = new SoftAssert();
	}

//	@Test(priority = 1)
//	public void verifyHomePageHeaderValueTest() {
//		softAssert.assertTrue(homePage.verifyHomePageHeader());
//		String headerValue = homePage.getHomePageHeader();
//		System.out.println("home page header is: " + headerValue);
//		Assert.assertEquals(headerValue, Constants.HOME_PAGE_HEADER, "home page header mismatched...");
//		System.out.println("end of the test.......");
//		softAssert.assertAll();
//	}

//	@Test(priority = 2)
//	public void verifyLoggedInUserTest() {
//		softAssert.assertTrue(homePage.verifyLoggedAccountName());
//		String accountName = homePage.getLoggedAccountName();
//		System.out.println("account Name is: " + accountName);
//		Assert.assertEquals(accountName, prop.getProperty("accountname"));
//		softAssert.assertAll();
//	}

//	@Test()
//	public void verifyHomePageAppLogo() {
//		// System.out.println("Application logo is present");
//		Assert.assertTrue(homePage.verifyApplicationLogo(), "Application logo is not present...");
//	}
//
//	@Test()
//	public void verifyHomePageTitleTest() {
//		String title = homePage.getHomePageTitle();
//		System.out.println("home page title is: " + title);
//		Assert.assertEquals(title, Constants.HOME_PAGE_TITLE, "Home Page Title doesn't match...");
//	}
//
//	@Test
//	public void testSearchField() {
//		homePage.checkSearchField();;
//	}
	

	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}

}
