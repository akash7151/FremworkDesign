package com.cjc.step;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cjc.pages.PomPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoBleze {
	static Logger log = Logger.getLogger(DemoBleze.class.getClass());
	static WebDriver driver;
	PomPage pp;
	@Given("^User navigate to DB sign in site$")
	public void openBrowser()
	{
		System.out.println("This is TestNG in chrome broswer");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akash\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		log.info("Open done");
	}
	
	@When("^User have to Click on sign in button$")
	public void sign()
	{
		pp =  PageFactory.initElements(driver, PomPage.class);
		pp.signin();
		log.info("Username done");
	}
	
	@And("^User have to enter valid username \"(.*)\"$")
	public void uname(String username)
	{
		pp.u_name(username);
		log.info("Password done");
	}
	
	@And("^User have to enter valid password \"(.*)\"$")
	public void pword(String pass)
	{
		pp.p_word(pass);
		log.info("Remember me done");
	}
	
	@And("^User have to click on sign in button$")
	public void click () throws InterruptedException
	{
		pp.c_sign();
		log.info("Login done");
	}
	@And("^User have to accept popup1$")
	public void alert2() throws InterruptedException
	{
		driver.switchTo().alert().accept();
		log.info("Login done");
	}
	@Then("^sign in successfully$")
	public void success()
	{
		log.info("Sign in done");
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------	
	@Given("^User navigate to product Section$")
	public void p_home()
	{
		pp =  PageFactory.initElements(driver, PomPage.class);
		pp.home();
		log.info("Click on home");
	}
	
	@When("^User have to select product$")
	public void pro()
	{
		pp.product();
		log.info("Click on product");
	}
	
	@And("^User have to click on add to cart$")
	public void addCart() throws InterruptedException
	{
		pp.a_cart();
		log.info("Add to cart done");
	}

	@And("^User have to accept popup2$")
	public void productSelect()
	{
		driver.switchTo().alert().accept();
		log.info("Alert done");
	}
	@Then("^product add to cart successfully$")
	public void productselect()
	{
		log.info("Product select done");
	}
	@Given("^User navigate to cart$")
	public void cartp() throws InterruptedException
	{  
		pp =  PageFactory.initElements(driver, PomPage.class);
		pp.c_cart();
		log.info("Click on cart");
	}
	
}
