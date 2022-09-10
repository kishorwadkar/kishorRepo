package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
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
	
	@FindBy(xpath="//input[@id='birthdateDay-field']")    
	public WebElement birthDate;
	@Test
	public void enterDateOfBirth(String date)
	{
		birthDate.sendKeys(date);
	}
	
	@FindBy(xpath="//select[@id='birthdateMonth-field']")
	public WebElement birthday_Month;
	@Test
	public void enterBirthDayMonth()
	{
		Select s=new Select(birthday_Month);
		s.selectByIndex(5);
		//birthday_Month.sendKeys(month);
	}
	
	@FindBy(xpath="//input[@id='birthdateYear-field']")    
	public WebElement birthDay_Year;
	@Test
	public void enterDateOfBirthYear(String year)
	{
		birthDay_Year.sendKeys(year);
	}
	
	@FindBy(xpath="//icon[@class='fas fa-chevron-right']")
	public WebElement next_Button3;
	@Test
	public void clickOnNextButton3()
	{
		next_Button3.click();
	}
	
	
	@FindBy(xpath="//input[@id='address1']")    
	public WebElement Adress1;
	@Test
	public void enterAdressOfPatient(String adress)
	{
		Adress1.sendKeys(adress);
	}
	
	
	@FindBy(xpath="//input[@id='cityVillage']")    
	public WebElement Villege_Name;
	@Test
	public void enterVillegeName(String villege)
	{
		Villege_Name.sendKeys(villege);
	}
	
	@FindBy(xpath="//input[@id='stateProvince']")    
	public WebElement State_Name;
	@Test
	public void enterStateName(String state)
	{
		State_Name.sendKeys(state);
	}
	
	@FindBy(xpath="//input[@id='country']")    
	public WebElement Country_Name;
	@Test
	public void enterCountryName(String country)
	{
		State_Name.sendKeys(country);
	}
	@FindBy(xpath="//input[@id='postalCode']")    
	public WebElement Postal_code;
	@Test
	public void enterPostal(String postalCode)
	{
		Postal_code.sendKeys(postalCode);
	}
	

	@FindBy(xpath="//button[@id='next-button']")
	public WebElement next_Button4;
	@Test
	public void clickOnNextButton4()
	{
		next_Button4.click();
	}
	
	@FindBy(xpath="//input[@name='phoneNumber']")
	public WebElement phone_Number;
	@Test
	public void enterPhoneNumber(String Phone)
	{
		phone_Number.sendKeys(Phone);;
	}
	
	@FindBy(xpath="//icon[@class='fas fa-chevron-right']")
	public WebElement next_Button5;
	@Test
	public void clickOnNextButton5()
	{
		next_Button5.click();
	}
	
	@FindBy(xpath="//select[@id='relationship_type']")
	public WebElement RelationShip_Type;
	@Test
	public void SelectRelationShip_Type()
	{
		Select s=new Select(RelationShip_Type);
		s.selectByIndex(5);
		
	}
	
	@FindBy(xpath="//input[@class='person-typeahead ng-pristine ng-untouched ng-valid ng-empty']")
	public WebElement Relative_Name;
	@Test
	public void enterRelativeName(String Rname)
	{
		 Relative_Name.sendKeys(Rname);
	}
	@FindBy(xpath="//icon[@class='fas fa-chevron-right']")
	public WebElement next_Button6;
	@Test
	public void clickOnNextButton6()
	{
		next_Button6.click();
	}
	
	
	@FindBy(xpath="//input[@id='submit']")
	public WebElement submit_Button;
	@Test
	public void clickOnSubmitButton()
	{
		submit_Button.click();
	}
	
	
	

}
