package com.qa.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.qa.TestBase.TestBase;

public class TakesSS extends TestBase 
{
	static String path="D:\\kishor\\kishorProject1\\kishorRepo\\OpenMRSApps\\ScreenShot\\";
	
	public static void takeSS(String filename) 
	{
	try {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	
	File desc=new File(path+filename + ".png");
	FileHandler.copy(src,desc);
	
	}
	catch (IOException e) 
	{
		System.out.println("Please provide correct path");
		e.printStackTrace();
	}
	}
	

}
