package com.automation.testscripts;
/*
 * Aim: To view the best seller items
 * Author:Group Q
 * Created on:13/03/2021
 * Modified Last:30/03/2021
 */
import org.testng.annotations.Test;
import com.automation.locators.BestSellersLocator;
import utils.SetupEnvironment;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class BestSellers {

	SetupEnvironment setup=new SetupEnvironment();
	BestSellersLocator loc=new BestSellersLocator();
	
	/**
	 * Function name: bestSellerFunctionality
	 * Check the best seller product functionality that performs click
	 * @param browserName
	 * @param url
	 * 
	 */
	@Test(description = "To verify the bestseller item")
	@Parameters({"browserName","url"})
	public void bestSellerFunctionality(String browserName,String url) {
		WebDriver driver = setup.driverReturn(browserName,url);
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