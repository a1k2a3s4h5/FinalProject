package com.healthline.locators;



/**
 * Aim: Locator file of subscribe section
 * Author: Group Q
 * Created on: 31/03/2021
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscribeLocators {

	public WebDriver driver;

	public SubscribeLocators(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@class='accept css-143g64q']")
	public WebElement popupSubmitButton;
	
	@FindBy(className="css-1rzdnss")
	public WebElement subscribeButton;
	
	@FindBy(className="css-dqw99v")
	public WebElement subscribeTestBox;
	
	@FindBy(className="css-14ktbsh")
	public WebElement subscribeButton2;
	
	@FindBy(className="css-1pule1j")
	public WebElement subscribeButton3;
}
