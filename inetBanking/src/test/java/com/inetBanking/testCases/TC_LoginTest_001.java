package com.inetBanking.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;


//every test case should get extended to base class
public class TC_LoginTest_001  extends BaseClass{
	
	
	
	@Test
	public void loginTest(){
	
		driver.get(baseURL);
		//logger.info("url is opened");		
		//we will create login page object here to call methods from loginpage
		//these methods are written in pageobject
		LoginPage login = new LoginPage(driver);
		login.setUserName(username);
		//logger.info("entered username");
		login.setPassword(password);
		//logger.info("Entered password");
		login.clickbutton();
		//logger.info("clicked on button");
		
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")){
			
			Assert.assertTrue(true);
			logger.info("Test passed");
		}
		else{
			
			Assert.assertTrue(false);
			logger.info("Test failed");
		
	}
	
	}

}
