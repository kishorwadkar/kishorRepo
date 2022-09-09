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
	
	
	}

}
