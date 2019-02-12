package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import testbase.base;

public class roles extends base {
public static WebElement roles_click()
{
	return driver.findElement(getElement("rolesclick"));
	
}

public static WebElement newroles_click()
{
return driver.findElement(getElement("newroles"));

}
public static WebElement roles_name()
{
return driver.findElement(getElement("rolename"));

}
public static WebElement roles_desc()
{
return driver.findElement(getElement("roledesc"));
}

public static WebElement roles_type()
{
return driver.findElement(getElement("roletype"));
}

public static WebElement roles_submit()
{
return driver.findElement(getElement("submit1"));
}
}
