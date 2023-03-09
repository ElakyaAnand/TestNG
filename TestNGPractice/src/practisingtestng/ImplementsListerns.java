package practisingtestng;


import org.testng.ITestContext;
import org.testng.ITestListener;

import org.testng.ITestResult;

public class ImplementsListerns implements ITestListener{
	
	
	
	
	
	
	public void OnTestStart(ITestContext context)
	{
		System.out.println("On test going");
	}
	
	public void OnTestSuccess(ITestResult result)
	{
		System.out.println("On success");
	}
	
	public void OnTestFailure(ITestResult result)
	{
		System.out.println("Failure execution");
	}
	
	public void OnTestSkipped(ITestResult result)
	{
		System.out.println("Skipping test");
	}
	
	public void OnStart(ITestResult result)
	{
	
		System.out.println("Before testing");
	}
	
	public void OnFinish(ITestResult result)
	{
		System.out.println("After testing");
	}





}
