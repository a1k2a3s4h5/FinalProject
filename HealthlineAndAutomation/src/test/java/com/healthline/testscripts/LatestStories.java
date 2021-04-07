package com.healthline.testscripts;
import org.openqa.selenium.By;
/**
 * Aim: To navigate to the Latest stories pages and verify that the functionality is working or not
 * Author: Group Q
 * Created on: 15/02/2021
 * Modified on: 31/03/2021
 */
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.healthline.locators.LatestStoriesLocators;

import utils.SetupEnvironment;
import utils.VisibilityOfElement;

public class LatestStories {

	public WebDriver driver;
	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	public com.page.object.model.LatestStoriesPOM latestStories;
	public boolean visibleFlag=false;
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		latestStories=new com.page.object.model.LatestStoriesPOM(driver);
	}
	
	@Test(description="To verify latest stories functionality.")
	public void latestStories() {
		latestStories.workingOfLatestStories();
		visibleFlag = VisibilityOfElement.isElementVisible(latestStories.getLatetestStories(), driver);
		Assert.assertEquals(visibleFlag, visibleFlag,"Back on same page after click is not working.");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("closing browser");
		driver.quit();
	}
}
