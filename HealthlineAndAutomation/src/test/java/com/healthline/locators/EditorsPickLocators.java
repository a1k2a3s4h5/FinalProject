package com.healthline.locators;
/**
 * Aim: Locator file of editor's pick section
 * Author: Group Q
 * Created on: 31/03/2021
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditorsPickLocators {
	public EditorsPickLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='accept css-143g64q']")
	public WebElement popupSubmitButton;
	
	@FindBy(xpath="//ul[@class='css-q8m3bq']/li[1]")
	public WebElement editorPick1;
	
	@FindBy(xpath="//ul[@class='css-q8m3bq']/li[2]")
	public WebElement editorPick2;
	
	@FindBy(xpath="//ul[@class='css-q8m3bq']/li[3]")
	public WebElement editorPick3;
	
	@FindBy(xpath="//h2[text()='More on the topic you were reading']")
	public WebElement moreEditors;
	
	@FindBy(xpath="//button[@class='css-1eiym9q icon-hl-close window-close-button']")
	public WebElement mainPopUp;
}
