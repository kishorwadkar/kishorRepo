package com.qa.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerSetUp implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result)
	{
		
		System.out.println("Test Execution Started");
		
    }

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test Execution Compleated");
		TakesSS.takeSS(result.getName()+System.currentTimeMillis());
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		
		System.out.println("Test Execution Failed");
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		
		
	}

	
	

}
