package testbase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class base {
	
	static Properties p;

public	static WebDriver driver;
	public static void loadproperty() 
	{
		// TODO Auto-generated method stub
		
 try {
	File f=new File(".\\src\\main\\java\\configuration\\OR.properties");
	 FileReader fr=new FileReader(f);
	 p=new Properties();
	 p.load(fr);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	
	
	public static void loadconfigproperty() 
	{
		// TODO Auto-generated method stub
		
 try {
	File f=new File(".\\src\\main\\java\\configuration\\config.properties");
	 FileReader fr=new FileReader(f);
	 p=new Properties();
	 p.load(fr);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	
	public static String getconfig(String Key)
	{
		loadconfigproperty();
		String data=p.getProperty(Key);
		return data;
		
	}
	
 public static By getElement(String Key)
 {
	 loadproperty();
	 By loc=null;
	 String value=p.getProperty(Key);
	 String loctype=value.split(":")[0];
	 String locval=value.split(":")[1];
	 switch(loctype)
	 {
	 case "id":
		 loc=By.id(locval);
		 break;
	 case "name":
		 loc=By.name(locval);
		 break;
	 case "xpath":
		 loc=By.xpath(locval);
		  
		 
	 }
	return loc;
	 
 
	 
 }
}


