package com.automation.testscripts;
/**
 * Aim: To check the Contact us functionality 
 * Author:Group Q
 * Date: 06/03/2021
 * Modified on:30/03/2021
 */
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.page.objects.ContactUsPOM;

import utils.Logger;

import utils.VisibilityOfElement;


import utils.SetupEnvironment;

public class ContactUs {
	public WebDriver driver;
	public SetupEnvironment setup = new SetupEnvironment();
	public boolean visibleFlag = false;
	public ContactUsPOM contactus;

	@DataProvider(name = "valid-contact-us-details")
	public Object[][] validContactusdetails() {
		return new Object[][] { { "test@gmail.com", "REF123", System.getProperty("user.dir")+"\\images\\testReport.PNG", "Hi" } };

	}

	@DataProvider(name = "invalid-contact-us-details")
	public Object[][] inValidContactusdetails() {


		return new Object[][] {
			{ "test#24!chj@gmail.com", "REF123", System.getProperty("user.dir")+"\\images\\testcasetemplate.xlsx", "Hi" } };

	}

	@DataProvider(name = "invalid-only_email--contact-us-details")
	public Object[][] inValidOnlyEmailContactusdetails() {


		return new Object[][] {
			{ "test#24!chj@gmail.com", "REF123", System.getProperty("user.dir")+"\\images\\testReport.PNG", "Hi" } };

	}

	@Parameters({ "browserName", "url" })
	@BeforeMethod
	public void beforeMethod(String browserName, String url) {
		driver = setup.driverReturn(browserName, url);
		contactus = new ContactUsPOM(driver);
	}
	
	
	/**
	 * Function: validContactUsWithValidEmailIdAndValidFileType
	 * Functionality: To verify the functionality of contact us with valid email and valid file type
	 */
	@Test(dataProvider = "valid-contact-us-details", priority = 2, description = "To provide valid details for contact us.")
	public void validEmailIdValidFileType(String email, String orderRef, String filePath,
			String message) {
		contactus.contactUs(email, orderRef, filePath, message);
		visibleFlag = VisibilityOfElement.isElementVisible(
				By.xpath("//p[text()='Your message has been successfully sent to our team.']"), driver);
		Assert.assertEquals(visibleFlag, true, "Messege was not sent.");
		Logger.print("With valid email id and valid filetype we can be able to send messege.");
	}

	/**
	 * Function: invalidEmailIdInvalidFileType
	 * Functionality: To verify the functionality of contact us with invalid email and invalid file type
	 */
	@Test(dataProvider = "invalid-contact-us-details", priority = 1, description = "To provide invalid details for contact us.")
	public void invalidEmailIdInvalidFileType(String email, String orderRef, String filePath,
			String message) {
		contactus.contactUs(email, orderRef, filePath, message);
		visibleFlag = VisibilityOfElement.isElementVisible(By.xpath("//p[contains(text(),'1 error')]"), driver);
		Assert.assertEquals(visibleFlag, true,
				"Here we can be able to send messege with improper mail id or with bad file extension.");
		Logger.print("With invalid email id and invalid filetype we can be able to send messege.");
	}

	/**
	 * Function: invalidEmailIdValidFileType
	 * Functionality: To provide invalid email and valid file type and verify contact us functionaliy
	 */
	@Test(dataProvider = "invalid-only_email--contact-us-details", priority = 3, description = "To provide invalid email for contact us.")
	public void invalidEmailIdValidFileType(String email, String orderRef, String filePath,
			String message) {
		contactus.contactUs(email, orderRef, filePath, message);
		visibleFlag = VisibilityOfElement.isElementVisible(By.xpath("//p[contains(text(),'1 error')]"), driver);
		Assert.assertEquals(visibleFlag, true, "Here we can be able to send messege with improper mail id.");
		Logger.print("With invalid email id and valid filetype we can't send messege.");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browsr");
		driver.quit();
	}
}