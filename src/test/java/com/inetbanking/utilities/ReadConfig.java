package com.inetbanking.utilities;


import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ReadConfig {
Properties prop;

public ReadConfig()
{
	File src=new File("./Configuration/config.properties");
	try {
		FileInputStream fis=new FileInputStream(src);
		prop=new Properties();
		prop.load(fis);
	} catch (Exception e) {
		System.out.println("Exception is "+e.getMessage());
		// TODO Auto-generated catch block
		
	}
	
}
public String getApplicationURL()
{
	String url=prop.getProperty("baseURL");
	return url;
}
public String getUsername()
{
	String uname=prop.getProperty("username");
	return uname;
}
public String getpassword()
{
	String pass=prop.getProperty("password");
	return pass;
}
public String getChromePath()
{
	String chrome=prop.getProperty("chromepath");
	return chrome;
}
public String getFirefox()
{
	String fire=prop.getProperty("firefoxpath");
	return fire;
}
}