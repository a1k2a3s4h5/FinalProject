package com.page.object.model;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.locators.SearchAndAddToCart;

public class SearchAndAddToCartPOM {

    public SearchAndAddToCart addtocart;
	public WebDriver driver;
	public WebDriverWait wait; 
	public SearchAndAddToCartPOM(WebDriver driver) {
		this.driver=driver;
		addtocart=new SearchAndAddToCart(driver);
		wait=new WebDriverWait(driver, 20);
	}
	
	public void signIn(String email,String password) {
		addtocart.signInLink.click();
		
		addtocart.emailField.click();
		addtocart.emailField.clear();
		addtocart.emailField.sendKeys(email);
	
		addtocart.passwordField.click();
		addtocart.passwordField.clear();
		addtocart.passwordField.sendKeys(password);
	
		addtocart.submitLogin.click();
	}
	
	public void searchItem(String item) {
		addtocart.searchInput.click();
		addtocart.searchInput.clear();
		addtocart.searchInput.sendKeys(item);
		
		addtocart.btnSearch.click();
	}
	
	public void addToCart() {
		
		addtocart.dress.click();
		addtocart.quantityUp.click();
		Select size=new Select(addtocart.sizeDD);
		size.selectByVisibleText("M");
		addtocart.colorGreen.click();
		addtocart.btnAddToCart.click();

	}		
	
	public String getSizeAndColor() {
		wait.until(ExpectedConditions.visibilityOf(addtocart.colorAndSize));
		String s = addtocart.colorAndSize.getText();
		return s;
	}
	
	public String getQt() {
		wait.until(ExpectedConditions.visibilityOf(addtocart.qt));
		String s = addtocart.qt.getText();
		return s;
	}
	
	public String getPrice() {
		wait.until(ExpectedConditions.visibilityOf(addtocart.totalPrice));
		String s = addtocart.totalPrice.getText();
		return s;
	}
	
	public String getProductName() {
		wait.until(ExpectedConditions.visibilityOf(addtocart.productName));
		String s = addtocart.productName.getText();
		return s;
	}
	
	public String getAddToCartMessege() {
		wait.until(ExpectedConditions.visibilityOf(addtocart.cssSuccessMessageAddCart));
		String s = addtocart.cssSuccessMessageAddCart.getText();
		return s;
	}

}
































































































/*
 * String parentWindowHandler = driver.getWindowHandle(); // Store your parent
 * window String subWindowHandler = null;
 * 
 * Set<String> handles = driver.getWindowHandles(); // get all window handles
 * Iterator<String> iterator = handles.iterator();
 * 
 * subWindowHandler = iterator.next();
 * 
 * driver.switchTo().window(subWindowHandler); // switch to popup window
 */
// Now you are in the popup window, perform necessary actions here

//driver.switchTo().window(parentWindowHandler);  // switch back to parent window

/*
 * Set<String> allWindowHandles = driver. getWindowHandles(); ArrayList<String>
 * lst = new ArrayList<String>(); for(String k:allWindowHandles) { lst.add(k); }
 * driver.switchTo().window(lst.get(0));
 */
//addtocart.closePopup.click();
//addtocart.shoppingCart.click();
//addtocart.btnProceed.click();
//addtocart.addComments.click();
//addtocart.addComments.clear();
//addtocart.addComments.sendKeys(comments);
//addtocart.proceedAddress.click();
//addtocart.agreeTerms.click();
//addtocart.proceedCarrier.click();
//addtocart.proceedByCheque.click();
//addtocart.confirmOrder.click();