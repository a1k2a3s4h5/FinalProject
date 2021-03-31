package com.healthline.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TrendingPostLocators {


	@FindBy(how=How.XPATH , using="//a[contains(text(),'authorize the use of Johnson')]")
	public WebElement trendingPost1;
	
	@FindBy(how=How.XPATH , using="//a[contains(text(),'HIV Recovery Stories')]")
	public WebElement trendingPost2;
	
	@FindBy(how=How.XPATH , using="//a[contains(text(),'5 Ways')]")
	public WebElement trendingPost3;
	
	@FindBy(how=How.XPATH , using="//button[@class='css-1eiym9q icon-hl-close window-close-button']")
	public WebElement mainPopUp;
	
	public TrendingPostLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
