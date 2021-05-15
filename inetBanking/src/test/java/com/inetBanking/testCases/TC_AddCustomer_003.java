package com.inetBanking.testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddCustomerPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_AddCustomer_003 extends BaseClass {
	
	//single method is required here
	@Test
	public void addNewcustomer() throws InterruptedException, IOException{
	//driver object comes from baseclass	
		LoginPage login = new LoginPage(driver);
		login.setUserName(username);
		logger.info("entered username");
		login.setPassword(password);
		logger.info("Entered password");
		login.clickbutton();
		logger.info("clicked on button");
	
	
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
	addcust.customermobilenumber("9948514343");
	String email = randomString()+"@gmail.com";
	addcust.customeremail(email);
	addcust.custSubmit();
	logger.info("Entered all details in page");
	
	Thread.sleep(3000);
	
	boolean res = driver.getPageSource().contains("Customer Registered Successfully");
	
	if(res==true){
		
		Assert.assertTrue(true);
		logger.info("test case is passed");
	}
	else{
		
		capturescreen(driver, "addNewCustomer");
		Assert.assertTrue(false);
		logger.info("test case failed");
	}
	
	}
	
	//for creating random email id's
	

}
