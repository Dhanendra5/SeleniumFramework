package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 public  class LoginPage {

	WebDriver ldriver;
	
	//constructor is made as public since it is used outside of package
	public LoginPage(WebDriver rdriver){
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	//findig the elements in below possible way
	@FindBy(name = "uid")
	WebElement txtUsername;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnklogout;
	//Action methods 
	
	public void setUserName(String uname){
		
		txtUsername.sendKeys(uname);
	}
	
	public void setPassword(String pwd){
		
		txtPassword.sendKeys(pwd);
	}
	
	public void clickbutton(){
		
		btnLogin.click();
	}
	
	public void logout(){
		
		lnklogout.click();
	}
	
	
	
	
}
