package com.healthline.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBarLocators {

	public WebDriver driver;
	public SearchBarLocators(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@class='accept css-143g64q']")
	public WebElement popupSubmitButton;
	
	@FindBy(className="autocomplete")
	public WebElement searchBox;
	
	@FindBy(xpath="//button[@aria-label='Click to Search']")
	public WebElement searchElement;
}
