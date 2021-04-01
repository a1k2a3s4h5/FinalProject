package com.page.object.model;

import org.openqa.selenium.WebDriver;

import com.healthline.locators.LatestStoriesLocators;



public class LatestStoriesPOM {
	public WebDriver driver;
    public LatestStoriesLocators latestStory;
	
	public LatestStoriesPOM(WebDriver driver) {	
		latestStory=new LatestStoriesLocators(driver);
	}
	
	public void workingOfLatestStories() {
		latestStory.latestStories.click();
		driver.navigate().back();
			
	}
}
