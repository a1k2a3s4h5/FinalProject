package com.healthline.testscripts;
/**
 * Aim: To navigate to the Editor's Pick pages and verify that the functionality is working or not
 * Author: Group Q
 * Created on: 15/02/2021
 * Modified on: 31/03/2021
 */
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;

public class EditorsPick {

	public WebDriver driver;
	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	public com.page.object.model.EditorsPickPOM editorsPick;
	boolean visibleFlag=false; 
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		editorsPick=new com.page.object.model.EditorsPickPOM(driver);
	}
	/**
	 * Function name: editorsPickWork
	 * To verify the click functionality of editor's pick collection
	 * @throws InterruptedException 
	 */
	@Test(description = "To verify editor's pick functionality")
	public void editorsPickWork() {
		editorsPick.workingOfEditorsPickLocators();
		String editorspick=editorsPick.moreEditorsPick();
		Assert.assertEquals(editorspick,"MORE ON THE TOPIC YOU WERE READING");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browser");
		driver.quit();
	}
}

