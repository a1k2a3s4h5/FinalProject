package com.page.objects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.healthline.locators.SearchBarLocators;


import utils.VisibilityOfElement;

import utils.Logger;


public class HealthlineSearchBar {
	public WebDriver driver;
	public SearchBarLocators searchBar;
	public boolean visibleFlag=false;
		
		public HealthlineSearchBar(WebDriver driver) {	
			this.driver=driver;
			searchBar=new SearchBarLocators(driver);
		}
	
		/**
		 * Description: To click on search bar and send different values
		 */
	public void searchBar() {
		try {
			searchBar.popupSubmitButton.click();
		}
		catch(Exception e) {}
		searchBar.searchBox.sendKeys("Women Health");
		Logger.print("Women health is given as input in search by");
		searchBar.searchElement.click();
		visibleFlag=VisibilityOfElement.isElementVisible(By.id("adBlock"), driver);
		Assert.assertEquals(visibleFlag, true,"Search functionality is not working.");
	}
}
