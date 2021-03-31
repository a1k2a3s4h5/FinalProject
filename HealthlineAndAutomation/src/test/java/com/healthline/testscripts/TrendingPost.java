package com.healthline.testscripts;

import org.testng.annotations.Test;
import com.healthline.locators.TrendingPostLocators;
import utils.SetupEnvironment;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class TrendingPost {
	
	public WebDriver driver;
	SetupEnvironment setup=new SetupEnvironment();
	TrendingPostLocators loc;
	
	@Test
	public void trendingPostFunctionality() {
		loc.workingOfTrendingPost();
	}
	
	

	@BeforeMethod
	public void beforeMethod() {
		String url = "https://www.healthline.com/";
		driver = setup.driverReturn("Chrome");
		loc = new TrendingPostLocators(driver);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Starting Browser");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browsr");
		driver.quit();
	}

}
