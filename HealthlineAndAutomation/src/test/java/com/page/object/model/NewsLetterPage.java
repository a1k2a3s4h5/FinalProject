package com.page.object.model;

import org.openqa.selenium.WebDriver;

import com.automation.locators.NewsletterLocators;


public class NewsLetterPage {
	public NewsletterLocators newsLetter;
	
	public NewsLetterPage(WebDriver driver) {	
		newsLetter=new NewsletterLocators(driver);
	}
	
	public void newsLetter(String email) {
		
		newsLetter.emailAddress.click();
		newsLetter.emailAddress.clear();
		newsLetter.emailAddress.sendKeys(email);
		
		newsLetter.btnSubmit.click();
	}

}
