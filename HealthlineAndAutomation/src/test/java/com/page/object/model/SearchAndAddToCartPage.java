package com.page.object.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.automation.locators.SearchAndAddToCart;

public class SearchAndAddToCartPage {

public SearchAndAddToCart addtocart;
	
	public SearchAndAddToCartPage(WebDriver driver) {	
		addtocart=new SearchAndAddToCart(driver);
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
	
	public void addToCart(String comments) {
		addtocart.dress.click();
		addtocart.quantityUp.click();
		Select size=new Select(addtocart.sizeDD);
		size.selectByVisibleText("M");
		addtocart.colorGreen.click();
		addtocart.btnAddToCart.click();
		addtocart.closePopup.click();
		addtocart.shoppingCart.click();
		addtocart.btnProceed.click();
		addtocart.addComments.click();
		addtocart.addComments.clear();
		addtocart.addComments.sendKeys(comments);
		addtocart.proceedAddress.click();
		addtocart.agreeTerms.click();
		addtocart.proceedCarrier.click();
		addtocart.proceedByCheque.click();
		addtocart.confirmOrder.click();
	}
	
	
}
