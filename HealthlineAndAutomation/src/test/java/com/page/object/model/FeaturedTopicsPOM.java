package com.page.object.model;

import org.openqa.selenium.WebDriver;
import com.healthline.locators.FeaturedTopicsLocators;

public class FeaturedTopicsPOM {
	
	public WebDriver driver;
	public FeaturedTopicsLocators featuredTopics;
	
	public FeaturedTopicsPOM(WebDriver driver) {
		this.driver=driver;
		featuredTopics=new FeaturedTopicsLocators(driver);
	}
	
	public void workingOfFeaturedTopics() {
		featuredTopics.coronaVirus.click();
		driver.navigate().back();
		featuredTopics.nutrition.click();
		driver.navigate().back();
		featuredTopics.parentHood.click();
		driver.navigate().back();
	}

}
