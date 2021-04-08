package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonLocators;

public class PopUpHandle {
	
	
	/*
	 * @FindBy(xpath="//button[@class='accept css-143g64q']") public WebElement
	 * popupSubmitButton;
	 * 
	 * @FindBy(
	 * xpath="//button[@class='css-1eiym9q icon-hl-close window-close-button']")
	 * public WebElement mainPopUp;
	 * 
	 * public PopUpHandle(WebDriver driver) {
	 * 
	 * PageFactory.initElements(driver, this);
	 * 
	 * }
	 */
	public static CommonLocators obj;
	
	public static void acceptCookie(WebDriver driver) {
		obj = new CommonLocators(driver);
		try {
			obj.popupSubmitButton.click();
		}
		catch(Exception e) {}
		
	}
	
	public static void mainPopUp(WebDriver driver) {
		try {
			 obj.mainPopUp.click();
		}
		catch(Exception e) {}
	}
	
}
