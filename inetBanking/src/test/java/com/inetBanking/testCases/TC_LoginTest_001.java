package com.inetBanking.testCases;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;


//every test case should get extended to base class
public class TC_LoginTest_001  extends BaseClass{
	
	
	
	@Test
	public void loginTest() throws IOException{
	
		driver.get(baseURL);
		logger.info("url is opened");		
		//we will create login page object here to call methods from loginpage
		//these methods are written in pageobject
		LoginPage login = new LoginPage(driver);
		login.setUserName(username);
		logger.info("entered username");
		login.setPassword(password);
		logger.info("Entered password");
		login.clickbutton();
		logger.info("clicked on button");
		
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage54321")){
			
			Assert.assertTrue(true);
			logger.info("Test passed");
		}
		else{
			
			capturescreen(driver , "loginTest");
			Assert.assertTrue(false);
			logger.info("Test failed");
		
	}
		
	
	
	}

}
