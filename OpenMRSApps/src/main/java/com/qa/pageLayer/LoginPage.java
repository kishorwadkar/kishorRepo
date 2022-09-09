package com.qa.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;

public class LoginPage extends TestBase
{
  

    public  LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='username']")
	public WebElement userName;
	@Test
	public void enterusername(String Username)
	{
		//userName.click();
		userName.sendKeys(Username);
	}
	
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement password;
	@Test
	public void enterPassword(String Pass)
	{
		// password.click();
		 password.sendKeys(Pass);
	}
	
	
	@FindBy(xpath="//li[@id='Inpatient Ward']")
	public WebElement select_Location;
	@Test
	public void selectLocationForSession()
	{
		select_Location.click();
	}
	
	
	@FindBy(xpath="//input[@id='loginButton']")
	public WebElement login_Button;
	@Test
	public void clickOnLoginButton()
	{
		login_Button.click();
	}
}
