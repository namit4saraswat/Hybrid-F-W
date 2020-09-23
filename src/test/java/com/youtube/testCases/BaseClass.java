package com.youtube.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.log4j.Logger;

import com.youtube.utilities.ReadConfig;

public class BaseClass {

	public static WebDriver driver;
	ReadConfig readConfig = new ReadConfig();
	Logger log = Logger.getLogger(Test.class);
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String browser)

	{

		String path = readConfig.ChromeDriverPath();
		String path1 =  readConfig.FirefoxDriverPath();
		System.setProperty("webdriver.chrome.driver", path);
		System.setProperty("webdriver.gecko.driver", path1);

		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			log.info("Chrome driver is launched");
		}

		else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			log.info("Firefox driver is launched");
		}

		else {
			Assert.assertTrue(false, "No correct type sent");
		}

		driver.manage().window().maximize();
		driver.get(readConfig.getbaseURL());
	}

	@AfterSuite
	public void teardown() {
		driver.quit();
		log.info("Browser is closed");
	}

}
