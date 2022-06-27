package com.cjc.pom.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.cjc.utilitiy.Common;

public class MyAccount {
public  MyAccount(WebDriver driver) {
	Common.driver=driver;
}
@FindBy(xpath = "//*[@id=\"id_gender2\"]")
WebElement Mrs1;
@FindBy(xpath = "//*[@id=\"customer_firstname\"]")
WebElement fn1;
@FindBy(xpath = "//*[@id=\"customer_lastname\"]")
WebElement ln1;
@FindBy(xpath = "//*[@id=\"passwd\"]")
WebElement pass1;
@FindBy(xpath = "//*[@id=\"company\"]")
WebElement company1;
@FindBy(xpath = "//*[@id=\"address1\"]")
WebElement add1;
@FindBy(xpath = "//*[@id=\"address2\"]")
WebElement add2;
@FindBy(xpath = "//*[@id=\"city\"]")
WebElement city11;
@FindBy(xpath = "//*[@id=\"id_state\"]")
WebElement state1;
@FindBy(xpath = "//*[@id=\"postcode\"]")
WebElement code1;
@FindBy(xpath = "//*[@id=\"phone_mobile\"]")
WebElement mono1;
@FindBy(xpath = "//*[@id=\"submitAccount\"]/span")
WebElement register1;
public void registerDeta() throws IOException {
	String fn=Common.firstN();
	String ln=Common.secondN();
	String ps=Common.passW();
	String com=Common.companyN();
	String addres1=Common.addressN1();
	String addre2=Common.addressN2();
	String city1=Common.cityN2();
	String  code=Common.postalCode();
	String mno1=Common.mobileNo();
	
	
	System.out.println("FirstName="+fn);
	System.out.println("LastName="+ln);
	System.out.println("Password="+ps);
	System.out.println("Company="+com);
	System.out.println("Adrees1="+addres1);
	System.out.println("Adrees2="+addre2);
	System.out.println("City="+city1);
	System.out.println("PostalCode="+code);
	System.out.println("MobileNo="+mno1);
	Mrs1.click();
	fn1.sendKeys(fn);
	ln1.sendKeys(ln);
	pass1.sendKeys(ps);
	company1.sendKeys(com);
	add1.sendKeys(addres1);
	add2.sendKeys(addre2);
	city11.sendKeys(city1);
	code1.sendKeys(code);

	mono1.sendKeys(mno1);
}
	public void selectState() {
		Select s1=new Select(state1);
		s1.selectByValue("2");

		register1.click();
	}
	

	//state1.
}

