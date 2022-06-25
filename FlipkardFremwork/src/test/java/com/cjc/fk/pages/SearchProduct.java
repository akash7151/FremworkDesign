package com.cjc.fk.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cjc.fk.utility.Common;

public class SearchProduct {
	public SearchProduct(WebDriver driver)
	{
		Common.driver=driver;
	}

	  @FindBy(css ="input._3704LK")
	  WebElement search;
	
	  @FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	  WebElement product;
	
     public void searchProduct(String item) throws IOException
     {
		/*
		 * FileInputStream fis=Common.filecall(); Common.pro.load(fis);
		 * Common.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 */
    	search.sendKeys(item);
    	search.sendKeys(Keys.ENTER);
    	Common.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	product.click();
     }



}
