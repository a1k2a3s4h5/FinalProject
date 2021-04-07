package com.healthline.testscripts;
/**
 * Aim: To check the logo navigates to home page or not
 * Author: Group Q
 * Created on: 30/03/2021
 */
import org.testng.annotations.Test;

import com.page.objects.HealthlineLogoPOM;

import utils.VisibilityOfElement;

import org.testng.Assert;

import utils.Logger;
import utils.SetupEnvironment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import org.openqa.selenium.WebDriver;

public class HealthlineLogo {
	public WebDriver driver;
	public boolean visibleFlag=false;
	public SetupEnvironment setup=new SetupEnvironment();
	public HealthlineLogoPOM healthlineLogo;
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		healthlineLogo=new com.page.objects.HealthlineLogoPOM(driver);
	}

	/**
	 * Function: healthlineLogolick
	 * Functionality: To verify healthline logo functionality.
	 */
	@Test(description="To verify healthline logo functionality.")

	public void clickFunctionalityOfHealthlineLogo() {
		healthlineLogo.healthlineLogoClick();
		visibleFlag = VisibilityOfElement.isElementVisible(healthlineLogo.getHomepage(), driver);
		Assert.assertEquals(visibleFlag,true,"Refresh not worked.");
	}

	public void healthlineLogolick() {
		healthlineLogo.healthlineLogoClick();
		Logger.print("Navigated to home page");

	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browsr");
		driver.quit();
	}

}
