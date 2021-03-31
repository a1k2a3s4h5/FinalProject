package com.healthline.testscripts;

import com.healthline.locators.HealthTopicsLocators;

import utils.SetupEnvironment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HealthTopics {

	public WebDriver driver;
	SetupEnvironment setup=new SetupEnvironment();
	HealthTopicsLocators loc;

		@Test
		public void healthTopics() {
			
			loc.menuButton.click();
			loc.allTopicsAtoZ.click();
			loc.usaGlasses.click();

			try {
				loc.mainPopUp.click();
			} catch (Exception e) {
				System.out.println("Pop-UP not found.");
			}
			loc.prosAndCons.click();
			loc.eyeStrain.click();

			driver.navigate().back();
			loc.visionPresc.click();

			driver.navigate().back();

			loc.doubleVision.click();

			driver.navigate().back();

			loc.enterEmail.click();
			loc.enterEmail.clear();

			loc.enterEmail.sendKeys("akash@gmail.com");
			loc.signUp.click();

			loc.sourceButton.click();

			loc.mailClick.click();

			loc.popUpClose.click();

			driver.navigate().back();

			loc.menuButton.click();

			loc.allTopicsAtoZ.click();
			
			loc.symptom.click();
			loc.ticherbust.click();
			

			driver.navigate().back();
			loc.nutri.click();

			loc.news.click();
			loc.Diabetes.click();
			
			loc.menuButton.click();
			loc.adhd.click();
		}

		@BeforeMethod
		public void beforeMethod() {
			String url = "https://www.healthline.com/";
			driver = setup.driverReturn("Chrome");
			loc = new HealthTopicsLocators(driver);
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Starting Browser");
		}

		@AfterMethod
		public void afterMethod() {
			System.out.println("Closing Browser");
		}

}
