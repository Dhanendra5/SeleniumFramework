package com.inetBanking.testCases;

import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddCustomerPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_AddCustomer_003 extends BaseClass {
	
	//single method is required here
	@Test
	public void addNewcustomer() throws InterruptedException{
	//driver object comes from baseclass	
	LoginPage lp = new LoginPage(driver);
	lp.setUserName(username);
	lp.setPassword(password);
	lp.clickbutton();
	
	Thread.sleep(3000);
	
	
	AddCustomerPage addcust = new AddCustomerPage(driver);
	addcust.clickAddNewCustomer();
	addcust.custName("Dhani");
	addcust.custGender("male");
	addcust.custDOB("06", "24", "1994");
	addcust.custaddress("Sri Kalahasti");
	addcust.custCity("Sri Kalahasti");
	addcust.custSatate("Andhra Pradesh");
	addcust.customerpincode(123456);
	addcust.CustPassword("Welcome@123");
	addcust.customeremail("vundupuramdhanendra@gmail.com");
	addcust.customermobilenumber("9948514343");
	
	
		
	}

}
