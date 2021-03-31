package com.healthline.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HealthlineLogoLocators {

	public WebDriver driver;
	
	@FindBy(how=How.XPATH , using="//ul[@class='css-q8m3bq']/li[1]")
	public WebElement logo;
	
	public HealthlineLogoLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void workOfHealthlineLogo() {
		logo.click();
		System.out.println("The page is refreshed");
		driver.quit();
	}
}
