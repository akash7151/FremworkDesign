package com.cjc.fk.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.cjc.fk.utility.Common;

public class LoginPage {
	public  LoginPage(WebDriver driver)
	{
		Common.driver=driver;
	}

	// POM with pageFactory
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement mobno;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	WebElement password;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")
	@CacheLookup
	WebElement login;
	
	
	 public void login() throws IOException
     {
		
		
//	 String un=Common.excel_Read_usrname();
//		 String ps=Common.excel_Read_pass();
//		 
//		 System.out.println("Username============="+un);
//		 System.out.println("pass============="+ps);
//		 
    	mobno.sendKeys("7972547020");
        password.sendKeys("dell@123");
    	login.click();
     }
		
	

}
