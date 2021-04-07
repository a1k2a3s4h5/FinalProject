package com.healthline.locators;
/**
 * Aim: Locator file of search bar section
 * Author: Group Q
 * Created on: 31/03/2021
 */
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
	@FindBy(how=How.XPATH, using="//button[@class='accept css-143g64q']")
	public WebElement popupSubmitButton;
	
	@FindBy(how=How.CLASS_NAME , using="autocomplete")
	public WebElement searchBox;
	
	@FindBy(how=How.XPATH , using="//button[@aria-label='Click to Search']")
	public WebElement searchElement;
}
