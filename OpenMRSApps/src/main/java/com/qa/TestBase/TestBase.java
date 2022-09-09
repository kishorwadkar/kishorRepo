package com.qa.TestBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import com.qa.pageLayer.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	public static WebDriver driver;
	@BeforeClass
	public void start()
	{
		Logger logger=Logger.getLogger("OpenMRSApps");
		PropertyConfigurator.configure("log4J.properties");
	}
	
	@AfterClass
	public void stop()
	{
		
	}
	@Parameters ("browser")
	@BeforeMethod
	public void suit(String br)
	{
		//String br="chrome";
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Enter Proper browser name");
		}
		//https://demo.openmrs.org/openmrs/
		driver.get("https://demo.openmrs.org/openmrs/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		
		LoginPage page=new LoginPage();
		page.enterusername("Admin");
		page.enterPassword("Admin123");
		page.selectLocationForSession();
		page.clickOnLoginButton();
		
		
	}
	@AfterMethod
	public void teardown()
	{
	  // driver.quit();	
	}

}
