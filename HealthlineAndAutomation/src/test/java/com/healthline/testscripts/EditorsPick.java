package com.healthline.testscripts;
/**
 * Aim: To navigate to the Editor's Pick pages and verify that the functionality is working or not
 * Author: Group Q
 * Created on: 15/02/2021
 * Modified on: 31/03/2021
 */
import org.testng.annotations.Test;
import com.healthline.locators.EditorsPickLocators;
import utils.SetupEnvironment;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class EditorsPick {

	public WebDriver driver;
	SetupEnvironment setup=new SetupEnvironment();
	EditorsPickLocators loc;
	
	/**
	 * Function name: editorsPickWork
	 * To verify the click functionality of editor's pick collection
	 */
	@Test(description = "To verify editor's pick functionality")
	public void editorsPickWork() {
		loc.WrokingOfEditorsPickLocators();
	}

	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName, String url) {
		driver = setup.driverReturn(browserName,url);
		loc = new EditorsPickLocators(driver);
		System.out.println("Starting Browser");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browser");
	}

}

