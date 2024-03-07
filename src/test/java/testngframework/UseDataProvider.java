package testngframework;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import project1.BaseClasss;

//in same class
public class UseDataProvider extends BaseClasss {
@DataProvider(name="login")
public Object[][]getData(){
	return new Object[][] {
		{"test1@gmail.com","asdfg"},{"test2@gmail.com","lkkjhg"}};
}
@Test(dataProvider="login")
private void tc1(String s1,String s2)
{
	getDriver("edge");
	url("https://www.facebook.com/");
	WebElement username=locators("id","email");
	textSend(username,s1);
	WebElement pwd=locators("id","pass");
	textSend(pwd,s2);
	WebElement btn=locators("name","login");
	buttonClick(btn);
	
}
}

