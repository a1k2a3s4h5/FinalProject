package com.automation.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsletterLocators {
	public NewsletterLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="newsletter-input")
	public WebElement emailAddress;
	
	@FindBy(xpath="//button[@name='submitNewsletter']")
	public WebElement btnSubmit;
}
