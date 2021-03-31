package com.automation.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.page.object.model.SearchPOM;

public class SearchItems {

	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	SearchPOM search;
	public WebDriver driver;
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(@Optional String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		search=new com.page.object.model.SearchPOM(driver);
	}

	@Test
	public void searchItems()
	{
		search.sendSearchText();
		//Assert.assertEquals(driver.findElement(By.id("order-confirmation")).isDisplayed(), true);
		driver.quit();
	}
}
