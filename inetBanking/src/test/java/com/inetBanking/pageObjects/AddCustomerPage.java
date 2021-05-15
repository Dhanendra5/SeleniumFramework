package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	//constructor
	public AddCustomerPage(WebDriver rdriver){
		
		ldriver = rdriver;
	    PageFactory.initElements(rdriver, this);
	
	}
	
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Customer')]")
	@CacheLookup
	WebElement lnkAddCustomer;
	
	@FindBy(how = How.NAME ,using = "name")
	@CacheLookup
	WebElement txtcustomername;
	
	@FindBy(how = How.NAME ,using = "rad1")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(how = How.ID_OR_NAME, using = "dob")
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(how = How.NAME , using = "addr")
	@CacheLookup
	WebElement txtadress;
	
	@FindBy(how = How.NAME, using = "pinno")
	@CacheLookup
	WebElement txtpin;
	
	
	@FindBy(how = How.NAME, using = "telephoneno")
	@CacheLookup
	WebElement txtMobile;
	
	
	@FindBy(how = How.NAME, using = "emailid")
	@CacheLookup
	WebElement txtEmail;
	
	
	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	WebElement txtPassword;
	
	
	@FindBy(how = How.NAME, using = "sub")
	@CacheLookup
	WebElement btnSubmit;
	
	@FindBy(how = How.NAME, using = "city")
	@CacheLookup
	WebElement custCity;
	
	@FindBy(how = How.NAME, using = "state")
	@CacheLookup
	WebElement custState;
	
	
	
	
	//Action methods
	public void clickAddNewCustomer(){
		lnkAddCustomer.click();
	}
	
	//take parameter from testcase and pass this parameter 
	public void custName(String cname){
		txtcustomername.sendKeys(cname);
		
	}
	
	public void custGender(String gender){
		
		rdGender.sendKeys(gender);
	}
	
	public void custDOB(String mm , String dd , String yy){
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}
	
	public void custaddress(String caddress){
		txtadress.sendKeys(caddress);				
	}
	
	public void customerpincode(int cpin){
		txtpin.sendKeys(String.valueOf(cpin));
		
	}
	
	public void customermobilenumber(String cmobNum ){
		
		txtMobile.sendKeys(cmobNum);	
	}
	
	public void customeremail(String Cemail){
		txtEmail.sendKeys(Cemail);
	}
	
	public void CustPassword(String cpass){
		
		txtPassword.sendKeys(cpass);
		
	}
	
	public void custSubmit(){
		btnSubmit.click();
	}
	
	public void custCity(String custcity){
		custCity.sendKeys(custcity);
	}
	
	public void custSatate(String custstate){
		custState.sendKeys(custstate);
	}
	


}
