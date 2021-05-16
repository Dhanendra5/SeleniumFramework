package com.inetBanking.testCases;

import org.testng.annotations.Test;

import com.inetBanking.pageObjects.EditCustomer;

public class TC_EditCustomer_004 extends BaseClass{
	
	@Test(priority=1)
	public void editNewCustomer(){
		
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
