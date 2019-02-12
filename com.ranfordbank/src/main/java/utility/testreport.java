package utility;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Toolkit;

import javax.imageio.ImageIO;

import testbase.base;

public class testreport extends base {
	public static boolean IsUrlIspresent(String expurl)
	{
		boolean b=driver.getCurrentUrl().contains(expurl);
	
		return b;
		
	}
	public static boolean IsTitleispresent(String exp)
	{
		boolean b=driver.getTitle().contains(exp);
		return b;
	
	}
	public static boolean IsAlertispresent(String exp1)
	{
		boolean b=driver.switchTo().alert().getText().contains(exp1);
		return b;
}
	
	public static void takescreenshot(String screenshortname)
	{
		try
		{
		Robot r=new Robot();
		BufferedImage bi=r.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(bi,"png",new File(".\\screenshot\\"+screenshortname+".png"));
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}


}