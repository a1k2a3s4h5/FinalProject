package com.healthline.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.healthline.locators.SearchBarLocators;

import utils.SetupEnvironment;

public class SearchBar {

	public WebDriver driver;
	SetupEnvironment setup=new SetupEnvironment();
	SearchBarLocators loc;
	
	@Test
	  public void searchBar() {
			loc.searchBox.sendKeys("Women Health");
			loc.searchElement.click();
	  }
	  @BeforeMethod
		public void beforeMethod() {
		  String url = "https://www.healthline.com/";
			driver = setup.driverReturn("Chrome");
			loc = new SearchBarLocators(driver);
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Starting Browser");
		}

		@AfterMethod
		public void afterMethod() {
			System.out.println("Closing Browser");
			
		}

	
}
