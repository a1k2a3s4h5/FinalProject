package com.healthline.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditorsPickLocators {
	
	public WebDriver driver;
	
	@FindBy(how=How.XPATH , using="//ul[@class='css-q8m3bq']/li[1]")
	public WebElement editorPick1;
	
	@FindBy(how=How.XPATH , using="//ul[@class='css-q8m3bq']/li[2]")
	public WebElement editorPick2;
	
	@FindBy(how=How.XPATH , using="//ul[@class='css-q8m3bq']/li[3]")
	public WebElement editorPick3;
	
	public EditorsPickLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void WrokingOfEditorsPickLocators() {
		editorPick1.click();
		driver.navigate().back();
		editorPick2.click();
		driver.navigate().back();
		editorPick3.click();
		driver.navigate().back();
		driver.quit();
	}
}
