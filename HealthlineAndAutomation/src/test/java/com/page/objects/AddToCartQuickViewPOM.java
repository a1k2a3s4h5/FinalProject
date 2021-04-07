package com.page.objects;

import org.openqa.selenium.WebDriver;

import com.automation.locators.AddToCartQuickViewLocators;

import utils.Logger;

public class AddToCartQuickViewPOM {
public AddToCartQuickViewLocators quickView;
	WebDriver driver;
	public AddToCartQuickViewPOM(WebDriver driver) {	
		this.driver=driver;
		quickView=new AddToCartQuickViewLocators(driver);
	}
	
	/**
	 * Description: Log in with email and password and add the product to cart with quick view method.
	 */
	public void quickView(String email,String password) {
		quickView.signInLink.click();
		quickView.emailField.click();
		quickView.emailField.clear();
		quickView.emailField.sendKeys(email);
		Logger.print("Email address is entered");
		quickView.passwordField.click();
		quickView.passwordField.clear();
		quickView.passwordField.sendKeys(password);
		Logger.print("Password address is entered");
		quickView.submitLogin.click();
		Logger.print("Login done successfully");
		quickView.womenSection.click();
		quickView.tops.click();
		quickView.top1.click();
		driver.switchTo().frame("fancybox-frame1617627541728");
		quickView.quantityUp.click();
		Logger.print("Top added to cart");
	}
}
