package com.cjc.dws.utitity;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserData {
	WebDriver driver;
	Properties pro = new Properties();
	public void openBrowser() throws Exception
	{
		System.out.println("This is TestNG in chrome broswer");
		FileInputStream fis = new FileInputStream("F:\\DemoWebShopKeywordFramework\\src\\test\\resources\\config.properties");
		pro.load(fis);
		String bro = pro.getProperty("browser");
		if (bro.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "F:\\DemoWebShopKeywordFramework\\src\\test\\resources\\chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");

			driver = new ChromeDriver();
			
		} 
		else if (bro.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		// Check if parameter passed as 'Edge'
		else if (bro.equalsIgnoreCase("Edge")) 
		{
			System.setProperty("webdriver.edge.driver", ".\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		} else
		{
			
			throw new Exception("Browser is not correct");
		}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void urldata()
	{
		System.out.println("URL" + pro.getProperty("url1"));
		driver.navigate().to(pro.getProperty("url1"));
	}
}

