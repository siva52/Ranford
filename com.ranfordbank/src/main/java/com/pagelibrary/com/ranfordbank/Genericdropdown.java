package com.pagelibrary.com.ranfordbank;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testbase.base;

public class Genericdropdown extends base {


public static Select dropdown_handle(WebElement element,String data) {
	


	Select s=new Select(element);
	List<WebElement>options=s.getOptions();
	for(WebElement op:options)
	{
		String x=op.getText();
		if(x.contains(data))
		{
		s.selectByVisibleText(data);
		break;
		
		}
	}
	return s;
}

public static void pop_up_Handler()
{
	Alert alert=driver.switchTo().alert();
	alert.accept();
}
}
