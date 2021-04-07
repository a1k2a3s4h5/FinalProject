package com.automation.testscripts;
/*
 * Aim: To view the best seller items
 * Author:Group Q
 * Created on:13/03/2021
 * Modified Last:30/03/2021
 */
import org.testng.annotations.Test;

import com.page.objects.BestSellersPOM;

import utils.SetupEnvironment;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.io.IOException;

import org.openqa.selenium.WebDriver;


public class BestSellers {

	public WebDriver driver;
	SetupEnvironment setup=new SetupEnvironment();
	public BestSellersPOM bestsellers;
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName,String url) {
		System.out.println("Staring test");
		driver = setup.driverReturn(browserName,url);
		bestsellers=new BestSellersPOM(driver);
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
	public void afterMethod(ITestResult result) throws IOException {
		System.out.println("Closing Browser");
		driver.quit();
	}
	
}