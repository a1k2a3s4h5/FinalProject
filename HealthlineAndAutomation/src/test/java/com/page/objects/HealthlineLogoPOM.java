package com.page.objects;

import org.openqa.selenium.WebDriver;


import com.healthline.locators.HealthlineLogoLocators;

public class HealthlineLogoPOM {
	public WebDriver driver;
public HealthlineLogoLocators healthlineLogo;
	
	public HealthlineLogoPOM(WebDriver driver) {	
		this.driver=driver;
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
		
	}
	
}
