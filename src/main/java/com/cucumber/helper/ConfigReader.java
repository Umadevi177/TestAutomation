package com.cucumber.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {
	public Properties pr = new Properties();

	public ConfigReader() throws Throwable {
		try {
			File pf = new File(System.getProperty("user.dir")
					+ "\\src\\test\\resource\\com\\cucumber\\properties\\Configuration.properties");
			FileInputStream fis = new FileInputStream(pf);
			pr.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}
	public String getBrowserName() throws Exception {
	String browser = pr.getProperty("BrowserName");
	if (browser==null) {
		throw new Exception("Give Valid browser name");
	}
	return browser;
		
	}
	public String getUrl() throws Exception {
		String url = pr.getProperty("Url");
		if (url==null) {
			throw new Exception("Give Valid browser name");
		}
		return url;
			
		}
}
