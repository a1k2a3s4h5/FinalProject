package com.automation.locators;
/**
 * Aim: Locators file for contact us functionality
 * Author: Group Q
 * Created on: 31/03/2021
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsLocators {
	
	public ContactUsLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Contact us locators
	@FindBy(xpath="//a[text()='Contact us']")
	public WebElement contactUsLink;
	
	@FindBy(id="id_contact")
	public WebElement subjectHeaingDD;
	
	@FindBy(id="email")
	public WebElement email;
	
	@FindBy(id="id_order")
	public WebElement orderRef;
	
	@FindBy(id="message")
	public WebElement message;
	
	@FindBy(id="fileUpload")
	public WebElement fileUpload;
	
	@FindBy(id="submitMessage")
	public WebElement submit;
	
}
