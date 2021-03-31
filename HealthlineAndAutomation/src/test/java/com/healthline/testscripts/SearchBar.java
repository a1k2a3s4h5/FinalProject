package com.healthline.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.healthline.locators.LatestStoriesLocators;
import com.healthline.locators.SearchBarLocators;

import utils.SetupEnvironment;

public class SearchBar {

	public WebDriver driver;
	SetupEnvironment setup=new SetupEnvironment();
	SearchBarLocators loc;
	
	@Test
	  public void searchBar() {
			loc.workingOfSearchBar();
	  }
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName, String url) {
		driver = setup.driverReturn(browserName,url);
		loc = new SearchBarLocators(driver);
		System.out.println("Starting Browser");
	}


		@AfterMethod
		public void afterMethod() {
			System.out.println("Closing Browser");
			driver.quit();	
		}

	
}
