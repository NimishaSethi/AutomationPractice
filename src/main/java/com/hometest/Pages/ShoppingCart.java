package com.hometest.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {
	
	
	WebDriver driver;
	

		
		@FindBy(xpath= "//input[@id='search_query_top']")
		WebElement search;
		
		
	
		
		public ShoppingCart(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
		public void searchtext(String keyword)
	    {
			search.clear();
			search.sendKeys(keyword);
	    }
	
	

}
