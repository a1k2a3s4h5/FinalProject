package com.page.object.model;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.automation.locators.SearchLocators;

import utils.Logger;

public class SearchPOM {

	SearchLocators loc;
	public WebDriver driver;
	public SearchPOM(WebDriver driver) {	
		this.driver=driver;
		loc=new SearchLocators(driver);
	}
	
	public void sendSearchText(String search) {
		loc.searchTextBox.clear();
		loc.searchTextBox.click();
		loc.searchTextBox.sendKeys(search);
		loc.searchTextBox.sendKeys(Keys.ENTER);
	}
	
}
