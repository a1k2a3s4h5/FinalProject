package com.healthline.testscripts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SearchBar {

	public WebDriver driver;
	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	public com.page.object.model.HealthlineSearchBar searchBar;
	
	@DataProvider(name="validSearchItem")
	public Object[] validSearch() {
		return new Object[] {"coronavirus"};
	}
	@DataProvider(name="invalidSearchItem")
	public Object[] invalidSearch() {
		return new Object[] {"qazxsevf"};
	}
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		searchBar=new com.page.object.model.HealthlineSearchBar(driver);
	}
	@Test(dataProvider="validSearchItem",priority=1,description="To verify search bar functionality with valid search item.")
	  public void searchBarWithValidItem(String searchItem) {
		searchBar.workingOfSearchBar(searchItem);
	  }
	@Test(dataProvider="invalidSearchItem",priority=2,description="To verify search bar functionality with invalid search item.")
	  public void searchBarWithInValidItem(String searchItem) {
		searchBar.workingOfSearchBar(searchItem);
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='gs-snippet']")).isDisplayed(), true);
		
	  }
		@AfterMethod
		public void afterMethod() {
			System.out.println("Closing Browser");
			driver.quit();	
		}
}