package com.automation.testscripts;
/*
 * Aim: To verify signup functionality in the application
 * Author:Group Q
 * Created on:7/03/2021
 * Modified Last:30/03/2021
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SignUp {
	
	public WebDriver driver;
	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	public com.page.object.model.SignUpPage signUp;
	
	@Parameters("browserName")
	@BeforeMethod
	public void beforeMethod(String browserName) {
		setup.browserSetup(browserName);
		driver = setup.driverReturn(browserName);
		signUp=new com.page.object.model.SignUpPage(driver);
	}
	
	
	/**
	 * Function name:signUpValidDetails
	 * Data provider with valid details
	 * @return
	 */
	@DataProvider(name="validDetails")
	public Object[][] signUpValidDetails(){
		return new Object[][] {{"test1510@test.com","Abc","Xyz","abcde","Abc","Xyz","Pqr","Gateway Group","Gateway","Ahmedabad","00000","abcdefgh","0000000000","0000000000","pqr"
		}};
	}
	
	/**
	 * Function name:signUpInValidEmail
	 * Data provider with invalid email address
	 * @return
	 */
	@DataProvider(name="invalidEmail")
	public Object[] signUpInValidEmail(){
		return new Object[] {"test1510.com"};
	}
	
	/**
	 * Function name:signUpAccountExists
	 * Data Provider with already exist email address
	 * @return
	 */
	@DataProvider(name="emailIdExists")
	public Object[] signUpAccountExists(){
		return new Object[] {"test1605@gmail.com"};
	}
	

	/**
	 * Function name:invalidSignUp
	 * To verify the signup functionality with invalid email address
	 * @param emailAddress
	 */
	@Test(dataProvider="invalidEmail",priority=1, description = "Provide invalid email and check the functionality")
	public void invalidSignUp(String emailAddress) {
		signUp.createAnAccount(emailAddress);
		System.out.println(driver.findElement(By.xpath("//div[@id='create_account_error']//li")).getText());
		Assert.assertEquals(driver.findElement(By.id("create_account_error")).isDisplayed(), true);
	}
	
	/**
	 * Function name: emailIdExits
	 * To verify the signup functionality with already registered email address
	 * @param emailAddress
	 */
	@Test(dataProvider="emailIdExists",priority=2,description = "Provide already exists email and check the functionality")
	public void emailIdExits(String emailAddress) {
		signUp.createAnAccount(emailAddress);
		System.out.println(driver.findElement(By.xpath("//div[@id='create_account_error']//li")).getText());
		Assert.assertEquals(driver.findElement(By.id("create_account_error")).isDisplayed(), true);
	}
	
	/**
	 * Function name: validSignUp
	 * To provide valid details for signup and verify the functionality
	 * @param emailAddress
	 * @param firstname
	 * @param lastname
	 * @param password
	 * @param fName
	 * @param lName
	 * @param company
	 * @param adrs1
	 * @param adrs2
	 * @param city
	 * @param postCode
	 * @param addinfo
	 * @param hPhone
	 * @param mPhone
	 * @param alias
	 */
	@Test(dataProvider="validDetails",priority=3,description = "Provide valid email and check the functionality")
	public void validSignUp(String emailAddress,String firstname,String lastname,String password,String fName,String lName,String company,String adrs1,String adrs2,String city,String postCode,String addinfo,String hPhone,String mPhone,String alias) {
		signUp.createAnAccount(emailAddress);
		signUp.personalInformation(firstname,lastname, password);
		signUp.yourAddressDetails(fName,lName, company, adrs1, adrs2, city, postCode, addinfo, hPhone, mPhone, alias);
		Assert.assertEquals(driver.findElement(By.className("page-heading")).isDisplayed(), true);
	}
}
