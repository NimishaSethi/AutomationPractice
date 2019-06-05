package com.hometest.Testcases;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hometest.Baseclass.BaseClass;
import com.hometest.Pages.CreateAccountPage;
import com.hometest.Pages.HomePage;

public class CreateAccountTest extends BaseClass  {
	
	HomePage homePage; 
	CreateAccountPage createAccoutPage;
	WebDriver driver;
	Properties prop;
	

	@BeforeMethod
	public void setup()
	{
	BaseClass baseclass = new BaseClass();
	prop = baseclass.Initialize_properties();
	driver =baseclass.initilization();
	driver.get(prop.getProperty("URL"));
	//CreateAccountPage createAccount = new CreateAccountPage();
	
	//CreateAccountPage createAccount= new CreateAccountPage();
	}
	
	
	
	
	


	@Test(priority=2)
	public void createAccountTest() {
		CreateAccountPage createAccount = new CreateAccountPage();
		//CreateAccountPage 
		//createAccount=
		createAccount.createAccountPage("nimishasethi.sethi@gmail.com", "Nimisha", "Sethi", "Nimisha", "Sethi", "Sethi", "Flat 3", "Ayr", "TX", "US", "KA71HH", "07846062119", "Nimisha");
		
		
	}
	@AfterTest
	public void close()
	{
	    driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
 
