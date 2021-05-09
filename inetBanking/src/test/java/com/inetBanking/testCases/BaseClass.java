package com.inetBanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inetBanking.utilities.ReadConfig;


public class BaseClass {
	
	//creating object of read config to access all methods in read config java
	ReadConfig readconfig = new ReadConfig();
	//common variables that every test cases use
	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUserName();
	public String password = readconfig.getPassword();
	public static WebDriver driver;	
	public static Logger logger;
	
	//if suppose we extends this class to another class 
	//this before class method will execute first and later test methods
	
	@BeforeClass
	public void setup(){
		
		System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
		driver = new ChromeDriver();
		//logger class
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
		
	}
	
	//after class method will execute after test methods
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
