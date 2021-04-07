package com.automation.locators;
/**
 * Aim: Locators file for contact us functionality
 * Author: Group Q
 * Created on: 31/03/2021
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ContactUsLocators {
	
	public ContactUsLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Contact us locators
	@FindBy(how=How.XPATH,using="//a[text()='Contact us']")
	public WebElement contactUsLink;
	
	@FindBy(how=How.ID,using="id_contact")
	public WebElement subjectHeaingDD;
	
	@FindBy(how=How.ID,using="email")
	public WebElement email;
	
	@FindBy(how=How.ID,using="id_order")
	public WebElement orderRef;
	
	@FindBy(how=How.ID,using="message")
	public WebElement message;
	
	@FindBy(how=How.ID,using="fileUpload")
	public WebElement fileUpload;
	
	@FindBy(how=How.ID,using="submitMessage")
	public WebElement submit;
	
}
