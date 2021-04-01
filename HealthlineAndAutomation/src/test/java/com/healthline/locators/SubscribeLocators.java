package com.healthline.locators;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SubscribeLocators {

	public WebDriver driver;

	@FindBy(how=How.CLASS_NAME , using="css-1rzdnss")
	public WebElement subscribeButton;
	
	@FindBy(how=How.CLASS_NAME , using="css-dqw99v")
	public WebElement subscribeTestBox;
	
	@FindBy(how=How.CLASS_NAME , using="css-14ktbsh")
	public WebElement subscribeButton2;
	
	@FindBy(how=How.CLASS_NAME , using="css-1pule1j")
	public WebElement subscribeButton3;
	
	public SubscribeLocators(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void workingOfSubscriber() {
		subscribeButton.click();

		subscribeTestBox.sendKeys("vaishvipatel365@gmail.com");

		subscribeButton2.click();

		subscribeButton3.click();
		Set<String> handlesSet = driver.getWindowHandles();
		List<String> handlesList = new ArrayList<String>(handlesSet);
		driver.switchTo().window(handlesList.get(1));
		driver.close();
		driver.switchTo().window(handlesList.get(0));
	}
	
}
