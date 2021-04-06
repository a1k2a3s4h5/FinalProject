package com.automation.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AddToCartQuickView {
	public WebDriver driver;
	utils.SetupEnvironment setup = new utils.SetupEnvironment();
	public com.page.object.model.AddToCartQuickViewPOM quickView;

	@DataProvider(name = "validDetails")
	public Object[][] SignInValidDetails() {
		return new Object[][] { { "test1605@gmail.com", "abcde" } };
	}

	@Parameters({ "browserName", "url" })
	@BeforeMethod
	public void beforeMethod(String browserName, String url) {
		driver = setup.driverReturn(browserName, url);
		quickView = new com.page.object.model.AddToCartQuickViewPOM(driver);
	}

	@Test(dataProvider = "validDetails", description = "To verify the women category functionality.")
	public void AddTocart(String email, String password) {
		quickView.QuickView(email, password);
		;
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browser");
		driver.quit();
	}
}
