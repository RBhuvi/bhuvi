package testngframework;

import org.junit.Assert;
import org.testng.annotations.Test;

public class FailedTestCases 
{
@Test(retryAnalyzer=RetryListen.class)
public void testcase1()
{
	Assert.assertEquals(true,false);
}
@Test(retryAnalyzer=RetryListen.class)
public void testcase2()
{
	Assert.assertEquals(true,false);
}
}
