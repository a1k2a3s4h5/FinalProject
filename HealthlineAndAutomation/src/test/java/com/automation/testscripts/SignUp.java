package com.automation.testscripts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SignUp {
	
	public WebDriver driver;
	public ExtentReports extent;
	public ExtentTest extentTest;
	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	public com.page.object.model.SignUpPagePOM signUp;
	
	@BeforeTest
	public void setExtent() {
		extent=new ExtentReports(System.getProperty("user.dir")+"/target/surefire-reports/html/ExtentReport.html",true);
		extent.addSystemInfo("User Name", "Vanshika Joukani");
	}
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		signUp=new com.page.object.model.SignUpPagePOM(driver);
	}
	/**
	 * Function name:signUpValidDetails
	 * Data provider with valid details
	 * @return
	 */
	@DataProvider(name="validDetails")
	public Object[][] signUpValidDetails(){
		return new Object[][] {{"test1510@test.com","Abc","Xyz","abcde","Abc","Xyz","Pqr","Gateway Group","Gateway","Ahmedabad","00000","abcdefgh","0000000000","0000000000","pqr"
		}};
	}
	
	/**
	 * Function name:signUpInValidEmail
	 * Data provider with invalid email address
	 * @return
	 */
	@DataProvider(name="invalidEmail")
	public Object[] signUpInValidEmail(){
		return new Object[] {"test#%1510@test.com"};
	}
	
	/**
	 * Function name:signUpAccountExists
	 * Data Provider with already exist email address
	 * @return
	 */
	@DataProvider(name="emailIdExists")
	public Object[] signUpAccountExists(){
		return new Object[] {"test1605@gmail.com"};
	}
	

	/**
	 * Function name:invalidSignUp
	 * To verify the signup functionality with invalid email address
	 * @param emailAddress
	 */
	@Test(dataProvider="invalidEmail",priority=1, description = "Provide invalid email and check the functionality")
	public void invalidSignUp(String emailAddress) {
		extentTest = extent.startTest("invalidSignUp");
		signUp.createAnAccount(emailAddress);
		System.out.println(driver.findElement(By.xpath("//div[@id='create_account_error']//li")).getText());
		Assert.assertEquals(driver.findElement(By.id("create_account_error")).isDisplayed(), true);
	}
	
	/**
	 * Function name: emailIdExits
	 * To verify the signup functionality with already registered email address
	 * @param emailAddress
	 */
//	@Test(dataProvider="emailIdExists",priority=2,description = "Provide already exists email and check the functionality")
//	public void emailIdExits(String emailAddress) {
//		signUp.createAnAccount(emailAddress);
//		System.out.println(driver.findElement(By.xpath("//div[@id='create_account_error']//li")).getText());
//		Assert.assertEquals(driver.findElement(By.id("create_account_error")).isDisplayed(), true);
//	}
//	
	/**
	 * Function name: validSignUp
	 * To provide valid details for signup and verify the functionality
	 * @param emailAddress
	 * @param firstname
	 * @param lastname
	 * @param password
	 * @param fName
	 * @param lName
	 * @param company
	 * @param adrs1
	 * @param adrs2
	 * @param city
	 * @param postCode
	 * @param addinfo
	 * @param hPhone
	 * @param mPhone
	 * @param alias
	 */
//	@Test(dataProvider="validDetails",priority=3,description = "Provide valid email and check the functionality")
//	public void validSignUp(String emailAddress,String firstname,String lastname,String password,String fName,String lName,String company,String adrs1,String adrs2,String city,String postCode,String addinfo,String hPhone,String mPhone,String alias) {
//		signUp.createAnAccount(emailAddress);
//		signUp.personalInformation(firstname,lastname, password);
//		signUp.yourAddressDetails(fName,lName, company, adrs1, adrs2, city, postCode, addinfo, hPhone, mPhone, alias);
//		Assert.assertEquals(driver.findElement(By.className("page-heading")).isDisplayed(), true);
//	}
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
			
			String screenshotPath = BestSellers.getScreenshot(driver, result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath)); //to add screenshot in extent report
		}
		else if(result.getStatus()==ITestResult.SKIP){
			extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS){
			extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());

		}
		extent.endTest(extentTest); //ending test and ends the current test and prepare to create html report
		System.out.println("Closing Browsr");
		driver.quit();
	}
	@AfterTest
	public void endReport() {
		extent.flush();
		extent.close();
	}
	
	public static String getScreenshot(WebDriver driver,String screenshotName) throws IOException {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "./FailedTestsScreenshots/" + screenshotName + dateName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}
}