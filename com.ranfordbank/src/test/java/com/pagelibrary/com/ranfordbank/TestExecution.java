package com.pagelibrary.com.ranfordbank;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestExecution extends repository
{
	@Parameters({"browser"})
	 @Test(priority=0)
	public void verify_launch(String browser)
	{
		launch(browser);
		
	}
	
   @Test(priority=1)
   public void verify_login()
   {
		login();
   }

@Test(priority=2)
public void verify_branches() throws InterruptedException
{
	branches();
}

@Test(priority=3)
	public void verify_newbranches()
	{
	Excelclass.excelConnection("Data.xls","Branch");
	/*for(int r=1;r<Excelclass.rowcount();r++)
	{
		Newbranches1(Excelclass.readdata(0, r),Excelclass.readdata(1, r),Excelclass.readdata(2, r),Excelclass.readdata(3, r),Excelclass.readdata(4, r),Excelclass.readdata(5, r),Excelclass.readdata(6, r),Excelclass.readdata(7, r),Excelclass.readdata(8, r));
	}*/
	Excelclass.Outputexcelconnection("Data.xls", "Branch", "output.xls");
	
	for(int r=1;r<Excelclass.rowcount();r++)
	{
		
		Newbranches(Excelclass.readdata(0, r),Excelclass.readdata(1, r),Excelclass.readdata(2, r),Excelclass.readdata(3, r),Excelclass.readdata(4, r),Excelclass.readdata(5, r),Excelclass.readdata(6, r),Excelclass.readdata(7, r),Excelclass.readdata(8, r));
		String text=driver.switchTo().alert().getText();
		
		driver.switchTo().alert().accept();
		
		if(text.contains("already Exist"))
		{
			Excelclass.WriteData(9, r, text);
		}
		else if(text.contains("created Successfully!"))
		{
			Excelclass.WriteData(9, r, text);
		}
		else
		{
			Excelclass.WriteData(9, r, "n/a");
		}
	}
	Excelclass.saveworkbook();
	
	}

@Test(priority=4)
public void verify_Employee()
{
Excelclass.excelConnection("Data.xls","Employee");
/*for(int r=1;r<Excelclass.rowcount();r++)
{
	Newbranches1(Excelclass.readdata(0, r),Excelclass.readdata(1, r),Excelclass.readdata(2, r),Excelclass.readdata(3, r)));
}*/
Excelclass.Outputexcelconnection("Data.xls", "Employee", "output.xls");

for(int r=1;r<Excelclass.rowcount();r++)
{
	
	Employees(Excelclass.readdata(0, r),Excelclass.readdata(1, r),Excelclass.readdata(2, r),Excelclass.readdata(3, r));
	String text=driver.switchTo().alert().getText();
	
	driver.switchTo().alert().accept();
	
	if(text.contains("already Exist"))
	{
		Excelclass.WriteData(4, r, text);
	}
	else if(text.contains("created Successfully!"))
	{
		Excelclass.WriteData(4, r, text);
	}
	else
	{
		Excelclass.WriteData(4, r, "n/a");
	}
}
Excelclass.saveworkbook();

}



@Test(priority=5)
public void verify_Roles()
{
Excelclass.excelConnection("Data.xls","roles");
/*for(int r=1;r<Excelclass.rowcount();r++)
{
	Newbranches1(Excelclass.readdata(0, r),Excelclass.readdata(1, r),Excelclass.readdata(2, r),Excelclass.readdata(3, r),Excelclass.readdata(4, r),Excelclass.readdata(5, r),Excelclass.readdata(6, r),Excelclass.readdata(7, r),Excelclass.readdata(8, r));
}*/
Excelclass.Outputexcelconnection("Data.xls", "roles", "output.xls");

for(int r=1;r<Excelclass.rowcount();r++)
{
	
	role(Excelclass.readdata(0, r),Excelclass.readdata(1, r),Excelclass.readdata(2, r));
	String text=driver.switchTo().alert().getText();
	
	driver.switchTo().alert().accept();
	
	if(text.contains("Already existed"))
	{
		Excelclass.WriteData(3, r, text);
	}
	else if(text.contains("created Successfully!"))
	{
		Excelclass.WriteData(3, r, text);
	}
	else
	{
		Excelclass.WriteData(3, r, "n/a");
	}
}
Excelclass.saveworkbook();

}




/*@Test(priority=6)
public void verify_users()
{
	users();
}*/

@Test(priority=7)
public void verify_table_handle()
{
	tablehandle();
}
/*@Test(priority=8)
public void verify_logout()
{
	logout();*/

}



