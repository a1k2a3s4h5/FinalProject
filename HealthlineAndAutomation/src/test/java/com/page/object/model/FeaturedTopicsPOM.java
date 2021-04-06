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
		try {
			featuredTopics.popupSubmitButton.click();
		}
		catch(Exception e) {}
		featuredTopics.coronaVirus.click();
		driver.navigate().back();
		try {
			featuredTopics.mainPopUp.click();
		}
		catch(Exception e) {}
		featuredTopics.nutrition.click();
		try {
			featuredTopics.mainPopUp.click();
		}
		catch(Exception e) {}
		driver.navigate().back();
		try {
			featuredTopics.mainPopUp.click();
		}
		catch(Exception e) {}
		featuredTopics.parentHood.click();
		try {
			featuredTopics.mainPopUp.click();
		}
		catch(Exception e) {}
		driver.navigate().back();
	}

}
