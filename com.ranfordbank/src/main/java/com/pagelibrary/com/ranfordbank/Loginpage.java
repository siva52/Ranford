package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import testbase.base;

public class Loginpage extends base {
	
	public static WebElement Username_editbox()
	
	
	{
return driver.findElement(getElement("username"));
	}
	public static WebElement password_editbox()
	{
		return driver.findElement(getElement("password"));
		
	}
		
		public static WebElement login_click()
		{
		return driver.findElement(getElement("login"));
		
			
		}
		
	}
	
	


