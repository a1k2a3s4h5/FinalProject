package com.healthline.testscripts;

/**
 * Aim:Verify the subscribe functionality
 * Author: Group Q
 * Created on:6/03/2021
 * Modified on: 31/03/2021
 */
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class Subscribe {

	public WebDriver driver;
	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	public com.page.object.model.SubscribePOM subscribe;
	
	@DataProvider(name="validEmail")
	public Object[][] validEmailAddress(){
		return new Object[][] {{"test@gmail.com"}};
	}
	
	@DataProvider(name="invalidEmail")
	public Object[][] invalidEmailAddress(){
		return new Object[][] {{"test.com"}};
	}
	
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		subscribe=new com.page.object.model.SubscribePOM(driver);
	}

	@Test(dataProvider="validEmail",priority=1,description="To verify subscribe functionality wuth valid email address.")
	public void subscribeFunctionalityWithValidEmail(String email) {
		subscribe.workingOfSubscriber(email);
		Assert.assertEquals(driver.findElement(By.xpath("//h2[text()='Thanks for subscribing']")).isDisplayed(), true);
	}

	@Test(dataProvider="invalidEmail",priority=2,description="To verify subscribe functionality with invalid email address.")
	public void subscribeFunctionalityWithInvalidEmail(String email) {
		subscribe.workingOfSubscriber(email);
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browser");
		driver.quit();
	}

}
