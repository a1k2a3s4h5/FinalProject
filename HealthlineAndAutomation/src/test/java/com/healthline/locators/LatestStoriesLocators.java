package com.healthline.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LatestStoriesLocators {

	@FindBy(how=How.XPATH , using="//a[contains(text(),'How to Get COVID-19')]")
	public WebElement latestStories;
	
	public LatestStoriesLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
