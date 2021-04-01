package com.automation.testscripts;
/**
 * Aim: To check the categories functionality 
 * Author:Group Q
 * Date: 06/03/2021
 * Modified on:30/03/2021
 */
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;

public class Categories {
	public WebDriver driver;
	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	public com.page.object.model.CategoriesPOM categories;
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		categories=new com.page.object.model.CategoriesPOM(driver);
	}
	/**
	 * Function name: categoriesWomenCheck
	 * To verify the categories of women
	 * @param browserName
	 * @param url
	 */
	@Test(description = "To verify the women category")
	public void categoriesWomenCheck() {
		categories.womenCategoryClicks();
	}
}
