package com.automation.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SignUp {
	
	public WebDriver driver;
	@DataProvider(name="validDetails")
	public Object[][] signUpValidDetails(){
		return new Object[][] {{"test1510@test.com","Abc","Xyz","abcde","Abc","Xyz","Pqr","Gateway Group","Gateway","Ahmedabad","00000","abcdefgh","0000000000","0000000000","pqr"
		}};
	}
	
	@DataProvider(name="invalidEmail")
	public Object[] signUpInValidEmail(){
		return new Object[] {"test1510.com"};
	}
	
	@DataProvider(name="emailIdExists")
	public Object[] signUpAccountExists(){
		return new Object[] {"test1605@gmail.com"};
	}
	
	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	public com.page.object.model.SignUpPage signUp;
	
	@Parameters("browserName")
	@BeforeMethod
	public void beforeMethod(String browserName) {
		setup.browserSetup(browserName);
		driver = setup.driverReturn(browserName);
		signUp=new com.page.object.model.SignUpPage(driver);
	}
	
	@Test(dataProvider="invalidEmail",priority=1)
	public void invalidSignUp(String emailAddress) {
		signUp.createAnAccount(emailAddress);
		System.out.println(driver.findElement(By.xpath("//div[@id='create_account_error']//li")).getText());
		Assert.assertEquals(driver.findElement(By.id("create_account_error")).isDisplayed(), true);
	}
	
	@Test(dataProvider="emailIdExists",priority=2)
	public void emailIdExits(String emailAddress) {
		signUp.createAnAccount(emailAddress);
		System.out.println(driver.findElement(By.xpath("//div[@id='create_account_error']//li")).getText());
		Assert.assertEquals(driver.findElement(By.id("create_account_error")).isDisplayed(), true);
	}
	
	@Test(dataProvider="validDetails",priority=3)
	public void validSignUp(String emailAddress,String firstname,String lastname,String password,String fName,String lName,String company,String adrs1,String adrs2,String city,String postCode,String addinfo,String hPhone,String mPhone,String alias) {
		signUp.createAnAccount(emailAddress);
		signUp.personalInformation(firstname,lastname, password);
		signUp.yourAddressDetails(fName,lName, company, adrs1, adrs2, city, postCode, addinfo, hPhone, mPhone, alias);
		Assert.assertEquals(driver.findElement(By.className("page-heading")).isDisplayed(), true);
	}
}
