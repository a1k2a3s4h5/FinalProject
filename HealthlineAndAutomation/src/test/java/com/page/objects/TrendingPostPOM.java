package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.healthline.locators.TrendingPostLocators;

import utils.Logger;

public class TrendingPostPOM {
	public WebDriver driver;
	public TrendingPostLocators trendingPost;
		
		public TrendingPostPOM(WebDriver driver) {	
			this.driver=driver;
			trendingPost=new TrendingPostLocators(driver);
		}
	
		/**
		 * Description: to click on different trending post links
		 */
		public void trendingPost() {
			trendingPost.popupSubmitButton.click();
			trendingPost.trendingPost1.click();
			Logger.print("Trending post article 1 is opened");
			driver.navigate().back();
	
			try {
				trendingPost.mainPopUp.click();
				} catch (Exception e) {
					System.out.println("Pop-UP not found.");
				}
			trendingPost.trendingPost2.click();
			Logger.print("Trending post article 2 is opened");
			driver.navigate().back();
		
		}
		
		public WebElement getTrandingPost1() {
			return trendingPost.trendingPost1;
		}

}
