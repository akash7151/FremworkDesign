package com.cjc.dws.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment {
	WebDriver driver;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[4]/div[2]/div/input")
	WebElement con4;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[5]/div[2]/div/input")
	WebElement con5;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[6]/div[2]/div[2]/input")
	WebElement confirm;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")
	WebElement con6;
	
	public Payment(WebDriver driver) {
		this.driver = driver;  
	}
	public void continu() throws InterruptedException  {
		con4.click();
		Thread.sleep(2000);
		con5.click();
		Thread.sleep(2000);
		confirm.click();
		Thread.sleep(2000);
		con6.click();
	}

}
