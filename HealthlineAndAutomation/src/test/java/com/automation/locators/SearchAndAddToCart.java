package com.automation.locators;
/**
 * Aim: Locators file for search item and add to cart functionality
 * Author: Group Q
 * Created on: 31/03/2021
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchAndAddToCart {
	
	public SearchAndAddToCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="login")
	public WebElement signInLink;
	
	@FindBy(id="email")
	public WebElement emailField;
	
	@FindBy(id="passwd")
	public WebElement passwordField;
	
	@FindBy(id="SubmitLogin")
	public WebElement submitLogin;
	
	@FindBy(id="search_query_top")
	public WebElement searchInput;
	
	@FindBy(xpath="//button[@class='btn btn-default button-search']")
	public WebElement btnSearch;
	
	
	@FindBy(xpath="//h5[@itemprop]/a[@title='Printed Chiffon Dress']")
	public WebElement dress;
	
	@FindBy(xpath="//a[@class='btn btn-default button-plus product_quantity_up']")
	public WebElement quantityUp;
	
	@FindBy(id="group_1")
	public WebElement sizeDD;
	
	@FindBy(id="color_15")
	public WebElement colorGreen;
	
	@FindBy(xpath="//button[@class='exclusive']")
	public WebElement btnAddToCart;
	
	@FindBy(xpath="//span[@title='Close window']")
	public WebElement closePopup;
	
	@FindBy(xpath="//a[@title='View my shopping cart']")
	public WebElement shoppingCart;
	
	@FindBy(xpath="//p/a[@title='Proceed to checkout']")
	public WebElement btnProceed;
	
	@FindBy(xpath="//textarea[@name='message']")
	public WebElement addComments;
	
	@FindBy(xpath="//button[@name='processAddress']")
	public WebElement proceedAddress;
	
	@FindBy(id="cgv")
	public WebElement agreeTerms;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	public WebElement proceedCarrier;
	
	@FindBy(xpath="//a[@class='cheque']")
	public WebElement proceedByCheque;
	
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	public WebElement confirmOrder;
	
	@FindBy(id="layer_cart_product_attributes")
	public WebElement colorAndSize;
	
	@FindBy(id="layer_cart_product_quantity")
	public WebElement qt;
	
	@FindBy(id="layer_cart_product_price")
	public WebElement totalPrice;
	
	@FindBy(id="layer_cart_product_title")
	public WebElement productName;
	
	@FindBy(xpath="//div[@id='layer_cart']/div[@class='clearfix']")
	public WebElement popUp;
	
	@FindBy(css = "div#layer_cart h2")
	public WebElement cssSuccessMessageAddCart;
	
}
