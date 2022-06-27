package com.cjc.test;

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

import com.cjc.pom.pages.AddToCard;
import com.cjc.pom.pages.Address;
import com.cjc.pom.pages.Cheakout;
import com.cjc.pom.pages.MyAccount;
import com.cjc.pom.pages.Payment;
import com.cjc.pom.pages.Shiping;
import com.cjc.pom.pages.sign;
import com.cjc.utilitiy.Common;

public class AutomationTest {
	static Logger log=Logger.getLogger(AutomationTest.class.getName());

	@BeforeSuite
	public void beforeSuite() throws IOException
	{
		FileInputStream fis=Common.filecall();
		Common.pro.load(fis);
		System.setProperty("webdriver.chrome.driver","F:\\FremworkAutomationIndex\\src\\test\\resources\\Driver\\chromedriver.exe");
		Common.driver=new ChromeDriver();
		log.info("Browser Open SuccessFully");
	}

	@BeforeTest
	public void enterUrl()
	{
		Common.driver.get(Common.pro.getProperty("url"));
		log.info("Enter url");
}
@BeforeClass
public void maximizeScreen() {
	Common.driver.manage().window().maximize();
	log.info("Maximize Screen succesfully");
}
@BeforeMethod
public void addCookies() {
	Set<Cookie>b1=Common.driver.manage().getCookies();
	int count=b1.size();
	log.info("Total No Of Cookies="+count);
	for(Cookie a1:b1) {
		log.info("Name="+a1.getName());
		log.info("Class="+a1.getClass());
		log.info("Path="+a1.getPath());
		log.info("Value="+a1.getPath());
		log.info("Domain="+a1.getDomain());
		log.info("isHttps="+a1.isHttpOnly());
		log.info("isSecure="+a1.isSecure());
		log.info("Expiry="+a1.getExpiry());
		log.info("Cookies succesfully added");
		Common.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Common.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
}
@Test(priority = 1,dataProvider = "getData")
public void signUser(String email) throws InterruptedException {
	Thread.sleep(3000);
	//Common.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	sign b1=PageFactory.initElements(Common.driver, sign.class);
	Thread.sleep(3000);
	b1.loginpage( email);
	log.info("Sign data succesfully added");
}
@DataProvider
public Object[][]getData(){
	return new Object[][] {
		new Object[] {"kajal23@gmail.com"},
	};
}
@Test(priority = 2)
	public void registerDetails() throws InterruptedException, IOException {
	Thread.sleep(3000);
	MyAccount m1=PageFactory.initElements(Common.driver, MyAccount.class);
	Thread.sleep(3000);
	m1.registerDeta();
	m1.selectState();
	log.info("Register data succesfully added");
}
@Test(priority = 3)
public void addToCard1() throws InterruptedException {
	Thread.sleep(3000);
	AddToCard b1=PageFactory.initElements(Common.driver, AddToCard.class);
	Thread.sleep(3000);
	b1.clickDress();
	log.info("Add To card process complte succesfully");
	
}
@Test(priority = 4)
public void chekout() throws InterruptedException {
	Thread.sleep(3000);
	 Cheakout n1=PageFactory.initElements(Common.driver,  Cheakout.class);
	 Thread.sleep(3000);
	 n1.chekOut();
	 log.info("Cheakout process succesfully ");
}
@Test(priority = 5)
public void enterAddress() throws InterruptedException {
	Thread.sleep(3000);
	Address a1=PageFactory.initElements(Common.driver, Address.class);
	a1.setAddress();
	log.info("Address succesfully entered");
}
@Test(priority = 6)
public void shipment() throws InterruptedException {
	Shiping s1=PageFactory.initElements(Common.driver, Shiping.class);
	Thread.sleep(2000);
	s1.ship();
	log.info("Shipment succesfully");
}
@Test(priority = 7)
public void paymentCon() throws InterruptedException {
	Payment p1=PageFactory.initElements(Common.driver, Payment.class);
	Thread.sleep(3000);
	p1.confirmOrder();
	log.info("Confirm order succesfully added");
}
@AfterClass
public void deleteCookies() {
	Common.driver.manage().deleteAllCookies();
	log.info("Delete cookies succesfully");
}
@AfterMethod
public void captureScreenshot() throws IOException {
	File src=((TakesScreenshot)Common.driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFileToDirectory(src,new File("F:\\FremworkAutomationIndex\\src\\test\\resources\\Screenshot"));
log.info("Capture screenshot succesfully");
}
@AfterTest
public void dbClose() {
	log.info("Deta base close succesfully");
}
@AfterSuite
public void closeBrowser() {
	Common.driver.close();
	log.info("Close browser succesfully");
}


}
	

