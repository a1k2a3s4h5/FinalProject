package com.healthline.testscripts;
/**
 * Aim: To navigate to the Health Topics pages and verify that the functionality is working or not
 * Author: Group Q
 * Created on: 15/02/2021
 * Modified on: 31/03/2021
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HealthTopics {

public WebDriver driver;
utils.SetupEnvironment setup=new utils.SetupEnvironment();
public com.page.object.model.HealthTopicsPOM healthlineTopics;

@DataProvider(name="invalidEmail")
public Object[][] invalidEmailAddress(){
	return new Object[][] {{"test.com"}};
}
@DataProvider(name="validEmail")
public Object[][] validEmailAddress(){
	return new Object[][] {{"test@gmail.com"}};
}


@Parameters({"browserName","url"})
@BeforeMethod
public void beforeMethod(String browserName,String url) {
	driver = setup.driverReturn(browserName,url);
	healthlineTopics=new com.page.object.model.HealthTopicsPOM(driver);
}

	@Test(dataProvider="invalidEmail",priority=1,description="To verify the health topics functionality with invalid email.")
	public void healthTopicsWithInvalidEmail(String email) {
	healthlineTopics.workingOfHealthTopics(email);
	Assert.assertEquals(driver.findElement(By.xpath("//div[@class='icon-hl-circle-alert css-1dj97s9']")).isDisplayed(), true);
	}
	
	@Test(dataProvider="validEmail",priority=2,description="To verify the health topics functionality with invalid email.")
	public void healthTopicsWithValidEmail(String email) {
	healthlineTopics.workingOfHealthTopics(email);
	Assert.assertEquals(driver.findElement(By.xpath("//div[@data-testid='is-inline-success']")).isDisplayed(), true);
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browser");
		//driver.quit();
	}


}