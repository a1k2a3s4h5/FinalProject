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
	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	public com.page.object.model.HealthlineLogoPOM healthlineLogo;
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		healthlineLogo=new com.page.object.model.HealthlineLogoPOM(driver);
	}

	@Test
	public void clickFunctionalityOfHealthlineLogo() {
		healthlineLogo.workOfHealthlineLogo();
	}
	

}
