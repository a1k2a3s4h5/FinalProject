package com.automation.testscripts;
/**
 * Aim: To verify signup functionality with different inputs
 * Author: Group Q
 * Created on: 30/03/2021
 */
import java.io.IOException;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.page.objects.SignUpPagePOM;

import utils.Logger;
import utils.VisibilityOfElement;

public class SignUp {
	public String randomEmail() {
	    String generatedstring=RandomStringUtils.randomAlphabetic(5);
	    Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);
		return generatedstring +randomInt;
	}
	public WebDriver driver;
	utils.SetupEnvironment setup = new utils.SetupEnvironment();

	public SignUpPagePOM signUp;
	public boolean visibleFlag = false;
	String emailID=randomEmail() +"@gmail.com";
	public WebDriver returnStateOfDriver() {
		return this.driver;
	}

	@Parameters({ "browserName", "url" })
	@BeforeMethod
	public void beforeMethod(String browserName, String url) {
		driver = setup.driverReturn(browserName, url);
		signUp = new com.page.objects.SignUpPagePOM(driver);
	}

	@DataProvider(name = "validDetails")
	public Object[][] signUpValidDetails() {
		return new Object[][] { { emailID, "Abc", "Xyz", "abcde", "Abc", "Xyz", "Pqr", "Gateway Group",
				"Gateway", "Ahmedabad", "00000", "abcdefgh", "0000000000", "0000000000", "pqr" } };
	}

	@DataProvider(name = "invalidEmail")
	public Object[] signUpInValidEmail() {
		return new Object[] { "test#%1510@test.com" };
	}

	@DataProvider(name = "emailIdExists")
	public Object[] signUpAccountExists() {
		return new Object[] { "test1605@gmail.com" };
	}

	/**
	 * Function name:invalidSignUp 
	 * Functionality:To verify the signup functionality with invalid email address
	 */
	@Test(dataProvider = "invalidEmail", priority = 1, description = "Provide invalid email and check the functionality")
	public void invalidSignUp(String emailAddress) {
		signUp.createAnAccount(emailAddress);
		visibleFlag = VisibilityOfElement.isElementVisible(By.id("create_account_error"), driver);
		Assert.assertEquals(visibleFlag, true,"Through invalid email address we are able to create an account.");
	}

	/**
	 * Function name: emailIdExits 
	 * Functionality: To verify the signup functionality with already registered email address
	 */

	@Test(dataProvider = "emailIdExists", priority = 2, description = "Provide already exists email and check the functionality")
	public void emailIdExits(String emailAddress) {
		signUp.createAnAccount(emailAddress);
		visibleFlag = VisibilityOfElement.isElementVisible(By.id("create_account_error"), driver);
		Assert.assertEquals(visibleFlag, true,"With exist email id we can log in");
		Logger.print("Sign in unsuccessful.");
	}

	/**
	 * Function name: validSignUp 
	 * Functionality: To provide valid details for signup and verify the functionality
	 */
	@Test(dataProvider = "validDetails", priority = 3, description = "Provide valid email and check the functionality")
	public void validSignUp(String emailAddress, String firstname, String lastname, String password, String fName,
			String lName, String company, String adrs1, String adrs2, String city, String postCode, String addinfo,
			String hPhone, String mPhone, String alias) {
		signUp.createAnAccount(emailAddress);
		signUp.personalInformation(firstname, lastname, password);
		signUp.yourAddressDetails(fName, lName, company, adrs1, adrs2, city, postCode, addinfo, hPhone, mPhone, alias);
		visibleFlag = VisibilityOfElement.isElementVisible(By.className("page-heading"), driver);
		Assert.assertEquals(visibleFlag, true,"We can't sign up.");
	}

	@AfterMethod
	public void afterMethod() throws IOException {
		System.out.println("Closing Browser");
		driver.quit();
	}
}