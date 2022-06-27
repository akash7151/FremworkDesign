package com.cjc.utilitiy;

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
public static XSSFWorkbook w1;
public static XSSFSheet sheet;
public static XSSFRow row;
public static XSSFCell cell;




public static FileInputStream filecall() throws FileNotFoundException
{
 fis=new FileInputStream("F:\\FremworkAutomationIndex\\src\\test\\resources\\configuration\\config.properties");
return fis;
}


public static String firstN() throws IOException
{
	fis=new FileInputStream("F:\\FremworkAutomationIndex\\src\\test\\resources\\AutoIndexxlsx.xlsx");
    w1=new XSSFWorkbook(fis);
    sheet=w1.getSheetAt(0);
    row=sheet.getRow(1);
    cell=row.getCell(0);
    String firstname=cell.getStringCellValue();
    return firstname;
}

public static String secondN() throws IOException
{
	fis=new FileInputStream("F:\\FremworkAutomationIndex\\src\\test\\resources\\AutoIndexxlsx.xlsx");
    w1=new XSSFWorkbook(fis);
    sheet=w1.getSheetAt(0);
    row=sheet.getRow(1);
    cell=row.getCell(1);
    String lastname=cell.getStringCellValue();
    return lastname;
}
public static String passW() throws IOException {
	fis=new FileInputStream("F:\\FremworkAutomationIndex\\src\\test\\resources\\AutoIndexxlsx.xlsx");
	w1=new XSSFWorkbook(fis);
	sheet=w1.getSheetAt(0);
	row=sheet.getRow(1);
	cell=row.getCell(2);
	String password=cell.getStringCellValue();
	return password;
}
public static String companyN() throws IOException {
	fis=new FileInputStream("F:\\FremworkAutomationIndex\\src\\test\\resources\\AutoIndexxlsx.xlsx");
	w1=new XSSFWorkbook(fis);
	sheet=w1.getSheetAt(0);
	row=sheet.getRow(1);
	cell=row.getCell(3);
	String password=cell.getStringCellValue();
	return password;
}

public static String addressN1() throws IOException {
	fis=new FileInputStream("F:\\FremworkAutomationIndex\\src\\test\\resources\\AutoIndexxlsx.xlsx");
	w1=new XSSFWorkbook(fis);
	sheet=w1.getSheetAt(0);
	row=sheet.getRow(1);
	cell=row.getCell(4);
	String address1=cell.getStringCellValue();
	return address1;
}
public static String addressN2() throws IOException {
	fis=new FileInputStream("F:\\FremworkAutomationIndex\\src\\test\\resources\\AutoIndexxlsx.xlsx");
	w1=new XSSFWorkbook(fis);
	sheet=w1.getSheetAt(0);
	row=sheet.getRow(1);
	cell=row.getCell(5);
	String address2=cell.getStringCellValue();
	return address2;
}
public static String cityN2() throws IOException {
	fis=new FileInputStream("F:\\FremworkAutomationIndex\\src\\test\\resources\\AutoIndexxlsx.xlsx");
	w1=new XSSFWorkbook(fis);
	sheet=w1.getSheetAt(0);
	row=sheet.getRow(1);
	cell=row.getCell(6);
	String city=cell.getStringCellValue();
	return city;
}
public static String postalCode() throws IOException {
	fis=new FileInputStream("F:\\FremworkAutomationIndex\\src\\test\\resources\\AutoIndexxlsx.xlsx");
	w1=new XSSFWorkbook(fis);
	sheet=w1.getSheetAt(0);
	row=sheet.getRow(1);
	cell=row.getCell(7);
	String  pcode= cell.getStringCellValue();
	return pcode;
}
public static String mobileNo() throws IOException {
	fis=new FileInputStream("F:\\FremworkAutomationIndex\\src\\test\\resources\\AutoIndexxlsx.xlsx");
	w1=new XSSFWorkbook(fis);
	sheet=w1.getSheetAt(0);
	row=sheet.getRow(1);
	cell=row.getCell(8);
	String mobileno= cell.getStringCellValue();
	return mobileno;
}
}