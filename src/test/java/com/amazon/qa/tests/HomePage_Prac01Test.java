package com.amazon.qa.tests;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.amazon.qa.test.base.BasePage;
import com.amazon.qa.test.pages.HomePage_Prac01;

public class HomePage_Prac01Test extends BasePage {
//My name Khan
	WebDriver driver;
	BasePage basePage;
	Properties prop;
	HomePage_Prac01 lsm;
	SoftAssert sa;
	Select select;
	JavascriptExecutor js;

	@BeforeTest
	public void setUp() {
		basePage = new BasePage();
		prop = basePage.init_properties();
		driver = basePage.init_driver(prop);
		sa = new SoftAssert();
		lsm = PageFactory.initElements(driver,HomePage_Prac01.class);
	}

//	@Test()
//	public void testLogo() {
//		Assert.assertTrue(lsm.verifyApplictionLogo, "Application logo is not present...");
//	}

	// Number#1
	@Test(priority = 1, enabled = true)
	public void testSearchField1() throws InterruptedException {
		lsm.checkSearchField();
		Thread.sleep(5000);
		}

	// Number#2
	@Test(priority = 2, enabled = true)
	public void testsearchField2() {
		lsm.checkSearchField1();
	}

	@Test(invocationCount = 2)
	public void testtodaysDeal() throws InterruptedException {
		lsm.verifyTodaysDeal();
		
	}

	@Test(invocationCount = 2) // RUN 4 TIMES
	public void checkBestSeller() {
		lsm.verifyBestSellers();
		Assert.assertTrue(true); // hard assert
	}

	@Test
	public void customerServic() {
		lsm.verifyCustomerService();
		sa.assertTrue(true); // softassert is used

	}
///????
//	@Test(dependsOnMethods = { "testLogo" }) // THIS TEST DEPEND ON TESTLOGO
//	public void testHomePageTitle() {
//		// String title = driver.getTitle(); // no need to create a method if we use
//		// this line
//		String title = lsm.verifyHomePageTitle();
//		System.out.println("home page title is: " + title);
//		Assert.assertEquals(title, Constants.HOME_PAGE_TITLE, "Home Page Title doesn't match...");
//
//	}

	// *******************************************************************************//

	// Number#3 //SHORTEST FORM WITHOUT CREATING METHOD IN ANOTHER PAGE
	@Test
	public void findAGiftTest() throws InterruptedException {
		lsm.verifyFindAGift();
		Thread.sleep(5000);
	}

	// Number#3b //SHORTEST FORM

	@Test
	public void checknewReleases() {
		lsm.verifyNewReleases();
	}

	// Number#4
	// when locator is ok but still selenium can't find the webelement
//	@Test
//	public void testPayMyBill() {
//
//		WebElement payMyBill = driver.findElement(By.xpath("(//a[text()='Pay My Bill'])[1]"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click()", payMyBill);
//
//	}

