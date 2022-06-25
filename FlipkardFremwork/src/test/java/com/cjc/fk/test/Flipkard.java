package com.cjc.fk.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cjc.fk.pages.LoginPage;
import com.cjc.fk.pages.SearchProduct;
import com.cjc.fk.utility.Common;

public class Flipkard {
	static Logger log=Logger.getLogger(Flipkard.class.getName());

	@BeforeSuite
	public void beforeSuite() throws IOException
	{
		FileInputStream fis=Common.filecall();
		Common.pro.load(fis);
		System.setProperty("webdriver.chrome.driver","F:\\FlipkardFremwork\\src\\test\\resources\\Driver\\chromedriver.exe");
		Common.driver=new ChromeDriver();
		log.info("Browser Open SuccessFully");
	}

	@BeforeTest
	public void enterApplicationUrl()
	{
		Common.driver.get(Common.pro.getProperty("url"));
		log.info("open url succesfully");
	}

	@BeforeClass
	public void maximizeWindow()
	{
		Common.driver.manage().window().maximize();
		log.info("Maximize Window Succesfully");
	}

	@BeforeMethod
	public void getCookies()
	{

		Set <Cookie>b1=Common.driver.manage().getCookies();
		int count=b1.size();
		log.info("Total No Of Cookies="+count);
		for(Cookie c1:b1) {
			log.info("Name="+c1.getName());
			log.info("Class="+c1.getClass());
			log.info("Value="+c1.getValue());
			log.info("Path="+c1.getPath());
			log.info("Expiry="+c1.getExpiry());
			log.info("isHttps="+c1.isHttpOnly());
			log.info("isSecure="+c1.isSecure());
			log.info("Domain="+c1.getDomain());
			log.info("Cookies succesfully added");
			Common.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Common.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		}

	}

	//login for Login Test
	//Excel File
	@Test(priority = 0)
	public void loginTest() throws IOException
	{
		Common.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 LoginPage lp=PageFactory.initElements(Common.driver,  LoginPage.class);	
		lp.login();
		log.info("login test mtd executed");
	}


	//search product   
	// Data Provider
	@Test(priority = 1,dataProvider = "getData")
	public void searchProductTest(String item) throws IOException
	{
		SearchProduct sp=PageFactory.initElements(Common.driver, SearchProduct.class);	
		sp.searchProduct(item);
		log.info("search product test mtd executed");
	}


	@DataProvider
	   public Object[][] getData()
	   {
		   return new Object[][]
				   {
			   new Object[] {"dell laptop core i5 11th generation 8gb/1tb"},
			   };
	   
	   }
@AfterMethod
public void captureScreenshot() throws IOException {
	File src=((TakesScreenshot)Common.driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFileToDirectory(src,new File("F:\\FlipkardFremwork\\src\\test\\resources\\Screenshot"));
log.info("Screenshot succesfully added");

}
@AfterClass
public void deleteCookies() {
	Common.driver.manage().deleteAllCookies();
	log.info("Delete cookies succesfully");
}
@AfterTest
public void dbClose() {
	log.info("Data base close succesfully");
}
@AfterSuite
public void closeBrowser() {
	Common.driver.close();
	log.info("Close Browser succesfully");
}
}
