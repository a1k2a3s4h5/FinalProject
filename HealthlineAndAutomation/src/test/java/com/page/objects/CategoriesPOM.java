package com.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.automation.locators.CategoriesLocator;

import utils.Logger;
import utils.VisibilityOfElement;

public class CategoriesPOM {
public CategoriesLocator categories;
	public WebDriver driver;
	public boolean visibleFlag=false;
	public CategoriesPOM(WebDriver driver) {
		this.driver = driver;
		categories=new CategoriesLocator(driver);
	}
	
	/**
	 * Description: navigate to women category with size, color, composition and properties 
	 */
	public void womenCategoryClicks() {
		Logger.print("Click on women link from navbar");
		categories.womenCategory.click();
		Logger.print("Click on tops");
		categories.tops.click();
		Logger.print("click on t-shirts");
		categories.t_shirts.click();
		Logger.print("Click on S cleckbox under SIZE.");
		categories.smallCheckbox.click();
		Logger.print("Click on white color cleckbox under COLOR.");
		categories.colorCheckbox.click();
		Logger.print("Click on cotton cleckbox under COMPOSITION.");
		categories.cottonCheckbox.click();
		Logger.print("Click on shortsleeve cleckbox under properties.");
		categories.shortSelvees.click();
		
		visibleFlag= VisibilityOfElement.isElementVisible(By.xpath("//ul/p/img[@src='http://automationpractice.com/img/loader.gif']"), driver);
		Assert.assertEquals(visibleFlag,false,"Loader is only loading... no data was fetched..");
		Logger.print("Category wise selection is working correctly");
	
	}
}
