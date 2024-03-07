package testngframework;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import project1.BaseClasss;

public class UsingSoftAssert extends BaseClasss
{
@Test
private void tc01()
{
	getDriver("edge");
	url("https://www.facebook.com/");
	WebElement user=locators("id","email");
	String title=getTitle();
	System.out.println(title);
	textSend(user,"Test1@gmail.com");
	String attribute=user.getAttribute("value");
	System.out.println(attribute);
	WebElement pwd=locators("id","pass");
	textSend(pwd,"198765");
	SoftAssert s=new SoftAssert();
	s.assertTrue(title.contains("facebook"));
	s.assertEquals("Test@gmail.com",user.getAttribute("value"));
	s.assertAll();
}
}
