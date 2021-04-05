package com.healthline.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchBarLocators {

	public WebDriver driver;
	public SearchBarLocators(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.CLASS_NAME , using="autocomplete")
	public WebElement searchBox;
	
	@FindBy(how=How.XPATH , using="//button[@aria-label='Click to Search']")
	public WebElement searchElement;
}
