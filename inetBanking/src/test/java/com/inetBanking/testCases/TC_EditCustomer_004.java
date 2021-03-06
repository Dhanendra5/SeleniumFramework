package com.inetBanking.testCases;

import org.testng.annotations.Test;

import com.inetBanking.pageObjects.EditCustomer;
import com.inetBanking.pageObjects.LoginPage;

public class TC_EditCustomer_004 extends BaseClass{
	
	@Test
	public void editNewCustomer() throws InterruptedException{
		
		LoginPage login = new LoginPage(driver);
		login.setUserName(username);
		logger.info("entered username");
		login.setPassword(password);
		logger.info("Entered password");
		login.clickbutton();
		logger.info("clicked on button");
	    Thread.sleep(3000);
	    
		EditCustomer editCust = new EditCustomer(driver);
		editCust.clickEditcustomer();
		logger.info("clicked on edit customer");
		//created object of test case to get cust ID variable
		TC_AddCustomer_003 addcust = new TC_AddCustomer_003();
		//entered cust ID variable in text box
		editCust.EnterCustomerID(addcust.custID);
		logger.info("entered customerID");
		editCust.custEditsubmit();
		logger.info("clicked on submit");
		
		
	}

}
