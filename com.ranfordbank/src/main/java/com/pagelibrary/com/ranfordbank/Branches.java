package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testbase.base;

public class Branches extends base {
	static WebDriver driver;
	
	
	public static WebElement country()
	{
		return driver.findElement(getElement("country"));
		
	}

public static WebElement search_click()
{
	return driver.findElement(getElement("search"));
	
}

public static WebElement clear_click()
{
	return driver.findElement(getElement("clear"));
}

public static WebElement click_click() {
	// TODO Auto-generated method stub
	return null;
}
}





