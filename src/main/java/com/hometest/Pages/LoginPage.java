package com.hometest.Pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hometest.Baseclass.BaseClass;


public class LoginPage extends BaseClass {

WebDriver driver;
Properties prop;
	

	
	@FindBy(xpath= "//input[@id='email']")
	WebElement LoginEmail;
	
	@FindBy(xpath= "//input[@id='passwd']")
	WebElement LoginPassword;
	
	
	@FindBy(xpath= "//p[@class='submit']//span[1]")
	WebElement SignInButton;
	
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void set_username(String username)
    {
		LoginEmail.clear();
		LoginEmail.sendKeys(username);
    }
    public void set_password(String password)
    {
    	LoginPassword.clear();
     LoginPassword.sendKeys(password);
    }
    public void click_button()
    {
    	SignInButton.submit();
    }
	
	
	
	
	
	
	
	
	
}
