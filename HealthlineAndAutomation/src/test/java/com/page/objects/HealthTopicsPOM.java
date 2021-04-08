package com.page.objects;

import org.openqa.selenium.WebDriver;

import com.healthline.locators.HealthTopicsLocators;

import utils.Logger;

public class HealthTopicsPOM {

	public WebDriver driver;
	public HealthTopicsLocators healthlineTopics;
		
		public HealthTopicsPOM(WebDriver driver) {	
			this.driver=driver;
			healthlineTopics=new HealthTopicsLocators(driver);
	}

		/**
		 * Description: To click on different health topics with email
		 */
		public void healthTopicsClicks(String email) {
			try {
				healthlineTopics.popupSubmitButton.click();
			}
			catch(Exception e) {}
			healthlineTopics.menuButton.click();
			healthlineTopics.allTopicsAtoZ.click();
			Logger.print("All Topic A to Z link is opened");
			
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
			Logger.print("Pros and Cons link is opened");
			healthlineTopics.eyeStrain.click();
			Logger.print("Eye strain link is opened");
			driver.navigate().back();
			healthlineTopics.visionPresc.click();
			driver.navigate().back();
			healthlineTopics.doubleVision.click();
			Logger.print("Double vision link is opened");
			driver.navigate().back();
			
			healthlineTopics.enterEmail.click();
			healthlineTopics.enterEmail.clear();
			healthlineTopics.enterEmail.sendKeys(email);
			Logger.print("Email address entered");
			healthlineTopics.signUp.click();
			healthlineTopics.sourceButton.click();
			healthlineTopics.mailClick.click();
			healthlineTopics.popUpClose.click();
	}
}
