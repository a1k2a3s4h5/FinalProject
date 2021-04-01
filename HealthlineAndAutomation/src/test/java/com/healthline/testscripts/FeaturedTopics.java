package com.healthline.testscripts;
/**
 * Aim: To navigate to the Featured Topics pages and verify that the functionality is working or not
 * Author: Group Q
 * Created on: 15/02/2021
 * Modified on: 31/03/2021
 */
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;

public class FeaturedTopics {

public WebDriver driver;
	
	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	public com.page.object.model.FeaturedTopicsPOM featuredTopics;
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		featuredTopics=new com.page.object.model.FeaturedTopicsPOM(driver);
	}

	/**
	 * Function name: featuredTopicsWork
	 * To verify the click functionality of editor's pick collection
	 * @throws InterruptedException 
	 */
	@Test(description = "To verify the featured topics")
	public void featuredTopicsWork() {
		
		featuredTopics.workingOfFeaturedTopics(); 
	}
}