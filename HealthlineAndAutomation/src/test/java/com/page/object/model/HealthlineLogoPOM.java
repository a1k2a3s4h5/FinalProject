package com.page.object.model;

import org.openqa.selenium.WebDriver;


import com.healthline.locators.HealthlineLogoLocators;

public class HealthlineLogoPOM {
	public WebDriver driver;
public HealthlineLogoLocators healthlineLogo;
	
	public HealthlineLogoPOM(WebDriver driver) {	
		this.driver=driver;
		healthlineLogo=new HealthlineLogoLocators(driver);
	}
	
	public void workOfHealthlineLogo() {
		healthlineLogo.popupSubmitButton.click();
		healthlineLogo.logo.click();
		System.out.println("The page is refreshed");
		driver.quit();
	}
	
}
