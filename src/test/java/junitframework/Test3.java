package junitframework;

import org.junit.Assert;
import org.junit.Test;



public class Test3 {
@Test
public void tc1()
{
	String s="java";
	System.out.println("Testcase 1");
	Assert.assertTrue(false);
	System.out.println("tc1 "+s);
}
@Test
public void tc2()
{
	String s="java";
	System.out.println("Testcase 2");
	Assert.assertFalse(false);
	System.out.println("tc2 "+s);
}
@Test
public void tc3()
{
	String s="java";
	System.out.println("Testcase3");
	Assert.assertEquals("java",s);
	System.out.println("tc3 "+s);
}
@Test
public void tc4()
{
	String s="java";
	System.out.println("Testcase4");
	Assert.assertNotSame("Ajay",s);
	System.out.println("tc5 "+s);
}
}
