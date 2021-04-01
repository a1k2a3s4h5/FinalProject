package com.page.object.model;

import org.openqa.selenium.WebDriver;

import com.healthline.locators.HealthTopicsLocators;

public class HealthTopicsPOM {

	public WebDriver driver;
	public HealthTopicsLocators healthlineTopics;
		
		public HealthTopicsPOM(WebDriver driver) {	
			this.driver=driver;
			healthlineTopics=new HealthTopicsLocators(driver);
		}
		
		public void workingOfHealthTopics() {
			healthlineTopics.menuButton.click();
			healthlineTopics.allTopicsAtoZ.click();
			healthlineTopics.next.click();
			healthlineTopics.next.click();
			healthlineTopics.next.click();
			healthlineTopics.usaGlasses.click();

			try {
				healthlineTopics.mainPopUp.click();
			} catch (Exception e) {
				System.out.println("Pop-UP not found.");
			}
			healthlineTopics.prosAndCons.click();
			healthlineTopics.eyeStrain.click();

			driver.navigate().back();
			healthlineTopics.visionPresc.click();

			driver.navigate().back();

			healthlineTopics.doubleVision.click();

			driver.navigate().back();

			healthlineTopics.enterEmail.click();
			healthlineTopics.enterEmail.clear();

			healthlineTopics.enterEmail.sendKeys("akash@gmail.com");
			healthlineTopics.signUp.click();

			healthlineTopics.sourceButton.click();

			healthlineTopics.mailClick.click();

			healthlineTopics.popUpClose.click();

			driver.navigate().back();

			healthlineTopics.menuButton.click();

			healthlineTopics.allTopicsAtoZ.click();
			
			healthlineTopics.symptom.click();
			healthlineTopics.ticherbust.click();
		
			driver.navigate().back();
			healthlineTopics.nutri.click();

			healthlineTopics.news.click();
			healthlineTopics.Diabetes.click();
			
			healthlineTopics.menuButton.click();
			healthlineTopics.adhd.click();
		}
}
