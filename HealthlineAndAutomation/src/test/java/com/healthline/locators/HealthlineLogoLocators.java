package com.healthline.locators;
/**
 * Aim: Locator file of healthline logo section
 * Author: Group Q
 * Created on: 31/03/2021
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HealthlineLogoLocators {

	public WebDriver driver;
	public HealthlineLogoLocators(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='accept css-143g64q']")
	public WebElement popupSubmitButton;
	
	@FindBy(xpath="//ul[@class='css-q8m3bq']/li[1]")
	public WebElement logo;
	
	@FindBy(xpath="//button[@class='css-1eiym9q icon-hl-close window-close-button']")
	public WebElement mainPopUp;
	
}
