package com.automation.locators;
/**
 * Aim: Locators file for news letter functionality
 * Author: Group Q
 * Created on: 31/03/2021
 */
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
