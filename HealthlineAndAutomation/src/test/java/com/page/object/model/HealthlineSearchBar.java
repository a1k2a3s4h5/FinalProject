package com.page.object.model;

import org.openqa.selenium.WebDriver;


import com.healthline.locators.SearchBarLocators;

public class HealthlineSearchBar {
	public WebDriver driver;
	public SearchBarLocators searchBar;
		
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
	}
}
