package com.healthline.locators;
/**
 * Aim: Locator file of health topics section
 * Author: Group Q
 * Created on: 31/03/2021
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HealthTopicsLocators {
	
	public WebDriver driver;
	public HealthTopicsLocators(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH, using="//button[@class='accept css-143g64q']")
	public WebElement popupSubmitButton;
	
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
}
