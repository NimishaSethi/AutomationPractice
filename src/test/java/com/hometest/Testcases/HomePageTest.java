package com.hometest.Testcases;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hometest.Baseclass.BaseClass;
import com.hometest.Pages.CreateAccountPage;
import com.hometest.Pages.HomePage;

public class HomePageTest extends BaseClass{
	
	HomePage homepage;
	WebDriver driver;
	Properties prop;
	
	
	
	
	@BeforeMethod
	public void setup()
	{
	BaseClass baseclass = new BaseClass();
	prop = baseclass.Initialize_properties();
	driver =baseclass.initilization();
	driver.get(prop.getProperty("URL"));
	
	

}
	
	@Test(priority=1)
	public void ClickOnLink()
	{
		homepage = new HomePage();
	      homepage.signIn();
	      
	
	
	}
	
	
	
	
	
	
}
