package com.healthline.testscripts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.healthline.locators.LatestStoriesLocators;

import utils.SetupEnvironment;

public class LatestStories {

	public WebDriver driver;
	SetupEnvironment setup=new SetupEnvironment();
	LatestStoriesLocators loc;
	
	@Test
	public void f() {
		loc.latestStories.click();
		driver.navigate().back();
		driver.quit();	
	}

	@BeforeMethod
	public void beforeMethod() {
		String url = "https://www.healthline.com/";
		driver = setup.driverReturn("Chrome");
		loc = new LatestStoriesLocators(driver);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Starting Browser");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("closing browser");
		
	}
}
