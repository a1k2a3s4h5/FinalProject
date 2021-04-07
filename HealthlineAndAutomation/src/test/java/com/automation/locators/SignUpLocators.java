package com.automation.locators;
/**
 * Aim: Locators file for sign up functionality
 * Author: Group Q
 * Created on: 31/03/2021
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignUpLocators {

	public SignUpLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//a[@title='Log in to your customer account']")
	public WebElement signInLink;
	
	@FindBy(how=How.ID,using="email_create")
	public WebElement email;
	
	@FindBy(how=How.ID,using="SubmitCreate")
	public WebElement submit;
	
	@FindBy(how=How.ID,using="uniform-id_gender1")
	public WebElement rdobtnMr;
	
	@FindBy(how=How.ID,using="id_gender2")
	public WebElement rdobtnMrs;
	
	@FindBy(how=How.ID,using="customer_firstname")
	public WebElement firstName;
	
	@FindBy(how=How.ID,using="customer_lastname")
	public WebElement lastName;
	
	@FindBy(how=How.ID,using="passwd")
	public WebElement password;
	
	@FindBy(how=How.ID,using="days")
	public WebElement days;
	
	@FindBy(how=How.ID,using="months")
	public WebElement months;
	
	@FindBy(how=How.ID,using="years")
	public WebElement years;
	
	@FindBy(how=How.ID,using="newsletter")
	public WebElement newsletterChk;
	
	@FindBy(how=How.ID,using="optin")
	public WebElement specialOffersChk;
	
	@FindBy(how=How.ID,using="firstname")
	public WebElement fName;
	
	@FindBy(how=How.ID,using="lastname")
	public WebElement lName;
	
	@FindBy(how=How.ID,using="company")
	public WebElement company;
	
	@FindBy(how=How.ID,using="address1")
	public WebElement yourAddress1;
	
	@FindBy(how=How.ID,using="address2")
	public WebElement yourAddress2;
	
	@FindBy(how=How.ID,using="city")
	public WebElement city;
	
	@FindBy(how=How.ID,using="id_state")
	public WebElement states;
	
	@FindBy(how=How.ID,using="postcode")
	public WebElement pinCode;
	
	@FindBy(how=How.ID,using="other")
	public WebElement additionalinfo;
	
	@FindBy(how=How.ID,using="phone")
	public WebElement homePhone;
	
	@FindBy(how=How.ID,using="phone_mobile")
	public WebElement mobilePhone;
	
	@FindBy(how=How.ID,using="alias")
	public WebElement alias;

	@FindBy(how=How.ID,using="submitAccount")
	public WebElement register;

}
