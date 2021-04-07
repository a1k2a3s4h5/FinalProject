package com.automation.testscripts;

import org.openqa.selenium.By;

/**
 * Aim: To check the categories functionality 
 * Author:Group Q
 * Date: 06/03/2021
 * Modified on:30/03/2021
 */

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.Logger;
import utils.VisibilityOfElement;

public class ContactUs {
	public WebDriver driver;
	public boolean visibleFlag = false;
	utils.SetupEnvironment setup = new utils.SetupEnvironment();
	public com.page.object.model.ContactUsPOM contactus;

	@DataProvider(name = "valid-contact-us-details")
	public Object[][] validContactusdetails() {
		// return new Object[][]
		// {{"test1605@gmail.com","REF123","./src/main/resources/images/ss.JPG","xyz"}};
		return new Object[][] {
				{ "test@gmail.com", "REF123", System.getProperty("user.dir") + "\\images\\testReport.PNG", "Hi" } };
		// return new Object[][] { { "test@gmail.com", "REF123",
		// "C:\\Users\\akash.patel\\Desktop\\email.png", "Hi" } };
	}

	@DataProvider(name = "invalid-contact-us-details")
	public Object[][] inValidContactusdetails() {
		// return new Object[][]
		// {{"test1605@gmail.com","REF123","./src/main/resources/images/ss.JPG","xyz"}};

		return new Object[][] { { "test#24!chj@gmail.com", "REF123",
				System.getProperty("user.dir") + "\\images\\testcasetemplate.xlsx", "Hi" } };

//		return new Object[][] {
//				{ "test#24!chj@gmail.com", "REF123", "C:\\Users\\akash.patel\\Desktop\\testcasetemplate.xlsx", "Hi" } };
	}

	@DataProvider(name = "invalid-only_email--contact-us-details")
	public Object[][] inValidOnlyEmailContactusdetails() {
		// return new Object[][]
		// {{"test1605@gmail.com","REF123","./src/main/resources/images/ss.JPG","xyz"}};

		return new Object[][] { { "test#24!chj@gmail.com", "REF123",
				System.getProperty("user.dir") + "\\images\\testReport.PNG", "Hi" } };

//		return new Object[][] {
//				{ "test#24!chj@gmail.com", "REF123", "C:\\Users\\akash.patel\\Desktop\\download.png", "Hi" } };
	}

	@Parameters({ "browserName", "url" })
	@BeforeMethod
	public void beforeMethod(String browserName, String url) {
		driver = setup.driverReturn(browserName, url);
		contactus = new com.page.object.model.ContactUsPOM(driver);
	}

	// Function name: validContactUs

	@Test(dataProvider = "valid-contact-us-details", priority = 2, description = "To provide valid details for contact us.")
	public void validContactUsWithValidEmailIdAndValidFileType(String email, String orderRef, String filePath,
			String message) {
		contactus.contactUs(email, orderRef, filePath, message);
		visibleFlag = VisibilityOfElement.isElementVisible(
				By.xpath("//p[text()='Your message has been successfully sent to our team.']"), driver);
		Assert.assertEquals(visibleFlag, true, "Messege was not sent.");
		Logger.print("With valid email id and valid filetype we can be able to send messege.");
	}

	@Test(dataProvider = "invalid-contact-us-details", priority = 1, description = "To provide valid details for contact us.")
	public void inValidContactUsWithInValidEmailIdAndInValidFileType(String email, String orderRef, String filePath,
			String message) {
		contactus.contactUs(email, orderRef, filePath, message);
		visibleFlag = VisibilityOfElement.isElementVisible(By.xpath("//p[contains(text(),'1 error')]"), driver);
		Assert.assertEquals(visibleFlag, true,
				"Here we can be able to send messege with improper mail id or with bad file extension.");
		Logger.print("With invalid email id and invalid filetype we can be able to send messege.");
	}

	@Test(dataProvider = "invalid-only_email--contact-us-details", priority = 3, description = "To provide valid details for contact us.")
	public void inValidContactUsWithInValidEmailIdAndValidFileType(String email, String orderRef, String filePath,
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
