package com.healthline.testscripts;

/**
 * Aim:Verify the subscribe functionality
 * Author: Group Q
 * Created on:6/03/2021
 * Modified on: 31/03/2021
 */
import org.testng.annotations.Test;

import com.healthline.locators.SubscribeLocators;

import utils.SetupEnvironment;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class Subscribe {

	public WebDriver driver;
	SetupEnvironment setup = new SetupEnvironment();
	SubscribeLocators loc;

	@Test
	public void subscribeFunctionality() {
		loc.workingOfSubscriber();
	}

	@Parameters({ "browserName", "url" })
	@BeforeMethod
	public void beforeMethod(String browserName, String url) {
		driver = setup.driverReturn(browserName, url);
		loc = new SubscribeLocators(driver);
		System.out.println("Starting Browser");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browser");
	}

}
