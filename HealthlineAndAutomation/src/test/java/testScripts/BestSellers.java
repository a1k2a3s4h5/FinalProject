package testScripts;

import org.testng.annotations.Test;

import utils.CommonUtilities;
import locators.Locators;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class BestSellers {
	Locators loc = new Locators();
	CommonUtilities commonUtilities = new CommonUtilities();
  @Test
  public void f() {
	  WebDriver driver= commonUtilities.driverReturn();
	  WebElement bestSeller=driver.findElement(By.xpath(loc.bestSellerXpath));
	  bestSeller.click();
	  
  }
  @BeforeMethod
	public void beforeMethod() {
		commonUtilities.browserSetup();
		System.out.println("Starting Browser");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browser");
	}

}
