package com.automation.testscripts;
/**
 * Aim: To verify that the about us link navigates to proper page or not
 * Author: Group Q
 * Created on: 31/03/2021
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.Logger;
import utils.SetupEnvironment;
import utils.VisibilityOfElement;

public class AboutUs {

	public boolean visibleFlag=false;

	WebDriver driver;

	SetupEnvironment setup = new SetupEnvironment();
	/**
	 * Function name: aboutUs 
	 * Check the about us functionality that performs click
	 * @param url
	 * @param browserName
	 * 
	 */
	@Test(description = "To verify about us is opend succesfully or not.")
	@Parameters({"browserName","url"})
	public void aboutUs(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		WebElement aboutUsLink = driver.findElement(By.xpath("//a[@title=\"About us\"]"));
		aboutUsLink.click();

		visibleFlag=VisibilityOfElement.isElementVisible(By.id("center_column"), driver);
		Assert.assertEquals(visibleFlag, true,"error in loading about us page.");
		Logger.print("About us page opened");
	

	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting test");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browser");
		driver.quit();
	}
}
