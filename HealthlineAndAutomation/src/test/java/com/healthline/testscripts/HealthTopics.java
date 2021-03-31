package com.healthline.testscripts;

import com.healthline.locators.HealthTopicsLocators;

import utils.SetupEnvironment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HealthTopics {

	public WebDriver driver;
	SetupEnvironment setup=new SetupEnvironment();
	HealthTopicsLocators loc;

		@Test
		public void healthTopics() {
			
		loc.workingOfHealthTopics();
		}

		@BeforeMethod
		public void beforeMethod() {
			String url = "https://www.healthline.com/";
			driver = setup.driverReturn("Chrome");
			loc = new HealthTopicsLocators(driver);
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Starting Browser");
		}

		@AfterMethod
		public void afterMethod() {
			System.out.println("Closing Browser");
		}

}
