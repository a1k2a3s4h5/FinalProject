package com.page.objects;

import org.openqa.selenium.WebDriver;
import com.healthline.locators.FeaturedTopicsLocators;

public class FeaturedTopicsPOM {
	
	public WebDriver driver;
	public FeaturedTopicsLocators featuredTopics;
	
	public FeaturedTopicsPOM(WebDriver driver) {
		this.driver=driver;
		featuredTopics=new FeaturedTopicsLocators(driver);
	}
	
	/**
	 * Description: Click on different featured topics link
	 */
	public void featuredTopicsClicks() {
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
