package test;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

public class Listeners {
	//ITestListener is an Interface which implements Listeners
	
	public class Listerners implements ITestListener 
	{
		@Override
		public void onTestStart(ITestResult result)
		{
			
		}
		
		@Override
		public void onTestSuccess(ITestResult result)
		{
			
		}
		
		@Override
		public void onTestFailure(ITestResult result)
		{
			System.out.println("Test is failed");
			
		}
		
		@Override
		public void onTestSkipped(ITestResult result)
		{
			
		}
		
		
	}
	
	

}
