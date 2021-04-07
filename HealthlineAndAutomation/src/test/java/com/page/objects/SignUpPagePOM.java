package com.page.objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.automation.locators.SignUpLocators;

import utils.Logger;
public class SignUpPagePOM {
	public SignUpLocators signup;
	
	public SignUpPagePOM(WebDriver driver) {	
		signup=new SignUpLocators(driver);
	}
	/**
	 * Description: To create account with email address
	 */
	public void createAnAccount(String emailId) {
		signup.signInLink.click();
		
		signup.email.click();
		signup.email.clear();
		signup.email.sendKeys(emailId);
		Logger.print("Email entered is : "+ emailId );
		signup.submit.click();
	}
	
	/**
	 * Description: To send first name, last, name and password, select birthday in the form 
	 */
	public void personalInformation(String first_name,String last_name,String pswd)
	{
		signup.rdobtnMr.click();
		signup.rdobtnMrs.click();
		Logger.print("Mrs is selected");
		signup.firstName.click();
		signup.firstName.clear();
		signup.firstName.sendKeys(first_name);
		Logger.print("First name entered is : "+ first_name );
		signup.lastName.click();
		signup.lastName.clear();
		signup.lastName.sendKeys(last_name);
		Logger.print("Last name entered is : "+ last_name );
		signup.password.click();
		signup.password.clear();
		signup.password.sendKeys(pswd);
		Logger.print("Password is entered");
		Select day=new Select(signup.days);
		day.selectByIndex(5);
		
		Select month=new Select(signup.months);
		month.selectByIndex(4);
		
		Select year=new Select(signup.years);
		year.selectByIndex(4);
		Logger.print("Date is selected");
		signup.newsletterChk.click();
		signup.specialOffersChk.click();
	}
	/**
	 * Description: To send first name, last, name, company name, address, city, state, postcode, additional info, phone in the form 
	 */
	public void yourAddressDetails(String f_Name,String l_Name,String companyName,String address1,String address2,String cty,String postCode,String addinfo,String hPhone,String mPhone,String Alias) {
		
		signup.fName.click();
		signup.fName.clear();
		signup.fName.sendKeys(f_Name);
		Logger.print("First name entered is : "+ f_Name );
		signup.lName.click();
		signup.lName.clear();
		signup.lName.sendKeys(l_Name);
		Logger.print("Last name entered is : "+ l_Name );
		signup.company.click();
		signup.company.clear();
		signup.company.sendKeys(companyName);
		Logger.print("Company name entered is : "+ companyName );
		signup.yourAddress1.click();
		signup.yourAddress1.clear();
		signup.yourAddress1.sendKeys(address1);
		Logger.print("Address 1 entered is : "+ address1 );
		signup.yourAddress2.click();
		signup.yourAddress2.clear();
		signup.yourAddress2.sendKeys(address2);
		Logger.print("Address 2 entered is : "+ address2 );
		signup.city.click();
		signup.city.clear();
		signup.city.sendKeys(cty);
		Logger.print("City entered is : "+ cty );
		Select state =new Select(signup.states);
		state.selectByVisibleText("California");
		Logger.print("The state is selected");
		signup.pinCode.click();
		signup.pinCode.clear();
		signup.pinCode.sendKeys(postCode);
		Logger.print("Post code entered is : "+ postCode );
		signup.additionalinfo.click();
		signup.additionalinfo.clear();
		signup.additionalinfo.sendKeys(addinfo);
		Logger.print("Additional information entered is : "+ addinfo );
		signup.homePhone.click();
		signup.homePhone.clear();
		signup.homePhone.sendKeys(hPhone);
		Logger.print("Home Phone number entered is : "+ hPhone );
		signup.mobilePhone.click();
		signup.mobilePhone.clear();
		signup.mobilePhone.sendKeys(mPhone);
		Logger.print("Mobile Phone number entered is : "+ mPhone );
		signup.alias.click();
		signup.alias.clear();
		signup.alias.sendKeys(Alias);
		Logger.print("Alias entered is : "+ Alias );
	}
	
	/**
	 * Description: To click on register button
	 */
	public void clickRegister() {
		signup.register.click();
		Logger.print("The user is registered");
	}
}