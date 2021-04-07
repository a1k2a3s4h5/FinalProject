package com.automation.testscripts;
/**
 * Aim: To check the categories functionality 
 * Author:Group Q
 * Date: 06/03/2021
 * Modified on:30/03/2021
 */
import org.testng.annotations.Test;

import com.page.object.model.CategoriesPOM;

import utils.SetupEnvironment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;

public class Categories {
	public WebDriver driver;
	SetupEnvironment setup = new SetupEnvironment();
	public CategoriesPOM categories;

	@Parameters({ "browserName", "url" })
	@BeforeMethod
	public void beforeMethod(String browserName, String url) {
		driver = setup.driverReturn(browserName, url);
		categories = new CategoriesPOM(driver);
	}

	/**
	 * Function name: categories
	 * Functionality: WomenCheck To verify the categories of women
	 * @param browserName
	 * @param url
	 */
	@Test(description = "To verify the women category functionality.")
	public void categoriesWomenCheck() {
		categories.womenCategoryClicks();
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browsr");
		driver.quit();
	}
}
