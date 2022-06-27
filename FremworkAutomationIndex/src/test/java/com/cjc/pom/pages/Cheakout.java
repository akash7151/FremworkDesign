package com.cjc.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cjc.utilitiy.Common;

public class Cheakout {

	public  Cheakout(WebDriver driver) {
		Common.driver=driver;
	}
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	WebElement c1;
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
	WebElement c2;
	public void chekOut() {
		c1.click();
		c2.click();
	}
}
