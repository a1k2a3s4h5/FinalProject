package com.healthline.locators;

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
	@FindBy(how=How.XPATH, using="//button[@class='accept css-143g64q']")
	public WebElement popupSubmitButton;
	
	@FindBy(how=How.XPATH , using="//ul[@class='css-q8m3bq']/li[1]")
	public WebElement logo;
}
