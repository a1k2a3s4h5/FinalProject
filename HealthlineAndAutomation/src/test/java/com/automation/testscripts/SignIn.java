package com.automation.testscripts;
/*
 * Aim: To verify signin functionality
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

public class SignIn {
	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	public com.page.object.model.SignInPagePOM signIn;
	public WebDriver driver;
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		signIn=new com.page.object.model.SignInPagePOM(driver);
	}
	
	/**
	 * Function name: signinInValidDetails
	 * Data provider with invalid details
	 * @return
	 */
	@DataProvider(name="invalidDetails")
	public Object[][] signinInValidDetails(){
		return new Object[][] {{"test1605.com","abcde"},{"test1605@gmail.com","abcd"}};
	}
	
	/**
	 * Function name: signInValidDetails
	 * Data provider with valid details
	 * @return
	 */
	@DataProvider(name="validDetails")
	public Object[][] SignInValidDetails(){
		return new Object[][] {{"test1605@gmail.com","abcde"}};
	}
	
	/**
	 * Function name: invalidSignIn
	 * To check the login functionality with invalid email address and password
	 * There are 2 test scenarios where email address is invalid and in other email is valid but password is invalid
	 * @param emailAddress
	 * @param pswd
	 */
	@Test(dataProvider="invalidDetails",priority=1, description = "To sign in with invalid email")
	public void invalidSignIn(String emailAddress,String pswd) {
		signIn.signIn(emailAddress, pswd);
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-danger']/p")).isDisplayed(), true);
	}
	
	/**
	 * Function name: validSignIn
	 * To check the login functionality with valid credentials
	 * @param emailAddress
	 * @param pswd
	 */
	@Test(dataProvider="validDetails",priority=2, description = "To verify login with valid credentials")
	public void validSignIn(String emailAddress,String pswd) {
		signIn.signIn(emailAddress, pswd);
		Assert.assertEquals(driver.findElement(By.className("page-heading")).isDisplayed(), true);
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browsr");
		driver.quit();
	}
}
