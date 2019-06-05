package com.hometest.Baseclass;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BaseClass {
	
 protected static WebDriver driver; 
	 public WebDriver initilization()
	 {
		 System.setProperty("webdriver.chrome.driver","/D:/Selenium/chromedriver.exe");
		 driver =  new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	return driver;
		 
	 }
	 
	 public Properties Initialize_properties()
	 {
		 
			
			Properties prop = new Properties();
			try {

				FileInputStream ip = new FileInputStream("C:\\Users\\Ayush_Gupta08\\HomeTest_Assignment\\src\\main\\java\\com\\hometest\\Properties\\config.Properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
			return prop;

	 }
	 
}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 


