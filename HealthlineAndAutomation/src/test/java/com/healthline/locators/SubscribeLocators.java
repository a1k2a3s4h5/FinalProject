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

	public SubscribeLocators(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.CLASS_NAME , using="css-1rzdnss")
	public WebElement subscribeButton;
	
	@FindBy(how=How.CLASS_NAME , using="css-dqw99v")
	public WebElement subscribeTestBox;
	
	@FindBy(how=How.CLASS_NAME , using="css-14ktbsh")
	public WebElement subscribeButton2;
	
	@FindBy(how=How.CLASS_NAME , using="css-1pule1j")
	public WebElement subscribeButton3;
}
