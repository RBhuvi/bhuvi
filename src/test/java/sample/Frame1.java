package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Browser\\src\\test\\resources\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		driver.switchTo().frame("firstFr");
		WebElement first=driver.findElement(By.name("fname"));
		first.sendKeys("Bhuvi");
		WebElement last=driver.findElement(By.name("lname"));
		last.sendKeys("Ravi");
		driver.switchTo().frame(1);
		driver.findElement(By.name("email")).sendKeys("bhuvi@gmail.com");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		last.clear();
		driver.switchTo().defaultContent();
		
	}

}
