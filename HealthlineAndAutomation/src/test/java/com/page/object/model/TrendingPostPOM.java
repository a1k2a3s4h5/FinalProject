package com.page.object.model;

import org.openqa.selenium.WebDriver;

import com.healthline.locators.SubscribeLocators;
import com.healthline.locators.TrendingPostLocators;

public class TrendingPostPOM {
	public WebDriver driver;
	public TrendingPostLocators trendingPost;
		
		public TrendingPostPOM(WebDriver driver) {	
			this.driver=driver;
			trendingPost=new TrendingPostLocators(driver);
		}
	public void workingOfTrendingPost() {
		trendingPost.popupSubmitButton.click();
		trendingPost.trendingPost1.click();
		driver.navigate().back();

		try {
			trendingPost.mainPopUp.click();
			} catch (Exception e) {
				System.out.println("Pop-UP not found.");
			}
		trendingPost.trendingPost2.click();
		driver.navigate().back();
		
	}

}
