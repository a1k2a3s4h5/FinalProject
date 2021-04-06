package com.healthline.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FeaturedTopicsLocators {

	
	public FeaturedTopicsLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//button[@class='accept css-143g64q']")
	public WebElement popupSubmitButton;
	
	@FindBy(how=How.XPATH , using="//div[@class='css-if9915']//div[@class='css-1z98t3']/ul/li[1]/a\r\n")
	public WebElement coronaVirus;
	
	@FindBy(how=How.XPATH , using="//div[@class='css-if9915']//div[@class='css-1z98t3']/ul/li[2]/a\r\n")
	public WebElement nutrition;
	
	@FindBy(how=How.XPATH , using="//div[@class='css-if9915']//div[@class='css-1z98t3']/ul/li[3]/a\r\n")
	public WebElement parentHood;	
	
	@FindBy(how=How.XPATH , using="//button[@class='css-1eiym9q icon-hl-close window-close-button']")
	public WebElement mainPopUp;
}
