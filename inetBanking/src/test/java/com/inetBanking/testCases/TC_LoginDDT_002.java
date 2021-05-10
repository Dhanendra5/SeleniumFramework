package com.inetBanking.testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass {
	
	//two methods we have to write one for login and one for providing data method
	
	
	@Test
	public void loginDDT(){
		
		
	}
	//read excel file and store test data in two dimension array and pass value to actual test case
	@DataProvider(name = "LoginData")
	getData(){
		
	String path = System.getProperty(("user.dir") + "/src/test/java/com/inetBanking/testData/LoginData.xlsx");
	
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
