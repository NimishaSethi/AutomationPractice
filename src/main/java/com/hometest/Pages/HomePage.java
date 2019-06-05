package com.hometest.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.hometest.Baseclass.BaseClass;

public class HomePage extends BaseClass{
	WebDriver driver;
	

	
	@FindBy(xpath= "//a[@class='login']")
	WebElement signInLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public CreateAccountPage signIn() {
	     signInLink.click();
		return new CreateAccountPage();
	}
	
	
	
	
}
