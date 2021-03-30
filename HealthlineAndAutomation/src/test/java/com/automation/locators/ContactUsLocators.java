package com.automation.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactUsLocators {
	//Contact us locators
	@FindBy(xpath="//a[@title='Contact Us']")
	public WebElement contactUs;

	@FindBy(id="id_contact")
	public WebElement subHead;
	
	@FindBy(how=How.ID,using="email")
	public WebElement email;
	
	@FindBy(how=How.ID,using="id_order")
	public WebElement orderRef;

	@FindBy(how=How.ID,using="fileUpload")
	public WebElement fileUpload;
	
	public String file= "C://Users//vaishvi.patel//Downloads//screenshot1.jpg";
	
	@FindBy(how=How.ID,using="message")
	public WebElement messege;

	
	@FindBy(how=How.XPATH,using="//button[@id='submitMessage']")
	public WebElement send;

	@FindBy(how=How.XPATH,using="//p[contains(text(),'Your message has been successfully')]")
	public WebElement sucessMessege;
	
}
