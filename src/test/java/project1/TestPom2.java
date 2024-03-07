package project1;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class TestPom2 extends BaseClasss
{
	public static void main(String[] args)throws IOException,InterruptedException
	{
	TestPom2 t=new TestPom2();
	t.getDriver("edge");
	t.url("https://www.facebook.com/login.php");
	PageObject1 p=new PageObject1();
	WebElement userName=p.getUserName();
	t.textSend(userName,"jfsarf@gmail.com");
	WebElement pwd=p.getPwd();
	t.textSend(pwd,"23456");
	Thread.sleep(1500);
	WebElement logIn = p.getLogIn();
	t.buttonClick(logIn);

}
}