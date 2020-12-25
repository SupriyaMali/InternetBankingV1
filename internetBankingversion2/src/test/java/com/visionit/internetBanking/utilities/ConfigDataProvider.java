package com.visionit.internetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	public Properties prop;
	public ConfigDataProvider() {

	try {
		File fs =	new File("./Config/config.properties");
		FileInputStream fis=new FileInputStream(fs);
		prop=new Properties();
		prop.load(fis);
	} catch (Exception  e) {
	
		e.printStackTrace();
	}
	}
	public String getKeyValue(String searchKey) {
		return prop.getProperty(searchKey);
	}
	public String getUserID() {
		return prop.getProperty("UserID");
	}
	public String getUserPassword() {
		return prop.getProperty("password");
	}
	public String getAppUrl() {
		return prop.getProperty("url");
	}

}
