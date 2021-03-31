package com.healthline.testscripts;

import org.testng.annotations.Test;
import com.healthline.locators.HealthlineLogoLocators;

import utils.SetupEnvironment;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class HealthlineLogo {
	public WebDriver driver;
	SetupEnvironment setup = new SetupEnvironment();
	HealthlineLogoLocators loc;

	@Test
	public void f() {
		loc.logo.click();
		System.out.println("The page is refreshed");
		driver.quit();
	}

	@BeforeMethod
	public void beforeMethod() {
		String url = "https://www.healthline.com/";
		driver = setup.driverReturn("Chrome");
		loc = new HealthlineLogoLocators(driver);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Starting Browser");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Browser closing");

	}
}
