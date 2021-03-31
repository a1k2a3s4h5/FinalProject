package com.healthline.testscripts;

import org.testng.annotations.Test;
import com.healthline.locators.EditorsPickLocators;
import utils.SetupEnvironment;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class EditorsPick {

	public WebDriver driver;
	SetupEnvironment setup=new SetupEnvironment();
	EditorsPickLocators loc;
	
	@Test
	public void editorsPickWork() {
		loc.WrokingOfEditorsPickLocators();
	}

	@BeforeMethod
	public void beforeMethod() {
		String url = "https://www.healthline.com/";
		driver = setup.driverReturn("Chrome");
		loc = new EditorsPickLocators(driver);
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

