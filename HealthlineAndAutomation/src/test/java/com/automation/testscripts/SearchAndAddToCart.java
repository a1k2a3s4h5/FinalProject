package com.automation.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.Logger;

public class SearchAndAddToCart {
	public WebDriver driver;
	utils.SetupEnvironment setup = new utils.SetupEnvironment();
	public com.page.object.model.SearchAndAddToCartPOM addtocart;

	@DataProvider(name = "validDetails")
	public Object[][] signInValidDetails() {
		return new Object[][] { { "test1605@gmail.com", "abcde", "Printed Chiffon Dress"} };
	}

	/*
	 * @DataProvider(name = "addToCart") public Object[][] addToCartData() { return
	 * new Object[][] { { "Blouse", "Black", 2, "s" } }; }
	 */

	@Parameters({ "browserName", "url" })
	@BeforeMethod
	public void beforeMethod(String browserName, String url) {
		driver = setup.driverReturn(browserName, url);
		addtocart = new com.page.object.model.SearchAndAddToCartPOM(driver);
	}

	@Test(dataProvider = "validDetails", description = "To provide valid details for add to cart functionality.")
	public void addToCart(String email, String password, String item) {
		addtocart.signIn(email, password);
		addtocart.searchItem(item);
		addtocart.addToCart();
		
		String productName= addtocart.getProductName();
		Logger.print("Added product name is "+productName);
		String sizeAndColor = addtocart.getSizeAndColor();
		Logger.print("Items color and size are "+sizeAndColor);
		String quantity = addtocart.getQt();
		Logger.print("Items quantity "+quantity);
		String totalPrice = addtocart.getPrice();
		Logger.print("Total Price of only product is  "+totalPrice);
		if(driver.findElement(By.xpath("//span[@id='layer_cart_product_attributes']")).isEnabled()) {
			System.out.println("DOMName: "+driver.findElement(By.xpath("//span[@id='layer_cart_product_attributes']")).getAttribute("innerHTML"));
		}
		else {
			System.out.println("Hiii i am not found..");
		}
		
		Assert.assertEquals(driver.findElement(By.xpath("//span[@id='layer_cart_product_attributes']")).getText(),item,"Differernt product name found.");
		Assert.assertEquals(addtocart.getSizeAndColor(), "Green, M","Different size and color was found.");
		Assert.assertEquals(addtocart.getQt(), "2","Quantity is different");
		Assert.assertEquals(addtocart.getPrice(), "32.80","total price is differernt");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browsr");
		//driver.quit();
	}
}
