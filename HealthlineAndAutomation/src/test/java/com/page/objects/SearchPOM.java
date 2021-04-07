package com.page.objects;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.automation.locators.SearchLocators;


public class SearchPOM {

	SearchLocators loc;
	public WebDriver driver;
	public SearchPOM(WebDriver driver) {	
		this.driver=driver;
		loc=new SearchLocators(driver);
	}
	
	/**
	 * Description: To enter the value in search bar
	 */
	public void sendSearchText(String search) {
		loc.searchTextBox.clear();
		loc.searchTextBox.click();
		loc.searchTextBox.sendKeys(search);
		loc.searchTextBox.sendKeys(Keys.ENTER);
	}
	
}
