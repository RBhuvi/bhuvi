package testngframework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import project1.BaseClasss;

public class ParallelExecutionTest extends BaseClasss{
	@Parameters({"browser"})
	@Test
	private void tc01(String s)
	{
		getDriver(s);
		url("https://www.facebook.com/");
		
	}

}
