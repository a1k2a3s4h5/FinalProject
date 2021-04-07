package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


import com.automation.locators.SearchAndAddToCart;

public class SearchAndAddToCartPOM {

public SearchAndAddToCart addtocart;
	
	public SearchAndAddToCartPOM(WebDriver driver) {	
		addtocart=new SearchAndAddToCart(driver);
	}
	
	/**
	 * Description: To send email and password in the field
	 */
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
	
	/**
	 * Description: To click and send data in search bar
	 */
	public void searchItem(String item) {
		addtocart.searchInput.click();
		addtocart.searchInput.clear();
		addtocart.searchInput.sendKeys(item);
		
		addtocart.btnSearch.click();
	}
	
	/**
	 * Description: To add the product to cart with M size and green color
	 */
	public void addToCart() {
		addtocart.dress.click();
		addtocart.quantityUp.click();
		Select size=new Select(addtocart.sizeDD);
		size.selectByVisibleText("M");
		addtocart.colorGreen.click();
		addtocart.btnAddToCart.click();
//		addtocart.closePopup.click();
//		addtocart.shoppingCart.click();
//		addtocart.btnProceed.click();
//		addtocart.addComments.click();
//		addtocart.addComments.clear();
//		addtocart.addComments.sendKeys(comments);
//		addtocart.proceedAddress.click();
//		addtocart.agreeTerms.click();
//		addtocart.proceedCarrier.click();
//		addtocart.proceedByCheque.click();
//		addtocart.confirmOrder.click();
	}		
	
	/**
	 * Description: To get the size of product
	 */
	public String getSizeAndColor() {
		String s = addtocart.colorAndSize.getText();
		System.out.println("color and size "+ s);
		return s;
	}
	
	/**
	 * Description: To get the quantity of product
	 */
	public String getQt() {
		String s = addtocart.qt.getText();
		System.out.println("qt "+ s);
		return s;
	}
	
	/**
	 * Description: To get the price of product
	 */
	public String getPrice() {
		String s = addtocart.totalPrice.getText();
		System.out.println("price");
		return s;
	}
	
	/**
	 * Description: To get the name of product
	 */
	public String getProductName() {
		String s = addtocart.productName.getText();
		System.out.println("name "+ s);
		return s;
	}
}
