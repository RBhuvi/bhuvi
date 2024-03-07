package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluienttWaitt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Browser\\src\\test\\resources\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://www.facebook.com/login.php");
		WebElement btn=driver.findElement(By.name("login"));
	//	Wait<WebDriver> waitt=new FluentWait<WebDriver>.withTimeOut(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(Throwable.class);
		Wait wait1=new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(Throwable.class);
		wait1.until(ExpectedConditions.visibilityOf(btn));
		btn.click();
		
	}

}
