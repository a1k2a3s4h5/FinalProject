package com.automation.testscripts;
/**
 * Aim: To check the categories functionality 
 * Author:Group Q
 * Date: 06/03/2021
 * Modified on:30/03/2021
 */
import org.testng.annotations.Test;
import com.automation.locators.*;
import utils.SetupEnvironment;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class Categories {
	WebDriver driver;
	CategoriesLocator loc=new CategoriesLocator() ;
	SetupEnvironment setup= new SetupEnvironment();

	/**
	 * Function name: categoriesWomenCheck
	 * To verify the categories of women
	 * @param browserName
	 * @param url
	 */
	@Test(description = "To verify the women category")
	@Parameters({"browserName","url"})
	public void categoriesWomenCheck(String browserName,String url) {
		driver= setup.driverReturn(browserName,url);
		loc.womenCategoryClicks();
		driver.quit();
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		loc=PageFactory.initElements(driver,CategoriesLocator.class);
		System.out.println("Starting test");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browser");
		
	}
}
