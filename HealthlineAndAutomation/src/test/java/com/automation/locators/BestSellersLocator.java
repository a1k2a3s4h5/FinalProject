package com.automation.locators;
/**
 * Aim: Locators file for best seller category functionality
 * Author: Group Q
 * Created on: 30/03/2021
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestSellersLocator {
	
	public BestSellersLocator(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Best Sellers']")
	public WebElement bestSeller;	
}
