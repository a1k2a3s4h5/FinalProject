package com.healthline.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchBarLocators {

	public WebDriver driver;
	
	@FindBy(how=How.CLASS_NAME , using="autocomplete")
	public WebElement searchBox;
	
	@FindBy(how=How.CLASS_NAME , using="css-xadql7")
	public WebElement searchElement;
	
	public SearchBarLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void workingOfSearchBar() {
		searchBox.sendKeys("Women Health");
		searchElement.click();
	}
}
