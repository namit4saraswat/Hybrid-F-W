package com.youtube.utilities;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Screenshot  {

	public static String take_snip(WebDriver driver) {
		
		String screenshotPath = "C:\\Users\\namit\\Documents\\Linked in learning\\Eclipse\\youtube\\Screenshots" + System.currentTimeMillis() + ".png";
		File dstn = new File(screenshotPath);
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(source, dstn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return screenshotPath;
		
	}

}
