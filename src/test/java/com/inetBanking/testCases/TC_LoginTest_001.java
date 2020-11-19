package com.inetBanking.testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException{
		
		
		//we need to use page object class
		//we need to use those web element methods from the page object class in the TC class
		//create an object for the page object class
	     LoginPage lp=new LoginPage(driver);
	    lp.setUserName(username);
	    logger.info("--Entered username");
	    lp.setPassword(password);	
	    logger.info("--Entered password");
	    lp.clickSubmit();
	    logger.info("--Logged in Manager Account successfully");
	    String PageTitle=driver.getTitle();
	    
	    //verify title of the page
	    if(PageTitle.equals("GTPL Bank Manager HomePage"))
	    {
	    	logger.info("--Test Case TC_LoginTest_001.Java passed");
	    	Assert.assertTrue(true);
	    	
	    }
	    else
	    {
	    	captureScreen(driver, "TC_LoginTest_001");
	    	Assert.assertTrue(false);
	    }
		    
	}
}
