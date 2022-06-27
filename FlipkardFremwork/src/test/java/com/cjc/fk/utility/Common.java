package com.cjc.fk.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Common {
	public static WebDriver driver;
	public static Properties pro= new Properties();
	public static FileInputStream fis;
	public static XSSFWorkbook asw;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;




	public static FileInputStream filecall() throws FileNotFoundException
	{
	 fis=new FileInputStream("F:\\FlipkardFremwork\\src\\test\\resources\\flipkard.properties");
	return fis;
	}


	public static String excel_Read_usrname() throws IOException
	{
		fis=new FileInputStream("C:\\Users\\Akash\\git\\FremworkDesign\\FlipkardFremwork\\src\\test\\resources\\FKFremwork.xlsx");
	    asw=new XSSFWorkbook(fis);
	    sheet=asw.getSheet("Sheet1");
	    row=sheet.getRow(1);
	    cell=row.getCell(0);
	    String username=cell.getStringCellValue();
	    return username;
	}

	public static String excel_Read_pass() throws IOException
	{
		fis=new FileInputStream("C:\\Users\\Akash\\git\\FremworkDesign\\FlipkardFremwork\\src\\test\\resources\\FKFremwork.xlsx");
	    asw=new XSSFWorkbook(fis);
	    sheet=asw.getSheet("Sheet1");
	    row=sheet.getRow(1);
	    cell=row.getCell(1);
	    String pass=cell.getStringCellValue();
	    return pass;
	}



	
}
