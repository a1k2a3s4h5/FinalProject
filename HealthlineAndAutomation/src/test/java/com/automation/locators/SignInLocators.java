package com.automation.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInLocators {
	
	public SignInLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="login")
	public WebElement signInLink;
	
	@FindBy(id="email")
	public WebElement emailField;
	
	@FindBy(id="passwd")
	public WebElement passwordField;
	
	@FindBy(id="SubmitLogin")
	public WebElement submitLogin;

}
