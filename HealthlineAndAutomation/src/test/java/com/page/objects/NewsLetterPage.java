package com.page.objects;

import org.openqa.selenium.WebDriver;

import com.automation.locators.NewsletterLocators;

import utils.Logger;


public class NewsLetterPage {
	public NewsletterLocators newsLetter;
	public WebDriver driver;
	
	public NewsLetterPage(WebDriver driver) {	
		this.driver=driver;
		newsLetter=new NewsletterLocators(driver);
	}
	
	/**
	 * Description: To send email and submit
	 */
	public void newsLetter(String email) {
		newsLetter.emailAddress.click();
		newsLetter.emailAddress.clear();
		newsLetter.emailAddress.sendKeys(email);
		Logger.print("Email entered is : "+email);
		newsLetter.btnSubmit.click();
		Logger.print("Subscribed to newsletter");
	}

}
