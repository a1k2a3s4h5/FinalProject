package com.automation.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BestSellersLocator {

	@FindBy(xpath="//a[text()='Best Sellers']")
	public WebElement bestSeller;

	
}
