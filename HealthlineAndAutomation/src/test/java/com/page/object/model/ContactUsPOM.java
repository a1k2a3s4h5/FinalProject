package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.automation.locators.ContactUsLocators;;

public class ContactUsPOM {

public ContactUsLocators newsLetter;
	
	public ContactUsPOM(WebDriver driver) {	
		newsLetter=new ContactUsLocators(driver);
	}
	
	public void contactUs(String email,String orderRef,String filePath,String message) {
		newsLetter.contactUsLink.click();
		Select subHead = new Select(newsLetter.subjectHeaingDD);
		subHead.selectByVisibleText("Webmaster");
		newsLetter.email.click();
		newsLetter.email.clear();
		newsLetter.email.sendKeys(email);
		newsLetter.orderRef.click();
		newsLetter.orderRef.clear();
		newsLetter.orderRef.sendKeys(orderRef);
		newsLetter.fileUpload.sendKeys(filePath);
		newsLetter.message.sendKeys(message);
		newsLetter.submit.click();
	}
}
