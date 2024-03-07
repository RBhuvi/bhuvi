package junitframework;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import project1.BaseClasss;

public class Test1 extends BaseClasss {
@BeforeClass
public static void tc1()
{
	System.out.println("Testcase1");
}
@Before
public void tc2()
{
	System.out.println("Testcase2");
}
@Test
public void tc3()
{
	System.out.println("Testcase3");
}
@After
public void tc4()
{
	System.out.println("Testcase4");
}
@AfterClass
public static void tc5()
{
	System.out.println("Testcase5");
}
}
