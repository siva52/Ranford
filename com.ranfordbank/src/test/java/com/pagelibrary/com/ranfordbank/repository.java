package com.pagelibrary.com.ranfordbank;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testbase.base;
import utility.testreport;
import webtable.table_handle;

public class repository extends base {
	public static ExtentReports extent;
	public static ExtentTest  test;
	@BeforeSuite
	public void extentreport()
	{
		extent=new ExtentReports(".\\ExtentReport\\report.html",true);
	}
	@BeforeMethod
	public void beforemethod(Method method)
	{
		test=extent.startTest((this.getClass().getSimpleName()+"::"+method.getName()));
		test.assignAuthor("siva");
		test.assignCategory("Regression");
		
	}
	
	@AfterSuite
	public void savereport()
	{
		extent.flush();
	
	}
	
		
	
	
public void launch(String browser) 
{
	if(browser.contains("chrome"))
		
	{
		System.setProperty(getconfig("chromedrivername"),getconfig("chromedriverpath"));
		driver=new ChromeDriver();
	}
	else if(browser.contains("firefox"))
	{
		driver=new FirefoxDriver();
		
	}


	
   
	driver.get(getconfig("BULID1"));

	driver.manage().window().maximize();
	
	if(testreport.IsUrlIspresent(getconfig("BULID1")))
	{
		test.log( LogStatus.PASS,"My expurl"+getconfig("BULID1")+" is matching with my actualUrl"+driver.getCurrentUrl());
		test.log(LogStatus.INFO," Launch is Sucessfull");
	}
	else
	{
		
		test.log(LogStatus.FAIL,"My expurl"+getconfig("")+" is not matching with my actualUrl"+driver.getCurrentUrl());
		test.log(LogStatus.INFO," Launch is failed getting 404 error");
		testreport.takescreenshot("launch");
	}
	
}
	public static  void login()
	{
		
		Loginpage.Username_editbox().sendKeys(getconfig("Username"));
		Loginpage.password_editbox().sendKeys(getconfig("Password"));
		Loginpage.login_click().click();
		
		if(testreport.IsTitleispresent(getconfig("title")))
		{
			test.log( LogStatus.PASS,"My exptitle"+getconfig("title")+" is matching with my actualtitle"+driver.getTitle());
			test.log(LogStatus.INFO," Login is Sucessfull");
		}
		else
		{
			
			test.log(LogStatus.FAIL,"My exptitle"+getconfig("")+" is not matching with my actualtitle"+driver.getTitle());
			test.log(LogStatus.INFO," Login is failed getting 404 error");
			
			testreport.takescreenshot("login");
		}
		
		}
	
	
	public static void branches() throws InterruptedException
	{
		Adminpage.Branches_click().click();
		
		
		
		if(testreport.IsAlertispresent(getconfig("alert")))
		{
			test.log( LogStatus.PASS,"My expalert"+getconfig("alert")+" is matching with my actualalert"+driver.switchTo().alert().getText());
			test.log(LogStatus.INFO," braanch  is opened Sucessfull");
		}
		else
		{
			
			test.log(LogStatus.FAIL,"My expalert"+getconfig("")+" is not matching with my actualalert"+driver.switchTo().alert().getText());
			test.log(LogStatus.INFO," branch is  failed getting 404 error");
		
			testreport.takescreenshot("Branches");
		}
		
		
	}
	
	
	public static void Newbranches1(String Branchname,String Address1,String Address2,String Address3,String Area,String Zipcode,String Country,String State,String city)
	{
		Newbranches.Newbranch_click().click();
		Newbranches.Newbranch_branchname().sendKeys(Branchname);
		Newbranches.Newbranch_address1().sendKeys(Address1);
		Newbranches.Newbranch_address2().sendKeys(Address2);
		Newbranches.Newbranch_address3().sendKeys(Address3);
		Newbranches.Newbranch_area().sendKeys(Area);
		Newbranches.Newbranch_zipcode().sendKeys(Zipcode);
		
		Genericdropdown.dropdown_handle(Newbranches.country_click(),Country);
		Genericdropdown.dropdown_handle(Newbranches.state_click(),State);
		Genericdropdown.dropdown_handle(Newbranches.city_click(),city);
		Newbranches.submit_click().click();
		
	
		if(testreport.IsAlertispresent(getconfig("alert2")))
		{
			test.log( LogStatus.PASS,"My expalert2"+getconfig("alert2")+" is matching with my actualalert2"+driver.switchTo().alert().getText());
			test.log(LogStatus.INFO," New Branch Created is Sucessfull");
		}
		else
		{
			
			test.log(LogStatus.FAIL,"My expalert2"+getconfig("")+" is not matching with my actualalert2"+driver.switchTo().alert().getText());
			test.log(LogStatus.INFO," NEW Branch  is failed getting 404 error");
		
			testreport.takescreenshot("NEW Branch");
		}
	
		Genericdropdown.pop_up_Handler();
		
	}
	
	
	
		 
	/*public static void Newbranches()
	{
		Newbranches.Newbranch_click().click();
		Newbranches.Newbranch_branchname().sendKeys(getconfig("branchname"));
		Newbranches.Newbranch_address1().sendKeys(getconfig("address1"));
		Newbranches.Newbranch_address2().sendKeys(getconfig("address2"));
		Newbranches.Newbranch_address3().sendKeys(getconfig("address3"));
		Newbranches.Newbranch_area().sendKeys(getconfig("area"));
		Newbranches.Newbranch_zipcode().sendKeys(getconfig("Zipcode"));
		Genericdropdown.dropdown_handle(Newbranches.country_click(),"INDIA");
		Genericdropdown.dropdown_handle(Newbranches.state_click(),getconfig("state"));
		Genericdropdown.dropdown_handle(Newbranches.city_click(),getconfig("city"));
		Newbranches.submit_click().click();
		
	
		if(testreport.IsAlertispresent(getconfig("alert2")))
		{
			test.log( LogStatus.PASS,"My expalert2"+getconfig("alert2")+" is matching with my actualalert2"+driver.switchTo().alert().getText());
			test.log(LogStatus.INFO," New Branch Created is Sucessfull");
		}
		else
		{
			
			test.log(LogStatus.FAIL,"My expalert2"+getconfig("")+" is not matching with my actualalert2"+driver.switchTo().alert().getText());
			test.log(LogStatus.INFO," NEW Branch  is failed getting 404 error");
		
			testreport.takescreenshot("NEW Branch");
		}
	
		Genericdropdown.pop_up_Handler();
		
	}
	*/
	
