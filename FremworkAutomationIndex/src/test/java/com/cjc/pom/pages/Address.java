package com.cjc.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cjc.utilitiy.Common;

public class Address {
	public Address(WebDriver driver) {
		Common.driver=driver;
	}
@FindBy(css = "#center_column > form > p > button > span")
WebElement c2;
public void setAddress() {
	c2.click();
}
}
