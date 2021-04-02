package com.automation.testscripts;
/*
 * Aim: To view the best seller items
 * Author:Group Q
 * Created on:13/03/2021
 * Modified Last:30/03/2021
 */
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;


public class BestSellers {

	public WebDriver driver;
	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	public com.page.object.model.BestSellersPOM bestsellers;
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		bestsellers=new com.page.object.model.BestSellersPOM(driver);
	}
	
	/**
	 * Function name: bestSellerFunctionality
	 * Check the best seller product functionality that performs click
	 * @param browserName
	 * @param url
	 */
	@Test(description = "To verify the bestseller item")
	public void bestSellerFunctionality() {
		bestsellers.bestSellers();
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browsr");
		driver.quit();
	}
}