package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testbase.base;

public class Adminpage extends base {
	
	
	public static WebElement Branches_click()
	{
		

			return driver.findElement(getElement("Branches"));
		}
		public static void Roles_click()
		{
			driver.findElement(getElement("Role"));
		}
				public static void Users_click()
				{
					driver.findElement(getElement("Users"));
			}
				
				{
					
				}
					public static void Employee_click()
					{
						driver.findElement(getElement("Employee"));
						
	}
	
	

}
