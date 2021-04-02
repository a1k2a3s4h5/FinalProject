package com.automation.testscripts;
/**
 * Aim: to verify the newsletter email functionality
 * Author: Group Q
 * Created on:31/03/2021
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewsLetter {
	public WebDriver driver;
	
	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	public com.page.object.model.NewsLetterPage newsLetter;
	
	@DataProvider(name="unRegisteredEmail")
	public Object[] newsLetterUnRegisteredEmail(){
		return new Object[] {"test016@gmail.com"};
	}
	
	@DataProvider(name="regsiteredEmail")
	public Object[] newsLetterRegisteredEmail(){
		return new Object[] {"test1605@gmail.com"};
	}
	
	@DataProvider(name="inValidEmail")
	public Object[][] newsLetterInValidEmail(){
	return new Object[][] {{"    "},{"test@gmail"}};
}

	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		newsLetter=new com.page.object.model.NewsLetterPage(driver);
	}
	
	/*
	 * Function name:  inValidEmailNewsLetter
	 */
	@Test(dataProvider="inValidEmail",priority=1,description="To provide invalid email for newsletter functionality.")
	public void inValidEmailNewsLetter(String email)
	{
		newsLetter.newsLetter(email);
		Assert.assertEquals(driver.findElement(By.xpath("//p[@class='alert alert-danger']")).isDisplayed(), true);
	}
	/*
	 * Function name:  registeredNewsLetter
	 */
	
	@Test(dataProvider="regsiteredEmail",priority=2,description="To provide registered email for newsletter functionality.")
	public void registeredNewsLetter(String email)
	{
		newsLetter.newsLetter(email);
		Assert.assertEquals(driver.findElement(By.xpath("//p[@class='alert alert-danger']")).isDisplayed(), true);
	}
	/*
	 * Function name:  unRegisterednNewsLetter
	 */

	@Test(dataProvider="unRegisteredEmail",priority=3,description="To provide unregistered email for newsletter functionality.")
	public void unRegisterednNewsLetter(String email)
	{
		newsLetter.newsLetter(email);
		Assert.assertEquals(driver.findElement(By.xpath("//p[@class='alert alert-success']")).isDisplayed(), true);
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browsr");
		driver.quit();
	}

}
