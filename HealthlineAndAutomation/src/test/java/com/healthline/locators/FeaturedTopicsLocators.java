package com.healthline.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FeaturedTopicsLocators {

	
	public FeaturedTopicsLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH , using="//img[@alt='Coronavirus 2021']")
	public WebElement coronaVirus;
	
	@FindBy(how=How.XPATH , using="//img[@alt='Nutrition']")
	public WebElement nutrition;
	
	@FindBy(how=How.XPATH , using="//img[@alt='Parenthood']")
	public WebElement parentHood;
	
	
	

	
	
}
