package com.page.object.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.healthline.locators.SearchBarLocators;

import utils.VisibilityOfElement;

public class HealthlineSearchBar {
	public WebDriver driver;
	public SearchBarLocators searchBar;
	public boolean visibleFlag=false;
		
		public HealthlineSearchBar(WebDriver driver) {	
			this.driver=driver;
			searchBar=new SearchBarLocators(driver);
		}
	
	public void workingOfSearchBar() {
		try {
			searchBar.popupSubmitButton.click();
		}
		catch(Exception e) {}
		searchBar.searchBox.sendKeys("Women Health");
		searchBar.searchElement.click();
		visibleFlag=VisibilityOfElement.isElementVisible(By.id("adBlock"), driver);
		Assert.assertEquals(visibleFlag, true,"Search functionality is not working.");
	}
}
