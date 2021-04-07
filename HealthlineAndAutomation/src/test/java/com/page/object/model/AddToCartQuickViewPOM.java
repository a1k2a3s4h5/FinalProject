package com.page.object.model;

import org.openqa.selenium.WebDriver;

import com.automation.locators.AddToCartQuickViewLocators;

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
	public void QuickView(String email,String password) {
		quickView.signInLink.click();
		quickView.emailField.click();
		quickView.emailField.clear();
		quickView.emailField.sendKeys(email);
		quickView.passwordField.click();
		quickView.passwordField.clear();
		quickView.passwordField.sendKeys(password);
		quickView.submitLogin.click();
		quickView.womenSection.click();
		quickView.tops.click();
		quickView.top1.click();
		driver.switchTo().frame("fancybox-frame1617627541728");
		quickView.quantityUp.click();
	}
}
