package com.page.object.model;

import org.openqa.selenium.WebDriver;

import com.automation.locators.BestSellersLocator;


public class BestSellersPOM {
public BestSellersLocator bestsellers;
	
	public BestSellersPOM(WebDriver driver) {	
		bestsellers=new BestSellersLocator(driver);
	}
	
	public void bestSellers() {
		bestsellers.bestSeller.click();
	}
}
