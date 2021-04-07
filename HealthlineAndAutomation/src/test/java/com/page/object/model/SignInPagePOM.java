package com.page.object.model;

import org.openqa.selenium.WebDriver;

import com.automation.locators.SignInLocators;

import utils.Logger;;

public class SignInPagePOM {
	
public SignInLocators signin;
	
	public SignInPagePOM(WebDriver driver) {	
		signin=new SignInLocators(driver);
	}
	
	/**
	 * Description: To sign in the website with email and password
	 */
	public void signIn(String email,String password) {
		signin.signInLink.click();
		
		signin.emailField.click();
		signin.emailField.clear();
		signin.emailField.sendKeys(email);
		Logger.print("Send email is :"+email);
		signin.passwordField.click();
		signin.passwordField.clear();
		signin.passwordField.sendKeys(password);
		Logger.print("Send password is :"+password);
		signin.submitLogin.click();
	}

}
