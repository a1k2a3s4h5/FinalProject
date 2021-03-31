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

import utils.SetupEnvironment;

public class AboutUs {
	
	SetupEnvironment setup = new SetupEnvironment();

	/**
	 * Function name: aboutUs 
	 * Check the about us functionality that performs click
	 * 
	 * @param browserName
	 * 
	 */
	@Test(description = "To verify the send to email item")
	@Parameters("browserName")
	public void aboutUs(String browserName) {
		WebDriver driver = setup.driverReturn(browserName);
		WebElement aboutUsLink = driver.findElement(By.xpath("//a[@title=\"About us\"]"));
		aboutUsLink.click();
		Assert.assertEquals(driver.findElement(By.id("center_column")).isDisplayed(), true);
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
