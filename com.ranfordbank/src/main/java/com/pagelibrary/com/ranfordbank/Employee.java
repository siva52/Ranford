package com.pagelibrary.com.ranfordbank;
import org.openqa.selenium.WebElement;

import testbase.base;

public class Employee extends base 
{
public static WebElement Employee_click()
	
	
	{
		return driver.findElement(getElement("Employee"));
	}
		
		public static WebElement newemployee_click()
		
		
		{
			return driver.findElement(getElement("newemployee"));
		}
			public static WebElement employername_name()
			
			
			{
				return driver.findElement(getElement("employername"));
			}
public static WebElement loginpassword_password()
			
			
			{
				return driver.findElement(getElement("loginpassword"));	
			}
public static WebElement Employee_role()
{
	return driver.findElement(getElement("role"));
	

}

public static WebElement Employee_branch()
{
	return driver.findElement(getElement("branch1"));
}
public static WebElement employer_submit3()


{
	return driver.findElement(getElement("submit3"));
}
}


