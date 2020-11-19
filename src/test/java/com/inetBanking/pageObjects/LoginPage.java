package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//There are 3 elements on the login page - user id password login button
	//First thing we need to create Driver object
	//create constructor for the loginPage and it will take driver as parameter WebDriver Driver
	//make Local and Remote Driver 
	//
	
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
	//initiate driver
		ldriver=rdriver;
		//need to specify the page factory class
		PageFactory.initElements(rdriver, this);
		
	}

	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement loginBtn;
	//write action methods
	
	public void setUserName(String uname){
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd){
		txtPassword.sendKeys(pwd);
	}
		
		public void clickSubmit(){
			loginBtn.click();;
	}
}


