package com.cjc.dws.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCard {
	WebDriver driver;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")
	WebElement book;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")
	WebElement s_book;
	
	
	public AddToCard(WebDriver driver) {
		this.driver = driver;  
	}
	public void book()  {
		book.click();
		s_book.click();
	}
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[4]/a")
	WebElement pant;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/div[3]/div[2]/input")
	WebElement a_pant;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a/span[1]")
	WebElement t_cart;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[1]/input")
	WebElement b_click;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[2]/td[1]/input")
	WebElement p_click;
	public void s_pant()  {
		pant.click();
		a_pant.click();
		t_cart.click();
		b_click.click();
		p_click.click();
	}

}
