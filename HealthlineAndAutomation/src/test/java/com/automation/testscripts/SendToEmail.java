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
import utils.SetupEnvironment;

public class SendToEmail {

	SetupEnvironment setup = new SetupEnvironment();

	/**
	 * Function name: SendToEmailTestCase Check the best seller product
	 * functionality that performs click
	 * 
	 * @param browserName
	 * 
	 */
	@Test(description = "To verify the send to email item")
	@Parameters("browserName")
	public void sendToEmailTestCase(String browserName) {
		WebDriver driver = setup.driverReturn(browserName);
		WebElement sendTolink = driver.findElement(By.linkText("support@seleniumframework.com"));
		sendTolink.click();
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
