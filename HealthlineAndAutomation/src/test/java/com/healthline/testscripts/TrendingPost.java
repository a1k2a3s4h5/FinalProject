package com.healthline.testscripts;

/**
 * Aim: To navigate to the Trending post pages and verify that the functionality is working or not
 * Author: Group Q
 * Created on: 14/02/2021
 * Modified on: 31/03/2021
 */
import org.testng.annotations.Test;
import com.healthline.locators.TrendingPostLocators;
import utils.SetupEnvironment;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class TrendingPost {

	public WebDriver driver;
	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	public com.page.object.model.TrendingPostPOM trendingPost;
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		trendingPost=new com.page.object.model.TrendingPostPOM(driver);
	}

	/**
	 * Function name:trendingPostFunctionality To navigate to the Trending post
	 * pages and verify that the functionality is working or not
	 */
	@Test(description = "trending post functionality")
	public void trendingPostFunctionality() {
		trendingPost.workingOfTrendingPost();
	}


	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browsr");
		driver.quit();
	}

}
