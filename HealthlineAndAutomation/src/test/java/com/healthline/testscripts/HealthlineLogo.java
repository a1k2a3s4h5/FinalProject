package com.healthline.testscripts;
/**
 * Aim: To check the logo navigates to home page or not
 * Author: Group Q
 * Created on: 30/03/2021
 */
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;

public class HealthlineLogo {
	public WebDriver driver;
	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	public com.page.objects.HealthlineLogoPOM healthlineLogo;
	
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
	public void healthlineLogolick() {
		healthlineLogo.healthlineLogoClick();
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browsr");
		driver.quit();
	}

}
