package com.inetBanking.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

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
	
	//changing before class to launch any browser  for tests vross browser testing
	//set up method will take this browser parameter as br
	@Parameters("browser")
	@BeforeClass
	public void setup(String br){
		
		//logger class
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
		
		if (br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
		driver = new ChromeDriver();
		}
		else if(br.equals("firefox")){
		System.setProperty("webdriver.gecko.driver", readconfig.getMozillaPath());
		driver = new FirefoxDriver();    
		}
		else if(br.equals("ie")){
		System.setProperty("webdriver.ie.driver",readconfig.getIEpath());
		driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		
	
	
		
	}
	
	//after class method will execute after test methods
	@AfterClass(enabled = false)
	public void tearDown()
	{
		driver.quit();
	}
	
	public void capturescreen(WebDriver driver, String tname) throws IOException{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");
		
	}
	
    public String randomString(){
		
		String generatedString = RandomStringUtils.randomAlphabetic(8);
		return (generatedString);
	}
	
	public static String randomNum(){
		
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}

}
