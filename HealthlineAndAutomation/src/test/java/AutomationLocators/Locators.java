package AutomationLocators;
/**
 * Locators of automationpractice.com website
 * Date: 4/03/2021
 * @author vaishvi.patel
 *
 */
public class Locators {

	//login and add to cart locators
	public String signUpClassName = "login";
	public String loginEmailId = "email";
	public String loginPasswordId = "passwd";
	public String signinId = "SubmitLogin";
	public String womenCategoryXpath = "//a[text()='Women']";
	public String tshirtXpath = "//img[@alt='Faded Short Sleeve T-shirts']";
	public String addToCartXpath="//a[@class='button ajax_add_to_cart_button btn btn-default']/span[text()='Add to cart']";
	public String proceedToCheckoutXpath = "//div[@id='layer_cart']//span[contains(text(),'Proceed to checkout')]";
	public String proceedToCheckoutFinalXpath = "//p[@class='cart_navigation clearfix']//span[text()='Proceed to checkout']";
	public String proceedToCheckoutFinal2Xpath = "//p[@class='cart_navigation clearfix']//span[text()='Proceed to checkout']";
	public String checkBoxId = "cgv";
	public String proceedToCheckoutFinal3Xpath = "//p[@class='cart_navigation clearfix']//span[contains(text(),'Proceed to checkout')]";
	public String bankPaymentClassName = "bankwire";
	public String confirmOrderXpath = "//button[@class='button btn btn-default button-medium']";

	//Contact us locators
	public String contactUsXpath = "//a[@title='Contact Us']";
	public String subHeadId = "id_contact";
	public String orderRefId = "id_order";
	public String fileUploadId = "fileUpload";
	public String file= "C://Users//vaishvi.patel//Downloads//screenshot1.jpg";
	public String messegeId = "message";
	public String sendId = "submitMessage";
	public String sucessMessegeXpath = "//p[contains(text(),'Your message has been successfully')]";
	
	//error
	public 	String signinErrorXpath = "//div[@class='alert alert-danger']/ol/li";
	
	//sign up 
	public String createEmailId = "email_create";
	public String createAccountId = "SubmitCreate";
	public String createAccountErrorXpath = "//div[@id='create_account_error']/ol/li";
	public String mrsId = "uniform-id_gender2";
	public String firstNameId = "customer_firstname";
	public String lastNameId = "customer_lastname";
	public String passwordId = "passwd";
	public String dayId = "days";
	public String monthId = "months";
	public String yearId = "years";
	public String companyId = "company";
	public String addressId = "address1";
	public String cityId = "city";
	public String stateId = "id_state";
	public String postCodeId = "postcode";
	public String phoneId = "phone_mobile";
	public String aliasAddressId = "alias";
	public String submitAccountId = "submitAccount";
	public String profileXpath = "//div[@class='header_user_info']//span";
	
	//categories
	public String dressXpath="//ul[@class='submenu-container clearfix first-in-line-xs']/li[@class='sfHoverForce']//a[text()='Dresses']";
	public String topsXpath="//a[@title='Tops']//img[@class='replace-2x']";
	public String t_shirtsXpath="//a[@title='T-shirts']//img[@class='replace-2x']";
	public String smallCheckboxId="//input[@id='layered_id_attribute_group_1']";
	public String colorCheckboxId="//input[@id='layered_id_attribute_group_14']";
	public String cottonCheckboxid="//input[@id='layered_id_feature_5']";
	public String shortSelveesId="//input[@id='layered_id_feature_17']";
	public String sliderClass="ui-slider-handle ui-state-default ui-corner-all";
	
	//logo
	public String logoXpath="//a[@title='Healthline']";
	
	public String sideClass="bx-next";
	public String searchBarId="search_query_top";
	public String filterDropdownId="selectProductSort";
	
	
	public String bestSellerXpath="//a[text()='Best Sellers']";
	
}
