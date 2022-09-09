package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;

public class RegisterPatient extends TestBase 
{
	
	public RegisterPatient()
	{
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="(//a[@class='btn btn-default btn-lg button app big align-self-center'])[3]")
	public WebElement register_Patient;
	@Test
	public void clickOnRegisterPatient()
	{
		 register_Patient.click();
	}
	
	@FindBy(xpath="//input[@name='givenName']")
	public WebElement firstName;
	@Test
	public void enterFirstName(String name)
	{
		firstName.sendKeys(name);
	}
	
	@FindBy(xpath="//input[@name='middleName']")
	public WebElement middleName;
	@Test
	public void enterMiddleName(String middle_name)
	{
		middleName.sendKeys(middle_name);
	}
	
	
	@FindBy(xpath="//input[@name='familyName']")
	public WebElement Last_Name;
	@Test
	public void enterLastName(String lastName)
	{
		Last_Name.sendKeys(lastName);
	}
	
	
//	@FindBy(xpath="//input[@id='checkbox-unknown-patient']")
//	public WebElement unidentifiedPatient;
//	@Test
//	public void clickOnunidentifiedPatientCheckBox()
//	{
//		unidentifiedPatient.click();
//	}
	
	@FindBy(xpath="//icon[@class='fas fa-chevron-right']")
	public WebElement navigate_Button1;
	@Test
	public void clickOnNavigateButton1()
	{
		navigate_Button1.click();
	}
	
	@FindBy(xpath="(//option[contains(text(),Male)])[1]")
	public WebElement Select_Gender;
	@Test
	public void selectGenderAndClockOnIt()
	{
		 Select_Gender.click();
	}
	
	
	@FindBy(xpath="//icon[@class='fas fa-chevron-right']")
	public WebElement next_Button;
	@Test
	public void clickOnNextButton()
	{
		next_Button.click();
	}
	

}
