package com.automation.locators;
/**
 * Aim: Locators file for search functionality
 * Author: Group Q
 * Created on: 31/03/2021
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchLocators {

	public SearchLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="search_query_top")
	public WebElement searchTextBox;
}
