package com.healthline.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LatestStoriesLocators {

	public WebDriver driver;
	
	@FindBy(how=How.XPATH , using="//li[@class='css-a4lyxf']/div")
	public WebElement latestStories;
	
	public void workingOfLatestStories() {
		latestStories.click();
		driver.navigate().back();
			
	}
	
	public LatestStoriesLocators(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
