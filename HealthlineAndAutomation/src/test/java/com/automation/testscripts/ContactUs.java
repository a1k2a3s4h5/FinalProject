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

public class ContactUs {
	public WebDriver driver;
	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	public com.page.object.model.ContactUsPOM contactus;
	
	@DataProvider(name="contact-us-details")
	public Object[][] contactusdetails(){
		//return new Object[][] {{"test1605@gmail.com","REF123","./src/main/resources/images/ss.JPG","xyz"}};
		
	return new Object[][] {{"test@gmail.com","REF123","D:\\Vanshika\\Automation Testing\\ss.jpg","xyz"}};
	}
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		contactus=new com.page.object.model.ContactUsPOM(driver);
	}
	
	 // Function name:  validContactUs
	 
	@Test(dataProvider="contact-us-details",priority=1,description="To provide valid details for contact us.")
	public void validContactUs(String email,String orderRef,String filePath,String message)
	{
		contactus.contactUs(email, orderRef, filePath, message);
		Assert.assertEquals(driver.findElement(By.xpath("//p[text()='Your message has been successfully sent to our team.']")).isDisplayed(),true);
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browsr");
		driver.quit();
	}
}
