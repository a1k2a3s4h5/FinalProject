package com.page.objects;

import org.openqa.selenium.WebDriver;
import com.healthline.locators.FeaturedTopicsLocators;

import utils.Logger;

public class FeaturedTopicsPOM {

	public WebDriver driver;
	public FeaturedTopicsLocators featuredTopics;

	public FeaturedTopicsPOM(WebDriver driver) {
		this.driver = driver;
		featuredTopics = new FeaturedTopicsLocators(driver);
	}

	/**
	 * Description: Click on different featured topics link
	 */
	public void featuredTopicsClicks() {
		try {
			featuredTopics.popupSubmitButton.click();
		} catch (Exception e) {
		}
		featuredTopics.coronaVirus.click();
		Logger.print("Featured topic- corona virus article opened");
		driver.navigate().back();
		try {
			featuredTopics.mainPopUp.click();
		} catch (Exception e) {
		}
		featuredTopics.nutrition.click();
		Logger.print("Featured topic- nutrition article opened");
		driver.navigate().back();

		try {
			featuredTopics.mainPopUp.click();
		} catch (Exception e) {
		}
		featuredTopics.parentHood.click();
		Logger.print("Featured topic- parenthood article opened");
		try {
			featuredTopics.mainPopUp.click();
		} catch (Exception e) {
		}
		driver.navigate().back();
	}

}
