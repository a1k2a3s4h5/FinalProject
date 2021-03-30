package AutomationTestScripts;

import org.testng.annotations.Test;

import AutomationLocators.BestSellersLocator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class BestSellers {

	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	AutomationLocators.BestSellersLocator loc=new AutomationLocators.BestSellersLocator();
	
	/**
	 * check the best seller functionality operation perform click
	 */
	@Parameters("browserName")
	@Test
	public void bestSellerFunctionality() {
		setup.browserSetup("chrome");
		WebDriver driver = setup.driverReturn("chrome");
		loc = PageFactory.initElements(driver, BestSellersLocator.class);
		loc.bestSeller.click();
		driver.quit();
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting test");
		
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browser");
	}
}