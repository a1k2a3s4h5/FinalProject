package com.healthline.testscripts;
/**
 * Aim:Verify the subscribe functionality
 * Author: Vaishvi patel
 * Created on:6/03/2021
 */
import org.testng.annotations.Test;
import com.healthline.locators.SubscribeLocators;

import utils.SetupEnvironment;

import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class Subscribe {
	
	public WebDriver driver;
	SetupEnvironment setup=new SetupEnvironment();
	SubscribeLocators loc;

	@Test
	public void f() {
		loc.subscribeButton.click();

		loc.subscribeTestBox.sendKeys("vaishvipatel365@gmail.com");

		loc.subscribeButton2.click();

		loc.subscribeButton3.click();
		Set<String> handlesSet = driver.getWindowHandles();
		List<String> handlesList = new ArrayList<String>(handlesSet);
		driver.switchTo().window(handlesList.get(1));
		driver.close();
		driver.switchTo().window(handlesList.get(0));
	}

	@BeforeMethod
	public void beforeMethod() {
		String url = "https://www.healthline.com/";
		driver = setup.driverReturn("Chrome");
		loc = new SubscribeLocators(driver);
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
