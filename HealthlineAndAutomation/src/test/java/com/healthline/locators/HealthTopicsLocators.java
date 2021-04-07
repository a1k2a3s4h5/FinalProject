package com.healthline.locators;
/**
 * Aim: Locator file of health topics section
 * Author: Group Q
 * Created on: 31/03/2021
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HealthTopicsLocators {
	
	public WebDriver driver;
	public HealthTopicsLocators(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@class='accept css-143g64q']")
	public WebElement popupSubmitButton;
	
	@FindBy(xpath="//button[@data-auto='header-menu']")
	public WebElement menuButton;
	
	@FindBy(xpath="//ul[@class='css-1t6cvut']/li[@class='css-efqyut'][1]/a")
	public WebElement  allTopicsAtoZ;
	
	@FindBy(xpath="//a[text()='What to Know About GlassesUSA']")
	public WebElement usaGlasses;
	
	@FindBy(xpath= "//span[text()='Next']")
	public WebElement next;
	
	@FindBy(xpath="//button[@class='css-1eiym9q icon-hl-close window-close-button']")
	public WebElement mainPopUp;
	
	@FindBy(xpath="//a[text()='Pros and cons']")
	public WebElement  prosAndCons;
	
	@FindBy(xpath="//a[text()='eyestrain']")
	public WebElement eyeStrain;
	
	@FindBy(xpath="//a[text()='vision prescription']")
	public WebElement visionPresc;
	
	@FindBy(xpath="//a[text()='diplopia (double vision)']")
	public WebElement doubleVision;
	
	@FindBy(xpath="//a[contains(text(),'Order prescription and')]")
	public WebElement o_p;
	
	@FindBy(xpath="//input[@class='css-12ffvwx']")
	public WebElement enterEmail;
	
	@FindBy(xpath="//button[@class='css-160vb1s']")
	public WebElement signUp;
	
	@FindBy(xpath="//span[text()='2 sources']")
	public WebElement sourceButton;
	
	@FindBy(xpath="//a[@title='Email this page']")
	public WebElement mailClick;
	
	@FindBy(xpath="//button[@class='css-1eiym9q icon-hl-close window-close-button']")
	public WebElement popUpClose;
	
	@FindBy(xpath="//a[text()='Symptoms']")
	public WebElement symptom;
	
	@FindBy(xpath="//a[text()='trichterbrust']")
	public WebElement ticherbust;
	
	@FindBy(xpath="//a[text()='Nutrition']")
	public WebElement nutri;
	
	@FindBy(xpath="//a[text()='News']")
	public WebElement news;
	
	@FindBy(xpath="//a[text()='Diabetes Mine']")
	public WebElement Diabetes;
	
	@FindBy(xpath="//a[text()='ADHD']")
	public WebElement adhd;
}