package com.automation.locators;
/**
 * Aim: Locators file for categories functionality
 * Author: Group Q
 * Created on: 31/03/2021
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoriesLocator {
	
	public CategoriesLocator(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Women']")
	public WebElement womenCategory;
	
	@FindBy(xpath="//ul[@class='submenu-container clearfix first-in-line-xs']/li[@class='sfHoverForce']//a[text()='Dresses']")
	public WebElement dress;
	

	@FindBy(xpath="//a[@title='Tops']//img[@class='replace-2x']")
	public WebElement tops;
	
	@FindBy(xpath="//a[@title='T-shirts']//img[@class='replace-2x']")
	public WebElement t_shirts;
	
	@FindBy(xpath="//input[@id='layered_id_attribute_group_1']")
	public WebElement smallCheckbox;
	
	@FindBy(xpath="//input[@id='layered_id_attribute_group_14']")
	public WebElement colorCheckbox;
	
	@FindBy(xpath="//input[@id='layered_id_feature_5']")
	public WebElement cottonCheckbox;

	@FindBy(xpath="//input[@id='layered_id_feature_17']")
	public WebElement shortSelvees;

	@FindBy(className="ui-slider-handle ui-state-default ui-corner-all")
	public WebElement slider;
}
