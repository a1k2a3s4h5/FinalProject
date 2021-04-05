package com.healthline.testscripts;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SearchBar {

	public WebDriver driver;
	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	public com.page.object.model.HealthlineSearchBar searchBar;
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		searchBar=new com.page.object.model.HealthlineSearchBar(driver);
	}
	
	
	@Test(description="To verify search bar functionality.")
	  public void searchBar() {
		searchBar.workingOfSearchBar();
	  }
		@AfterMethod
		public void afterMethod() {
			System.out.println("Closing Browser");
			driver.quit();	
		}
}
