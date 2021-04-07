package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.healthline.locators.HealthlineLogoLocators;

public class HealthlineLogoPOM {
	public WebDriver driver;
public HealthlineLogoLocators healthlineLogo;
	
	public HealthlineLogoPOM(WebDriver driver) {	
		this.driver=driver;
		healthlineLogo=new HealthlineLogoLocators(driver);
	}
	
	public void workOfHealthlineLogo() {
		try {
			healthlineLogo.popupSubmitButton.click();
		}
		catch(Exception e) {}
		healthlineLogo.logo.click();
		driver.quit();
	}
	
	public WebElement getHomepage() {
		return healthlineLogo.logo;
	}
	
}
