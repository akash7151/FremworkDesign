package com.cjc.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cjc.utilitiy.Common;

public class Payment {
public Payment(WebDriver driver) {
	Common.driver=driver;
}
@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a/span")
WebElement cha1;
@FindBy(css = "//*[@id=\"cart_navigation\"]/button/span")
WebElement confirm1;
public void confirmOrder() {
	cha1.click();
	confirm1.click();
}
}
