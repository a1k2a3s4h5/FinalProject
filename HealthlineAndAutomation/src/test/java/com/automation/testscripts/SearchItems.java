package com.automation.testscripts;
/**
 * Aim: To searchfor different products in the search bar
 * Author:Group Q
 * Created on: 31/03/2021
 */
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.page.objects.SearchPOM;

import utils.Logger;
import utils.SetupEnvironment;

public class SearchItems {

	SetupEnvironment setup = new SetupEnvironment();
	SearchPOM search;
	public WebDriver driver;

	@DataProvider(name = "inValidSearch")
	public Object[] inValidSearch() {
		return new Object[] { "Hii", "how are u", "kese ho" };
	}

	@DataProvider(name = "validSearch")
	public Object[] validSearch() {
		return new Object[] { "Top", "Dress" };
	}

	@Parameters({ "browserName", "url" })
	@BeforeMethod
	public void beforeMethod(@Optional String browserName, String url) {
		driver = setup.driverReturn(browserName, url);
		search = new SearchPOM(driver);
	}

	@Test(dataProvider = "validSearch", priority = 2, description = "To verify the search functionality.")
	public void validSearchItems(String searchData) {
		search.sendSearchText(searchData);
		try {
			Assert.assertEquals(
					driver.findElement(By.xpath("//p[contains(text(),'No results were found for your search')]"))
							.isDisplayed(),
					false, "For valid search it should not provide correct pages.");
		} catch (Exception e) {
			Logger.print("Item or items succesfully display on DOM.");
		}
	}

	@Test(dataProvider = "inValidSearch", priority = 1, description = "To verify the search functionality.")
	public void inValidSearchItems(String searchData) {
		search.sendSearchText(searchData);
		try {
			Assert.assertEquals(
					driver.findElement(By.xpath("//p[contains(text(),'No results were found for your search')]"))
							.isDisplayed(),
					true);
			Logger.print("For \"" + searchData + "\" it will display no result found. ");
		} catch (Exception e) {
			Assert.assertFalse(true, "Not accepeted messege was found.");
		}

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browsr");
		driver.quit();
	}
}
