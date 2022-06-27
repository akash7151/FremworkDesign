package com.cjc.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PomPage {
	WebDriver driver;
	//----login----
	@FindBy(xpath = "//*[@id=\"signin2\"]")
	WebElement signin;
	@FindBy(xpath = "//*[@id=\"sign-username\"]")
	WebElement u_name;
	@FindBy(xpath = "//*[@id=\"sign-password\"]")
	WebElement p_word;
	@FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
	WebElement c_sign;

	public void login(String username , String pass,String name,String country,String city,String card,String month,String year)
	{
		this.u_name(username);
		this.p_word(pass);
		this.c_name(name);
		this.c_country(country);
		this.c_city(city);
		this.c_card(card);
		this.c_month(month);
		this.c_year(year);
	}
	
	public PomPage(WebDriver driver) {
		this.driver = driver;  
	}
	public void signin()  {
		signin.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
	}
	public void u_name(String username) {
		u_name.sendKeys(username);
	}
	public void p_word(String pass) {
		p_word.sendKeys(pass);
	}
	public void c_sign() throws InterruptedException  {
		c_sign.click();
		Thread.sleep(2000);
	}
	
	//----ADD to Cart----
	@FindBy(xpath = "//*[@id=\"navbarExample\"]/ul/li[1]/a")
	WebElement home;
	@FindBy(xpath = "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")
	WebElement product;
	@FindBy(xpath = "//*[@id=\"tbodyid\"]/div[2]/div/a")
	WebElement a_cart;
	
	public void home()  {
		home.click();
	}
	public void product()  {
		product.click();
	}
	public void a_cart() throws InterruptedException  {
		a_cart.click();
		Thread.sleep(2000);
	}
	
	//----shipping address----
	@FindBy(xpath = "//*[@id=\"cartur\"]")
	WebElement c_cart;
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[2]/button")
	WebElement p_order;
	@FindBy(xpath = "//*[@id=\"name\"]")
	WebElement c_name;
	@FindBy(xpath = "//*[@id=\"country\"]")
	WebElement c_country;
	@FindBy(xpath = "//*[@id=\"city\"]")
	WebElement c_city;
	@FindBy(xpath = "//*[@id=\"card\"]")
	WebElement c_card;
	@FindBy(xpath = "//*[@id=\"month\"]")
	WebElement c_month;
	@FindBy(xpath = "//*[@id=\"year\"]")
	WebElement c_year;
	@FindBy(xpath = "//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")
	WebElement c_purchase;
	@FindBy(xpath = "/html/body/div[10]/div[7]/div/button")
	WebElement c_ok;
	
	public void c_cart() throws InterruptedException  {
		c_cart.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void p_order()  {
		p_order.click();
	}
	public void c_name(String name) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		c_name.sendKeys(name);
	}
	public void c_country(String country) {
		c_country.sendKeys(country);
	}
	public void c_city(String city) {
		c_city.sendKeys(city);
	}
	public void c_card(String card) {
		c_card.sendKeys(card);
	}
	public void c_month(String month) {
		c_month.sendKeys(month);
	}
	public void c_year(String year) {
		c_year.sendKeys(year);
	}
	public void c_purchase()  {
		c_purchase.click();
	}
	public void c_ok()  {
		c_ok.click();
	}

}


