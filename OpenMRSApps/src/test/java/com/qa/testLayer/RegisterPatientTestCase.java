package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;
import com.qa.pageLayer.RegisterPatient;

public class RegisterPatientTestCase extends TestBase 
{
	@Test
	public void registerPatient() throws InterruptedException
	{
		Thread.sleep(5000);
	RegisterPatient register=new RegisterPatient();
	register.clickOnRegisterPatient();
	Thread.sleep(2000);
	register.enterFirstName("Mayur");
	register.enterMiddleName("Limbraj");
	register.enterLastName("Shingare");
	//register.clickOnunidentifiedPatientCheckBox();
	register.clickOnNavigateButton1();
	Thread.sleep(2000);
	register.selectGenderAndClockOnIt();
	register.clickOnNextButton();
	Thread.sleep(2000);
	register.enterDateOfBirth("20");
	register.enterBirthDayMonth();
	register.enterDateOfBirthYear("2018");
	register.clickOnNextButton3();
	Thread.sleep(2000);
	register.enterAdressOfPatient("At:Wanewadi, Tal:Tuljapur,Dist:Osmanabad");
	register.enterVillegeName("Wanewadi");
	register.enterStateName("Maharashtra");
	Thread.sleep(2000);
	register.enterCountryName("India");
	register.enterPostal("412634");
	register.clickOnNextButton4();
	Thread.sleep(2000);
	
	register.enterPhoneNumber("7020734961");
	register.clickOnNextButton5();
	Thread.sleep(2000);
	register.SelectRelationShip_Type();
	register.enterRelativeName("Pradip");
	register.clickOnNextButton6();
	register.clickOnSubmitButton();
	
	
	}

}
