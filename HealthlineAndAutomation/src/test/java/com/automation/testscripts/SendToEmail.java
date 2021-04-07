package com.automation.testscripts;
/**
 * Aim: To verify the send to email in footer of the homepage
 * Author: Group Q
 * Created on: 31/03/2021
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.Logger;
import utils.SetupEnvironment;

public class SendToEmail {
	WebDriver driver;
	SetupEnvironment setup = new SetupEnvironment();

	/**
	 * Function name: SendToEmailTestCase Check the best seller product
	 * functionality that performs click 
	 */
	@Test(description = "To verify the send to email item")
	@Parameters({"browserName","url"})
	public void sendToEmailTestCase(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		WebElement sendTolink = driver.findElement(By.linkText("support@seleniumframework.com"));
		sendTolink.click();
		Logger.print("We can send email by this link.");
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