	public static void Newbranches(String BranchName,String Address1,String Address2,String Address3,String Area,String ZipCode,String Country,String State,String City)
	{
		Newbranches.Newbranch_click().click();
		Newbranches.Newbranch_branchname().sendKeys(BranchName);
		Newbranches.Newbranch_address1().sendKeys(Address1);
		Newbranches.Newbranch_address2().sendKeys(Address2);
		Newbranches.Newbranch_address3().sendKeys(Address3);
		Newbranches.Newbranch_area().sendKeys(Area);
		Newbranches.Newbranch_zipcode().sendKeys(ZipCode);
		Genericdropdown.dropdown_handle(Newbranches.country_click(),Country);
		Genericdropdown.dropdown_handle(Newbranches.state_click(),State);
		Genericdropdown.dropdown_handle(Newbranches.city_click(),City);
		Newbranches.submit_click().click();
		
	}
	
	
	public static void role(String RoleName,String RoleDesc,String RolesType)
	{
		
	roles.roles_click().click();
	roles.newroles_click().click();
	roles.roles_name().sendKeys(RoleName);
	roles.roles_desc().sendKeys(RoleDesc);
	Genericdropdown.dropdown_handle(roles.roles_type(),(RolesType));
	roles.roles_submit().click();
	
	
	if(testreport.IsAlertispresent(getconfig("alert4")))
	{
		test.log( LogStatus.PASS,"My expalert4"+getconfig("alert4")+" is matching with my actualalert4"+driver.switchTo().alert().getText());
		test.log(LogStatus.INFO," Roles Created is Sucessfull");
	}
	else
	{
		
		test.log(LogStatus.FAIL,"My expalert4"+getconfig("")+" is not matching with my actualalert4"+driver.switchTo().alert().getText());
		test.log(LogStatus.INFO," Roles  is failed getting 404 error");
	
		testreport.takescreenshot("Roles");
	}

	
//Genericdropdown.pop_up_Handler();
	}
	
	public static void Employees(String EmployeerName,String LoginPassword,String Role,String Branch)
	{
		Employee.Employee_click().click();

		Employee.newemployee_click().click();
		Employee.employername_name().sendKeys(EmployeerName);
		Employee.loginpassword_password().sendKeys(LoginPassword);
		Genericdropdown.dropdown_handle(Employee.Employee_role(),(Role));
		Genericdropdown.dropdown_handle(Employee.Employee_branch(),(Branch));
		Employee.employer_submit3().click();
		
		if(testreport.IsAlertispresent(getconfig("alert3")))
		{
			test.log( LogStatus.PASS,"My expalert3"+getconfig("alert3")+" is matching with my actualalert3"+driver.switchTo().alert().getText());
			test.log(LogStatus.INFO," Employees Created is Sucessfull");
		}
		else
		{
			
			test.log(LogStatus.FAIL,"My expalert3"+getconfig("")+" is not matching with my actualalert3"+driver.switchTo().alert().getText());
			test.log(LogStatus.INFO," Employees  is failed getting 404 error");
		
			testreport.takescreenshot("Employees");
		}
		
		//Genericdropdown.pop_up_Handler();
	}
	
	/*public void users()
	{
		
		users.users_click().click();
	
		Genericdropdown.dropdown_handle(users.users_Branch(),getconfig("branch"));
		Genericdropdown.dropdown_handle(users.Branch_role(),getconfig("roles1"));
		users.users_search().click();
		
		
	}*/
	
	Genericdropdown pop_up_Handler() {
		return null;
		
	}
	public void tablehandle()
	{
		Adminpage.Branches_click().click();
		table_handle.table("edit");
	}
	
	public void logout()
	{
		
		logout.logout_click().click();
		
		
		
		
	}
}
	

	
	
	
	
	
	
	
	


