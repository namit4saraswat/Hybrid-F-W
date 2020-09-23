package com.youtube.testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.youtube.pageObjects.HomePage;

public class MusicVideo extends BaseClass {
	
	

	@Test
	public void MusicVideoSearch()
	{	
		
		
		HomePage home = new HomePage();
		home.search("Best Music Video Currently");
		
		if (driver.getTitle().equals("Best Music Video Currently - YouTube"))
		{
			Assert.assertTrue(true);
		}
		
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	
	
}
