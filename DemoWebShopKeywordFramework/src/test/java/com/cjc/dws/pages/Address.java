package com.cjc.dws.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Address {
	WebDriver driver;
	Properties pro = new Properties();
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[2]/div[3]/input")
	WebElement agree;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[2]/div[4]/button")
	WebElement checkout;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[1]/div[2]/div/input")
	WebElement con1;
	@FindBy(css = "#shipping-buttons-container > input")
	WebElement con2;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/input")
	WebElement con3;
	
	public Address(WebDriver driver) {
		this.driver = driver;  
	}


	@FindBy(xpath = "//*[@id=\"billing-address-select\"]")
	WebElement a_new;
	@FindBy(xpath = "//*[@id=\"BillingNewAddress_CountryId\"]")
	WebElement a_country;
	@FindBy(xpath = "//*[@id=\"BillingNewAddress_City\"]")
	WebElement a_city;
	@FindBy(xpath = "//*[@id=\"BillingNewAddress_Address1\"]")
	WebElement a_address;
	@FindBy(xpath = "//*[@id=\"BillingNewAddress_ZipPostalCode\"]")
	WebElement a_zip;
	@FindBy(xpath = "//*[@id=\"BillingNewAddress_PhoneNumber\"]")
	WebElement a_number;
	public void newAddress() throws InterruptedException, IOException
	{
		FileInputStream fis1 = new FileInputStream("F:\\DemoWebShopKeywordFramework\\src\\test\\resources\\parameter.properties");
		pro.load(fis1);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		agree.click();
		checkout.click();
		Select s=new Select(a_new);
		s.selectByIndex(5);
		
		Select s1=new Select(a_country);
		s1.selectByIndex(40);
		
		a_city.sendKeys(pro.getProperty("city"));
		a_address.sendKeys(pro.getProperty("add1"));
		a_zip.sendKeys(pro.getProperty("zipcode"));
		a_number.sendKeys(pro.getProperty("num"));
		con1.click();
		Thread.sleep(3000);
		con2.click();
		Thread.sleep(3000);
		con3.click();
		Thread.sleep(3000);
	}

}
