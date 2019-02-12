package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import testbase.base;

public class Newbranches extends base
{

	public static WebElement Newbranch_click()
	{
		return driver.findElement(getElement("newbranch"));
	}
//fill the elements
	
	public static WebElement Newbranch_branchname() 
	{
		return driver.findElement(getElement("branchname"));
		
	}
	public static WebElement Newbranch_address1() 
	{
		return driver.findElement(getElement("address1"));
	}
		
		public static WebElement Newbranch_address2() 
		{
			return driver.findElement(getElement("address2"));
			
	}
		
		public static WebElement Newbranch_address3() 
		{
			return driver.findElement(getElement("address3"));
		}
		
		public static WebElement Newbranch_area() 
		{
			return driver.findElement(getElement("area"));
		}
		public static WebElement Newbranch_zipcode() 
		{
			return driver.findElement(getElement("zipcode"));
		}

		public static WebElement country_click()
		{
			return driver.findElement(getElement("country1"));
			
		}

		public static WebElement state_click()
		{
			return driver.findElement(getElement("state1"));
		}

		public static WebElement city_click()
		{
			return driver.findElement(getElement("city1"));
		}
		public static WebElement submit_click()
		{
			return driver.findElement(getElement("submit"));
			
		}


}
