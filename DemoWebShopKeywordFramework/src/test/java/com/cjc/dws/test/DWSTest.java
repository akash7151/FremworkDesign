package com.cjc.dws.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cjc.dws.pages.AddToCard;
import com.cjc.dws.pages.Address;
import com.cjc.dws.pages.LoginPage;
import com.cjc.dws.pages.Payment;


public class DWSTest {
	WebDriver driver;
	static Logger log = Logger.getLogger(DWSTest.class.getClass());
	Properties pro = new Properties();
	@BeforeSuite
	public void openBrowser() throws Exception 
	{
		System.out.println("This is TestNG in chrome broswer");
		FileInputStream fis = new FileInputStream("F:\\DemoWebShopKeywordFramework\\src\\test\\resources\\config.properties");
		pro.load(fis);
		String bro = pro.getProperty("browser");
		if (bro.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} 
		else if (bro.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else if (bro.equalsIgnoreCase("Edge")) 
		{
			System.setProperty("webdriver.edge.driver", "G:\\TESTING\\edgedriver_win32\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else{
			
			throw new Exception("Browser is not correct");
		}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
//		BrowserData data= new BrowserData();
//		data.openBrowser();
		
		log.info("----Broswer Open----Before Suite----");
	}

	@BeforeTest
	public void enterURL() throws IOException 
	{
		System.out.println("URL" + pro.getProperty("url"));
		driver.navigate().to(pro.getProperty("url"));
//		BrowserData data= new BrowserData();
//		data.urldata();
		log.info("----URL enter----Before Test----");
	}

	@BeforeClass
	public void maxBrowser() 
	{
		driver.manage().window().maximize();
		log.info("----Broswer Max----Before Class----");
	}

	@BeforeMethod
	public void getAllCookies() 
	{
		Set<org.openqa.selenium.Cookie> cookies = driver.manage().getCookies();
		int co = cookies.size();
		System.out.println("Total no of cookies : " + co);
		log.info("----Before Method----");
	}

	@Test (priority = 1)
	public void login() throws IOException 
	{
		LoginPage pp =PageFactory.initElements(driver, LoginPage.class);
		pp.dwslogins();
		log.info("Login Done");
	}	
	@Test (priority = 2)
	public void addToCart() 
	{
		AddToCard pp = PageFactory.initElements(driver, AddToCard.class);
		pp.book();
		pp.s_pant();
	}
	
	@Test (priority = 3)
	public void addres() throws InterruptedException, IOException
	{
		 Address pp = PageFactory.initElements(driver,  Address.class);
	//	pp.agree();
		pp.newAddress();
	}
	@Test (priority = 4)
	public void payment() throws InterruptedException
	{
		Payment pp = PageFactory.initElements(driver, Payment.class);
		pp.continu();
		log.info("----Continue done----Test---");
	}
	@AfterMethod
	public void captureScreenshot() throws IOException 
	{
		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("F:\\DemoWebShopKeywordFramework\\src\\test\\resources\\Screenshot.jpg"));
		log.warn("----ScreenShot Taken----After Method----");
	}


	@AfterClass
	public void deleteCookies() 
	{
		log.warn("----Delete cookies----After Class----");
	}

	@AfterTest
	public void dbClose()
	{
		log.warn("Data Base Close");
	}

	@AfterSuite
	public void closeBrowser() 
	{
	//	driver.close();
		log.warn("----Tab close----After Suite----");
	}

}
