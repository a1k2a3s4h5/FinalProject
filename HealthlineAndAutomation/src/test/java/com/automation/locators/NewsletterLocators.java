package com.automation.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewsletterLocators {
	public NewsletterLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="newsletter-input")
	public WebElement emailAddress;
	
	@FindBy(how=How.XPATH,using="//button[@name='submitNewsletter']")
	public WebElement btnSubmit;
}
