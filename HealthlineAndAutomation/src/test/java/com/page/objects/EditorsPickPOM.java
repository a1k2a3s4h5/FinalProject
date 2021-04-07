package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.healthline.locators.EditorsPickLocators;

import utils.Logger;

public class EditorsPickPOM {

	public WebDriver driver;
	public EditorsPickLocators editor;
	public WebDriverWait wait; 
	
	public EditorsPickPOM(WebDriver driver) {
		this.driver=driver;
		editor=new EditorsPickLocators(driver);
		wait=new WebDriverWait(driver, 20);
	}
	/**
	 * Description: Click on different editors pick links 
	 */
	public void editorsPickClicks() {
		editor.popupSubmitButton.click();
		editor.editorPick1.click();
		Logger.print("Editor's Pick article one opened successful");
		driver.navigate().back();
		try {
			editor.mainPopUp.click();
		} catch (Exception e) {
			System.out.println("Pop-UP not found.");
		}
		editor.editorPick2.click();
		Logger.print("Editor's Pick article two opened successful");
		driver.navigate().back();
		try {
			editor.mainPopUp.click();
		} catch (Exception e) {
			System.out.println("Pop-UP not found.");
		}
		editor.editorPick3.click();
		Logger.print("Editor's Pick article three opened successful");
		driver.navigate().back();
		try {
			editor.mainPopUp.click();
		} catch (Exception e) {
			System.out.println("Pop-UP not found.");
		}
	}
	
	public String moreEditorsPick() {
		wait.until(ExpectedConditions.visibilityOf(editor.moreEditors));
		String s = editor.moreEditors.getText();
		return s;
	}
}
