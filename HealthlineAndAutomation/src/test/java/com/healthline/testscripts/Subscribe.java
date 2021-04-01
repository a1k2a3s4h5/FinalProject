package com.healthline.testscripts;

/**
 * Aim:Verify the subscribe functionality
 * Author: Group Q
 * Created on:6/03/2021
 * Modified on: 31/03/2021
 */
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class Subscribe {

	public WebDriver driver;
	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	public com.page.object.model.SubscribePOM subscribe;
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		subscribe=new com.page.object.model.SubscribePOM(driver);
	}

	@Test
	public void subscribeFunctionality() {
		subscribe.workingOfSubscriber();
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browser");
	}

}
