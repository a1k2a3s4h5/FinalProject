package utils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisibilityOfElement {

	public static boolean isElementVisible(By by, WebDriver appInstance) {
		try {
			WebDriverWait wait = new WebDriverWait(appInstance, 5);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			return true;
		}
		catch (NoSuchElementException e) {
			return false;
		}
		catch(TimeoutException te) {
			return false;
		}
		
	}
	
	public static boolean isElementVisible(WebElement element, WebDriver appInstance) {
		try {
			WebDriverWait wait = new WebDriverWait(appInstance, 5);
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		}
		catch (NoSuchElementException e) {
			return false;
		}
		catch(TimeoutException te) {
			return false;
		}
		
	}
}
