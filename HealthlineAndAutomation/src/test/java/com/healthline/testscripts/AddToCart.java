package com.healthline.testscripts;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddToCart {
	
	public static void main(String[] args) {
	
		String url = "http://automationpractice.com/index.php";
		String chromePath = "./drivers/msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", chromePath);

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String signUpClassName = "login";
		WebElement signUp = driver.findElement(By.className(signUpClassName));
		signUp.click();

		String loginEmailId = "email";
		WebElement loginEmail = driver.findElement(By.id(loginEmailId));
		loginEmail.sendKeys("vaishvi@123.c");

		String loginPasswordId = "passwd";
		WebElement loginPassword = driver.findElement(By.id(loginPasswordId));
		loginPassword.sendKeys("1234567890");

		String signinId = "SubmitLogin";
		WebElement signin = driver.findElement(By.id(signinId));
		signin.click();

		String womenCategoryXpath = "//a[text()='Women']";
		WebElement womenCategory = driver.findElement(By.xpath(womenCategoryXpath));
		womenCategory.click();
		
		

		/*
		 * String womenTshirtXpath = "//li//ul/li/a[text()='T-shirts']"; WebElement
		 * womenTshirt = driver.findElement(By.xpath(womenTshirtXpath));
		 * womenTshirt.click();
		 */

		//Thread.sleep(5000);
		String tshirtXpath = "//img[@alt='Faded Short Sleeve T-shirts']";
		WebElement tshirt = driver.findElement(By.xpath(tshirtXpath));
		WebElement addToCart1 = driver.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']/span[text()='Add to cart']"));
		//tshirt.click();
		/*
		 * WebElement iFrame = driver.findElement(By.tagName("iframe"));
		 * driver.switchTo().frame(iFrame); //driver.switchTo().alert(); WebElement
		 * addToCartPopUpButton=
		 * driver.findElement(By.xpath("//p[@id='add_to_cart']/button"));
		 * addToCartPopUpButton.click();
		 */
        Actions actions=new Actions(driver);
        actions.moveToElement(tshirt).moveToElement(addToCart1).click().perform();
	//	
		


		
	/*
	 * String openClassName =
	 * "ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line"
	 * ; WebElement open = driver.findElement(By.className(openClassName));
	 * open.click();
	 */
		
		/*
		 * String addToCartXpath = "//button[@class='exclusive']"; WebElement addToCart
		 * = driver.findElement(By.xpath(addToCartXpath)); addToCart.click();
		 * 
		 * String proceedToCheckoutXpath =
		 * "//a[@class='btn btn-default button button-medium']"; WebElement
		 * proceedToCheckout = driver.findElement(By.xpath(proceedToCheckoutXpath));
		 * proceedToCheckout.click();
		 */

		String proceedToCheckoutXpath = "//div[@id='layer_cart']//span[contains(text(),'Proceed to checkout')]";
		WebElement proceedToCheckout1 = driver.findElement(By.xpath(proceedToCheckoutXpath));
		proceedToCheckout1.click();

		String proceedToCheckoutFinalXpath	 = "//p[@class='cart_navigation clearfix']//span[text()='Proceed to checkout']";
		WebElement proceedToCheckoutFinal = driver.findElement(By.xpath(proceedToCheckoutFinalXpath));
		proceedToCheckoutFinal.click();

		String proceedToCheckoutFinal2Xpath	 = "//p[@class='cart_navigation clearfix']//span[text()='Proceed to checkout']";
		WebElement proceedToCheckoutFinal2 = driver.findElement(By.xpath(proceedToCheckoutFinal2Xpath));
		proceedToCheckoutFinal2.click();
		
		String checkBoxId = "cgv";
		WebElement checkBox = driver.findElement(By.id(checkBoxId));
		checkBox.click();
		
		String proceedToCheckoutFinal3Xpath	 = "//p[@class='cart_navigation clearfix']//span[contains(text(),'Proceed to checkout')]";
		WebElement proceedToCheckoutFinal3 = driver.findElement(By.xpath(proceedToCheckoutFinal3Xpath));
		proceedToCheckoutFinal3.click();
		
		/*
		 * String termsAndConditionsId = "uniform-cgv"; WebElement termsAndConditions =
		 * driver.findElement(By.id(termsAndConditionsId)); termsAndConditions.click();
		 * 
		 * String proceedToCheckout4Class =
		 * "button btn btn-default standard-checkout button-medium"; WebElement
		 * proceedToCheckout4 =
		 * driver.findElement(By.className(proceedToCheckout4Class));
		 * proceedToCheckout4.click();
		 * 
		 * 
		 * String bankPaymentClassName = "bankwire"; WebElement bankPayment =
		 * driver.findElement(By.className(bankPaymentClassName)); bankPayment.click();
		 * 
		 * 
		 * String confirmOrderClassName = "button btn btn-default button-medium";
		 * WebElement confirmOrder =
		 * driver.findElement(By.className(confirmOrderClassName));
		 * confirmOrder.click();
		 */
//		
//		driver.quit();
	} 
	
}