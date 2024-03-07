package project1;

import org.openqa.selenium.WebElement;

public class BaseClassMain extends BaseClasss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
BaseClassMain b=new BaseClassMain();
b.getDriver("chrome");
b.url("https://www.facebook.com/");
WebElement username=b.locators("xpath","//input[@id='email']");
//username.sendKeys("asdfghj@gmail.com");
b.textSend(username,"asdfghj@gmail.com");
WebElement pwd=b.locators("id","pass");
pwd.sendKeys("3425678");
//b.textSend(pwd,"34526778");
WebElement logIn=b.locators("xpath","//button[@name='login']");
logIn.click();
//b.buttonClick(logIn);
Thread.sleep(1500);
b.quitBrowser();
	}

}
