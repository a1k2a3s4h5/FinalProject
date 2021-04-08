package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.healthline.locators.HealthlineLogoLocators;

import utils.PopUpHandle;

public class HealthlineLogoPOM {
	public WebDriver driver;
	public HealthlineLogoLocators healthlineLogo;
	public PopUpHandle obj;
	public HealthlineLogoPOM(WebDriver driver) {	
		this.driver=driver;
		obj=new PopUpHandle();
		healthlineLogo=new HealthlineLogoLocators(driver);
	}
	
	/**
	 * Description: To click on healthline logo and the page should navigate to home page
	 */
	public void healthlineLogoClick() {
		try {
			healthlineLogo.popupSubmitButton.click();
		}
		catch(Exception e) {}
		healthlineLogo.logo.click();
		try {
			healthlineLogo.mainPopUp.click();
		}
		catch(Exception e) {}

		
	}
	
	public WebElement getHomepage() {
		return healthlineLogo.logo;
	}
	
}
