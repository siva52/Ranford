package com.pagelibrary.com.ranfordbank;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import testbase.base;

public class Excelclass extends base {
	public static String folderpath=getconfig("fldr");
	static Sheet sh;
	static Workbook wb;
	static WritableWorkbook wwb;
	static WritableSheet wsh;
	public static void excelConnection(String NewBranch,String Branch)
	{
	File f=new File(folderpath+NewBranch);
	try {
		Workbook wb=Workbook.getWorkbook(f);
		sh=wb.getSheet(Branch);
	} catch (BiffException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
	}
	public static int rowcount()
	{
		int rc=sh.getRows();
		return rc;
		
	}
	public static int colcount()
	{
		int cc=sh.getColumns();
		return cc;
		
	}
public static String readdata(int col,int row)
{
	String str=sh.getCell(col,row).getContents();
	return str;
	
}

  //   we r reading the data from the up as expected values


public static void Outputexcelconnection(String Ifilename,String Branch,String Ofilename)
{
	try
	{
		FileInputStream fis=new FileInputStream(folderpath+Ifilename);
		
		wb=Workbook.getWorkbook(fis);
		sh=wb.getSheet(Branch);
		FileOutputStream fos=new FileOutputStream(folderpath+Ofilename);
		
		wwb=Workbook.createWorkbook(fos, wb);
		
		wsh=wwb.getSheet(Branch);
	}
	
	catch (Exception e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
}	
	
	
	
		
	

public static void WriteData(int col,int row,String data)
{
	
try
{
	
Label I=new Label(col,row,data);
	wsh.addCell(I);
}
catch(Exception e)
{
}
}
public static void saveworkbook()
{
	try{
		wwb.write();
		wwb.close();
		wb.close();
		
	}
	catch(Exception e)
	{
	}
	
	}
}


			

