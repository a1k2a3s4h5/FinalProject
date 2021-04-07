package com.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.automation.locators.BestSellersLocator;

import utils.Logger;
import utils.VisibilityOfElement;


public class BestSellersPOM {
public BestSellersLocator bestsellers;
public boolean visibleFlag=false;	
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

		visibleFlag=  VisibilityOfElement.isElementVisible(By.id("blockbestsellers"), driver);
		Assert.assertEquals(visibleFlag,true,"Elementlist was not updated so we can say that clik on beast seller is not working fine.");
		Logger.print("Bestseller state changing functionality working correctly.");

		Assert.assertEquals(driver.findElement(By.id("blockbestsellers")).isDisplayed(),true,"Best Seller product list is not visible.");
		Logger.print("Bestseller products are visible");

	}
}
