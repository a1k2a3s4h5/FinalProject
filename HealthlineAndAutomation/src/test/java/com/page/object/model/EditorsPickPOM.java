package com.page.object.model;

import org.openqa.selenium.WebDriver;

import com.healthline.locators.EditorsPickLocators;

public class EditorsPickPOM {

	public WebDriver driver;
	public EditorsPickLocators editor;
	
	public EditorsPickPOM(WebDriver driver) {
		this.driver=driver;
		editor=new EditorsPickLocators(driver);
	}
	
	public void workingOfEditorsPickLocators() {
		editor.editorPick1.click();
		driver.navigate().back();
		editor.editorPick2.click();
		driver.navigate().back();
		editor.editorPick3.click();
		driver.navigate().back();
		driver.quit();
	}
}