	@Test
	//
	// how to put value in search field
	public void registryTest() {
		lsm.verifyRegistry();
	}
	@Test
     public void  bookTest() {
		lsm.verifyBooks();
	}
	@Test 
	public void giftCardsTest() {
		lsm.verifyGiftCards();
	}
    @Test
    public void SearchGmailAccount() throws InterruptedException {
    	driver.navigate().to("https://accounts.google.com/");
    	driver.findElement(By.xpath("(//div[@class='lCoei YZVTmd SmR8'])[2]")).sendKeys("tinak4781@gmail.com");
    	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Lubna436");
    	driver.findElement(By.xpath("(//span[@class='RveJvd snByac'])[1]")).click();
    	driver.findElement(By.xpath("//span[@class='gb_Ia gbii']")).click();
    	js.executeScript("window.scrollBy(0,3000)","");
    	js.executeScript("window.scrollBy(0,-3000)","");
    	driver.navigate().to("https://www.amazon.com/");
    	Thread.sleep(50000);
    	driver.navigate().back();
    	Thread.sleep(5000);
    	driver.navigate().forward();
    	Thread.sleep(5000);
    	//driver.navigate().refresh();
    	//Ask Tofael Vi about the below codes
    	//WebElement searchField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//WebElement submitButton = driver.findElement(By.xpath("//input[@tabindex='20']"));
		
		//js.executeScript("arguments[0].value='macbook air'", searchField); //to send keys
		
		//js.executeScript("arguments[0].click()", submitButton); //to do click
		
		//Thread.sleep(5000);
		
		//driver.navigate().to("https://accounts.google.com/");
		
		//org.openqa.selenium.Dimension ds = new org.openqa.selenium.Dimension(480, 620); //Dimension class to reset size
		//driver.manage().window().setSize(ds);
		//Thread.sleep(2000); //to see the change
		//driver.manage().window().maximize();
		//Thread.sleep(4000);
		
	}
    
//	// do the homework: find asad mohammmad from find a doctor
//	@Test
//	public void testFindADoctorByName() {
//		driver.findElement(By.xpath("(//a[@class='hidden-xs dropdown'])[2]")).click();
//		driver.findElement(By.xpath("(//span[contains(text(),'By Name')])[4]")).isEnabled();
//		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("AHMED");
//		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("ASAD");
//		driver.findElement(By.xpath("(//button[@type='submit'])[8]")).click();
//
//	}
//
//	@Test
//	public void testFindADoctorPrimaryCarePhysician() {
//		driver.findElement(By.xpath("(//a[@class='hidden-xs dropdown'])[2]")).click();
//		driver.findElement(By.xpath("((//span[contains(text(),'By Name')])[5]")).isEnabled();
//		driver.findElement(By.xpath("(//input[@name=\"lastName\"])[4]")).sendKeys("AHMED");
//		driver.findElement(By.xpath("(//input[@name=\"firstName\"])[4]")).sendKeys("ASAD");
//		driver.findElement(By.xpath("(//button[@type=\"submit\"])[10]")).click();
//	}
//	/*
//	 * @Test void testRequestAnAppointment() {
//	 * driver.findElement(By.xpath("(//a[@class=\"hidden-xs dropdown\"])[3]")).click
//	 * (); driver.findElement(By.xpath("(//span[contains(text(),'By Name')])[3]")).
//	 * isEnabled(); driver.findElement(By.
//	 * xpath("(//input[@aria-label=\"Name\" and @class=\"form-control\"])[1]")).
//	 * sendKeys("ASAD AHMED"); driver.findElement(By.xpath()) }
//	 */
//
////(//a[@class="hidden-xs dropdown"])[3]
//
//	// "Submit" by clicking "Enter" button from keyboard
//
//	@Test(priority = 10, enabled = true)
//	public void useOfEnterFromKeyBoardTest() {
//		driver.findElement(By.xpath("(//i[@class='fa fa-search'])[2]")).click();
//		driver.findElement(By.xpath("(//input[@name='searchQuery' and @class='form-control dropdown-menu__input--search'])[2]")).sendKeys("Irene Rahman", Keys.ENTER);
//
//	}
//
//	// do the homework: find asad mohammmad from find a doctor
//	// "Submit" by clicking "Submit" button from web
//	@Test
//	public void testFindADoctorByName1() throws Exception {
//		driver.findElement(By.xpath("(//a[@class='hidden-xs dropdown'])[2]")).click();
//		Thread.sleep(2000);// Generally smart tester don't use it)
//		driver.findElement(By.xpath("(//span[contains(text(),'By Name')])[4]")).click();
//		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("AHMED");
//		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("ASAD");
//		driver.findElement(By.xpath("(//button[@type='submit'])[8]")).click();
//
//	}
//
//	// "Submit" by clicking "Enter" button from keyboard
//	@Test
//	public void testFindADoctorByName2() throws Exception {
//		driver.findElement(By.xpath("(//a[@class='hidden-xs dropdown'])[2]")).click();
//		Thread.sleep(2000);// Generally smart tester don't use it, they use webdriverWait.
//		driver.findElement(By.xpath("(//span[contains(text(),'By Name')])[4]")).click();
//		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("AHMED");
//		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("ASAD", Keys.ENTER);
//	}
//
//	// use of Selection Class for drop down -- have 3 way
//	// First we are doing selectByIndex() method //not preferable, last choice
//
//	@Test
//	public void selectAddictionPsychiatryFromdropdownTest1() throws InterruptedException {
//		driver.findElement(By.xpath("(//a[@class='hidden-xs dropdown'])[2]")).click();
//		driver.findElement(By.xpath("(//span[contains(text(),'By Specialty')])[3]")).click();
//		WebElement selectSpecialty = driver.findElement(By.xpath("//select[@aria-label='speciality_label']"));
//		select = new Select(selectSpecialty);
//		select.selectByIndex(2);
//		driver.findElement(By.xpath("(//input[@name='zipcode'])[3]")).sendKeys("10029", Keys.ENTER);
//
//	}
//
//	// Second we are doing selectByVisibleText() method
//	// most common method to find drop down
//
//	@Test
//	public void selectAddictionPsychiatryFromdropdownTest2() throws InterruptedException {
//		driver.findElement(By.xpath("(//a[@class='hidden-xs dropdown'])[2]")).click(); // click on findA doctor
//		driver.findElement(By.xpath("(//span[contains(text(),'By Name')])[4]")).click(); // click on by name //using to
//																							// see it can click on
//																							// specialty next
//		driver.findElement(By.xpath("(//span[contains(text(),'By Specialty')])[3]")).click(); // click on by specialty
//		select = new Select(driver.findElement(By.xpath("//select[@aria-label='speciality_label']")));
//		select.selectByVisibleText("Cardiology");
//		driver.findElement(By.xpath("(//input[@name='zipcode'])[3]")).sendKeys("10029", Keys.ENTER);
//
//	}
//	// third we are doing selectByValue() method
//	// Need to know more, similar like visible text
//
//	@Test
//	public void selectAddictionPsychiatryFromdropdownTest3() throws InterruptedException {
//		driver.findElement(By.xpath("(//a[@class='hidden-xs dropdown'])[2]")).click(); // click on findA doctor
//		driver.findElement(By.xpath("(//span[contains(text(),'By Name')])[4]")).click(); // click on by name //using to
//																							// see it can click on
//																							// specialty next
//		driver.findElement(By.xpath("(//span[contains(text(),'By Specialty')])[3]")).click(); // click on by specialty
//		select = new Select(driver.findElement(By.xpath("//select[@aria-label='speciality_label']")));
//		select.selectByValue("Surgery");
//		driver.findElement(By.xpath("(//input[@name='zipcode'])[3]")).sendKeys("10029", Keys.ENTER);
//
//	}

	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}

}




