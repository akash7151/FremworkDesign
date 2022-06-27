package com.cjc.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cjc.utilitiy.Common;

public class Shiping {
	public Shiping(WebDriver driver) {
		Common.driver=driver;
	}
@FindBy(css = "#cgv")
WebElement cg1;
@FindBy(css = "#form > p > button > span")
WebElement sp1;
public void ship() {
	cg1.click();
	sp1.click();
}

}
