
//create constructor by creating property object/fileInputStream to load the complete file
//create method for each variable , these methods will read data from property file and return the same.

package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig()
	{
		File src=new File("./Configuration//config.properties");
		try{
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e){
			System.out.println("Exception is : "+ e);
		}
		
	}
	
	//Add method for every variable we defined in the CONFIG file and return the variable
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getUserName()
	{
		String username=pro.getProperty("username");
		return username;
	}
	
	public String getPassword()
	{
		String password=pro.getProperty("password");
		return password;
	}
	
	public String getChromePath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String getIEPath()
	{
		String iepath=pro.getProperty("iepath");
		return iepath;
	}
	
}
