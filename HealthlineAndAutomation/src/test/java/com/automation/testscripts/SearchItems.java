package com.automation.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
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

	@Test(description="To verify the search functionality.")
	public void searchItems()
	{
		search.sendSearchText();
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browsr");
		driver.quit();
	}
}
