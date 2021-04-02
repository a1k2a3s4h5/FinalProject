package com.automation.testscripts;
/*
 * Aim: To view the best seller items
 * Author:Group Q
 * Created on:13/03/2021
 * Modified Last:30/03/2021
 */
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;


public class BestSellers {

	public WebDriver driver;
	public ExtentReports extent;
	public ExtentTest extentTest;
	utils.SetupEnvironment setup=new utils.SetupEnvironment();
	public com.page.object.model.BestSellersPOM bestsellers;
	
	@BeforeTest
	public void setExtent() {
		extent=new ExtentReports(System.getProperty("user.dir")+"/target/surefire-reports/html/ExtentReport.html",true);
		extent.addSystemInfo("User Name", "Vanshika Joukani");
	}
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void beforeMethod(String browserName,String url) {
		driver = setup.driverReturn(browserName,url);
		bestsellers=new com.page.object.model.BestSellersPOM(driver);
	}
	
	/**
	 * Function name: bestSellerFunctionality
	 * Check the best seller product functionality that performs click
	 * @param browserName
	 * @param url
	 */
	@Test(description = "To verify the bestseller item")
	public void bestSellerFunctionality() {
		extentTest = extent.startTest("bestSellerFunctionality");
		bestsellers.bestSellers();
	}
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