package com.cjc.dws.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	Properties pro = new Properties();
	@FindBy(xpath = "//*[@id=\"Email\"]")
	WebElement email;
	@FindBy(xpath = "//*[@id=\"Password\"]")
	WebElement pass;
	@FindBy(xpath = "//*[@id=\"RememberMe\"]")
	WebElement rem;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	WebElement login;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;  
	}

	public void dwslogins() throws IOException  {
		FileInputStream fis1 = new FileInputStream("F:\\DemoWebShopKeywordFramework\\src\\test\\resources\\parameter.properties");
		pro.load(fis1);
		email.sendKeys(pro.getProperty("username"));
		pass.sendKeys(pro.getProperty("password"));
		rem.click();
		login.click();
	}

}
