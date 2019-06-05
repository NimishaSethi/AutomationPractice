package com.hometest.Testcases;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hometest.Baseclass.BaseClass;
import com.hometest.Pages.LoginPage;




public class LoginTest extends BaseClass {
	WebDriver driver;
	String username;
	String password;
	
	
	
	@BeforeMethod
	public void setup()
	{
	BaseClass baseclass = new BaseClass();
	driver =baseclass.initilization();
	driver.get("http://automationpractice.com/index.php?controller=authentication");
     }
	
	@Test(priority=3)
	public void verifyEmail()
	{
	    LoginPage login=new LoginPage(driver);
	    login.set_username("nimisha89sethi");
	    login.set_password("nimisha");
	    login.click_button();
	    Assert.assertEquals(driver.findElement(By.xpath("//li[contains(text(),'Invalid email address.')]")).getText(),"Invalid email address.");
	}
	@Test(priority=4)
	public void verifyPassword()
	{
	    LoginPage login=new LoginPage(driver);
	    login.set_username("nimisha89sethi@gmail.com");
	    login.set_password("nimish");
	    login.click_button();
	    Assert.assertEquals(driver.findElement(By.xpath("//li[contains(text(),'Authentication failed.')]")).getText(),"Authentication failed");
	}
	@Test(priority=5)
	public void verifyBoth()
	{
	    LoginPage login=new LoginPage(driver);
	    login.set_username("123@.com");
	    login.set_password("nimws");
	    login.click_button();
	    Assert.assertEquals(driver.findElement(By.xpath("//li[contains(text(),'Authentication failed.')]")).getText(),"Authentication failed");
	}
	@AfterTest
	public void close()
	{
	    driver.close();
	}
	
	
	

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

