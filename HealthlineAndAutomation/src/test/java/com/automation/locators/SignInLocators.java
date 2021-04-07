package com.automation.locators;
/**
 * Aim: Locators file for signin functionality
 * Author: Group Q
 * Created on: 31/03/2021
 */
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
