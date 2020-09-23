package com.youtube.utilities;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;

public class ReadConfig {
	Properties prop;
	public ReadConfig() {

		try {
			File src = new File("C:\\Users\\namit\\Documents\\Linked in learning\\Eclipse\\youtube\\Configuration\\config.properties");
			prop = new Properties();
			FileInputStream ip = new FileInputStream(src);
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	// List of Methods
	public String ChromeDriverPath() {
		String path = prop.getProperty("chromeDriverPath");
		System.out.println("Chrome path is " + path);
		return path;
	}

	public String FirefoxDriverPath() {
		String path = prop.getProperty("firefoxDriverPath");

		return path;
	}

	public String getbaseURL() {
		String path = prop.getProperty("baseURL");

		return path;
	}

}
