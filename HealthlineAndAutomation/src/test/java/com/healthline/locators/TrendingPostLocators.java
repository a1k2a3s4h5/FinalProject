package com.healthline.locators;
/**
 * Aim: Locator file of trending post section
 * Author: Group Q
 * Created on: 31/03/2021
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrendingPostLocators {

	public WebDriver driver;

	public TrendingPostLocators(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[@class='accept css-143g64q']")
	public WebElement popupSubmitButton;
	
	@FindBy(xpath="//a[text()='10 Natural Energy Drinks to Put Pep in Your Step']")
	public WebElement trendingPost1;

	@FindBy(xpath="//a[text()='11 Ways to Get the Dewiest Skin of Your Life']")
	public WebElement trendingPost2;
	
	@FindBy(xpath="//button[@class='css-1eiym9q icon-hl-close window-close-button']")
	public WebElement mainPopUp;
}
