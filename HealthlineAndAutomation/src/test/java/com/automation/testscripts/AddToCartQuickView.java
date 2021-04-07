package com.automation.testscripts;
/**
 * Aim: To add the product to cart with quick view
 * Author: Group Q
 * Created on:30/03/2021
 */
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.page.object.model.AddToCartQuickViewPOM;

import utils.SetupEnvironment;

public class AddToCartQuickView {
	public WebDriver driver;
	SetupEnvironment setup = new SetupEnvironment();
	public AddToCartQuickViewPOM quickView;

	@DataProvider(name = "validDetails")
	public Object[][] SignInValidDetails() {
		return new Object[][] { { "test1605@gmail.com", "abcde" } };
	}

	@Parameters({ "browserName", "url" })
	@BeforeMethod
	public void beforeMethod(String browserName, String url) {
		driver = setup.driverReturn(browserName, url);
		quickView = new AddToCartQuickViewPOM(driver);
	}

	@Test(dataProvider = "validDetails", description = "To verify the women category functionality.")
	public void AddTocart(String email, String password) {
		quickView.QuickView(email, password);
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browser");
		driver.quit();
	}
}
