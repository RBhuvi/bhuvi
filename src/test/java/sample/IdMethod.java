package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdMethod {
	public static void main(String[]args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Browser\\src\\test\\resources\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailtxt=driver.findElement(By.id("email"));
		emailtxt.sendKeys("bhuviravi31@gmail.com");
		Thread.sleep(2500);
		emailtxt.clear();
		WebElement pwdtxt=driver.findElement(By.name("pass"));
		pwdtxt.sendKeys("9876543");
		Thread.sleep(2500);
		pwdtxt.clear();
		WebElement logbn=driver.findElement(By.name("login"));
		logbn.click();
	}
}
