package project1;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class TestPom extends BaseClasss
{

	public static void main(String[] args)throws IOException,InterruptedException
	{
		// TODO Auto-generated method stub
TestPom t=new TestPom();
t.getDriver("edge");
t.url("https://www.facebook.com/login.php");
PageObject p=new PageObject();
WebElement username=p.getUserName();
t.textSend(username,"ascat@gmail.com");
driver.navigate().refresh();
t.textSend(username,"muthukkl@gmail.com");

	}

}
