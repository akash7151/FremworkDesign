package com.cjc.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cjc.utilitiy.Common;

public class sign {
public sign(WebDriver driver){
	Common.driver=driver;
}
@FindBy(linkText = "Sign in")
WebElement sign1;
@FindBy(xpath = "//input[@name=\"email_create\"]")
WebElement email1;
@FindBy(xpath = "//*[@id=\"SubmitCreate\"]/span")
WebElement submit1;
public void loginpage(String email) {
	
	sign1.click();
	email1.sendKeys(email);
	submit1.click();
	
}
}
