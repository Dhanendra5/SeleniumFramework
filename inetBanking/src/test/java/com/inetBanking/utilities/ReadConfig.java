package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

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
	
	

}
