package com.automation.testscripts;

import org.testng.annotations.Test;

import com.automation.locators.BestSellersLocator;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class BestSellers {

	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	com.automation.locators.BestSellersLocator loc=new com.automation.locators.BestSellersLocator();
	
	/**
	 * check the best seller functionality operation perform click
	 * 
	 */

	@Test
	@Parameters("browserName")
	public void bestSellerFunctionality(String browserName) {
		setup.browserSetup(browserName);
		WebDriver driver = setup.driverReturn(browserName);
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