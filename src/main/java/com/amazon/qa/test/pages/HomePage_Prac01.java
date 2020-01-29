
package com.amazon.qa.test.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.amazon.qa.test.base.BasePage;
import com.amazon.qa.test.util.ElementUtil;

public class HomePage_Prac01 extends BasePage {
	WebDriver driver;
	ElementUtil elementUtil;
	public HomePage_Prac01(WebDriver driver){
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
		//elementUtil.waitForElementPresent(logo); //better to use something which is present in home page
    }
//	By logo=By.xpath("//a[@class='nav-logo-link']");
//	public boolean verifyApplictionLogo() {
//		return elementUtil.doIsDisplayed(logo);
//	}
//	By logo = By.xpath("//a[@tabindex='6']");
//	
//	public boolean verifyApplicationLogo() {
//		return elementUtil.doIsDisplayed(logo);
//	}
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	public static WebElement searchField1;
	public void checkSearchField1() {
		searchField1.click();
	}
	@FindBy(xpath="(//input[@class='nav-input'])[2]")
	public static WebElement searchField2;
	public void checkSearchField() {
		searchField2.sendKeys("laptop");
	}
	@FindBy(xpath="//a[@class='nav-a']  ")
	public static WebElement todaysDeal;
	public void verifyTodaysDeal() throws InterruptedException {
		Thread.sleep(2000);
		todaysDeal.click();
	}
	@FindBy(xpath ="//a[@tabindex='48'] ")
	public static WebElement bestSeller;
	public  void verifyBestSellers() {
		bestSeller.click();
	}
	
	@FindBy(xpath ="//a[contains(text(),'Customer Service')]" )
	public static WebElement customerServic;
	public  void verifyCustomerService() {
		customerServic.click();
	}
	@FindBy(xpath ="//a[@tabindex='50']")
	 public static WebElement findAGiftElement;
	
	public void verifyFindAGift() {
		findAGiftElement.click();
	}
	@FindBy(xpath ="//a[@tabindex='51']")
	public static WebElement newReleases;
	
	public void verifyNewReleases() {
		newReleases.click();
	}
	@FindBy(xpath ="//a[@tabindex='52']")
	public static WebElement registry;
	public void verifyRegistry() {
		registry.click();
	}
	@FindBy(xpath ="//a[@tabindex='53']")
	public static WebElement books;
    public void verifyBooks(){
    	books.click();
    }
    @FindBy(xpath="//a[@tabindex='54']")
    public static WebElement giftCards;
    public void verifyGiftCards() {
    	giftCards.click();
    }
	
//	@FindBy(xpath = "*************")
//    public static WebElement searchField;
//	
//    public void checkSearchField() {
//        searchField.click();
//    }
	
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



