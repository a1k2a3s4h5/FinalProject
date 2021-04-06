package com.page.object.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import com.healthline.locators.SubscribeLocators;

public class SubscribePOM {
	
	public WebDriver driver;
	public SubscribeLocators subscribe;
		
		public SubscribePOM(WebDriver driver) {	
			this.driver=driver;
			subscribe=new SubscribeLocators(driver);
		}
	public void workingOfSubscriber(String email) {
		subscribe.subscribeButton.click();
		subscribe.subscribeTestBox.sendKeys(email);
		subscribe.subscribeButton2.click();
		subscribe.subscribeButton3.click();
		Set<String> handlesSet = driver.getWindowHandles();
		List<String> handlesList = new ArrayList<String>(handlesSet);
		driver.switchTo().window(handlesList.get(1));
		driver.close();
		driver.switchTo().window(handlesList.get(0));
	}
}
