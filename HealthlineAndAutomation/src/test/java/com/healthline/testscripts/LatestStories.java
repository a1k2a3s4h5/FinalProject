package com.healthline.testscripts;
/**
 * Aim: To navigate to the Latest stories pages and verify that the functionality is working or not
 * Author: Group Q
 * Created on: 15/02/2021
 * Modified on: 31/03/2021
 */
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.page.objects.LatestStoriesPOM;

import utils.Logger;
import utils.SetupEnvironment;

public class LatestStories {

	public WebDriver driver;
	SetupEnvironment setup=new SetupEnvironment();
	public LatestStoriesPOM latestStories;
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		latestStories=new LatestStoriesPOM(driver);
	}
	
	/**
	 * Function: latestStories
	 * Functionality: To perform click functionality on latest stories
	 */
	@Test(description="To verify latest stories functionality.")
	public void latestStories() {
		latestStories.latestStoriesClicks();
		Logger.print("Latest story article is opened.");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing browser");
		driver.quit();
	}
}
