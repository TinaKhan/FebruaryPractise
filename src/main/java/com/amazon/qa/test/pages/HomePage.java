package com.amazon.qa.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.amazon.qa.test.base.BasePage;
import com.amazon.qa.test.util.ElementUtil;

public class HomePage extends BasePage {
	WebDriver driver;
	ElementUtil elementUtil;
	public HomePage(WebDriver driver){
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
		//elementUtil.waitForElementPresent(logo); //better to use something which is present in home page
    }
	By logo = By.xpath("//a[@tabindex='6']");
	
	public boolean verifyApplicationLogo() {
		return elementUtil.doIsDisplayed(logo);
	}  

	@FindBy(xpath = "*************")
    public static WebElement searchField;
	
    public void checkSearchField() {
        searchField.click();
    }
	
	public String getHomePageTitle() {
		return elementUtil.doGetTitle();
	}
//
//	public boolean verifyHomePageHeader() {
//		return elementUtil.doIsDisplayed(header);
//	}
//
//	public String getHomePageHeader() {
//		return elementUtil.doGetText(header);
//	}
//
//	public boolean verifyLoggedAccountName() {
//		return elementUtil.doIsDisplayed(accountname);
//	}
//
//	public String getLoggedAccountName() {
//		return elementUtil.doGetText(accountname);
	//}
       //public ContactsPage goToContactsPage() {
//		elementUtil.waitForElementPresent(contactsParentTab);
//		elementUtil.doClick(contactsParentTab);
//		elementUtil.waitForElementPresent(contactsChildTab);
//		elementUtil.doClick(contactsChildTab);
//
//		return new ContactsPage(driver);
//	}
	
//	public void checkLogo() {
//        
//        logo.click();
//    }
    
}
