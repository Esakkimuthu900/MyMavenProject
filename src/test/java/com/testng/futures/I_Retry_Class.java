package com.testng.futures;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class I_Retry_Class implements IRetryAnalyzer{

	int start = 1;
	
	int end = 3;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if (start <= end) {
			
			start++;
			
			return true;
		}
		
		return false;
	}
}
