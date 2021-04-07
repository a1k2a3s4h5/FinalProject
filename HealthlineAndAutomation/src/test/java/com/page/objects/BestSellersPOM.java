package com.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.automation.locators.BestSellersLocator;

import utils.Logger;


public class BestSellersPOM {
public BestSellersLocator bestsellers;
	
public WebDriver driver;
	public BestSellersPOM(WebDriver driver) {	
		this.driver=driver;
		bestsellers=new BestSellersLocator(driver);
	}
	
	/**
	 * Description: click on best seller link 
	 */
	public void bestSellers() {
		Logger.print("Click on bestseller link");
		bestsellers.bestSeller.click();
		Assert.assertEquals(driver.findElement(By.id("blockbestsellers")).isDisplayed(),true,"Best Seller product list is not visible.");
		Logger.print("Bestseller products are visible");
	}
}
