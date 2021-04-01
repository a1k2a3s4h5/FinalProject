package com.healthline.testscripts;
/**
 * Aim: To navigate to the Health Topics pages and verify that the functionality is working or not
 * Author: Group Q
 * Created on: 15/02/2021
 * Modified on: 31/03/2021
 */

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HealthTopics {

public WebDriver driver;
	
	
	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	public com.page.object.model.HealthTopicsPOM healthlineTopics;
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		healthlineTopics=new com.page.object.model.HealthTopicsPOM(driver);
	}

		@Test(description="To verify the health topics")
		public void healthTopics() {
			
		healthlineTopics.workingOfHealthTopics();
		}

	
		@AfterMethod
		public void afterMethod() {
			System.out.println("Closing Browser");
		}

}
