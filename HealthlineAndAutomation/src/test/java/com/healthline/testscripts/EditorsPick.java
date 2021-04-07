package com.healthline.testscripts;
/**
 * Aim: To navigate to the Editor's Pick pages and verify that the functionality is working or not
 * Author: Group Q
 * Created on: 15/02/2021
 * Modified on: 31/03/2021
 */
import org.testng.annotations.Test;

import com.page.object.model.EditorsPickPOM;

import utils.SetupEnvironment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;

public class EditorsPick {

	public WebDriver driver;
	SetupEnvironment setup=new SetupEnvironment();
	public EditorsPickPOM editorsPick;
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		editorsPick=new EditorsPickPOM(driver);
	}
	/**
	 * Function: editorsPickWork
	 * Functionality: To verify the click functionality of editor's pick collection
	 */
	@Test(description = "To verify editor's pick functionality")
	public void editorsPickWork() {
		editorsPick.editorsPickClicks();
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browsr");
		driver.quit();
	}
}

