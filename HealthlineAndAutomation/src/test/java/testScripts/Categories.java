package testScripts;
/**
 * Aim: To check the categories functionality 
 * Author: Vaishvi Patel
 * Date: 06/03/2021
 */
import org.testng.annotations.Test;


import utils.CommonUtilities;
import locators.Locators;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class Categories {
	Locators loc = new Locators();
	CommonUtilities commonUtilities = new CommonUtilities();

	@Test
	public void f() {
		WebDriver driver = commonUtilities.driverReturn();

		WebElement womenCategory = driver.findElement(By.xpath(loc.womenCategoryXpath));
		womenCategory.click();

		WebElement tops = driver.findElement(By.xpath(loc.topsXpath));
		tops.click();

		WebElement tshirts = driver.findElement(By.xpath(loc.t_shirtsXpath));
		tshirts.click();

		WebElement smallCheckbox = driver.findElement(By.xpath(loc.smallCheckboxId));
		smallCheckbox.click();


		WebElement cottonCheckbox = driver.findElement(By.xpath(loc.cottonCheckboxid));
		cottonCheckbox.click();
		
		WebElement casualCheckbox = driver.findElement(By.xpath(loc.cottonCheckboxid));
		casualCheckbox.click();

		WebElement shortSelvees = driver.findElement(By.xpath(loc.shortSelveesId));
		shortSelvees.click();
      		 
		driver.quit();

	}

	@BeforeMethod
	public void beforeMethod() {
		commonUtilities.browserSetup();
		System.out.println("Starting the browser");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Browser closing");
	}
}
