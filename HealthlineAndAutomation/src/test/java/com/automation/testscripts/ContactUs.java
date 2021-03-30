package com.automation.testscripts;

/**
 * Aim: To check the categories functionality 
 * Author: Vaishvi Patel
 * Date: 06/03/2021
 * Modified on:30/03/2021
 */
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.locators.ContactUsLocators;

import utils.SetupEnvironment;

public class ContactUs {
	ContactUsLocators loc = new ContactUsLocators();
	SetupEnvironment setup = new SetupEnvironment();

	/**
	 * test the contact us fuctionality with email, file upload and message
	 */
	@Test(description = "To verify the contact us functionality")
	@Parameters({ "browserName" })
	public void contactUsFunctionality(String browserName) {
		WebDriver driver = setup.driverReturn(browserName);
		loc = PageFactory.initElements(driver, ContactUsLocators.class);
		loc.contactUs.click();

		Select subHead = new Select(loc.subHead);
		subHead.selectByVisibleText("Webmaster");
		loc.email.click();
		loc.email.clear();
		loc.email.sendKeys("vaishvi@123.c");
		loc.orderRef.click();
		loc.orderRef.clear();
		loc.orderRef.sendKeys("12345");
		loc.fileUpload.sendKeys(loc.file);
		loc.messege.sendKeys("Hey I have complain.");
		loc.send.click();
		String actualString = driver.findElement(By.xpath("//p[@class=\"alert alert-success\"]")).getText();
		assertTrue(actualString.contains("Your message has been successfully sent to our team."));
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
