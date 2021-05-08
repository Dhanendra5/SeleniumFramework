package com.inetBanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	
	//common variables that every test cases use
	public String baseURL = "http://demo.guru99.com/V4/";
	public String username = "mngr324911";
	public String password = "ubegAqA";
	public static WebDriver driver;	
	public static Logger logger;
	
	//if suppose we extends this class to another class 
	//this before class method will execute first and later test methods
	
	@BeforeClass
	public void setup(){
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
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
