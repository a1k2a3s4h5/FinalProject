package com.automation.locators;
/**
 * Aim: Locators file for sign up functionality
 * Author: Group Q
 * Created on: 31/03/2021
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpLocators {

	public SignUpLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	public WebElement signInLink;
	
	@FindBy(id="email_create")
	public WebElement email;
	
	@FindBy(id="SubmitCreate")
	public WebElement submit;
	
	@FindBy(id="uniform-id_gender1")
	public WebElement rdobtnMr;
	
	@FindBy(id="id_gender2")
	public WebElement rdobtnMrs;
	
	@FindBy(id="customer_firstname")
	public WebElement firstName;
	
	@FindBy(id="customer_lastname")
	public WebElement lastName;
	
	@FindBy(id="passwd")
	public WebElement password;
	
	@FindBy(id="days")
	public WebElement days;
	
	@FindBy(id="months")
	public WebElement months;
	
	@FindBy(id="years")
	public WebElement years;
	
	@FindBy(id="newsletter")
	public WebElement newsletterChk;
	
	@FindBy(id="optin")
	public WebElement specialOffersChk;
	
	@FindBy(id="firstname")
	public WebElement fName;
	
	@FindBy(id="lastname")
	public WebElement lName;
	
	@FindBy(id="company")
	public WebElement company;
	
	@FindBy(id="address1")
	public WebElement yourAddress1;
	
	@FindBy(id="address2")
	public WebElement yourAddress2;
	
	@FindBy(id="city")
	public WebElement city;
	
	@FindBy(id="id_state")
	public WebElement states;
	
	@FindBy(id="postcode")
	public WebElement pinCode;
	
	@FindBy(id="other")
	public WebElement additionalinfo;
	
	@FindBy(id="phone")
	public WebElement homePhone;
	
	@FindBy(id="phone_mobile")
	public WebElement mobilePhone;
	
	@FindBy(id="alias")
	public WebElement alias;

	@FindBy(id="submitAccount")
	public WebElement register;

}
