package testngframework;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import project1.BaseClasss;

public class UseParameters extends BaseClasss{
@Parameters({"username","password"})
@Test
private void tc1(String s1,String s2)
{
	getDriver("edge");
	url("https://www.facebook.com/");
	WebElement locator=locators("id","email");
	textSend(locator,s1);
	WebElement locator1=locators("id","pass");
	textSend(locator1,s2);
	
}
}
