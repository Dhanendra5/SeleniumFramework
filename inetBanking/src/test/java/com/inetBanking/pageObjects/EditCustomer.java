package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditCustomer {
	
WebDriver ldriver;
	
	//constructor
	public EditCustomer(WebDriver rdriver){
		
		ldriver = rdriver;
	    PageFactory.initElements(rdriver, this);
	
	}

	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Customer')]")
	@CacheLookup
	WebElement custEdit;
	
	@FindBy(how = How.NAME ,using = "cusid")
	@CacheLookup
	WebElement EnterCusID;
	
	@FindBy(how = How.NAME ,using = "AccSubmit")
	@CacheLookup
	WebElement CusIDsubmit;
	
	
	
	
	
	//Action methods
	public void clickEditcustomer(){
		custEdit.click();
	}
	
	//take parameter from testcase and pass this parameter 
	public void EnterCustomerID(String id){
		EnterCusID.sendKeys(id);
		
	}
	
	public void custEditsubmit(){
		
		CusIDsubmit.click();
	}
	
	
	
	


}


