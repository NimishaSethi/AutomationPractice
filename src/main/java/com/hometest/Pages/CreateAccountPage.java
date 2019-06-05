package com.hometest.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hometest.Baseclass.BaseClass;

public class CreateAccountPage  extends BaseClass{
	WebDriver driver;
	LoginPage LoginPage;
	

	@FindBy(linkText="Sign in")
	WebElement SignIn;
	
	@FindBy(id="email_create")
	WebElement EmailAddress;
	
	@FindBy(id="create-account_form")
	WebElement CreateAccount;
	
	@FindBy(xpath="//input[@id='id_gender1']")
	WebElement Radiobutton;
	
	@FindBy(id ="customer_firstname")
	WebElement Cus_FirstName;
	
	
	@FindBy(id ="customer_lastname")
	WebElement Cus_LastName;
	
	@FindBy(id ="passwd")
	WebElement Password;
	
	@FindBy(id="firstname")
	WebElement FirstName;
	
	@FindBy(id="lastname")
	WebElement LastName;
	
	@FindBy(id="address1")
	WebElement Address;
	
	@FindBy(id="address2")
	WebElement address2;
	
	@FindBy(id="city")
	WebElement City;
	
	@FindBy(id="id_state")
	WebElement StateDDSelection;
	
	@FindBy(id="postcode")
	WebElement ZipPostalCode;
	
	@FindBy(id="id_country")
	WebElement countryDDSelection;
	
	
	@FindBy(id="phone_mobile")
	WebElement PhoneMobile;
	
	@FindBy(id="alias")
	WebElement Alias;
	
	@FindBy(name="submitAccount")
	WebElement Register;
	
	
	public CreateAccountPage() 
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
public LoginPage createAccountPage(String email, String Cus_FName, String Cus_LName, String password,String firstname,String lastname,String address1,String city, String state,String country,String postalCode,  String Mobile,String alias) 
{
		
	    
        EmailAddress.sendKeys(email);
        CreateAccount.click();
	
        //if the user EmailId already Present in the system it will capture error message otherwise new user registered
        String errorMessage=driver.findElement(By.xpath("//div[@id='create_account_error']")).getText();
        String errorMessage1="Invalid email address" ;
        //Assert.assertEquals(userAlreadyRegMsg, errorMessage);
        //An account using this email address has already been registered. Please enter a valid password or request a new one.
        if(errorMessage.contains("An account using this email address has already been registered. Please enter a valid password or request a new one.")) 
        {
		
				
		System.out.print("User is already registered ");
     
        }
        else if(errorMessage1.contains("Invalid email address")) 
        {
        	System.out.print("Email adress is not valid");	
        }
        else
        {
        	
       
        	 //Create an account Page page to complete new users details
        	Radiobutton.click();
        	Cus_FirstName.sendKeys(Cus_FName);
        	Cus_LastName.sendKeys(Cus_LName);
        	Password.sendKeys(password);
        	//Your Address
        	FirstName.sendKeys(firstname);
        	LastName.sendKeys(lastname);
        	Address.sendKeys(address1);
        	City.sendKeys(city);
        	
		Select dropdownState= new Select(StateDDSelection);
		dropdownState.selectByVisibleText(state);
		ZipPostalCode.sendKeys(postalCode);
		
		Select dropdownCountry= new Select(countryDDSelection);
		dropdownCountry.selectByValue(country);
		
		

		PhoneMobile.sendKeys(Mobile);
		Alias.sendKeys(alias);
		
		Register.click();	
        }
		return  LoginPage;
		
	}

}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


