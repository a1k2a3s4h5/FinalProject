package com.page.object.model;

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
		Logger.print("Here we have sent subject heading is 'Webmaster'.");
		newsLetter.email.click();
		newsLetter.email.clear();
		newsLetter.email.sendKeys(email);
		Logger.print("Send email is : "+email);
		newsLetter.orderRef.click();
		newsLetter.orderRef.clear();
		newsLetter.orderRef.sendKeys(orderRef);
		Logger.print("Send order reference is :"+orderRef);
		newsLetter.fileUpload.sendKeys(filePath);
		Logger.print("Send file with it's path is "+filePath);
		newsLetter.message.sendKeys(message);
		Logger.print("Send messege is : "+message);
		newsLetter.submit.click();
	}
}
