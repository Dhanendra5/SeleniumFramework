package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

//this is utility class used to read property file and pass parameters to base class
public class ReadConfig {
	
    Properties pro;
    
    public ReadConfig(){
    	
        // src here referes to properties file
    	File src = new File("./configuration/config.properties");
    	
    
    try {
    	//top read any file we user file input stream
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties(); //initiating pro object here
		//loading properties file
		pro.load(fis);
		//used  try catch block if file is not found
		
	} catch (Exception e) {
	
		System.out.println("Exception is " + e.getMessage());
	}
    
        	
    }
    // this method will read baseurl from properties file
    // and return base url value to base class
    public String getApplicationURL(){
    	String url = pro.getProperty("baseURL");
    	return url;
    	
    }
    //this function get value of username and pass to base class
    public String getUserName(){
    String username = pro.getProperty("username");
    return username;    	
    }
    
    //getting password
    
   public String getPassword(){
	  String password = pro.getProperty("password");
	  return password;
   }
   
   //getting chromepath
   public String getChromepath(){
	   String chromepath = pro.getProperty("chromepath");
	   return chromepath;
   }
   
   //getting iepath
   public String getIEpath(){
	   String IEpath = pro.getProperty("iepath");
	   return IEpath;
	   
   }
  //getting IE path 
   public String getMozillaPath(){
	   String Mozillapath = pro.getProperty("firefoxpath");
	   return Mozillapath;
   }
	
	

}
