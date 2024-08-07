package testngframework;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListen implements IRetryAnalyzer
{
int failedcount=0;
int limit=4;
public boolean retry(ITestResult result)
{
	if(failedcount<limit)
	{
		failedcount++;
		return true;
		
	}
	return false;
	
}
}
