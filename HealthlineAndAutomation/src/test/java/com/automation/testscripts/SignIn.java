package com.automation.testscripts;

/*
 * Aim: To verify sign in functionality
 * Author:Group Q
 * Created on: 10/03/2021
 * Modified Last:31/03/2021
 */
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.page.objects.SignInPagePOM;

import utils.Logger;

import utils.VisibilityOfElement;

import utils.SetupEnvironment;


public class SignIn {
	SetupEnvironment setup = new SetupEnvironment();
	public SignInPagePOM signIn;
	public WebDriver driver;
	public boolean visibleFlag = false;

	@Parameters({ "browserName", "url" })
	@BeforeMethod
	public void beforeMethod(String browserName, String url) {
		driver = setup.driverReturn(browserName, url);
		signIn = new SignInPagePOM(driver);
	}

	@DataProvider(name = "invalidDetails")
	public Object[][] signinInValidDetails() {
		return new Object[][] { { "test1605.com", "abcde" }, { "test1605@gmail.com", "abcd" } };
	}

	
	@DataProvider(name = "validDetails")
	public Object[][] SignInValidDetails() {
		return new Object[][] { { "test1605@gmail.com", "abcde" } };
	}

	/**
	 * Function name: invalidSignIn To check the login functionality with invalid
	 * email address and password There are 2 test scenarios where email address is
	 * invalid and in other email is valid but password is invalid
	 */
	@Test(dataProvider = "invalidDetails", priority = 1, description = "To sign in with invalid email")
	public void invalidSignIn(String emailAddress, String pswd) {
		signIn.signIn(emailAddress, pswd);
		visibleFlag = VisibilityOfElement.isElementVisible(By.xpath("//div[@class='alert alert-danger']/p"), driver);
		Assert.assertEquals(visibleFlag, true,"with invalid creadiatianls we can be able to login");
		Logger.print("We can't log in.");
	}

	/**
	 * Function name: validSignIn 
	 * To check the login functionality with valid credentials
	 */
	@Test(dataProvider = "validDetails", priority = 2, description = "To verify login with valid credentials")
	public void validSignIn(String emailAddress, String pswd) {
		signIn.signIn(emailAddress, pswd);
		visibleFlag = VisibilityOfElement.isElementVisible(By.className("page-heading"), driver);
		Assert.assertEquals(visibleFlag, true,"We are not be able to login with valid creadiantials");
		Logger.print("we are logged in.");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browsr");
		driver.quit();
	}
}
