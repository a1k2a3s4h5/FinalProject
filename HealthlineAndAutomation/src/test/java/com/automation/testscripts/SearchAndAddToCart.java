package com.automation.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SearchAndAddToCart {
	public WebDriver driver;
	
	@DataProvider(name="validDetails")
	public Object[][] signInValidDetails(){
		return new Object[][] {{"test1605@gmail.com","abcde","Printed Chiffon Dress","XYZ"}};
	}
	
	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	public com.page.object.model.SearchAndAddToCartPOM addtocart;
	
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		addtocart=new com.page.object.model.SearchAndAddToCartPOM(driver);
	}

	@Test(dataProvider="validDetails", description = "To provide valid details for add to cart functionality.")
	public void addToCart(String email,String password,String item,String comments)
	{
		addtocart.signIn(email, password);
		addtocart.searchItem(item);
		addtocart.addToCart(comments);
		Assert.assertEquals(driver.findElement(By.id("order-confirmation")).isDisplayed(), true);
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browsr");
		driver.quit();
	}
}
