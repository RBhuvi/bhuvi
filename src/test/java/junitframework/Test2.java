package junitframework;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import project1.BaseClasss;

public class Test2 extends BaseClasss{
@BeforeClass
public static void tc1()
{
	getDriver("edge");
	url("https://www.facebook.com/");
}
@Before
public void tc2()
{
	Date d=new Date();
	System.out.println("Start time is "+d);
}
@Test
public void tc3()
{
locators("id","email").sendKeys("tstdafi@gmail.com");
locators("xpath","//input[@type='password']").sendKeys("asdfgh");
locators("name","login").click();
}
@After
public void tc4()
{
	Date d=new Date();
	System.out.println("End time is "+d);
}
@AfterClass
public static void tc5()
{
	quitBrowser();
}
}
