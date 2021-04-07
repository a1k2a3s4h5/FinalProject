package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.automation.locators.ContactUsLocators;

import utils.Logger;;

public class ContactUsPOM {

public ContactUsLocators newsLetter;
	
	public ContactUsPOM(WebDriver driver) {	
		newsLetter=new ContactUsLocators(driver);
	}
	/**
	 * Description: Click on contact us link and enter email, order ref, image and message and submit
	 */
	public void contactUs(String email,String orderRef,String filePath,String message) {
		newsLetter.contactUsLink.click();
		Select subHead = new Select(newsLetter.subjectHeaingDD);
		subHead.selectByVisibleText("Webmaster");
		newsLetter.email.click();
		newsLetter.email.clear();
		newsLetter.email.sendKeys(email);
		Logger.print("Email entered : "+email);
		newsLetter.orderRef.click();
		newsLetter.orderRef.clear();
		newsLetter.orderRef.sendKeys(orderRef);
		Logger.print("Send order reference :"+orderRef);
		newsLetter.fileUpload.sendKeys(filePath);
		Logger.print("File path is "+filePath);
		newsLetter.message.sendKeys(message);
		Logger.print("Message entered is : "+message);
		newsLetter.submit.click();
		Logger.print("The message is submitted");
	}
}
