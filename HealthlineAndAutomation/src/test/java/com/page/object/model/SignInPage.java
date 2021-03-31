package com.page.object.model;

import org.openqa.selenium.WebDriver;

import com.automation.locators.SignInLocators;;

public class SignInPage {
	
public SignInLocators signin;
	
	public SignInPage(WebDriver driver) {	
		signin=new SignInLocators(driver);
	}
	
	public void signIn(String email,String password) {
		signin.signInLink.click();
		
		signin.emailField.click();
		signin.emailField.clear();
		signin.emailField.sendKeys(email);
	
		signin.passwordField.click();
		signin.passwordField.clear();
		signin.passwordField.sendKeys(password);
	
		signin.submitLogin.click();
	}

}
