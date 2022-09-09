package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;
import com.qa.pageLayer.LoginPage;

public class LoginPageTestCase extends TestBase
{
	@Test
	public void login()
	{
		LoginPage page=new LoginPage();
		page.enterusername("Admin");
		page.enterPassword("Admin123");
		page.selectLocationForSession();
		page.clickOnLoginButton();
	}

}
