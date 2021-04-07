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

import com.page.object.model.HealthTopicsPOM;

import utils.SetupEnvironment;

public class HealthTopics {

public WebDriver driver;
SetupEnvironment setup=new SetupEnvironment();
public HealthTopicsPOM healthlineTopics;

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
	healthlineTopics=new HealthTopicsPOM(driver);
}

	/**
	 * Function: healthTopicsInvalidEmail
	 * Functionality: To verify the health topics functionality with invalid email.
	 */
	@Test(dataProvider="invalidEmail",priority=1,description="To verify the health topics functionality with invalid email.")
	public void healthTopicsInvalidEmail(String email) {
	healthlineTopics.healthTopicsClicks(email);
	Assert.assertEquals(driver.findElement(By.xpath("//div[@class='icon-hl-circle-alert css-1dj97s9']")).isDisplayed(), true);
	}
	/**
	 * Function: healthTopicsValidEmail
	 * Functionality: To verify the health topics functionality with valid email.
	 */
	@Test(dataProvider="validEmail",priority=2,description="To verify the health topics functionality with valid email.")
	public void healthTopicsValidEmail(String email) {
	healthlineTopics.healthTopicsClicks(email);
	Assert.assertEquals(driver.findElement(By.xpath("//div[@data-testid='is-inline-success']")).isDisplayed(), true);
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browser");
		driver.quit();
	}


}