package testngframework;

import org.testng.annotations.Test;

public class TestNgGroups {
@Test(groups="Smoke")
private void tc5()
{
	System.out.println("Tc5");
}
@Test(groups= {"Regression","Smoke"})
private void tc6()
{
System.out.println("Tc6");
}
}
