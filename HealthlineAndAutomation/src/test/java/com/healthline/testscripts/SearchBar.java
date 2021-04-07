package com.healthline.testscripts;

/**
 * Aim: To search different health topics in the search bar and check the functionality.
 * Author: Group Q
 * Created on: 30/03/2021
 */
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.page.objects.HealthlineSearchBar;

import utils.SetupEnvironment;

public class SearchBar {

	public WebDriver driver;
	SetupEnvironment setup=new SetupEnvironment();
	public HealthlineSearchBar searchBar;
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		searchBar=new HealthlineSearchBar(driver);
	}
	
	/**
	 * Function: searchBar
	 * Functionality: To verify search bar functionality with different inputs
	 */
	@Test(description="To verify search bar functionality.")
	  public void searchBar() {
		searchBar.searchBar();
	  }
		@AfterMethod
		public void afterMethod() {
			System.out.println("Closing Browser");
			driver.quit();	
		}
}
