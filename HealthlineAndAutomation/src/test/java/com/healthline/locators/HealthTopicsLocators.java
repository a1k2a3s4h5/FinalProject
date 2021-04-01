package com.healthline.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HealthTopicsLocators {
	
	public WebDriver driver;

	@FindBy(how=How.XPATH , using="//button[@data-auto='header-menu']")
	public WebElement menuButton;
	
	@FindBy(how=How.XPATH , using="//ul[@class='css-1t6cvut']/li[@class='css-efqyut'][1]/a")
	public WebElement  allTopicsAtoZ;
	
	@FindBy(how=How.XPATH , using="//a[text()='What to Know About GlassesUSA']")
	public WebElement usaGlasses;
	
	@FindBy(how=How.XPATH, using= "//span[text()='Next']")
	public WebElement next;
	
	@FindBy(how=How.XPATH , using="//button[@class='css-1eiym9q icon-hl-close window-close-button']")
	public WebElement mainPopUp;
	
	@FindBy(how=How.XPATH , using="//a[text()='Pros and cons']")
	public WebElement  prosAndCons;
	
	@FindBy(how=How.XPATH , using="//a[text()='eyestrain']")
	public WebElement eyeStrain;
	
	@FindBy(how=How.XPATH , using="//a[text()='vision prescription']")
	public WebElement visionPresc;
	
	@FindBy(how=How.XPATH , using="//a[text()='diplopia (double vision)']")
	public WebElement doubleVision;
	
	@FindBy(how=How.XPATH , using="//a[contains(text(),'Order prescription and')]")
	public WebElement o_p;
	
	@FindBy(how=How.XPATH , using="//input[@class='css-12ffvwx']")
	public WebElement enterEmail;
	
	@FindBy(how=How.XPATH , using="//button[@class='css-160vb1s']")
	public WebElement signUp;
	
	@FindBy(how=How.XPATH , using="//span[text()='2 sources']")
	public WebElement sourceButton;
	
	@FindBy(how=How.XPATH , using="//a[@title='Email this page']")
	public WebElement mailClick;
	
	@FindBy(how=How.XPATH , using="//button[@class='css-1eiym9q icon-hl-close window-close-button']")
	public WebElement popUpClose;
	
	@FindBy(how=How.XPATH , using="//a[text()='Symptoms']")
	public WebElement symptom;
	
	@FindBy(how=How.XPATH , using="//a[text()='trichterbrust']")
	public WebElement ticherbust;
	
	@FindBy(how=How.XPATH , using="//a[text()='Nutrition']")
	public WebElement nutri;
	
	@FindBy(how=How.XPATH , using="//a[text()='News']")
	public WebElement news;
	
	@FindBy(how=How.XPATH , using="//a[text()='Diabetes Mine']")
	public WebElement Diabetes;
	
	@FindBy(how=How.XPATH , using="//a[text()='ADHD']")
	public WebElement adhd;
	
	public HealthTopicsLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void workingOfHealthTopics() {
		menuButton.click();
		allTopicsAtoZ.click();
		next.click();
		next.click();
		next.click();
		usaGlasses.click();

		try {
			mainPopUp.click();
		} catch (Exception e) {
			System.out.println("Pop-UP not found.");
		}
		prosAndCons.click();
		eyeStrain.click();

		driver.navigate().back();
		visionPresc.click();

		driver.navigate().back();

		doubleVision.click();

		driver.navigate().back();

		enterEmail.click();
		enterEmail.clear();

		enterEmail.sendKeys("akash@gmail.com");
		signUp.click();

		sourceButton.click();

		mailClick.click();

		popUpClose.click();

		driver.navigate().back();

		menuButton.click();

		allTopicsAtoZ.click();
		
		symptom.click();
		ticherbust.click();
	
		driver.navigate().back();
		nutri.click();

		news.click();
		Diabetes.click();
		
		menuButton.click();
		adhd.click();
	}
	
}
