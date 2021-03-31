package com.automation.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SignIn {
	public WebDriver driver;
	
	@DataProvider(name="invalidDetails")
	public Object[][] signinInValidDetails(){
		return new Object[][] {{"test1605.com","abcde"},{"test1605@gmail.com","abcd"}};
	}
	
	@DataProvider(name="validDetails")
	public Object[][] signInValidDetails(){
		return new Object[][] {{"test1605@gmail.com","abcde"}};
	}
	
	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	public com.page.object.model.SignInPage signIn;
	
	
	@Parameters("browserName")
	@BeforeMethod
	public void beforeMethod(String browserName) {
		setup.browserSetup(browserName);
		driver = setup.driverReturn(browserName);
		signIn=new com.page.object.model.SignInPage(driver);
	}
	
	@Test(dataProvider="invalidDetails",priority=1)
	public void invalidSignIn(String emailAddress,String pswd) {
		signIn.signIn(emailAddress, pswd);
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-danger']/p")).isDisplayed(), true);
	}
	
	
	@Test(dataProvider="validDetails",priority=2)
	public void validSignIn(String emailAddress,String pswd) {
		signIn.signIn(emailAddress, pswd);
		Assert.assertEquals(driver.findElement(By.className("page-heading")).isDisplayed(), true);
	}
}
