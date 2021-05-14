package com.inetBanking.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;
import com.inetBanking.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass {
	
	//two methods we have to write one for login and one for providing data method
	
	//it will get data from dataprovider login written below
	@Test(dataProvider = "LoginData")
	public void loginDDT(String user , String pwd) throws InterruptedException{
		
		LoginPage lp = new LoginPage(driver);
		 lp.setUserName(user);
		 logger.info("username is provided");
		 lp.setPassword(pwd);
		 logger.info("password is provided");
		 lp.clickbutton(); 
		 logger.info("submit button is clicked");
		 
		 Thread.sleep(3000);
		 
		 if(isAlertpresent() == true){
			 
		driver.switchTo().alert().accept(); //close alert
		driver.switchTo().defaultContent();
		Assert.assertTrue(false);
		logger.warn("Login failed");
			 
		 }
		 
		 else {
			 Assert.assertTrue(true);
			 lp.logout();
			 //handling alert which close logout alert
			 driver.switchTo().alert().accept();
			 driver.switchTo().defaultContent();
			 logger.info("login passed");
		 }
	
	}
	
	//to verify whether alert present or not while logging in
	
	public boolean isAlertpresent(){ //user defined method to check alert is present or not
		try
		{
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e ){
		return false;
		}
			
	}
	
	
	
	
	//read excel file and store test data in two dimension array and pass value to actual test case
	@DataProvider(name = "LoginData") //logindata is getting information from for loops
	String [][] getData() throws IOException{
	
	String path = System.getProperty(("user.dir")+"/src/test/java/com/inetBanking/testData/LoginData.xlsx");
	
	//will returns the row count
	int rownum = XLUtils.getRowCount(path, "sheet1");
	//will return the columns count in excel file
	int colcount = XLUtils.getCellCount(path, "sheet1", 1);
	//two dimensional array
	String logindata[][] = new String [rownum][colcount];
	
	
	for(int i =1; i<=rownum; i++){
		
		for(int j=0; j<=colcount; j++){
			//not considering 0 index from excel sheet since it has header 
			logindata[i-1][j] = XLUtils.getCellData(path, "Sheet1", i, j); // 1,0
			
		}
	}
	
	return logindata;
	
	
	}
	
	
	

}
