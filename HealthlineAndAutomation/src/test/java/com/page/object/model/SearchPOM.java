package com.page.object.model;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.automation.locators.SearchLocators;

public class SearchPOM {

	SearchLocators loc;
	
	public SearchPOM(WebDriver driver) {	
		loc=new SearchLocators(driver);
	}
	
	public void sendSearchText() {
		loc.searchTextBox.clear();
		loc.searchTextBox.click();
		loc.searchTextBox.sendKeys("");
		loc.searchTextBox.sendKeys(Keys.ENTER);
	}
	
}
