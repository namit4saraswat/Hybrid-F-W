package com.youtube.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="search")
	WebElement searchBox;
	
	public void search (String key)
	{	
		System.out.println(key);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(searchBox));
		searchBox.sendKeys(key);
		searchBox.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	
}
