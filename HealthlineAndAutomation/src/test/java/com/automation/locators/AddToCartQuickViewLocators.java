package com.automation.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddToCartQuickViewLocators {
	
	public AddToCartQuickViewLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.CLASS_NAME,using="login")
	public WebElement signInLink;
	
	@FindBy(how=How.ID,using="email")
	public WebElement emailField;
	
	@FindBy(how=How.ID,using="passwd")
	public WebElement passwordField;
	
	@FindBy(how=How.ID,using="SubmitLogin")
	public WebElement submitLogin;
	
	@FindBy(how=How.XPATH,using="//a[text()='Women']")
	public WebElement womenSection;
	
	@FindBy(how=How.XPATH,using="//div[@class='subcategory-image']/a[@title='Tops']")
	public WebElement tops;
	
	@FindBy(how=How.XPATH,using="//img[@title='Faded Short Sleeve T-shirts']")
	public WebElement top1;
	
	@FindBy(how=How.ID,using="fancybox-frame1617627541728")
	public WebElement quickview;
	
	@FindBy(how=How.XPATH,using="//a[@class='btn btn-default button-plus product_quantity_up']")
	public WebElement quantityUp;
	
	
	
	
}
