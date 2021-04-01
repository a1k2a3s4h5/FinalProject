package com.page.object.model;

import org.openqa.selenium.WebDriver;

import com.automation.locators.CategoriesLocator;

public class CategoriesPOM {
public CategoriesLocator categories;
	
	public CategoriesPOM(WebDriver driver) {	
		categories=new CategoriesLocator(driver);
	}
	
	public void womenCategoryClicks() {
		categories.womenCategory.click();
		categories.tops.click();
		categories.t_shirts.click();
		categories.smallCheckbox.click();
		categories.colorCheckbox.click();
		categories.cottonCheckbox.click();
		categories.shortSelvees.click();
	}
}
