package com.page.objects;

import org.openqa.selenium.WebDriver;

import com.healthline.locators.EditorsPickLocators;

import utils.Logger;

public class EditorsPickPOM {

	public WebDriver driver;
	public EditorsPickLocators editor;
	
	public EditorsPickPOM(WebDriver driver) {
		this.driver=driver;
		editor=new EditorsPickLocators(driver);
	}
	/**
	 * Description: Click on different editors pick links 
	 */
	public void editorsPickClicks() {
		editor.popupSubmitButton.click();
		editor.editorPick1.click();
		Logger.print("Editor's Pick article one opened successful");
		driver.navigate().back();
		editor.editorPick2.click();
		Logger.print("Editor's Pick article two opened successful");
		driver.navigate().back();
		editor.editorPick3.click();
		Logger.print("Editor's Pick article three opened successful");
		driver.navigate().back();
		driver.quit();
	}
}
