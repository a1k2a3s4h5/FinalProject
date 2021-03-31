package com.healthline.testscripts;

import org.testng.annotations.Test;
import com.healthline.locators.HealthlineLogoLocators;
import utils.SetupEnvironment;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class HealthlineLogo {
	public WebDriver driver;
	SetupEnvironment setup = new SetupEnvironment();
	HealthlineLogoLocators loc;

	@Test
	public void clickFunctionalityOfHealthlineLogo() {
		loc.workOfHealthlineLogo();
	}
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName, String url) {
		driver = setup.driverReturn(browserName,url);
		loc = new HealthlineLogoLocators(driver);
		System.out.println("Starting Browser");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Browser closing");

	}
}
