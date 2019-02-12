package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import testbase.base;

public class logout extends base{
	public static WebElement logout_click()
	{
		return driver.findElement(getElement("logout"));

}
}

