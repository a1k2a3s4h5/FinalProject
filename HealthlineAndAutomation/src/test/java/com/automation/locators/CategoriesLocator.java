package com.automation.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoriesLocator {
	//categories
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
	
	public void womenCategoryClicks() {
		womenCategory.click();
		tops.click();
		t_shirts.click();
		smallCheckbox.click();
		colorCheckbox.click();
		cottonCheckbox.click();
		shortSelvees.click();
	}
	
}
