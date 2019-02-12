package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import testbase.base;

public class users extends base {
	
	public static WebElement users_click()
	{
		return driver.findElement(getElement("users"));
		
	}
	
	public static WebElement users_Branch()
	{
	return driver.findElement(getElement("branch"));
	}
	public static WebElement Branch_role()
	{
	return driver.findElement(getElement("roles1"));

}
	
	public static WebElement users_search()
	{
	return driver.findElement(getElement("search"));

}
}


