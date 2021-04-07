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
		Logger.print("Send data in email field : "+ emailId );
		signup.submit.click();
	}
	
	/**
	 * Description: To send first name, last, name and password, select birthday in the form 
	 */
	public void personalInformation(String first_name,String last_name,String pswd)
	{
		signup.rdobtnMr.click();
		signup.rdobtnMrs.click();
		
		signup.firstName.click();
		signup.firstName.clear();
		signup.firstName.sendKeys(first_name);
		
		signup.lastName.click();
		signup.lastName.clear();
		signup.lastName.sendKeys(last_name);
		
		signup.password.click();
		signup.password.clear();
		signup.password.sendKeys(pswd);
		
		Select day=new Select(signup.days);
		day.selectByIndex(5);
		
		Select month=new Select(signup.months);
		month.selectByIndex(4);
		
		Select year=new Select(signup.years);
		year.selectByIndex(4);
		
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
		
		signup.lName.click();
		signup.lName.clear();
		signup.lName.sendKeys(l_Name);
		
		signup.company.click();
		signup.company.clear();
		signup.company.sendKeys(companyName);
		
		signup.yourAddress1.click();
		signup.yourAddress1.clear();
		signup.yourAddress1.sendKeys(address1);
		
		signup.yourAddress2.click();
		signup.yourAddress2.clear();
		signup.yourAddress2.sendKeys(address2);
		
		signup.city.click();
		signup.city.clear();
		signup.city.sendKeys(cty);
		
		Select state =new Select(signup.states);
		state.selectByVisibleText("California");
		
		signup.pinCode.click();
		signup.pinCode.clear();
		signup.pinCode.sendKeys(postCode);
		
		signup.additionalinfo.click();
		signup.additionalinfo.clear();
		signup.additionalinfo.sendKeys(addinfo);
		
		signup.homePhone.click();
		signup.homePhone.clear();
		signup.homePhone.sendKeys(hPhone);
		
		signup.mobilePhone.click();
		signup.mobilePhone.clear();
		signup.mobilePhone.sendKeys(mPhone);
		
		signup.alias.click();
		signup.alias.clear();
		signup.alias.sendKeys(Alias);
	}
	
	/**
	 * Description: To click on register button
	 */
	public void clickRegister() {
		signup.register.click();
	}
}