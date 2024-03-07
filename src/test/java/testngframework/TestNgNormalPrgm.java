package testngframework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgNormalPrgm {
@BeforeClass
private void tc1()
{
	System.out.println("Tc1");
}
@BeforeGroups
private void tc2()
{
	System.out.println("Tc2");
}
@BeforeMethod
private void tc3()
{
	System.out.println("Tc3");
}
@Test
private void tc4()
{
	System.out.println("Tc4");
}
@AfterMethod
private void tc5()
{
	System.out.println("Tc5");
}
@AfterGroups
private void tc6()
{
	System.out.println("Tc6");
}
@AfterClass
private void tc7()
{
	System.out.println("Tc7");
}
}
