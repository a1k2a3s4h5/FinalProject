package com.automation.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignInLocators {
	
	public SignInLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.CLASS_NAME,using="login")
	public WebElement signInLink;
	
	@FindBy(how=How.ID,using="email")
	public WebElement emailField;
	
	@FindBy(how=How.ID,using="passwd")
	public WebElement passwordField;
	
	@FindBy(how=How.ID,using="SubmitLogin")
	public WebElement submitLogin;

}
