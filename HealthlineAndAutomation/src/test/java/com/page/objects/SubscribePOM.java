package com.page.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import com.healthline.locators.SubscribeLocators;

import utils.Logger;

public class SubscribePOM {
	
	public WebDriver driver;
	public SubscribeLocators subscribe;
		
		public SubscribePOM(WebDriver driver) {	
			this.driver=driver;
			subscribe=new SubscribeLocators(driver);
		}

		/**
		 * Description: To subscribe to the website with email
		 */		
		public void subscribe(String email) {
		subscribe.subscribeButton.click();
		subscribe.subscribeTestBox.sendKeys(email);
		Logger.print("Email is entered in the field");
		subscribe.subscribeButton2.click();
		subscribe.subscribeButton3.click();
		Set<String> handlesSet = driver.getWindowHandles();
		List<String> handlesList = new ArrayList<String>(handlesSet);
		driver.switchTo().window(handlesList.get(1));
		driver.close();
		driver.switchTo().window(handlesList.get(0));
		Logger.print("Subscribed to website");
	}
}
